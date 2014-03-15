(defproject taurus "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [clj-time "0.6.0"]
                 [me.raynes/fs "1.4.4"]
                 [org.clojure/tools.logging "0.2.6"]
                 [org.flatland/protobuf "0.8.1"]
                 [org.clojure/core.async "0.1.267.0-0d7780-alpha"]
                 [slingshot "0.10.3"]     
                 [com.palletops/thread-expr "1.3.0"]
                 [org.clojure/algo.monads "0.1.5"]
                 [quickfixj/quickfixj-all "1.5.3"]
                 [org.slf4j/slf4j-api "1.7.6"]
                 [org.slf4j/slf4j-simple "1.7.6"]
                 [org.clojure/data.priority-map "0.0.4"]
                 ]
  :plugins [[lein-protobuf "0.4.2"]]
  :repositories [["snapshots" "http://mainpc:8081/artifactory/libs-snapshot"]
                 ["releases" {:url "http://mainpc:8081/artifactory/libs-release"
                              :username "admin" :password "password"}]]
  :main taurus.core  
  )
