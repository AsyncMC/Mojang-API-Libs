package com.github.asyncmc.mojang.api.java.vertx.api;

import org.openapitools.server.api.MainApiException;
import com.github.asyncmc.mojang.api.java.vertx.model.OrderStatisticsRequest;
import com.github.asyncmc.mojang.api.java.vertx.model.OrderStatisticsResponse;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface MiscellaneousApi  {
    //getOrdersStatistics
    void getOrdersStatistics(OrderStatisticsRequest orderStatisticsRequest, Handler<AsyncResult<OrderStatisticsResponse>> handler);
    
}
