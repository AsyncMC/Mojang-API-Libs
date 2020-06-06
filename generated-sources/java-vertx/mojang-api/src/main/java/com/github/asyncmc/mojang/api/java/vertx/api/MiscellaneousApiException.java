package com.github.asyncmc.mojang.api.java.vertx.api;

import org.openapitools.server.api.MainApiException;
import com.github.asyncmc.mojang.api.java.vertx.model.OrderStatisticsRequest;
import com.github.asyncmc.mojang.api.java.vertx.model.OrderStatisticsResponse;

public final class MiscellaneousApiException extends MainApiException {
    public MiscellaneousApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }
    
    

}