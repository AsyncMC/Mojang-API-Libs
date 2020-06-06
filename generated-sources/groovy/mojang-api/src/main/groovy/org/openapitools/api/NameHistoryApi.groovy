package org.openapitools.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import org.openapitools.api.ApiUtils

import org.openapitools.model.CurrentPlayerIDs
import org.openapitools.model.Error
import org.openapitools.model.NameChange

import java.util.*;

@Mixin(ApiUtils)
class NameHistoryApi {
    String basePath = "https://api.mojang.com"
    String versionPath = "/api/v1"

    def findUniqueIdsByName ( List<String> requestBody, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/profiles/minecraft"

        // query params
        def queryParams = [:]
        def headerParams = [:]

        // verify required params are set
        if (requestBody == null) {
            throw new RuntimeException("missing required params requestBody")
        }

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "array",
                    CurrentPlayerIDs.class )

    }

    def getNameHistory ( String strippedUuid, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/user/profiles/{stripped_uuid}/names"

        // query params
        def queryParams = [:]
        def headerParams = [:]

        // verify required params are set
        if (strippedUuid == null) {
            throw new RuntimeException("missing required params strippedUuid")
        }

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "array",
                    NameChange.class )

    }

    def getUniqueIdByName ( String username, Long at, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/users/profiles/minecraft/{username}"

        // query params
        def queryParams = [:]
        def headerParams = [:]

        // verify required params are set
        if (username == null) {
            throw new RuntimeException("missing required params username")
        }

        if (!"null".equals(String.valueOf(at)))
            queryParams.put("at", String.valueOf(at))

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    CurrentPlayerIDs.class )

    }

}
