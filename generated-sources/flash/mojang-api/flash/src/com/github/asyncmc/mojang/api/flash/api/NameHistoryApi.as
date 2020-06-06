package com.github.asyncmc.mojang.api.flash.api {

import org.openapitools.common.ApiInvoker;
import org.openapitools.exception.ApiErrorCodes;
import org.openapitools.exception.ApiError;
import org.openapitools.common.ApiUserCredentials;
import org.openapitools.event.Response;
import org.openapitools.common.OpenApi;
import com.github.asyncmc.mojang.api.flash.model.CurrentPlayerIDs;
import com.github.asyncmc.mojang.api.flash.model.Error;
import com.github.asyncmc.mojang.api.flash.model.NameChange;

import mx.rpc.AsyncToken;
import mx.utils.UIDUtil;
import flash.utils.Dictionary;
import flash.events.EventDispatcher;

public class NameHistoryApi extends OpenApi {
    /**
    * Constructor for the NameHistoryApi api client
    * @param apiCredentials Wrapper object for tokens and hostName required towards authentication
    * @param eventDispatcher Optional event dispatcher that when provided is used by the SDK to dispatch any Response
    */
    public function NameHistoryApi(apiCredentials: ApiUserCredentials, eventDispatcher: EventDispatcher = null) {
        super(apiCredentials, eventDispatcher);
    }

        public static const event_find_unique_ids_by_name: String = "find_unique_ids_by_name";
        public static const event_get_name_history: String = "get_name_history";
        public static const event_get_unique_id_by_name: String = "get_unique_id_by_name";


    /*
     * Returns Array 
     */
    public function find_unique_ids_by_name (requestBody: Array): String {
        // create path and map variables
        var path: String = "/profiles/minecraft".replace(/{format}/g,"xml");

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
        if() {
            throw new ApiError(400, "missing required params");
        }

        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, requestBody, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "find_unique_ids_by_name";

        token.returnType = Array;
        return requestId;

    }

    /*
     * Returns Array 
     */
    public function get_name_history (strippedUuid: String): String {
        // create path and map variables
        var path: String = "/user/profiles/{stripped_uuid}/names".replace(/{format}/g,"xml").replace("{" + "stripped_uuid" + "}", getApiInvoker().escapeString(strippedUuid));

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
        if() {
            throw new ApiError(400, "missing required params");
        }

        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "get_name_history";

        token.returnType = Array;
        return requestId;

    }

    /*
     * Returns CurrentPlayerIDs 
     */
    public function get_unique_id_by_name (username: String, at: Number): String {
        // create path and map variables
        var path: String = "/users/profiles/minecraft/{username}".replace(/{format}/g,"xml").replace("{" + "username" + "}", getApiInvoker().escapeString(username));

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
        if(        // verify required params are set
        if() {
            throw new ApiError(400, "missing required params");
        }
) {
            throw new ApiError(400, "missing required params");
        }

        if("null" != String(at))
            queryParams["at"] = toPathValue(at);

        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "get_unique_id_by_name";

        token.returnType = CurrentPlayerIDs;
        return requestId;

    }
}
}
