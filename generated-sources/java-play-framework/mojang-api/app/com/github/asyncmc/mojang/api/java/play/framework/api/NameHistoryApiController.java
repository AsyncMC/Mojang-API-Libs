package com.github.asyncmc.mojang.api.java.play.framework.api;

import com.github.asyncmc.mojang.api.java.play.framework.model.CurrentPlayerIDs;
import com.github.asyncmc.mojang.api.java.play.framework.model.Error;
import java.util.List;
import com.github.asyncmc.mojang.api.java.play.framework.model.NameChange;

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

public class NameHistoryApiController extends Controller {

    private final NameHistoryApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Configuration configuration;

    @Inject
    private NameHistoryApiController(Configuration configuration, NameHistoryApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }


    @ApiAction
    public Result findUniqueIdsByName() throws Exception {
        JsonNode noderequestBody = request().body().asJson();
        List<String> requestBody;
        if (noderequestBody != null) {
            requestBody = mapper.readValue(noderequestBody.toString(), new TypeReference<List<String>>(){});
            if (configuration.getBoolean("useInputBeanValidation")) {
                for (String curItem : requestBody) {
                    OpenAPIUtils.validate(curItem);
                }
            }
        } else {
            throw new IllegalArgumentException("'request_body' parameter is required");
        }
        List<CurrentPlayerIDs> obj = imp.findUniqueIdsByName(requestBody);
        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (CurrentPlayerIDs curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
    }

    @ApiAction
    public Result getNameHistory(String strippedUuid) throws Exception {
        List<NameChange> obj = imp.getNameHistory(strippedUuid);
        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (NameChange curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
    }

    @ApiAction
    public Result getUniqueIdByName(String username) throws Exception {
        String valueat = request().getQueryString("at");
        Long at;
        if (valueat != null) {
            at = Long.parseLong(valueat);
        } else {
            at = null;
        }
        CurrentPlayerIDs obj = imp.getUniqueIdByName(username, at);
        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
    }
}
