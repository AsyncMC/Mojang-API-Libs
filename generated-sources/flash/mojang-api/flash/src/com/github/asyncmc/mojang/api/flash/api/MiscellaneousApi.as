package com.github.asyncmc.mojang.api.flash.api {

import org.openapitools.common.ApiInvoker;
import org.openapitools.exception.ApiErrorCodes;
import org.openapitools.exception.ApiError;
import org.openapitools.common.ApiUserCredentials;
import org.openapitools.event.Response;
import org.openapitools.common.OpenApi;
import com.github.asyncmc.mojang.api.flash.model.OrderStatisticsRequest;
import com.github.asyncmc.mojang.api.flash.model.OrderStatisticsResponse;

import mx.rpc.AsyncToken;
import mx.utils.UIDUtil;
import flash.utils.Dictionary;
import flash.events.EventDispatcher;

public class MiscellaneousApi extends OpenApi {
    /**
    * Constructor for the MiscellaneousApi api client
    * @param apiCredentials Wrapper object for tokens and hostName required towards authentication
    * @param eventDispatcher Optional event dispatcher that when provided is used by the SDK to dispatch any Response
    */
    public function MiscellaneousApi(apiCredentials: ApiUserCredentials, eventDispatcher: EventDispatcher = null) {
        super(apiCredentials, eventDispatcher);
    }

        public static const event_get_orders_statistics: String = "get_orders_statistics";


    /*
     * Returns OrderStatisticsResponse 
     */
    public function get_orders_statistics (orderStatisticsRequest: OrderStatisticsRequest): String {
        // create path and map variables
        var path: String = "/orders/statistics".replace(/{format}/g,"xml");

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
        if() {
            throw new ApiError(400, "missing required params");
        }

        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, orderStatisticsRequest, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "get_orders_statistics";

        token.returnType = OrderStatisticsResponse;
        return requestId;

    }
}
}
