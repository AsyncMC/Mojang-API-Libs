package com.github.asyncmc.mojang.api.java.vertx.api;

import com.github.asyncmc.mojang.api.java.vertx.model.Error;
import java.io.File;
import org.openapitools.server.api.MainApiException;
import com.github.asyncmc.mojang.api.java.vertx.model.SkinModel;

public final class SkinOperationsApiException extends MainApiException {
    public SkinOperationsApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }
    
    public static final SkinOperationsApiException SkinOperations_changePlayerSkin_400_Exception = new SkinOperationsApiException(400, "Upon error the server will send back a JSON with the error. (Success is a blank payload)");
    public static final SkinOperationsApiException SkinOperations_resetPlayerSkin_400_Exception = new SkinOperationsApiException(400, "Upon error the server will send back a JSON with the error. (Success is a blank payload)");
    public static final SkinOperationsApiException SkinOperations_uploadPlayerSkin_400_Exception = new SkinOperationsApiException(400, "Upon error the server will send back a JSON with the error. (Success is a blank payload)");
    

}