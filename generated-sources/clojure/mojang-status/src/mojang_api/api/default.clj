(ns mojang-api.api.default
  (:require [mojang-api.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn check-statuses-with-http-info
  "Checks the Mojang service statuses"
  []
  (call-api "/check" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn check-statuses
  "Checks the Mojang service statuses"
  []
  (:data (check-statuses-with-http-info)))

