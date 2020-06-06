package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.SecurityAnswer;
import org.openapitools.server.api.model.SecurityChallenge;

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
