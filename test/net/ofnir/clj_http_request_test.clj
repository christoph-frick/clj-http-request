(ns net.ofnir.clj-http-request-test
  (:require [clojure.test :refer :all]
            [net.ofnir.clj-http-request :refer :all]))


(deftest form-test
  (testing "Form parameters"
    (is (= {:form-params {:foo 42}} 
           (form {:foo 42})))))


(deftest query-test
  (testing "Query parameters"
    (is (= {:query-params {:foo 42}} 
           (query {:foo 42})))))


(deftest json-test
  (testing "JSON body"
    (is (= {:content-type :application/json
            :body "{\"foo\":42}"} 
           (json {:foo 42})))))


(deftest xml-test
  (testing "XML body"
    (is (= {:content-type :application/xml
            :body "<?xml version=\"1.0\" encoding=\"UTF-8\"?><foo>42</foo>"} 
           (xml [:foo {} 42])))))


(deftest edn-test
  (testing "EDN body"
    (is (= {:content-type :application/edn
            :body "{:foo 42}"} 
           (edn {:foo 42})))))
