package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;

import org.openapitools.model.Error;
import java.io.File;
import java.util.List;
import org.openapitools.model.NameChange;
import org.openapitools.model.SecurityAnswer;
import org.openapitools.model.SecurityChallenge;
import org.openapitools.model.SkinModel;

import java.util.List;

import java.io.InputStream;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@RequestScoped
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2020-06-05T23:33:55.984553100-03:00[America/Sao_Paulo]")
public class UserApiServiceImpl implements UserApiService {
      @Override
      public Response changePlayerSkin(String strippedUuid, String url, SkinModel model, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response checkSecurityStatus(SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response getNameHistory(String strippedUuid, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response listPendingSecurityQuestions(SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response resetPlayerSkin(String strippedUuid, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response sendSecurityQuestionAnswers(List<SecurityAnswer> securityAnswer, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response uploadPlayerSkin(String strippedUuid, InputStream fileInputStream, Attachment fileDetail, SkinModel model, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
}
