package com.github.asyncmc.mojang.api.java.play.framework.api;

import com.github.asyncmc.mojang.api.java.play.framework.model.OrderStatisticsRequest;
import com.github.asyncmc.mojang.api.java.play.framework.model.OrderStatisticsResponse;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import javax.validation.constraints.*;

@SuppressWarnings("RedundantThrows")
public interface MiscellaneousApiControllerImpInterface {
    OrderStatisticsResponse getOrdersStatistics(OrderStatisticsRequest orderStatisticsRequest) throws Exception;

}
