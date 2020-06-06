package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.Error;
import java.io.File;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.SkinModel;

public final class SkinOperationsApiException extends MainApiException {
    public SkinOperationsApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }
    
    public static final SkinOperationsApiException SkinOperations_changePlayerSkin_400_Exception = new SkinOperationsApiException(400, "Upon error the server will send back a JSON with the error. (Success is a blank payload)");
    public static final SkinOperationsApiException SkinOperations_resetPlayerSkin_400_Exception = new SkinOperationsApiException(400, "Upon error the server will send back a JSON with the error. (Success is a blank payload)");
    public static final SkinOperationsApiException SkinOperations_uploadPlayerSkin_400_Exception = new SkinOperationsApiException(400, "Upon error the server will send back a JSON with the error. (Success is a blank payload)");
    

}