(ns mojang-api.api.miscellaneous
  (:require [mojang-api.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn get-orders-statistics-with-http-info
  "Get statistics on the sales of Minecraft."
  [order-statistics-request ]
  (check-required-params order-statistics-request)
  (call-api "/orders/statistics" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    order-statistics-request
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    ["MojangStatisticsToken"]}))

(defn get-orders-statistics
  "Get statistics on the sales of Minecraft."
  [order-statistics-request ]
  (:data (get-orders-statistics-with-http-info order-statistics-request)))

