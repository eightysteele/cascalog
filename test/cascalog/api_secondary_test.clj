(ns cascalog.api-secondary-test
  (:use clojure.test
        cascalog.testing
        cascalog.api)
  (:import [cascading.tuple Fields])
  (:require [cascalog [ops :as c] [io :as io]]))

(deftest test-outfields-query
  (with-tmp-sources [age [["nathan" 25]]]
    (is (= ["?age"] (get-out-fields (<- [?age] (age _ ?age)))))
    (is (= ["!!age2" "!!age"] (get-out-fields (<- [!!age2 !!age] (age ?person !!age) (age ?person !!age2)))))
    (is (= ["?person" "!a"] (get-out-fields (<- [?person !a] (age ?person !a)))))
    (is (= ["!a" "!count"] (get-out-fields (<- [!a !count] (age _ !a) (c/count !count)))))
    ))

(deftest test-outfields-tap
  (is (thrown? IllegalArgumentException (get-out-fields (memory-source-tap Fields/ALL []))))
  (is (= ["!age"] (get-out-fields (memory-source-tap ["!age"] []))))
  (is (= ["?age" "field2"] (get-out-fields (memory-source-tap ["?age" "field2"] []))))
  )

(defbufferop sum+1 [tuples]
  [(inc (reduce + (map first tuples)))])

(defn op-to-pairs [sq op]
  (<- [?c] (sq ?a ?b) (op ?a ?b :> ?c) (:distinct false)))

(deftest test-use-var
  (with-tmp-sources [nums [[1 1] [2 2] [1 3]]]
    (test?<- [[2] [4] [4]] [?sum] (nums ?a ?b) (#'+ ?a ?b :> ?sum) (:distinct false))
    (test?- [[0] [0] [-2]] (op-to-pairs nums #'-))
    (test?- [[5]] (op-to-pairs nums #'sum+1))
    (test?- [[5]] (op-to-pairs nums sum+1))
    ))

(deftest test-construct
  (with-tmp-sources [age [["alice" 25] ["bob" 30]]
                     gender [["alice" "f"] ["charlie" "m"]]]
    (test?- [["alice" 26 "f"] ["bob" 31 nil]]
      (apply construct ["?p" "?a2" "!!g"] [(conj [[age "?p" "?a"] [#'inc "?a" :> "?a2"]] [gender "?p" "!!g"])]))
    ))

(deftest test-cascalog-tap-source
  (io/with-log-level :fatal
    (with-tmp-sources [num [[1]]]
      (let [gen (<- [?n] (num ?raw) (inc ?raw :> ?n) (:distinct false))
            tap1 (cascalog-tap num nil)]
        (test?<- [[1]] [?n] (tap1 ?n) (:distinct false))
        (test?<- [[2]] [?n] ((cascalog-tap gen nil) ?n) (:distinct false))
        (test?<- [[1]] [?n] ((cascalog-tap (cascalog-tap tap1 nil) nil) ?n) (:distinct false))
        ))))

(deftest test-cascalog-tap-sink
  (io/with-log-level :fatal
    (with-tmp-sources [num [[2]]]
      (with-expected-sinks [sink1 [[2]]
                            sink2 [[3]]
                            sink3 [[2]]
                            ]
        (?<- (cascalog-tap nil sink1) [?n] (num ?n) (:distinct false))
        (?<- (cascalog-tap nil (fn [sq] [sink2 (<- [?n2] (sq ?n) (inc ?n :> ?n2) (:distinct false))]))
          [?n] (num ?n) (:distinct false))
        (?<- (cascalog-tap nil (cascalog-tap nil sink3)) [?n] (num ?n) (:distinct false))
        ))))

(deftest test-cascalog-tap-source-and-sink
  (io/with-log-level :fatal
    (with-tmp-sources [num [[3]]]
      (with-expected-sinks [sink1 [[4]]]
        (let [tap (cascalog-tap num sink1)]
          (?<- tap [?n] (tap ?raw) (inc ?raw :> ?n) (:distinct false))
          )))))