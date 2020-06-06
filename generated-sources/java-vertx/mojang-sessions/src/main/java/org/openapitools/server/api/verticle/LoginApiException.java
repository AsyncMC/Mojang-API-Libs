package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.PlayerProfile;
import org.openapitools.server.api.model.SessionApiError;

public final class LoginApiException extends MainApiException {
    public LoginApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }
    
    public static final LoginApiException Login_getPlayerProfile_400_Exception = new LoginApiException(400, "UUID is invalid");
    

}