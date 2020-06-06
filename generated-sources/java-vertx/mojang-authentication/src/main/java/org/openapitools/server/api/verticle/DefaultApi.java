package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.AccessKeys;
import org.openapitools.server.api.model.Authentication;
import org.openapitools.server.api.model.AuthenticationRequest;
import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.RefreshRequest;
import org.openapitools.server.api.model.RefreshResponse;
import org.openapitools.server.api.model.UsernamePassword;

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
