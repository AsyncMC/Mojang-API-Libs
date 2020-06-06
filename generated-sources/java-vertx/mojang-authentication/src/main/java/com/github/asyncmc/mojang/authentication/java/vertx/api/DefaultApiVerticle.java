package com.github.asyncmc.mojang.authentication.java.vertx.api;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import com.github.asyncmc.mojang.authentication.java.vertx.model.AccessKeys;
import com.github.asyncmc.mojang.authentication.java.vertx.model.Authentication;
import com.github.asyncmc.mojang.authentication.java.vertx.model.AuthenticationRequest;
import com.github.asyncmc.mojang.authentication.java.vertx.model.Error;
import org.openapitools.server.api.MainApiException;
import com.github.asyncmc.mojang.authentication.java.vertx.model.RefreshRequest;
import com.github.asyncmc.mojang.authentication.java.vertx.model.RefreshResponse;
import com.github.asyncmc.mojang.authentication.java.vertx.model.UsernamePassword;

import java.util.List;
import java.util.Map;

public class DefaultApiVerticle extends AbstractVerticle {
    final static Logger LOGGER = LoggerFactory.getLogger(DefaultApiVerticle.class); 
    
    final static String AUTHENTICATE_SERVICE_ID = "authenticate";
    final static String INVALIDATE_SERVICE_ID = "invalidate";
    final static String REFRESH_SERVICE_ID = "refresh";
    final static String SIGINOUT_SERVICE_ID = "siginout";
    final static String VALIDATE_SERVICE_ID = "validate";
    
    final DefaultApi service;

    public DefaultApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("com.github.asyncmc.mojang.authentication.java.vertx.api.DefaultApiImpl");
            service = (DefaultApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("DefaultApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for authenticate
        vertx.eventBus().<JsonObject> consumer(AUTHENTICATE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "authenticate";
                JsonObject authenticationRequestParam = message.body().getJsonObject("AuthenticationRequest");
                if (authenticationRequestParam == null) {
                    manageError(message, new MainApiException(400, "AuthenticationRequest is required"), serviceId);
                    return;
                }
                AuthenticationRequest authenticationRequest = Json.mapper.readValue(authenticationRequestParam.encode(), AuthenticationRequest.class);
                service.authenticate(authenticationRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "authenticate");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("authenticate", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for invalidate
        vertx.eventBus().<JsonObject> consumer(INVALIDATE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "invalidate";
                JsonObject accessKeysParam = message.body().getJsonObject("AccessKeys");
                if (accessKeysParam == null) {
                    manageError(message, new MainApiException(400, "AccessKeys is required"), serviceId);
                    return;
                }
                AccessKeys accessKeys = Json.mapper.readValue(accessKeysParam.encode(), AccessKeys.class);
                service.invalidate(accessKeys, result -> {
                    if (result.succeeded())
                        message.reply(null);
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "invalidate");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("invalidate", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for refresh
        vertx.eventBus().<JsonObject> consumer(REFRESH_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "refresh";
                JsonObject refreshRequestParam = message.body().getJsonObject("RefreshRequest");
                if (refreshRequestParam == null) {
                    manageError(message, new MainApiException(400, "RefreshRequest is required"), serviceId);
                    return;
                }
                RefreshRequest refreshRequest = Json.mapper.readValue(refreshRequestParam.encode(), RefreshRequest.class);
                service.refresh(refreshRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "refresh");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("refresh", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for siginout
        vertx.eventBus().<JsonObject> consumer(SIGINOUT_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "siginout";
                JsonObject usernamePasswordParam = message.body().getJsonObject("UsernamePassword");
                if (usernamePasswordParam == null) {
                    manageError(message, new MainApiException(400, "UsernamePassword is required"), serviceId);
                    return;
                }
                UsernamePassword usernamePassword = Json.mapper.readValue(usernamePasswordParam.encode(), UsernamePassword.class);
                service.siginout(usernamePassword, result -> {
                    if (result.succeeded())
                        message.reply(null);
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "siginout");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("siginout", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for validate
        vertx.eventBus().<JsonObject> consumer(VALIDATE_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "validate";
                JsonObject accessKeysParam = message.body().getJsonObject("AccessKeys");
                if (accessKeysParam == null) {
                    manageError(message, new MainApiException(400, "AccessKeys is required"), serviceId);
                    return;
                }
                AccessKeys accessKeys = Json.mapper.readValue(accessKeysParam.encode(), AccessKeys.class);
                service.validate(accessKeys, result -> {
                    if (result.succeeded())
                        message.reply(null);
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "validate");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("validate", e);
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
