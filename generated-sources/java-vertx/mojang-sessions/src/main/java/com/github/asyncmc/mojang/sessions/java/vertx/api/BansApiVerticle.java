package com.github.asyncmc.mojang.sessions.java.vertx.api;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import org.openapitools.server.api.MainApiException;

import java.util.List;
import java.util.Map;

public class BansApiVerticle extends AbstractVerticle {
    final static Logger LOGGER = LoggerFactory.getLogger(BansApiVerticle.class); 
    
    final static String GETBLOCKEDSERVERHASHES_SERVICE_ID = "getBlockedServerHashes";
    
    final BansApi service;

    public BansApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("com.github.asyncmc.mojang.sessions.java.vertx.api.BansApiImpl");
            service = (BansApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("BansApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for getBlockedServerHashes
        vertx.eventBus().<JsonObject> consumer(GETBLOCKEDSERVERHASHES_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getBlockedServerHashes";
                service.getBlockedServerHashes(result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getBlockedServerHashes");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getBlockedServerHashes", e);
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
