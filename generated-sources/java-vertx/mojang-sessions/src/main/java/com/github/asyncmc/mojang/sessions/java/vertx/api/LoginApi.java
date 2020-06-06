package com.github.asyncmc.mojang.sessions.java.vertx.api;

import org.openapitools.server.api.MainApiException;
import com.github.asyncmc.mojang.sessions.java.vertx.model.PlayerProfile;
import com.github.asyncmc.mojang.sessions.java.vertx.model.SessionApiError;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface LoginApi  {
    //getPlayerProfile
    void getPlayerProfile(String strippedUuid, Boolean unsigned, Handler<AsyncResult<PlayerProfile>> handler);
    
}
