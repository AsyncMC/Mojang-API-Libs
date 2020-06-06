package com.github.asyncmc.mojang.authentication.java.vertx.api;

import com.github.asyncmc.mojang.authentication.java.vertx.model.AccessKeys;
import com.github.asyncmc.mojang.authentication.java.vertx.model.Authentication;
import com.github.asyncmc.mojang.authentication.java.vertx.model.AuthenticationRequest;
import com.github.asyncmc.mojang.authentication.java.vertx.model.Error;
import org.openapitools.server.api.MainApiException;
import com.github.asyncmc.mojang.authentication.java.vertx.model.RefreshRequest;
import com.github.asyncmc.mojang.authentication.java.vertx.model.RefreshResponse;
import com.github.asyncmc.mojang.authentication.java.vertx.model.UsernamePassword;

public final class DefaultApiException extends MainApiException {
    public DefaultApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }
    
    public static final DefaultApiException Default_authenticate_400_Exception = new DefaultApiException(400, "Could not authenticate");
    public static final DefaultApiException Default_invalidate_400_Exception = new DefaultApiException(400, "Could not invalidate the token");
    public static final DefaultApiException Default_refresh_400_Exception = new DefaultApiException(400, "Could not refresh the session");
    public static final DefaultApiException Default_siginout_400_Exception = new DefaultApiException(400, "Invalid username/password");
    public static final DefaultApiException Default_validate_403_Exception = new DefaultApiException(403, "The token is not valid");
    

}