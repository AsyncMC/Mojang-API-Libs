package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.OrderStatisticsRequest;
import org.openapitools.server.api.model.OrderStatisticsResponse;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface MiscellaneousApi  {
    //getOrdersStatistics
    void getOrdersStatistics(OrderStatisticsRequest orderStatisticsRequest, Handler<AsyncResult<OrderStatisticsResponse>> handler);
    
}
