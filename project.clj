(defproject simple-http-clj "0.1.0-SNAPSHOT"
  :author "Therese Diede"
  :description "A simple HTTP server"
  :min-lein-version "2.7.1"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [clj-time "0.14.2"]
                 [compojure "1.6.0"]
                 [http-kit "2.2.0"]]
  :main simple-http-clj.core)
