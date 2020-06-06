package com.github.asyncmc.mojang.sessions.groovy.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import com.github.asyncmc.mojang.sessions.groovy.server.ApiUtils


import java.util.*;

@Mixin(ApiUtils)
class BansApi {
    String basePath = "https://sessionserver.mojang.com"
    String versionPath = "/api/v1"

    def getBlockedServerHashes ( Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/blockedservers"

        // query params
        def queryParams = [:]
        def headerParams = [:]

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    String.class )

    }

}
