package com.github.asyncmc.mojang.authentication.java.vertx.api;

import com.github.asyncmc.mojang.authentication.java.vertx.model.AccessKeys;
import com.github.asyncmc.mojang.authentication.java.vertx.model.Authentication;
import com.github.asyncmc.mojang.authentication.java.vertx.model.AuthenticationRequest;
import com.github.asyncmc.mojang.authentication.java.vertx.model.Error;
import org.openapitools.server.api.MainApiException;
import com.github.asyncmc.mojang.authentication.java.vertx.model.RefreshRequest;
import com.github.asyncmc.mojang.authentication.java.vertx.model.RefreshResponse;
import com.github.asyncmc.mojang.authentication.java.vertx.model.UsernamePassword;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface DefaultApi  {
    //authenticate
    void authenticate(AuthenticationRequest authenticationRequest, Handler<AsyncResult<Authentication>> handler);
    
    //invalidate
    void invalidate(AccessKeys accessKeys, Handler<AsyncResult<Void>> handler);
    
    //refresh
    void refresh(RefreshRequest refreshRequest, Handler<AsyncResult<RefreshResponse>> handler);
    
    //siginout
    void siginout(UsernamePassword usernamePassword, Handler<AsyncResult<Void>> handler);
    
    //validate
    void validate(AccessKeys accessKeys, Handler<AsyncResult<Void>> handler);
    
}
