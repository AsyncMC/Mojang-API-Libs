package org.openapitools.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import org.openapitools.api.ApiUtils

import org.openapitools.model.OrderStatisticsRequest
import org.openapitools.model.OrderStatisticsResponse

import java.util.*;

@Mixin(ApiUtils)
class MiscellaneousApi {
    String basePath = "https://api.mojang.com"
    String versionPath = "/api/v1"

    def getOrdersStatistics ( OrderStatisticsRequest orderStatisticsRequest, Closure onSuccess, Closure onFailure)  {
        // create path and map path parameters (TODO)
        String resourcePath = "/orders/statistics"

        // query params
        def queryParams = [:]
        def headerParams = [:]

        // verify required params are set
        if (orderStatisticsRequest == null) {
            throw new RuntimeException("missing required params orderStatisticsRequest")
        }

        // TODO: form params, body param not yet support

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    OrderStatisticsResponse.class )

    }

}
