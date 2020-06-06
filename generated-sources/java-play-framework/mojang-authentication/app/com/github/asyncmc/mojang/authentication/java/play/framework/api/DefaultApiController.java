package com.github.asyncmc.mojang.authentication.java.play.framework.api;

import com.github.asyncmc.mojang.authentication.java.play.framework.model.AccessKeys;
import com.github.asyncmc.mojang.authentication.java.play.framework.model.Authentication;
import com.github.asyncmc.mojang.authentication.java.play.framework.model.AuthenticationRequest;
import com.github.asyncmc.mojang.authentication.java.play.framework.model.Error;
import com.github.asyncmc.mojang.authentication.java.play.framework.model.RefreshRequest;
import com.github.asyncmc.mojang.authentication.java.play.framework.model.RefreshResponse;
import com.github.asyncmc.mojang.authentication.java.play.framework.model.UsernamePassword;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2020-06-06T04:59:29.903633400-03:00[America/Sao_Paulo]")

public class DefaultApiController extends Controller {

    private final DefaultApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Configuration configuration;

    @Inject
    private DefaultApiController(Configuration configuration, DefaultApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }


    @ApiAction
    public Result authenticate() throws Exception {
        JsonNode nodeauthenticationRequest = request().body().asJson();
        AuthenticationRequest authenticationRequest;
        if (nodeauthenticationRequest != null) {
            authenticationRequest = mapper.readValue(nodeauthenticationRequest.toString(), AuthenticationRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(authenticationRequest);
            }
        } else {
            throw new IllegalArgumentException("'AuthenticationRequest' parameter is required");
        }
        Authentication obj = imp.authenticate(authenticationRequest);
        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
    }

    @ApiAction
    public Result invalidate() throws Exception {
        JsonNode nodeaccessKeys = request().body().asJson();
        AccessKeys accessKeys;
        if (nodeaccessKeys != null) {
            accessKeys = mapper.readValue(nodeaccessKeys.toString(), AccessKeys.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(accessKeys);
            }
        } else {
            throw new IllegalArgumentException("'AccessKeys' parameter is required");
        }
        imp.invalidate(accessKeys);
        return ok();
    }

    @ApiAction
    public Result refresh() throws Exception {
        JsonNode noderefreshRequest = request().body().asJson();
        RefreshRequest refreshRequest;
        if (noderefreshRequest != null) {
            refreshRequest = mapper.readValue(noderefreshRequest.toString(), RefreshRequest.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(refreshRequest);
            }
        } else {
            throw new IllegalArgumentException("'RefreshRequest' parameter is required");
        }
        RefreshResponse obj = imp.refresh(refreshRequest);
        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
    }

    @ApiAction
    public Result siginout() throws Exception {
        JsonNode nodeusernamePassword = request().body().asJson();
        UsernamePassword usernamePassword;
        if (nodeusernamePassword != null) {
            usernamePassword = mapper.readValue(nodeusernamePassword.toString(), UsernamePassword.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(usernamePassword);
            }
        } else {
            throw new IllegalArgumentException("'UsernamePassword' parameter is required");
        }
        imp.siginout(usernamePassword);
        return ok();
    }

    @ApiAction
    public Result validate() throws Exception {
        JsonNode nodeaccessKeys = request().body().asJson();
        AccessKeys accessKeys;
        if (nodeaccessKeys != null) {
            accessKeys = mapper.readValue(nodeaccessKeys.toString(), AccessKeys.class);
            if (configuration.getBoolean("useInputBeanValidation")) {
                OpenAPIUtils.validate(accessKeys);
            }
        } else {
            throw new IllegalArgumentException("'AccessKeys' parameter is required");
        }
        imp.validate(accessKeys);
        return ok();
    }
}
