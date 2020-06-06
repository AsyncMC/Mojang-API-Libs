package com.github.asyncmc.mojang.authentication.groovy.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import com.github.asyncmc.mojang.authentication.groovy.server.ApiUtils

import com.github.asyncmc.mojang.authentication.groovy.model.AccessKeys
import com.github.asyncmc.mojang.authentication.groovy.model.Authentication
import com.github.asyncmc.mojang.authentication.groovy.model.AuthenticationRequest
import com.github.asyncmc.mojang.authentication.groovy.model.Error
import com.github.asyncmc.mojang.authentication.groovy.model.RefreshRequest
import com.github.asyncmc.mojang.authentication.groovy.model.RefreshResponse
import com.github.asyncmc.mojang.authentication.groovy.model.UsernamePassword

import java.util.*;

@Mixin(ApiUtils)
class DefaultApi {
    String basePath = "https://authserver.mojang.com"
    String versionPath = "/api/v1"

    def authenticate ( AuthenticationRequest authenticationRequest, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/authenticate"

        // query params
        def queryParams = [:]
        def headerParams = [:]

        // verify required params are set
        if (authenticationRequest == null) {
            throw new RuntimeException("missing required params authenticationRequest")
        }

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    Authentication.class )

    }

    def invalidate ( AccessKeys accessKeys, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/invalidate"

        // query params
        def queryParams = [:]
        def headerParams = [:]

        // verify required params are set
        if (accessKeys == null) {
            throw new RuntimeException("missing required params accessKeys")
        }

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    null )

    }

    def refresh ( RefreshRequest refreshRequest, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/refresh"

        // query params
        def queryParams = [:]
        def headerParams = [:]

        // verify required params are set
        if (refreshRequest == null) {
            throw new RuntimeException("missing required params refreshRequest")
        }

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    RefreshResponse.class )

    }

    def siginout ( UsernamePassword usernamePassword, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/signout"

        // query params
        def queryParams = [:]
        def headerParams = [:]

        // verify required params are set
        if (usernamePassword == null) {
            throw new RuntimeException("missing required params usernamePassword")
        }

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    null )

    }

    def validate ( AccessKeys accessKeys, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/validate"

        // query params
        def queryParams = [:]
        def headerParams = [:]

        // verify required params are set
        if (accessKeys == null) {
            throw new RuntimeException("missing required params accessKeys")
        }

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    null )

    }

}
