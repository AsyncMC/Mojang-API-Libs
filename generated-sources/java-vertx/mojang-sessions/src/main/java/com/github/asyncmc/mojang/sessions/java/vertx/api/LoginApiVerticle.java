package com.github.asyncmc.mojang.sessions.java.vertx.api;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import org.openapitools.server.api.MainApiException;
import com.github.asyncmc.mojang.sessions.java.vertx.model.PlayerProfile;
import com.github.asyncmc.mojang.sessions.java.vertx.model.SessionApiError;

import java.util.List;
import java.util.Map;

public class LoginApiVerticle extends AbstractVerticle {
    final static Logger LOGGER = LoggerFactory.getLogger(LoginApiVerticle.class); 
    
    final static String GETPLAYERPROFILE_SERVICE_ID = "getPlayerProfile";
    
    final LoginApi service;

    public LoginApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("com.github.asyncmc.mojang.sessions.java.vertx.api.LoginApiImpl");
            service = (LoginApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("LoginApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for getPlayerProfile
        vertx.eventBus().<JsonObject> consumer(GETPLAYERPROFILE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getPlayerProfile";
                String strippedUuidParam = message.body().getString("stripped_uuid");
                if(strippedUuidParam == null) {
                    manageError(message, new MainApiException(400, "stripped_uuid is required"), serviceId);
                    return;
                }
                String strippedUuid = strippedUuidParam;
                String unsignedParam = message.body().getString("unsigned");
                Boolean unsigned = (unsignedParam == null) ? null : Json.mapper.readValue(unsignedParam, Boolean.class);
                service.getPlayerProfile(strippedUuid, unsigned, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getPlayerProfile");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getPlayerProfile", e);
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
