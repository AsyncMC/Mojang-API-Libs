package com.github.asyncmc.mojang.api.java.play.framework.api;

import com.github.asyncmc.mojang.api.java.play.framework.model.OrderStatisticsRequest;
import com.github.asyncmc.mojang.api.java.play.framework.model.OrderStatisticsResponse;

import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Http;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import java.io.File;
import openapitools.OpenAPIUtils;
import com.fasterxml.jackson.core.type.TypeReference;

import javax.validation.constraints.*;
import play.Configuration;

import openapitools.OpenAPIUtils.ApiAction;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2020-06-06T04:59:28.832500800-03:00[America/Sao_Paulo]")

public class MiscellaneousApiController extends Controller {

    private final MiscellaneousApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Configuration configuration;

    @Inject
    private MiscellaneousApiController(Configuration configuration, MiscellaneousApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }


    @ApiAction
    public Result getOrdersStatistics() throws Exception {
        JsonNode nodeorderStatisticsRequest = request().body().asJson();
        OrderStatisticsRequest orderStatisticsRequest;
        if (nodeorderStatisticsRequest != null) {
            orderStatisticsRequest = mapper.readValue(nodeorderStatisticsRequest.toString(), OrderStatisticsRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(orderStatisticsRequest);
            }
        } else {
            throw new IllegalArgumentException("'OrderStatisticsRequest' parameter is required");
        }
        OrderStatisticsResponse obj = imp.getOrdersStatistics(orderStatisticsRequest);
        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
    }
}
