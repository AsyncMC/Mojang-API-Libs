package com.github.asyncmc.mojang.status.java.vertx.api;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import com.github.asyncmc.mojang.status.java.vertx.model.ApiStatus;
import org.openapitools.server.api.MainApiException;

import java.util.List;
import java.util.Map;

public class DefaultApiVerticle extends AbstractVerticle {
    final static Logger LOGGER = LoggerFactory.getLogger(DefaultApiVerticle.class); 
    
    final static String CHECKSTATUSES_SERVICE_ID = "checkStatuses";
    
    final DefaultApi service;

    public DefaultApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("com.github.asyncmc.mojang.status.java.vertx.api.DefaultApiImpl");
            service = (DefaultApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("DefaultApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for checkStatuses
        vertx.eventBus().<JsonObject> consumer(CHECKSTATUSES_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "checkStatuses";
                service.checkStatuses(result -> {
                    if (result.succeeded())
                        message.reply(new JsonArray(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "checkStatuses");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("checkStatuses", e);
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
