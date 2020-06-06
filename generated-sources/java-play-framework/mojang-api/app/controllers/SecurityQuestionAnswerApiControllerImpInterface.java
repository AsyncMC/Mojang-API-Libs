package controllers;

import apimodels.Error;
import java.util.List;
import apimodels.SecurityAnswer;
import apimodels.SecurityChallenge;

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
