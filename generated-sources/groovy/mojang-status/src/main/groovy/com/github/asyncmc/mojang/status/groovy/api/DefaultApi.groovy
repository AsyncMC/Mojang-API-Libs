package com.github.asyncmc.mojang.status.groovy.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import com.github.asyncmc.mojang.status.groovy.server.ApiUtils

import com.github.asyncmc.mojang.status.groovy.model.ApiStatus

import java.util.*;

@Mixin(ApiUtils)
class DefaultApi {
    String basePath = "https://status.mojang.com"
    String versionPath = "/api/v1"

    def checkStatuses ( Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/check"

        // query params
        def queryParams = [:]
        def headerParams = [:]

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "array",
                    Map.class )

    }

}
