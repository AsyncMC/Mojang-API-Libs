package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.OrderStatisticsRequest;
import org.openapitools.server.api.model.OrderStatisticsResponse;

public final class MiscellaneousApiException extends MainApiException {
    public MiscellaneousApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }
    
    

}