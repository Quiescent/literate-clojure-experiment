(defproject literate-project-catalog "0.0.1-SNAPSHOT"
  :description "A literate version of the project catalog program from the udemy course \"Building Microservices with Clojure\""
  :url "None yet"
  :license {:name "GplV3"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [io.pedestal/pedestal.service "0.5.2"]
                 [io.pedestal/pedestal.jetty "0.5.2"]
                 [ch.qos.logback/logback-classic "1.1.8" :exclusions [org.slf4j/slf4j-api]]
                 [org.slf4j/jul-to-slf4j "1.7.22"]
                 [org.slf4j/jcl-over-slf4j "1.7.22"]
                 [org.slf4j/log4j-over-slf4j "1.7.22"]]
  :min-lein-version "2.0.0"
  :resource-paths ["config", "resources"])
