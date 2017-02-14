(defproject lein-kibit-sortable "0.1.4-SNAPSHOT"
  :description "kibit lein plugin"
  :url "https://github.com/jonase/lein-kibit"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[jonase/kibit-sortable "0.1.4-SNAPSHOT"]
                 [org.clojure/tools.namespace "0.2.11"]]
  :deploy-repositories [["releases" :clojars]]
  :repositories [["snapshots" "file:///tmp/maven/snapshots"]]
  :eval-in-leiningen true)
