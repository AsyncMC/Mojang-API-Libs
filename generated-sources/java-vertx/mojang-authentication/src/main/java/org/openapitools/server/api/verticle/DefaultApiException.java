package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.AccessKeys;
import org.openapitools.server.api.model.Authentication;
import org.openapitools.server.api.model.AuthenticationRequest;
import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.RefreshRequest;
import org.openapitools.server.api.model.RefreshResponse;
import org.openapitools.server.api.model.UsernamePassword;

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