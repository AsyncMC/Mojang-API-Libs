package com.github.asyncmc.mojang.api.java.vertx.api;

import com.github.asyncmc.mojang.api.java.vertx.model.Error;
import java.io.File;
import org.openapitools.server.api.MainApiException;
import com.github.asyncmc.mojang.api.java.vertx.model.SkinModel;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface SkinOperationsApi  {
    //changePlayerSkin
    void changePlayerSkin(String strippedUuid, String url, SkinModel model, Handler<AsyncResult<Void>> handler);
    
    //resetPlayerSkin
    void resetPlayerSkin(String strippedUuid, Handler<AsyncResult<Void>> handler);
    
    //uploadPlayerSkin
    void uploadPlayerSkin(String strippedUuid, File file, SkinModel model, Handler<AsyncResult<Void>> handler);
    
}
