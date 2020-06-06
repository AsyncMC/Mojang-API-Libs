(ns mojang-session-api.api.login
  (:require [mojang-session-api.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn get-player-profile-with-http-info
  "Gets the player's game profile
  This will return the player's username plus any additional information about them (e.g. skins).
This has a much stricter rate limit: You can request the same profile once per minute, however you can send as many unique requests as you like."
  ([stripped-uuid ] (get-player-profile-with-http-info stripped-uuid nil))
  ([stripped-uuid {:keys [unsigned ]}]
   (check-required-params stripped-uuid)
   (call-api "/session/minecraft/profile/{stripped_uuid}" :get
             {:path-params   {"stripped_uuid" stripped-uuid }
              :header-params {}
              :query-params  {"unsigned" unsigned }
              :form-params   {}
              :content-types []
              :accepts       ["application/json"]
              :auth-names    []})))

(defn get-player-profile
  "Gets the player's game profile
  This will return the player's username plus any additional information about them (e.g. skins).
This has a much stricter rate limit: You can request the same profile once per minute, however you can send as many unique requests as you like."
  ([stripped-uuid ] (get-player-profile stripped-uuid nil))
  ([stripped-uuid optional-params]
   (:data (get-player-profile-with-http-info stripped-uuid optional-params))))

