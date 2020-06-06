package com.github.asyncmc.mojang.api.java.play.framework.api;

import com.github.asyncmc.mojang.api.java.play.framework.model.Error;
import java.util.List;
import com.github.asyncmc.mojang.api.java.play.framework.model.SecurityAnswer;
import com.github.asyncmc.mojang.api.java.play.framework.model.SecurityChallenge;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import javax.validation.constraints.*;

@SuppressWarnings("RedundantThrows")
public interface SecurityQuestionAnswerApiControllerImpInterface {
    void checkSecurityStatus() throws Exception;

    List<SecurityChallenge> listPendingSecurityQuestions() throws Exception;

    void sendSecurityQuestionAnswers(List<SecurityAnswer> securityAnswer) throws Exception;

}
