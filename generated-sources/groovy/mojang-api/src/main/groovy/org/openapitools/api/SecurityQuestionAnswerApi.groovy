package org.openapitools.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import org.openapitools.api.ApiUtils

import org.openapitools.model.Error
import org.openapitools.model.SecurityAnswer
import org.openapitools.model.SecurityChallenge

import java.util.*;

@Mixin(ApiUtils)
class SecurityQuestionAnswerApi {
    String basePath = "https://api.mojang.com"
    String versionPath = "/api/v1"

    def checkSecurityStatus ( Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/user/security/location"

        // query params
        def queryParams = [:]
        def headerParams = [:]

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    null )

    }

    def listPendingSecurityQuestions ( Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/user/security/challenges"

        // query params
        def queryParams = [:]
        def headerParams = [:]

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "array",
                    SecurityChallenge.class )

    }

    def sendSecurityQuestionAnswers ( List<SecurityAnswer> securityAnswer, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/user/security/location"

        // query params
        def queryParams = [:]
        def headerParams = [:]

        // verify required params are set
        if (securityAnswer == null) {
            throw new RuntimeException("missing required params securityAnswer")
        }

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    null )

    }

}
