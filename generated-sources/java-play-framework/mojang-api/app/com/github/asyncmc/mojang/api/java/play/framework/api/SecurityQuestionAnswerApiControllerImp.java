package com.github.asyncmc.mojang.api.java.play.framework.api;

import com.github.asyncmc.mojang.api.java.play.framework.model.Error;
import java.util.List;
import com.github.asyncmc.mojang.api.java.play.framework.model.SecurityAnswer;
import com.github.asyncmc.mojang.api.java.play.framework.model.SecurityChallenge;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.FileInputStream;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2020-06-06T02:32:37.270382100-03:00[America/Sao_Paulo]")

public class SecurityQuestionAnswerApiControllerImp implements SecurityQuestionAnswerApiControllerImpInterface {
    @Override
    public void checkSecurityStatus() throws Exception {
        //Do your magic!!!
    }

    @Override
    public List<SecurityChallenge> listPendingSecurityQuestions() throws Exception {
        //Do your magic!!!
        return new ArrayList<SecurityChallenge>();
    }

    @Override
    public void sendSecurityQuestionAnswers(List<SecurityAnswer> securityAnswer) throws Exception {
        //Do your magic!!!
    }

}
