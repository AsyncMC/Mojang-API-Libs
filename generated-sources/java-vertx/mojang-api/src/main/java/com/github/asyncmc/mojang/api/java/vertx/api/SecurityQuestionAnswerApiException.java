package com.github.asyncmc.mojang.api.java.vertx.api;

import com.github.asyncmc.mojang.api.java.vertx.model.Error;
import org.openapitools.server.api.MainApiException;
import com.github.asyncmc.mojang.api.java.vertx.model.SecurityAnswer;
import com.github.asyncmc.mojang.api.java.vertx.model.SecurityChallenge;

public final class SecurityQuestionAnswerApiException extends MainApiException {
    public SecurityQuestionAnswerApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }
    
    public static final SecurityQuestionAnswerApiException SecurityQuestionAnswer_checkSecurityStatus_400_Exception = new SecurityQuestionAnswerApiException(400, "A security check is needed or there is an other issue");
    public static final SecurityQuestionAnswerApiException SecurityQuestionAnswer_sendSecurityQuestionAnswers_400_Exception = new SecurityQuestionAnswerApiException(400, "At least one answer we not accepted");
    

}