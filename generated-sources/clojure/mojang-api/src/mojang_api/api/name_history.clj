(ns mojang-api.api.name-history
  (:require [mojang-api.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn find-unique-ids-by-name-with-http-info
  "Find the current UUID of multiple players at once
  Find the current players name, UUID, demo status and migration flag by the current players name. The \"at\" parameter is not supported. Players not found are not returned. If no players are found, an empty array is returned."
  [string ]
  (check-required-params string)
  (call-api "/profiles/minecraft" :post
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :body-param    string
             :content-types ["application/json"]
             :accepts       ["application/json"]
             :auth-names    []}))

(defn find-unique-ids-by-name
  "Find the current UUID of multiple players at once
  Find the current players name, UUID, demo status and migration flag by the current players name. The \"at\" parameter is not supported. Players not found are not returned. If no players are found, an empty array is returned."
  [string ]
  (:data (find-unique-ids-by-name-with-http-info string)))

(defn get-name-history-with-http-info
  "Gets the full player's name history"
  [stripped-uuid ]
  (check-required-params stripped-uuid)
  (call-api "/user/profiles/{stripped_uuid}/names" :get
            {:path-params   {"stripped_uuid" stripped-uuid }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    []}))

(defn get-name-history
  "Gets the full player's name history"
  [stripped-uuid ]
  (:data (get-name-history-with-http-info stripped-uuid)))

(defn get-unique-id-by-name-with-http-info
  "Find the UUID by name
  Find the current player name, UUID, demo status and migration flag by the current player name or at a given time."
  ([username ] (get-unique-id-by-name-with-http-info username nil))
  ([username {:keys [at ]}]
   (check-required-params username)
   (call-api "/users/profiles/minecraft/{username}" :get
             {:path-params   {"username" username }
              :header-params {}
              :query-params  {"at" at }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-unique-id-by-name
  "Find the UUID by name
  Find the current player name, UUID, demo status and migration flag by the current player name or at a given time."
  ([username ] (get-unique-id-by-name username nil))
  ([username optional-params]
   (:data (get-unique-id-by-name-with-http-info username optional-params))))

