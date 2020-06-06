package com.github.asyncmc.mojang.status.java.vertx.api;

import com.github.asyncmc.mojang.status.java.vertx.model.ApiStatus;
import org.openapitools.server.api.MainApiException;

public final class DefaultApiException extends MainApiException {
    public DefaultApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }
    
    

}