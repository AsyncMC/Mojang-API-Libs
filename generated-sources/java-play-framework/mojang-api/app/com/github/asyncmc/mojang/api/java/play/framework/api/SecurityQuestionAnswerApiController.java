package com.github.asyncmc.mojang.api.java.play.framework.api;

import com.github.asyncmc.mojang.api.java.play.framework.model.Error;
import java.util.List;
import com.github.asyncmc.mojang.api.java.play.framework.model.SecurityAnswer;
import com.github.asyncmc.mojang.api.java.play.framework.model.SecurityChallenge;

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

public class SecurityQuestionAnswerApiController extends Controller {

    private final SecurityQuestionAnswerApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Configuration configuration;

    @Inject
    private SecurityQuestionAnswerApiController(Configuration configuration, SecurityQuestionAnswerApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }


    @ApiAction
    public Result checkSecurityStatus() throws Exception {
        imp.checkSecurityStatus();
        return ok();
    }

    @ApiAction
    public Result listPendingSecurityQuestions() throws Exception {
        List<SecurityChallenge> obj = imp.listPendingSecurityQuestions();
        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (SecurityChallenge curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
    }

    @ApiAction
    public Result sendSecurityQuestionAnswers() throws Exception {
        JsonNode nodesecurityAnswer = request().body().asJson();
        List<SecurityAnswer> securityAnswer;
        if (nodesecurityAnswer != null) {
            securityAnswer = mapper.readValue(nodesecurityAnswer.toString(), new TypeReference<List<SecurityAnswer>>(){});
            if (configuration.getBoolean("useInputBeanValidation")) {
                for (SecurityAnswer curItem : securityAnswer) {
                    OpenAPIUtils.validate(curItem);
                }
            }
        } else {
            throw new IllegalArgumentException("'SecurityAnswer' parameter is required");
        }
        imp.sendSecurityQuestionAnswers(securityAnswer);
        return ok();
    }
}
