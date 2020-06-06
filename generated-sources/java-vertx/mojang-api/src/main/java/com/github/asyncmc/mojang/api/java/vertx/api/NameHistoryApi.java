package com.github.asyncmc.mojang.api.java.vertx.api;

import com.github.asyncmc.mojang.api.java.vertx.model.CurrentPlayerIDs;
import com.github.asyncmc.mojang.api.java.vertx.model.Error;
import org.openapitools.server.api.MainApiException;
import com.github.asyncmc.mojang.api.java.vertx.model.NameChange;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface NameHistoryApi  {
    //findUniqueIdsByName
    void findUniqueIdsByName(List<String> requestBody, Handler<AsyncResult<List<CurrentPlayerIDs>>> handler);
    
    //getNameHistory
    void getNameHistory(String strippedUuid, Handler<AsyncResult<List<NameChange>>> handler);
    
    //getUniqueIdByName
    void getUniqueIdByName(String username, Long at, Handler<AsyncResult<CurrentPlayerIDs>> handler);
    
}
