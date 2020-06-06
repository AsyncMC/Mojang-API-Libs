package com.github.asyncmc.mojang.api.groovy.model;

import groovy.transform.Canonical
import com.github.asyncmc.mojang.api.groovy.model.OrderStatistic;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

@Canonical
class OrderStatisticsRequest {
    List<OrderStatistic> metricKeys = new ArrayList<OrderStatistic>()

}
