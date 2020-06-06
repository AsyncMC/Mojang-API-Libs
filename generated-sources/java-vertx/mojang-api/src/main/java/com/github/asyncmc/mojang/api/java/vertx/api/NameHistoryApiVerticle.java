package com.github.asyncmc.mojang.api.java.vertx.api;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import com.github.asyncmc.mojang.api.java.vertx.model.CurrentPlayerIDs;
import com.github.asyncmc.mojang.api.java.vertx.model.Error;
import org.openapitools.server.api.MainApiException;
import com.github.asyncmc.mojang.api.java.vertx.model.NameChange;

import java.util.List;
import java.util.Map;

public class NameHistoryApiVerticle extends AbstractVerticle {
    final static Logger LOGGER = LoggerFactory.getLogger(NameHistoryApiVerticle.class); 
    
    final static String FINDUNIQUEIDSBYNAME_SERVICE_ID = "findUniqueIdsByName";
    final static String GETNAMEHISTORY_SERVICE_ID = "getNameHistory";
    final static String GETUNIQUEIDBYNAME_SERVICE_ID = "getUniqueIdByName";
    
    final NameHistoryApi service;

    public NameHistoryApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("com.github.asyncmc.mojang.api.java.vertx.api.NameHistoryApiImpl");
            service = (NameHistoryApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("NameHistoryApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for findUniqueIdsByName
        vertx.eventBus().<JsonObject> consumer(FINDUNIQUEIDSBYNAME_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "findUniqueIdsByName";
                JsonArray requestBodyParam = message.body().getJsonArray("request_body");
                if(requestBodyParam == null) {
                    manageError(message, new MainApiException(400, "request_body is required"), serviceId);
                    return;
                }
                List<String> requestBody = Json.mapper.readValue(requestBodyParam.encode(),
                    Json.mapper.getTypeFactory().constructCollectionType(List.class, List.class));
                service.findUniqueIdsByName(requestBody, result -> {
                    if (result.succeeded())
                        message.reply(new JsonArray(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "findUniqueIdsByName");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("findUniqueIdsByName", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getNameHistory
        vertx.eventBus().<JsonObject> consumer(GETNAMEHISTORY_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getNameHistory";
                String strippedUuidParam = message.body().getString("stripped_uuid");
                if(strippedUuidParam == null) {
                    manageError(message, new MainApiException(400, "stripped_uuid is required"), serviceId);
                    return;
                }
                String strippedUuid = strippedUuidParam;
                service.getNameHistory(strippedUuid, result -> {
                    if (result.succeeded())
                        message.reply(new JsonArray(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getNameHistory");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getNameHistory", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getUniqueIdByName
        vertx.eventBus().<JsonObject> consumer(GETUNIQUEIDBYNAME_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getUniqueIdByName";
                String usernameParam = message.body().getString("username");
                if(usernameParam == null) {
                    manageError(message, new MainApiException(400, "username is required"), serviceId);
                    return;
                }
                String username = usernameParam;
                String atParam = message.body().getString("at");
                Long at = (atParam == null) ? null : Json.mapper.readValue(atParam, Long.class);
                service.getUniqueIdByName(username, at, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getUniqueIdByName");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getUniqueIdByName", e);
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
