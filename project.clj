(defproject literate-project-catalog "0.0.1-SNAPSHOT"
  :description "A literate version of the project catalog program from the udemy course \"Building Microservices with Clojure\""
  :url "None yet"
  :license {:name "GplV3"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [io.pedestal/pedestal.service "0.5.2"]
                 [io.pedestal/pedestal.jetty "0.5.2"]
                 [com.novemberain/monger "3.1.0"]
                 [clj-http "3.4.1"]
                 [org.clojure/data.json "0.2.6"]
                 [org.clojure/data.xml "0.0.8"]]
  :min-lein-version "2.0.0"
  :resource-paths ["config", "resources"])
