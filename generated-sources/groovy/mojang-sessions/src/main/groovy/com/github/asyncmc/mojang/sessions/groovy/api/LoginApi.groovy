package com.github.asyncmc.mojang.sessions.groovy.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import com.github.asyncmc.mojang.sessions.groovy.server.ApiUtils

import com.github.asyncmc.mojang.sessions.groovy.model.PlayerProfile
import com.github.asyncmc.mojang.sessions.groovy.model.SessionApiError

import java.util.*;

@Mixin(ApiUtils)
class LoginApi {
    String basePath = "https://sessionserver.mojang.com"
    String versionPath = "/api/v1"

    def getPlayerProfile ( String strippedUuid, Boolean unsigned, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/session/minecraft/profile/{stripped_uuid}"

        // query params
        def queryParams = [:]
        def headerParams = [:]

        // verify required params are set
        if (strippedUuid == null) {
            throw new RuntimeException("missing required params strippedUuid")
        }

        if (!"null".equals(String.valueOf(unsigned)))
            queryParams.put("unsigned", String.valueOf(unsigned))

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    PlayerProfile.class )

    }

}
