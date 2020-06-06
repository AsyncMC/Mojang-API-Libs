package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.PlayerProfile;
import org.openapitools.server.api.model.SessionApiError;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface LoginApi  {
    //getPlayerProfile
    void getPlayerProfile(String strippedUuid, Boolean unsigned, Handler<AsyncResult<PlayerProfile>> handler);
    
}
