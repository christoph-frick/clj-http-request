(ns net.ofnir.clj-http-request
  (:require [cheshire.core :as json]
            [clojure.data.xml :as xml]))

(defn form
  "Create a request with form params"
  [data]
  {:form-params data})


(defn query
  "Create a request with query params"
  [data]
  {:query-params data})


(defn json
  "Create a request with a body as JSON"
  [data]
  {:content-type :application/json 
   :body (json/generate-string data)})


(defn xml
  "Create a request with a body as XML"
  [data]
  {:content-type :application/xml 
   :body (-> data xml/sexp-as-element xml/emit-str)})


(defn edn
  "Create a request with a body as EDN"
  [data]
  {:content-type :application/edn
   :body (pr-str data)})
