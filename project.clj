(defproject net.ofnir/clj-http-request "0.1.1"
  :description "Helper functions to create the most common requests for HTTP client libraries"
  :url "https://github.com/christoph-frick/clj-http-request"
  :license {:name "MIT"
            :url "https://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.10.3"]
                 [cheshire/cheshire "5.10.2"]
                 [org.clojure/data.xml "0.0.8"]]
  :deploy-repositories {"releases" {:url "https://clojars.org/repo/" :creds :gpg}})
