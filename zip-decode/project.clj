(defproject zip-decode "0.0.1-SNAPSHOT"
  :description "zip-decode"
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [net.drib/strokes "0.4.0"]]
  :min-lein-version "2.0.0"
  :source-paths ["src/clj" "src/cljs"]

  :plugins [[lein-cljsbuild "0.3.0"]]

  :cljsbuild {:builds [{:source-paths ["src/cljs"]
                        :compiler { :output-to "public/out/zip-decode.js"
                                    :pretty-print true 
                                    :optimizations :simple}}]})
