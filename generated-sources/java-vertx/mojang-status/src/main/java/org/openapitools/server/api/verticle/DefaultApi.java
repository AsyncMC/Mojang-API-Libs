package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.ApiStatus;
import org.openapitools.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface DefaultApi  {
    //checkStatuses
    void checkStatuses(Handler<AsyncResult<List<Map<String, ApiStatus>>>> handler);
    
}
