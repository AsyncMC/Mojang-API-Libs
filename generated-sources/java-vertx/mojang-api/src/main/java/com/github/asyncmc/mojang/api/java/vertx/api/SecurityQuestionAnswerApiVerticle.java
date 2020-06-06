package com.github.asyncmc.mojang.api.java.vertx.api;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import com.github.asyncmc.mojang.api.java.vertx.model.Error;
import org.openapitools.server.api.MainApiException;
import com.github.asyncmc.mojang.api.java.vertx.model.SecurityAnswer;
import com.github.asyncmc.mojang.api.java.vertx.model.SecurityChallenge;

import java.util.List;
import java.util.Map;

public class SecurityQuestionAnswerApiVerticle extends AbstractVerticle {
    final static Logger LOGGER = LoggerFactory.getLogger(SecurityQuestionAnswerApiVerticle.class); 
    
    final static String CHECKSECURITYSTATUS_SERVICE_ID = "checkSecurityStatus";
    final static String LISTPENDINGSECURITYQUESTIONS_SERVICE_ID = "listPendingSecurityQuestions";
    final static String SENDSECURITYQUESTIONANSWERS_SERVICE_ID = "sendSecurityQuestionAnswers";
    
    final SecurityQuestionAnswerApi service;

    public SecurityQuestionAnswerApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("com.github.asyncmc.mojang.api.java.vertx.api.SecurityQuestionAnswerApiImpl");
            service = (SecurityQuestionAnswerApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("SecurityQuestionAnswerApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for checkSecurityStatus
        vertx.eventBus().<JsonObject> consumer(CHECKSECURITYSTATUS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "checkSecurityStatus";
                service.checkSecurityStatus(result -> {
                    if (result.succeeded())
                        message.reply(null);
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "checkSecurityStatus");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("checkSecurityStatus", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for listPendingSecurityQuestions
        vertx.eventBus().<JsonObject> consumer(LISTPENDINGSECURITYQUESTIONS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "listPendingSecurityQuestions";
                service.listPendingSecurityQuestions(result -> {
                    if (result.succeeded())
                        message.reply(new JsonArray(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "listPendingSecurityQuestions");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("listPendingSecurityQuestions", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for sendSecurityQuestionAnswers
        vertx.eventBus().<JsonObject> consumer(SENDSECURITYQUESTIONANSWERS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "sendSecurityQuestionAnswers";
                JsonArray securityAnswerParam = message.body().getJsonArray("SecurityAnswer");
                if(securityAnswerParam == null) {
                    manageError(message, new MainApiException(400, "SecurityAnswer is required"), serviceId);
                    return;
                }
                List<SecurityAnswer> securityAnswer = Json.mapper.readValue(securityAnswerParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, List.class));
                service.sendSecurityQuestionAnswers(securityAnswer, result -> {
                    if (result.succeeded())
                        message.reply(null);
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "sendSecurityQuestionAnswers");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("sendSecurityQuestionAnswers", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
    }
    
    private void manageError(Message<JsonObject> message, Throwable cause, String serviceName) {
        int code = MainApiException.INTERNAL_SERVER_ERROR.getStatusCode();
        String statusMessage = MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage();
        if (cause instanceof MainApiException) {
            code = ((MainApiException)cause).getStatusCode();
            statusMessage = ((MainApiException)cause).getStatusMessage();
        } else {
            logUnexpectedError(serviceName, cause); 
        }
            
        message.fail(code, statusMessage);
    }
    
    private void logUnexpectedError(String serviceName, Throwable cause) {
        LOGGER.error("Unexpected error in "+ serviceName, cause);
    }
}
