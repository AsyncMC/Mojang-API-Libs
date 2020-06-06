package com.github.asyncmc.mojang.sessions.java.vertx.api;

import org.openapitools.server.api.MainApiException;

public final class BansApiException extends MainApiException {
    public BansApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }
    
    

}