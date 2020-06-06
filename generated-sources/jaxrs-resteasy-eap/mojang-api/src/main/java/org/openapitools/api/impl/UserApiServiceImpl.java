package org.openapitools.api.impl;

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

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-06-05T23:34:10.608540300-03:00[America/Sao_Paulo]")
public class UserApiServiceImpl implements UserApi {
      public Response changePlayerSkin(String strippedUuid,String url,SkinModel model,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response checkSecurityStatus(SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response getNameHistory(String strippedUuid,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response listPendingSecurityQuestions(SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response resetPlayerSkin(String strippedUuid,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response sendSecurityQuestionAnswers(List<SecurityAnswer> securityAnswer,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
      public Response uploadPlayerSkin(MultipartFormDataInput input,String strippedUuid,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
}
