package controllers;

import apimodels.OrderStatisticsRequest;
import apimodels.OrderStatisticsResponse;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import javax.validation.constraints.*;

@SuppressWarnings("RedundantThrows")
public interface MiscellaneousApiControllerImpInterface {
    OrderStatisticsResponse getOrdersStatistics(OrderStatisticsRequest orderStatisticsRequest) throws Exception;

}
