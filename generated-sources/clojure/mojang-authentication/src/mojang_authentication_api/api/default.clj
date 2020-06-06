(ns mojang-authentication-api.api.default
  (:require [mojang-authentication-api.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn authenticate-with-http-info
  ""
  [authentication-request ]
  (check-required-params authentication-request)
  (call-api "/authenticate" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    authentication-request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn authenticate
  ""
  [authentication-request ]
  (:data (authenticate-with-http-info authentication-request)))

(defn invalidate-with-http-info
  ""
  [access-keys ]
  (check-required-params access-keys)
  (call-api "/invalidate" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    access-keys
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn invalidate
  ""
  [access-keys ]
  (:data (invalidate-with-http-info access-keys)))

(defn refresh-with-http-info
  ""
  [refresh-request ]
  (check-required-params refresh-request)
  (call-api "/refresh" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    refresh-request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn refresh
  ""
  [refresh-request ]
  (:data (refresh-with-http-info refresh-request)))

(defn siginout-with-http-info
  ""
  [username-password ]
  (check-required-params username-password)
  (call-api "/signout" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    username-password
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn siginout
  ""
  [username-password ]
  (:data (siginout-with-http-info username-password)))

(defn validate-with-http-info
  ""
  [access-keys ]
  (check-required-params access-keys)
  (call-api "/validate" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    access-keys
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn validate
  ""
  [access-keys ]
  (:data (validate-with-http-info access-keys)))

