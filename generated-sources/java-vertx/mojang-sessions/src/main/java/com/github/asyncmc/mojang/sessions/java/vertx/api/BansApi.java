package com.github.asyncmc.mojang.sessions.java.vertx.api;

import org.openapitools.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface BansApi  {
    //getBlockedServerHashes
    void getBlockedServerHashes(Handler<AsyncResult<String>> handler);
    
}
