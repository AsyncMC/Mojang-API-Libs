package com.github.asyncmc.mojang.sessions.java.play.framework.api;

import com.github.asyncmc.mojang.sessions.java.play.framework.model.PlayerProfile;
import com.github.asyncmc.mojang.sessions.java.play.framework.model.SessionApiError;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2020-06-06T04:59:30.811111-03:00[America/Sao_Paulo]")

public class LoginApiController extends Controller {

    private final LoginApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Configuration configuration;

    @Inject
    private LoginApiController(Configuration configuration, LoginApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }


    @ApiAction
    public Result getPlayerProfile(String strippedUuid) throws Exception {
        String valueunsigned = request().getQueryString("unsigned");
        Boolean unsigned;
        if (valueunsigned != null) {
            unsigned = Boolean.valueOf(valueunsigned);
        } else {
            unsigned = null;
        }
        PlayerProfile obj = imp.getPlayerProfile(strippedUuid, unsigned);
        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
    }
}
