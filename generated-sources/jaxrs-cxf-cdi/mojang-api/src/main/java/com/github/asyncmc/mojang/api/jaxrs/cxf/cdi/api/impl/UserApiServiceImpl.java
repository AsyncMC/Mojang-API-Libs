package com.github.asyncmc.mojang.api.jaxrs.cxf.cdi.api.impl;

import com.github.asyncmc.mojang.api.jaxrs.cxf.cdi.api.*;
import com.github.asyncmc.mojang.api.jaxrs.cxf.cdi.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;

import com.github.asyncmc.mojang.api.jaxrs.cxf.cdi.model.Error;
import java.io.File;
import java.util.List;
import com.github.asyncmc.mojang.api.jaxrs.cxf.cdi.model.NameChange;
import com.github.asyncmc.mojang.api.jaxrs.cxf.cdi.model.SecurityAnswer;
import com.github.asyncmc.mojang.api.jaxrs.cxf.cdi.model.SecurityChallenge;
import com.github.asyncmc.mojang.api.jaxrs.cxf.cdi.model.SkinModel;

import java.util.List;

import java.io.InputStream;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@RequestScoped
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2020-06-06T02:32:58.743651500-03:00[America/Sao_Paulo]")
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
