(ns mojang-api.api.security-question-answer
  (:require [mojang-api.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn check-security-status-with-http-info
  "Check if security questions are needed"
  []
  (call-api "/user/security/location" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["PlayerAccessToken"]}))

(defn check-security-status
  "Check if security questions are needed"
  []
  (:data (check-security-status-with-http-info)))

(defn list-pending-security-questions-with-http-info
  "Get list of questions"
  []
  (call-api "/user/security/challenges" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["PlayerAccessToken"]}))

(defn list-pending-security-questions
  "Get list of questions"
  []
  (:data (list-pending-security-questions-with-http-info)))

(defn send-security-question-answers-with-http-info
  "Send back the answers"
  [security-answer ]
  (check-required-params security-answer)
  (call-api "/user/security/location" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    security-answer
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["PlayerAccessToken"]}))

(defn send-security-question-answers
  "Send back the answers"
  [security-answer ]
  (:data (send-security-question-answers-with-http-info security-answer)))

