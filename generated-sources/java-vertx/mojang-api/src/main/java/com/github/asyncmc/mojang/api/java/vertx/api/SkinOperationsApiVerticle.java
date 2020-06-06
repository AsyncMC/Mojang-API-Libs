package com.github.asyncmc.mojang.api.java.vertx.api;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import com.github.asyncmc.mojang.api.java.vertx.model.Error;
import java.io.File;
import org.openapitools.server.api.MainApiException;
import com.github.asyncmc.mojang.api.java.vertx.model.SkinModel;

import java.util.List;
import java.util.Map;

public class SkinOperationsApiVerticle extends AbstractVerticle {
    final static Logger LOGGER = LoggerFactory.getLogger(SkinOperationsApiVerticle.class); 
    
    final static String CHANGEPLAYERSKIN_SERVICE_ID = "changePlayerSkin";
    final static String RESETPLAYERSKIN_SERVICE_ID = "resetPlayerSkin";
    final static String UPLOADPLAYERSKIN_SERVICE_ID = "uploadPlayerSkin";
    
    final SkinOperationsApi service;

    public SkinOperationsApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("com.github.asyncmc.mojang.api.java.vertx.api.SkinOperationsApiImpl");
            service = (SkinOperationsApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("SkinOperationsApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for changePlayerSkin
        vertx.eventBus().<JsonObject> consumer(CHANGEPLAYERSKIN_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "changePlayerSkin";
                String strippedUuidParam = message.body().getString("stripped_uuid");
                if(strippedUuidParam == null) {
                    manageError(message, new MainApiException(400, "stripped_uuid is required"), serviceId);
                    return;
                }
                String strippedUuid = strippedUuidParam;
                String urlParam = message.body().getString("url");
                if(urlParam == null) {
                    manageError(message, new MainApiException(400, "url is required"), serviceId);
                    return;
                }
                String url = urlParam;
                JsonObject modelParam = message.body().getJsonObject("model");
                if (modelParam == null) {
                    manageError(message, new MainApiException(400, "model is required"), serviceId);
                    return;
                }
                SkinModel model = Json.mapper.readValue(modelParam.encode(), SkinModel.class);
                service.changePlayerSkin(strippedUuid, url, model, result -> {
                    if (result.succeeded())
                        message.reply(null);
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "changePlayerSkin");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("changePlayerSkin", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for resetPlayerSkin
        vertx.eventBus().<JsonObject> consumer(RESETPLAYERSKIN_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "resetPlayerSkin";
                String strippedUuidParam = message.body().getString("stripped_uuid");
                if(strippedUuidParam == null) {
                    manageError(message, new MainApiException(400, "stripped_uuid is required"), serviceId);
                    return;
                }
                String strippedUuid = strippedUuidParam;
                service.resetPlayerSkin(strippedUuid, result -> {
                    if (result.succeeded())
                        message.reply(null);
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "resetPlayerSkin");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("resetPlayerSkin", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for uploadPlayerSkin
        vertx.eventBus().<JsonObject> consumer(UPLOADPLAYERSKIN_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "uploadPlayerSkin";
                String strippedUuidParam = message.body().getString("stripped_uuid");
                if(strippedUuidParam == null) {
                    manageError(message, new MainApiException(400, "stripped_uuid is required"), serviceId);
                    return;
                }
                String strippedUuid = strippedUuidParam;
                String fileParam = message.body().getString("file");
                if(fileParam == null) {
                    manageError(message, new MainApiException(400, "file is required"), serviceId);
                    return;
                }
                File file = Json.mapper.readValue(fileParam, File.class);
                JsonObject modelParam = message.body().getJsonObject("model");
                if (modelParam == null) {
                    manageError(message, new MainApiException(400, "model is required"), serviceId);
                    return;
                }
                SkinModel model = Json.mapper.readValue(modelParam.encode(), SkinModel.class);
                service.uploadPlayerSkin(strippedUuid, file, model, result -> {
                    if (result.succeeded())
                        message.reply(null);
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "uploadPlayerSkin");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("uploadPlayerSkin", e);
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
