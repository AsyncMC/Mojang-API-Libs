package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import org.openapitools.model.Error;
import java.io.File;
import java.util.List;
import org.openapitools.model.NameChange;
import org.openapitools.model.SecurityAnswer;
import org.openapitools.model.SecurityChallenge;
import org.openapitools.model.SkinModel;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2020-06-05T23:33:24.655917700-03:00[America/Sao_Paulo]")
public abstract class UserApiService {
    public abstract Response changePlayerSkin(String strippedUuid
 ,String url
 ,SkinModel model
 ) throws NotFoundException;
    public abstract Response checkSecurityStatus() throws NotFoundException;
    public abstract Response getNameHistory(String strippedUuid
 ) throws NotFoundException;
    public abstract Response listPendingSecurityQuestions() throws NotFoundException;
    public abstract Response resetPlayerSkin(String strippedUuid
 ) throws NotFoundException;
    public abstract Response sendSecurityQuestionAnswers(List<SecurityAnswer> securityAnswer
 ) throws NotFoundException;
    public abstract Response uploadPlayerSkin(String strippedUuid
 ,InputStream fileInputStream, FileInfo fileDetail
 ,SkinModel model
 ) throws NotFoundException;
}
