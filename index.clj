{:namespaces
 ({:source-url nil,
   :wiki-url
   "http://nathanmarz.github.com/cascalog/cascalog.api-api.html",
   :name "cascalog.api",
   :doc nil}
  {:source-url nil,
   :wiki-url
   "http://nathanmarz.github.com/cascalog/cascalog.ops-api.html",
   :name "cascalog.ops",
   :doc nil}),
 :vars
 ({:arglists ([outvars & predicates]),
   :name "<-",
   :namespace "cascalog.api",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "http://nathanmarz.github.com/cascalog//cascalog.api-api.html#cascalog.api/<-",
   :doc
   "Constructs a query or predicate macro from a list of\npredicates. Predicate macros support destructuring of the input and\noutput variables.",
   :var-type "macro",
   :line 137,
   :file "src/clj/cascalog/api.clj"}
  {:arglists ([& bindings]),
   :name "?-",
   :namespace "cascalog.api",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "http://nathanmarz.github.com/cascalog//cascalog.api-api.html#cascalog.api/?-",
   :doc
   "Executes 1 or more queries and emits the results of each query to\nthe associated tap.\n\nSyntax: (?- sink1 query1 sink2 query2 ...)  or (?- query-name sink1\nquery1 sink2 query2)\n \n If the first argument is a string, that will be used as the name\nfor the query and will show up in the JobTracker UI.",
   :var-type "function",
   :line 178,
   :file "src/clj/cascalog/api.clj"}
  {:arglists ([& args]),
   :name "?<-",
   :namespace "cascalog.api",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "http://nathanmarz.github.com/cascalog//cascalog.api-api.html#cascalog.api/?<-",
   :doc
   "Helper that both defines and executes a query in a single call.\n\nSyntax: (?<- out-tap out-vars & predicates) or (?<- \"myflow\"\nout-tap out-vars & predicates) ; flow name must be a static string\nwithin the ?<- form.",
   :var-type "macro",
   :line 207,
   :file "src/clj/cascalog/api.clj"}
  {:arglists ([& subqueries]),
   :name "??-",
   :namespace "cascalog.api",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "http://nathanmarz.github.com/cascalog//cascalog.api-api.html#cascalog.api/??-",
   :doc
   "Executes one or more queries and returns a seq of seqs of tuples\n back, one for each subquery given.\n\nSyntax: (??- sink1 query1 sink2 query2 ...)",
   :var-type "function",
   :line 193,
   :file "src/clj/cascalog/api.clj"}
  {:arglists ([& args]),
   :name "??<-",
   :namespace "cascalog.api",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "http://nathanmarz.github.com/cascalog//cascalog.api-api.html#cascalog.api/??<-",
   :doc "Like ??-, but for ?<-. Returns a seq of tuples.",
   :var-type "macro",
   :line 218,
   :file "src/clj/cascalog/api.clj"}
  {:arglists ([source sink]),
   :name "cascalog-tap",
   :namespace "cascalog.api",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "http://nathanmarz.github.com/cascalog//cascalog.api-api.html#cascalog.api/cascalog-tap",
   :doc
   "Defines a cascalog tap which can be used to add additional\nabstraction over cascading taps.\n\n 'source' can be a cascading tap, subquery, or a cascalog tap.\n 'sink' can be a cascading tap, sink function, or a cascalog tap.",
   :var-type "function",
   :line 20,
   :file "src/clj/cascalog/api.clj"}
  {:arglists ([& gens]),
   :name "combine",
   :namespace "cascalog.api",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "http://nathanmarz.github.com/cascalog//cascalog.api-api.html#cascalog.api/combine",
   :doc
   "Merge the tuples from the subqueries together into a single\nsubquery. Doesn't ensure uniqueness of tuples.",
   :var-type "function",
   :line 263,
   :file "src/clj/cascalog/api.clj"}
  {:arglists ([& args]),
   :name "compile-flow",
   :namespace "cascalog.api",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "http://nathanmarz.github.com/cascalog//cascalog.api-api.html#cascalog.api/compile-flow",
   :doc
   "Attaches output taps to some number of subqueries and creates a\nCascading flow. The flow can be executed with `.complete`, or\nintrospection can be done on the flow.\n\nSyntax: (compile-flow sink1 query1 sink2 query2 ...)\nor (compile-flow flow-name sink1 query1 sink2 query2)\n \n If the first argument is a string, that will be used as the name\nfor the query and will show up in the JobTracker UI.",
   :var-type "function",
   :line 149,
   :file "src/clj/cascalog/api.clj"}
  {:arglists ([outvars preds]),
   :name "construct",
   :namespace "cascalog.api",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "http://nathanmarz.github.com/cascalog//cascalog.api-api.html#cascalog.api/construct",
   :doc
   "Construct a query or predicate macro functionally. When\nconstructing queries this way, operations should either be vars for\noperations or values defined using one of Cascalog's def macros. Vars\nmust be stringified when passed to construct. If you're using\ndestructuring in a predicate macro, the & symbol must be stringified\nas well.",
   :var-type "function",
   :line 245,
   :file "src/clj/cascalog/api.clj"}
  {:arglists ([name & forms]),
   :name "defmain",
   :namespace "cascalog.api",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "http://nathanmarz.github.com/cascalog//cascalog.api-api.html#cascalog.api/defmain",
   :doc
   "Defines an AOT-compiled function with the supplied\n`name`. Containing namespace must be marked for AOT compilation to\nhave any effect.",
   :var-type "macro",
   :line 360,
   :file "src/clj/cascalog/api.clj"}
  {:arglists ([name doc-string? attr-map? [fn-args*] body]),
   :name "defmapop",
   :namespace "cascalog.api",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "http://nathanmarz.github.com/cascalog//cascalog.api-api.html#cascalog.api/defmapop",
   :doc
   "Defines a custom operation that appends new fields to the input tuple.",
   :var-type "macro",
   :line 323,
   :file "src/clj/cascalog/api.clj"}
  {:arglists
   ([name doc-string? attr-map? & {:keys [init-var combine-var]}]),
   :name "defparallelagg",
   :namespace "cascalog.api",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "http://nathanmarz.github.com/cascalog//cascalog.api-api.html#cascalog.api/defparallelagg",
   :doc
   "Binds an efficient aggregator to the supplied symbol. A parallel\naggregator processes each tuple through an initializer function,\nthen combines the results each tuple's initialization until one\nresult is achieved. `defparallelagg` accepts two keyword arguments:\n\n:init-var -- A var bound to a fn that accepts raw tuples and returns\nan intermediate result; #'one, for example.\n\n:combine-var -- a var bound to a fn that both accepts and returns\nintermediate results.\n\nFor example,\n\n(defparallelagg sum\n:init-var #'identity\n:combine-var #'+)\n\nUsed as\n\n(sum ?x :> ?y)",
   :var-type "macro",
   :line 338,
   :file "src/clj/cascalog/api.clj"}
  {:arglists ([f & rest]),
   :name "div",
   :namespace "cascalog.api",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "http://nathanmarz.github.com/cascalog//cascalog.api-api.html#cascalog.api/div",
   :doc
   "Perform floating point division on the arguments. Use this instead\nof / in Cascalog queries since / produces Ratio types which aren't\nserializable by Hadoop.",
   :var-type "function",
   :line 344,
   :file "src/clj/cascalog/api.clj"}
  {:arglists ([path & opts]),
   :name "hfs-seqfile",
   :namespace "cascalog.api",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "http://nathanmarz.github.com/cascalog//cascalog.api-api.html#cascalog.api/hfs-seqfile",
   :doc
   "Creates a tap on HDFS using sequence file format. Different\n filesystems can be selected by using different prefixes for `path`.\n\nSupports keyword option for `:outfields`. See `cascalog.tap/hfs-tap`\nfor more keyword arguments.\n\n See http://www.cascading.org/javadoc/cascading/tap/Hfs.html and\n http://www.cascading.org/javadoc/cascading/scheme/SequenceFile.html",
   :var-type "function",
   :line 53,
   :file "src/clj/cascalog/api.clj"}
  {:arglists
   ([scheme
     path-or-file
     &
     {:keys
      [sinkmode sinkparts sink-template source-pattern templatefields],
      :or {templatefields Fields/ALL}}]),
   :name "hfs-tap",
   :namespace "cascalog.api",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "http://nathanmarz.github.com/cascalog//cascalog.api-api.html#cascalog.api/hfs-tap",
   :doc
   "Returns a Cascading Hfs tap with support for the supplied scheme,\nopened up on the supplied path or file object. Supported keyword\noptions are:\n\n`:sinkmode` - can be `:keep`, `:update` or `:replace`.\n\n`:sinkparts` - used to constrain the segmentation of output files.\n\n`:source-pattern` - Causes resulting tap to respond as a GlobHfs tap\nwhen used as source.\n\n`:sink-template` - Causes resulting tap to respond as a TemplateTap when\nused as a sink.\n\n`:templatefields` - When pattern is supplied via :sink-template, this option allows a\nsubset of output fields to be used in the naming scheme.",
   :var-type "function",
   :line 21,
   :file "src/clj/cascalog/api.clj"}
  {:arglists ([path & opts]),
   :name "hfs-textline",
   :namespace "cascalog.api",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "http://nathanmarz.github.com/cascalog//cascalog.api-api.html#cascalog.api/hfs-textline",
   :doc
   "Creates a tap on HDFS using textline format. Different filesystems\n can be selected by using different prefixes for `path`.\n\nSupports keyword option for `:outfields`. See `cascalog.tap/hfs-tap`\nfor more keyword arguments.\n \n See http://www.cascading.org/javadoc/cascading/tap/Hfs.html and\n http://www.cascading.org/javadoc/cascading/scheme/TextLine.html",
   :var-type "function",
   :line 26,
   :file "src/clj/cascalog/api.clj"}
  {:arglists ([path & opts]),
   :name "lfs-seqfile",
   :namespace "cascalog.api",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "http://nathanmarz.github.com/cascalog//cascalog.api-api.html#cascalog.api/lfs-seqfile",
   :doc
   "Creates a tap that reads data off of the local filesystem in\n sequence file format.\n\nSupports keyword option for `:outfields`. See `cascalog.tap/lfs-tap`\nfor more keyword arguments.\n \n See http://www.cascading.org/javadoc/cascading/tap/Lfs.html and\n http://www.cascading.org/javadoc/cascading/scheme/SequenceFile.html",
   :var-type "function",
   :line 67,
   :file "src/clj/cascalog/api.clj"}
  {:arglists
   ([scheme
     path-or-file
     &
     {:keys
      [sinkmode sinkparts sink-template source-pattern templatefields],
      :or {templatefields Fields/ALL}}]),
   :name "lfs-tap",
   :namespace "cascalog.api",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "http://nathanmarz.github.com/cascalog//cascalog.api-api.html#cascalog.api/lfs-tap",
   :doc
   "Returns a Cascading Lfs tap with support for the supplied scheme,\nopened up on the supplied path or file object. Supported keyword\noptions are:\n\n`:sinkmode` - can be `:keep`, `:update` or `:replace`.\n\n`:sinkparts` - used to constrain the segmentation of output files.\n\n`:source-pattern` - Causes resulting tap to respond as a GlobHfs tap\nwhen used as source.\n\n`:sink-template` - Causes resulting tap to respond as a TemplateTap when\nused as a sink.\n\n`:templatefields` - When pattern is supplied via :sink-template, this option allows a\nsubset of output fields to be used in the naming scheme.",
   :var-type "function",
   :line 22,
   :file "src/clj/cascalog/api.clj"}
  {:arglists ([path & opts]),
   :name "lfs-textline",
   :namespace "cascalog.api",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "http://nathanmarz.github.com/cascalog//cascalog.api-api.html#cascalog.api/lfs-textline",
   :doc
   "Creates a tap on the local filesystem using textline format.\n\nSupports keyword option for `:outfields`. See `cascalog.tap/lfs-tap`\nfor more keyword arguments.\n\n See http://www.cascading.org/javadoc/cascading/tap/Lfs.html and\n http://www.cascading.org/javadoc/cascading/scheme/TextLine.html",
   :var-type "function",
   :line 40,
   :file "src/clj/cascalog/api.clj"}
  {:arglists ([& body]),
   :name "predmacro",
   :namespace "cascalog.api",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "http://nathanmarz.github.com/cascalog//cascalog.api-api.html#cascalog.api/predmacro",
   :doc
   "A more general but more verbose way to create predicate macros.\n\nCreates a function that takes in [invars outvars] and returns a\nlist of predicates. When making predicate macros this way, you must\ncreate intermediate variables with gen-nullable-var(s). This is\nbecause unlike the (<- [?a :> ?b] ...) way of doing pred macros,\nCascalog doesn't have a declaration for the inputs/outputs.",
   :var-type "macro",
   :line 234,
   :file "src/clj/cascalog/api.clj"}
  {:arglists ([pred-macro-fn]),
   :name "predmacro*",
   :namespace "cascalog.api",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "http://nathanmarz.github.com/cascalog//cascalog.api-api.html#cascalog.api/predmacro*",
   :doc "Functional version of predmacro. See predmacro for details.",
   :var-type "function",
   :line 226,
   :file "src/clj/cascalog/api.clj"}
  {:arglists ([]),
   :name "stdout",
   :namespace "cascalog.api",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "http://nathanmarz.github.com/cascalog//cascalog.api-api.html#cascalog.api/stdout",
   :doc
   "Creates a tap that prints tuples sunk to it to standard\noutput. Useful for experimentation in the REPL.",
   :var-type "function",
   :line 81,
   :file "src/clj/cascalog/api.clj"}
  {:arglists ([& gens]),
   :name "union",
   :namespace "cascalog.api",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "http://nathanmarz.github.com/cascalog//cascalog.api-api.html#cascalog.api/union",
   :doc
   "Merge the tuples from the subqueries together into a single\nsubquery and ensure uniqueness of tuples.",
   :var-type "function",
   :line 257,
   :file "src/clj/cascalog/api.clj"}
  {:arglists ([& body]),
   :name "with-debug",
   :namespace "cascalog.api",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "http://nathanmarz.github.com/cascalog//cascalog.api-api.html#cascalog.api/with-debug",
   :doc
   "Wrap queries in this macro to cause debug information for the query\nplanner to be printed out.",
   :var-type "macro",
   :line 351,
   :file "src/clj/cascalog/api.clj"}
  {:arglists ([conf & body]),
   :name "with-job-conf",
   :namespace "cascalog.api",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "http://nathanmarz.github.com/cascalog//cascalog.api-api.html#cascalog.api/with-job-conf",
   :doc
   "Modifies the job conf for queries executed within the form. Nested\nwith-job-conf calls will merge configuration maps together, with\ninnermost calls taking precedence on conflicting keys.",
   :var-type "macro",
   :line 110,
   :file "src/clj/cascalog/api.clj"}
  {:arglists ([serial-vec & forms]),
   :name "with-serializations",
   :namespace "cascalog.api",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "http://nathanmarz.github.com/cascalog//cascalog.api-api.html#cascalog.api/with-serializations",
   :doc
   "Enables the supplied serializations for queries executed within the\nform. Serializations should be provided as a vector of strings or\nclasses, like so:\n\n(import 'org.apache.hadoop.io.serializer.JavaSerialization)\n(with-serializations [JavaSerialization]\n   (?<- ...))\n\nSerializations nest; nested calls to with-serializations will merge\nand unique with serializations currently specified by other calls to\n`with-serializations` or `with-job-conf`.",
   :var-type "macro",
   :line 118,
   :file "src/clj/cascalog/api.clj"}
  {:arglists ([& ops]),
   :name "all",
   :namespace "cascalog.ops",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "http://nathanmarz.github.com/cascalog//cascalog.ops-api.html#cascalog.ops/all",
   :doc
   "Accepts any number of filtering ops and returns a new op that\nchecks that every every one of the original filters passes. For\nexample:\n\n((all #'even? #'positive? #'small?) ?x) ;; within some query\n\nIs equivalent to:\n\n;; within some query\n(even? ?x :> ?temp1)\n(positive? ?x :> ?temp2)\n(small? ?x) :> ?temp3)\n(and ?temp1 ?temp2 ?temp3)",
   :var-type "function",
   :line 26,
   :file "src/clj/cascalog/ops.clj"}
  {:arglists ([& ops]),
   :name "any",
   :namespace "cascalog.ops",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "http://nathanmarz.github.com/cascalog//cascalog.ops-api.html#cascalog.ops/any",
   :doc
   "Accepts any number of filtering ops and returns a new op that\nchecks that at least one of the original filters passes. For\nexample:\n\n((any #'even? #'positive? #'small?) ?x) ;; within some query\n\nIs equivalent to:\n\n;; within some query\n(even? ?x :> ?temp1)\n(positive? ?x :> ?temp2)\n(small? ?x :> ?temp3)\n(or ?temp1 ?temp2 ?temp3)",
   :var-type "function",
   :line 43,
   :file "src/clj/cascalog/ops.clj"}
  {:file "src/clj/cascalog/ops.clj",
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://nathanmarz.github.com/cascalog//cascalog.ops-api.html#cascalog.ops/avg",
   :namespace "cascalog.ops",
   :line 184,
   :var-type "var",
   :doc
   "Predicate operation that produces the average value of the\nsupplied input variable. For example:\n\n(let [src [[1] [2]]]\n  (<- [?avg]\n      (src ?x)\n      (avg ?x :> ?avg)))\n;;=> ([1.5])",
   :name "avg"}
  {:arglists ([& ops]),
   :name "comp",
   :namespace "cascalog.ops",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "http://nathanmarz.github.com/cascalog//cascalog.ops-api.html#cascalog.ops/comp",
   :doc
   "Accepts any number of predicate ops and returns an op that is the\ncomposition of those ops.\n\n(require '[cascalog.ops :as c])\n((c/comp #'str #'+) ?x ?y :> ?sum-string) ;; within some query\n\nIs equivalent to:\n\n;; within some query\n(+ ?x ?y :> ?intermediate)\n(str ?intermediate :> ?sum-string)",
   :var-type "function",
   :line 60,
   :file "src/clj/cascalog/ops.clj"}
  {:file "src/clj/cascalog/ops.clj",
   :raw-source-url nil,
   :source-url nil,
   :wiki-url
   "http://nathanmarz.github.com/cascalog//cascalog.ops-api.html#cascalog.ops/distinct-count",
   :namespace "cascalog.ops",
   :line 198,
   :var-type "var",
   :doc
   "Predicate operation that produces a count of all distinct\nvalues of the supplied input variable. For example:\n\n(let [src [[1] [2] [2]]]\n(<- [?count]\n    (src ?x)\n    (distinct-count ?x :> ?count)))\n;;=> ([2])",
   :name "distinct-count"}
  {:arglists ([op]),
   :name "each",
   :namespace "cascalog.ops",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "http://nathanmarz.github.com/cascalog//cascalog.ops-api.html#cascalog.ops/each",
   :doc
   "Accepts an operation and returns a predicate macro that maps `op`\nacross any number of input variables. For example:\n\n((each #'str) ?x ?y ?z :> ?x-str ?y-str ?z-str) ;; within some query\n\nIs equivalent to\n\n;; within some query\n(str ?x :> ?x-str)\n(str ?y :> ?y-str)\n(str ?z :> ?z-str)",
   :var-type "function",
   :line 107,
   :file "src/clj/cascalog/ops.clj"}
  {:arglists ([gen n & {:keys [sort reverse], :or {reverse false}}]),
   :name "first-n",
   :namespace "cascalog.ops",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "http://nathanmarz.github.com/cascalog//cascalog.ops-api.html#cascalog.ops/first-n",
   :doc
   "Accepts a generator and a number `n` and returns a subquery that\n  produces the first n elements from the supplied generator. Two\n  boolean keyword arguments are supported:\n\n :sort -- accepts a vector of variables on which to sort. Defaults to\n          nil (unsorted).\n :reverse -- If true, sorts items in reverse order. (false by default).\n\n For example:\n\n (def src [[1] [3] [2]]) ;; produces 3 tuples\n\n ;; produces ([1 2] [3 4] [2 3]) when executed\n (def query (<- [?x ?y] (src ?x) (inc ?x :> ?y)))\n\n ;; produces ([3 4]) when executed\n (first-n query 1 :sort [\"?x\"] :reverse true)",
   :var-type "function",
   :line 235,
   :file "src/clj/cascalog/ops.clj"}
  {:arglists ([& ops]),
   :name "juxt",
   :namespace "cascalog.ops",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "http://nathanmarz.github.com/cascalog//cascalog.ops-api.html#cascalog.ops/juxt",
   :doc
   "Accepts any number of predicate ops and returns an op that is the\njuxtaposition of those ops.\n\n(require '[cascalog.ops :as c])\n((c/juxt #'+ #'- #'<) !x !y :> !sum !diff !mult) ;; within some query\n\nIs equivalent to:\n\n;; within some query\n(+ !x !y :> !sum)\n(- !x !y :> !diff)\n(* !x !y :> !mult)",
   :var-type "function",
   :line 85,
   :file "src/clj/cascalog/ops.clj"}
  {:arglists ([tmp-path [tuple :as l-seq]]),
   :name "lazy-generator",
   :namespace "cascalog.ops",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "http://nathanmarz.github.com/cascalog//cascalog.ops-api.html#cascalog.ops/lazy-generator",
   :doc
   "Returns a cascalog generator on the supplied sequence of\ntuples. `lazy-generator` serializes each item in the lazy sequence\ninto a sequencefile located at the supplied temporary directory, and\nreturns a tap into its guts.\n\nI recommend wrapping queries that use this tap with\n`cascalog.io/with-fs-tmp`; for example,\n\n  (with-fs-tmp [_ tmp-dir]\n    (let [lazy-tap (pixel-generator tmp-dir lazy-seq)]\n    (?<- (stdout)\n         [?field1 ?field2 ... etc]\n         (lazy-tap ?field1 ?field2)\n         ...)))",
   :var-type "function",
   :line 213,
   :file "src/clj/cascalog/ops.clj"}
  {:arglists ([op]),
   :name "negate",
   :namespace "cascalog.ops",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "http://nathanmarz.github.com/cascalog//cascalog.ops-api.html#cascalog.ops/negate",
   :doc
   "Accepts a filtering op and returns an new op that acts as the\nnegation (or complement) of the original. For example:\n\n((negate #'string?) ?string-var) ;; within some query\n\nIs equivalent to\n\n;; within some query\n(string? ?string-var :> ?temp-bool)\n(not ?temp-bool)",
   :var-type "function",
   :line 10,
   :file "src/clj/cascalog/ops.clj"}
  {:arglists ([op & args]),
   :name "partial",
   :namespace "cascalog.ops",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "http://nathanmarz.github.com/cascalog//cascalog.ops-api.html#cascalog.ops/partial",
   :doc
   "Accepts an operation and fewer than normal arguments, and returns a\nnew operation that can be called with the remaining unspecified\nargs. For example, given this require and defmapop:\n\n(require '[cascalog.ops :as c])\n(defmapop plus [x y] (+ x y))\n\nThe following two forms are equivalent: \n\n(let [plus-10 (c/partial plus 10)]\n   (<- [?y] (src ?x) (plus-10 ?x :> ?y)))\n\n(<- [?y] (src ?x) (plus-10 ?x :> ?y))\n\nWith the benefit that `10` doesn't need to be hardcoded into the\nfirst query.",
   :var-type "function",
   :line 131,
   :file "src/clj/cascalog/ops.clj"}
  {:arglists ([str]),
   :name "re-parse",
   :namespace "cascalog.ops",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "http://nathanmarz.github.com/cascalog//cascalog.ops-api.html#cascalog.ops/re-parse",
   :doc
   "Accepts a regex `pattern` and a string argument `str` and returns\nthe groups within `str` that match the supplied `pattern`.",
   :var-type "function",
   :line 155,
   :file "src/clj/cascalog/ops.clj"}
  {:arglists ([[ms] & body]),
   :name "with-timeout",
   :namespace "cascalog.ops",
   :source-url nil,
   :raw-source-url nil,
   :wiki-url
   "http://nathanmarz.github.com/cascalog//cascalog.ops-api.html#cascalog.ops/with-timeout",
   :doc
   "Accepts a vector with a timeout (in ms) and any number of forms and\nexecutes those forms sequentially. returns the result of the last\nform or nil (if the timeout is reached.) For example:\n\n(with-timeout [100]\n  (Thread/sleep 50)\n  \"done!\")\n;;=> \"done!\"\n\n(with-timeout [100]\n  (Thread/sleep 200)\n  \"done!\")\n;;=> nil",
   :var-type "macro",
   :line 270,
   :file "src/clj/cascalog/ops.clj"})}
