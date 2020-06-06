package com.github.asyncmc.mojang.api.groovy.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import com.github.asyncmc.mojang.api.groovy.server.ApiUtils

import com.github.asyncmc.mojang.api.groovy.model.Error
import com.github.asyncmc.mojang.api.groovy.model.SkinModel

import java.util.*;

@Mixin(ApiUtils)
class SkinOperationsApi {
    String basePath = "https://api.mojang.com"
    String versionPath = "/api/v1"

    def changePlayerSkin ( String strippedUuid, String url, SkinModel model, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/user/profile/{stripped_uuid}/skin"

        // query params
        def queryParams = [:]
        def headerParams = [:]

        // verify required params are set
        if (strippedUuid == null) {
            throw new RuntimeException("missing required params strippedUuid")
        }

        // verify required params are set
        if (url == null) {
            throw new RuntimeException("missing required params url")
        }

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    null )

    }

    def resetPlayerSkin ( String strippedUuid, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/user/profile/{stripped_uuid}/skin"

        // query params
        def queryParams = [:]
        def headerParams = [:]

        // verify required params are set
        if (strippedUuid == null) {
            throw new RuntimeException("missing required params strippedUuid")
        }

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    null )

    }

    def uploadPlayerSkin ( String strippedUuid, File file, SkinModel model, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/user/profile/{stripped_uuid}/skin"

        // query params
        def queryParams = [:]
        def headerParams = [:]

        // verify required params are set
        if (strippedUuid == null) {
            throw new RuntimeException("missing required params strippedUuid")
        }

        // verify required params are set
        if (file == null) {
            throw new RuntimeException("missing required params file")
        }

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "PUT", "",
                    null )

    }

}
