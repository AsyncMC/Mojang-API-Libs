package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.CurrentPlayerIDs;
import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.NameChange;

public final class NameHistoryApiException extends MainApiException {
    public NameHistoryApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }
    
    public static final NameHistoryApiException NameHistory_getNameHistory_204_Exception = new NameHistoryApiException(204, "Username not found at the given time");
    public static final NameHistoryApiException NameHistory_getUniqueIdByName_204_Exception = new NameHistoryApiException(204, "User not found");
    public static final NameHistoryApiException NameHistory_getUniqueIdByName_400_Exception = new NameHistoryApiException(400, "If the timestamp is invalid");
    

}