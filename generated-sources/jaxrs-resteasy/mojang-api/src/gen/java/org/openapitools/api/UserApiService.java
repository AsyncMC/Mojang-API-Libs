package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;


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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2020-06-05T23:34:14.066473100-03:00[America/Sao_Paulo]")
public interface UserApiService {
      Response changePlayerSkin(String strippedUuid,String url,SkinModel model,SecurityContext securityContext)
      throws NotFoundException;
      Response checkSecurityStatus(SecurityContext securityContext)
      throws NotFoundException;
      Response getNameHistory(String strippedUuid,SecurityContext securityContext)
      throws NotFoundException;
      Response listPendingSecurityQuestions(SecurityContext securityContext)
      throws NotFoundException;
      Response resetPlayerSkin(String strippedUuid,SecurityContext securityContext)
      throws NotFoundException;
      Response sendSecurityQuestionAnswers(List<SecurityAnswer> securityAnswer,SecurityContext securityContext)
      throws NotFoundException;
      Response uploadPlayerSkin(MultipartFormDataInput input,String strippedUuid,SecurityContext securityContext)
      throws NotFoundException;
}
