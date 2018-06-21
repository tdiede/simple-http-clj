(ns simple-http-clj.core
  (:gen-class)
  (:require [org.httpkit.server :refer [run-server]]
            [clj-time.core :as t]
            [compojure.core :refer :all]
            [compojure.route :as route]))

(defn get-time
  []
  (let [response {:status  200
                  :headers {"Content-Type" "text/html"}
                  :body    (str (t/time-now))}]
    response))

(defroutes app
  (GET "/" [] "<h1>Welcome to Therese's Docker container. This is it.</h1>")
  (GET "/get-time" [] (get-time))
  (route/not-found "<h1>Page not found</h1>"))


(defn -main [& args]
  (run-server app {:port 8080})
  (println "Server started on port 8080"))
