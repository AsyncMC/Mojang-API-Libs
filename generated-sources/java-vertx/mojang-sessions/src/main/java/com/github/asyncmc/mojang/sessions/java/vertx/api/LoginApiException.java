package com.github.asyncmc.mojang.sessions.java.vertx.api;

import org.openapitools.server.api.MainApiException;
import com.github.asyncmc.mojang.sessions.java.vertx.model.PlayerProfile;
import com.github.asyncmc.mojang.sessions.java.vertx.model.SessionApiError;

public final class LoginApiException extends MainApiException {
    public LoginApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }
    
    public static final LoginApiException Login_getPlayerProfile_400_Exception = new LoginApiException(400, "UUID is invalid");
    

}