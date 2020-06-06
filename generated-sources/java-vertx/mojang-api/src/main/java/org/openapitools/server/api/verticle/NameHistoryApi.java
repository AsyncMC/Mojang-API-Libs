package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.CurrentPlayerIDs;
import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.NameChange;

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
