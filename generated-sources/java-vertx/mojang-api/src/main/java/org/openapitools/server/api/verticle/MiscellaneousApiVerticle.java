package org.openapitools.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.OrderStatisticsRequest;
import org.openapitools.server.api.model.OrderStatisticsResponse;

import java.util.List;
import java.util.Map;

public class MiscellaneousApiVerticle extends AbstractVerticle {
    final static Logger LOGGER = LoggerFactory.getLogger(MiscellaneousApiVerticle.class); 
    
    final static String GETORDERSSTATISTICS_SERVICE_ID = "getOrdersStatistics";
    
    final MiscellaneousApi service;

    public MiscellaneousApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.MiscellaneousApiImpl");
            service = (MiscellaneousApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("MiscellaneousApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for getOrdersStatistics
        vertx.eventBus().<JsonObject> consumer(GETORDERSSTATISTICS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getOrdersStatistics";
                JsonObject orderStatisticsRequestParam = message.body().getJsonObject("OrderStatisticsRequest");
                if (orderStatisticsRequestParam == null) {
                    manageError(message, new MainApiException(400, "OrderStatisticsRequest is required"), serviceId);
                    return;
                }
                OrderStatisticsRequest orderStatisticsRequest = Json.mapper.readValue(orderStatisticsRequestParam.encode(), OrderStatisticsRequest.class);
                service.getOrdersStatistics(orderStatisticsRequest, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getOrdersStatistics");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getOrdersStatistics", e);
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
