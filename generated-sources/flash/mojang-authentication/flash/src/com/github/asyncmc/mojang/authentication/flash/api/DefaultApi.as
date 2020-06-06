package com.github.asyncmc.mojang.authentication.flash.api {

import org.openapitools.common.ApiInvoker;
import org.openapitools.exception.ApiErrorCodes;
import org.openapitools.exception.ApiError;
import org.openapitools.common.ApiUserCredentials;
import org.openapitools.event.Response;
import org.openapitools.common.OpenApi;
import com.github.asyncmc.mojang.authentication.flash.model.AccessKeys;
import com.github.asyncmc.mojang.authentication.flash.model.Authentication;
import com.github.asyncmc.mojang.authentication.flash.model.AuthenticationRequest;
import com.github.asyncmc.mojang.authentication.flash.model.Error;
import com.github.asyncmc.mojang.authentication.flash.model.RefreshRequest;
import com.github.asyncmc.mojang.authentication.flash.model.RefreshResponse;
import com.github.asyncmc.mojang.authentication.flash.model.UsernamePassword;

import mx.rpc.AsyncToken;
import mx.utils.UIDUtil;
import flash.utils.Dictionary;
import flash.events.EventDispatcher;

public class DefaultApi extends OpenApi {
    /**
    * Constructor for the DefaultApi api client
    * @param apiCredentials Wrapper object for tokens and hostName required towards authentication
    * @param eventDispatcher Optional event dispatcher that when provided is used by the SDK to dispatch any Response
    */
    public function DefaultApi(apiCredentials: ApiUserCredentials, eventDispatcher: EventDispatcher = null) {
        super(apiCredentials, eventDispatcher);
    }

        public static const event_authenticate: String = "authenticate";
        public static const event_invalidate: String = "invalidate";
        public static const event_refresh: String = "refresh";
        public static const event_siginout: String = "siginout";
        public static const event_validate: String = "validate";


    /*
     * Returns Authentication 
     */
    public function authenticate (authenticationRequest: AuthenticationRequest): String {
        // create path and map variables
        var path: String = "/authenticate".replace(/{format}/g,"xml");

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
        if() {
            throw new ApiError(400, "missing required params");
        }

        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, authenticationRequest, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "authenticate";

        token.returnType = Authentication;
        return requestId;

    }

    /*
     * Returns void 
     */
    public function invalidate (accessKeys: AccessKeys): String {
        // create path and map variables
        var path: String = "/invalidate".replace(/{format}/g,"xml");

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
        if() {
            throw new ApiError(400, "missing required params");
        }

        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, accessKeys, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "invalidate";

        token.returnType = null ;
        return requestId;

    }

    /*
     * Returns RefreshResponse 
     */
    public function refresh (refreshRequest: RefreshRequest): String {
        // create path and map variables
        var path: String = "/refresh".replace(/{format}/g,"xml");

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
        if() {
            throw new ApiError(400, "missing required params");
        }

        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, refreshRequest, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "refresh";

        token.returnType = RefreshResponse;
        return requestId;

    }

    /*
     * Returns void 
     */
    public function siginout (usernamePassword: UsernamePassword): String {
        // create path and map variables
        var path: String = "/signout".replace(/{format}/g,"xml");

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
        if() {
            throw new ApiError(400, "missing required params");
        }

        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, usernamePassword, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "siginout";

        token.returnType = null ;
        return requestId;

    }

    /*
     * Returns void 
     */
    public function validate (accessKeys: AccessKeys): String {
        // create path and map variables
        var path: String = "/validate".replace(/{format}/g,"xml");

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
        if() {
            throw new ApiError(400, "missing required params");
        }

        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, accessKeys, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "validate";

        token.returnType = null ;
        return requestId;

    }
}
}
