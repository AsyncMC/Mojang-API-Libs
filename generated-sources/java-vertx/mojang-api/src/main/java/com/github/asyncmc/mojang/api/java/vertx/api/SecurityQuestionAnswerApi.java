package com.github.asyncmc.mojang.api.java.vertx.api;

import com.github.asyncmc.mojang.api.java.vertx.model.Error;
import org.openapitools.server.api.MainApiException;
import com.github.asyncmc.mojang.api.java.vertx.model.SecurityAnswer;
import com.github.asyncmc.mojang.api.java.vertx.model.SecurityChallenge;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface SecurityQuestionAnswerApi  {
    //checkSecurityStatus
    void checkSecurityStatus(Handler<AsyncResult<Void>> handler);
    
    //listPendingSecurityQuestions
    void listPendingSecurityQuestions(Handler<AsyncResult<List<SecurityChallenge>>> handler);
    
    //sendSecurityQuestionAnswers
    void sendSecurityQuestionAnswers(List<SecurityAnswer> securityAnswer, Handler<AsyncResult<Void>> handler);
    
}
