(ns mojang-api.api.skin-operations
  (:require [mojang-api.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn change-player-skin-with-http-info
  "Changes the player skin by URL
  This will set the skin for the selected profile, but Mojang's servers will fetch the skin from a URL. This will also work for legacy accounts."
  ([stripped-uuid url ] (change-player-skin-with-http-info stripped-uuid url nil))
  ([stripped-uuid url {:keys [model ]}]
   (check-required-params stripped-uuid url)
   (call-api "/user/profile/{stripped_uuid}/skin" :post
             {:path-params   {"stripped_uuid" stripped-uuid }
              :header-params {}
              :query-params  {}
              :form-params   {"model" model "url" url }
              :content-types ["application/x-www-form-urlencoded"]
              :accepts       ["application/json"]
              :auth-names    ["PlayerAccessToken"]})))

(defn change-player-skin
  "Changes the player skin by URL
  This will set the skin for the selected profile, but Mojang's servers will fetch the skin from a URL. This will also work for legacy accounts."
  ([stripped-uuid url ] (change-player-skin stripped-uuid url nil))
  ([stripped-uuid url optional-params]
   (:data (change-player-skin-with-http-info stripped-uuid url optional-params))))

(defn reset-player-skin-with-http-info
  "Resets the player skin to default"
  [stripped-uuid ]
  (check-required-params stripped-uuid)
  (call-api "/user/profile/{stripped_uuid}/skin" :delete
            {:path-params   {"stripped_uuid" stripped-uuid }
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types []
             :accepts       ["application/json"]
             :auth-names    ["PlayerAccessToken"]}))

(defn reset-player-skin
  "Resets the player skin to default"
  [stripped-uuid ]
  (:data (reset-player-skin-with-http-info stripped-uuid)))

(defn upload-player-skin-with-http-info
  "Changes the player skin by upload
  This uploads a skin to Mojang's servers. It also sets the users skin. This works on legacy counts as well."
  ([stripped-uuid ^File file ] (upload-player-skin-with-http-info stripped-uuid file nil))
  ([stripped-uuid ^File file {:keys [model ]}]
   (check-required-params stripped-uuid file)
   (call-api "/user/profile/{stripped_uuid}/skin" :put
             {:path-params   {"stripped_uuid" stripped-uuid }
              :header-params {}
              :query-params  {}
              :form-params   {"model" model "file" file }
              :content-types ["multipart/form-data"]
              :accepts       ["application/json"]
              :auth-names    ["PlayerAccessToken"]})))

(defn upload-player-skin
  "Changes the player skin by upload
  This uploads a skin to Mojang's servers. It also sets the users skin. This works on legacy counts as well."
  ([stripped-uuid ^File file ] (upload-player-skin stripped-uuid file nil))
  ([stripped-uuid ^File file optional-params]
   (:data (upload-player-skin-with-http-info stripped-uuid file optional-params))))

