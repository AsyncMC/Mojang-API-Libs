package com.github.asyncmc.mojang.api.flash.api {

import org.openapitools.common.ApiInvoker;
import org.openapitools.exception.ApiErrorCodes;
import org.openapitools.exception.ApiError;
import org.openapitools.common.ApiUserCredentials;
import org.openapitools.event.Response;
import org.openapitools.common.OpenApi;
import com.github.asyncmc.mojang.api.flash.model.Error;
import com.github.asyncmc.mojang.api.flash.model.SecurityAnswer;
import com.github.asyncmc.mojang.api.flash.model.SecurityChallenge;

import mx.rpc.AsyncToken;
import mx.utils.UIDUtil;
import flash.utils.Dictionary;
import flash.events.EventDispatcher;

public class SecurityQuestionAnswerApi extends OpenApi {
    /**
    * Constructor for the SecurityQuestionAnswerApi api client
    * @param apiCredentials Wrapper object for tokens and hostName required towards authentication
    * @param eventDispatcher Optional event dispatcher that when provided is used by the SDK to dispatch any Response
    */
    public function SecurityQuestionAnswerApi(apiCredentials: ApiUserCredentials, eventDispatcher: EventDispatcher = null) {
        super(apiCredentials, eventDispatcher);
    }

        public static const event_check_security_status: String = "check_security_status";
        public static const event_list_pending_security_questions: String = "list_pending_security_questions";
        public static const event_send_security_question_answers: String = "send_security_question_answers";


    /*
     * Returns void 
     */
    public function check_security_status (): String {
        // create path and map variables
        var path: String = "/user/security/location".replace(/{format}/g,"xml");

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();


        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "check_security_status";

        token.returnType = null ;
        return requestId;

    }

    /*
     * Returns Array 
     */
    public function list_pending_security_questions (): String {
        // create path and map variables
        var path: String = "/user/security/challenges".replace(/{format}/g,"xml");

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();


        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "GET", queryParams, null, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "list_pending_security_questions";

        token.returnType = Array;
        return requestId;

    }

    /*
     * Returns void 
     */
    public function send_security_question_answers (securityAnswer: Array): String {
        // create path and map variables
        var path: String = "/user/security/location".replace(/{format}/g,"xml");

        // query params
        var queryParams: Dictionary = new Dictionary();
        var headerParams: Dictionary = new Dictionary();

        // verify required params are set
        if() {
            throw new ApiError(400, "missing required params");
        }

        
        
        var token:AsyncToken = getApiInvoker().invokeAPI(path, "POST", queryParams, securityAnswer, headerParams);

        var requestId: String = getUniqueId();

        token.requestId = requestId;
        token.completionEventType = "send_security_question_answers";

        token.returnType = null ;
        return requestId;

    }
}
}
