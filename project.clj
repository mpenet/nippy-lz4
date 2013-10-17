(defproject cc.qbits/nippy-lz4 "0.1.0"
  :description "LZ4 compression for ptaoussanis/nippy"
  :url "https://github.com/mpenet/nippy-lz4"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [net.jpountz.lz4/lz4 "1.2.0"]
                 [primitive-math "0.1.3"]]
  :profiles {:1.4  {:dependencies [[org.clojure/clojure "1.4.0"]]}
             :1.5  {:dependencies [[org.clojure/clojure "1.5.0"]]}
             :1.6  {:dependencies [[org.clojure/clojure "1.6.0-master-SNAPSHOT"]]}
             :dev  {:dependencies [[com.taoensso/nippy "2.2.0"]]}
             :test {:dependencies [[com.taoensso/nippy "2.2.0"]]}}
  :codox {:src-dir-uri "https://github.com/mpenet/nippy-lz4/blob/master"
          :src-linenum-anchor-prefix "L"
          :output-dir "doc/codox"}
  :global-vars {*warn-on-reflection* true})
