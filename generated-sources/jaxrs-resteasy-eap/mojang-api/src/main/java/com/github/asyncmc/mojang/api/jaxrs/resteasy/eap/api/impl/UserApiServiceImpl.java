package com.github.asyncmc.mojang.api.jaxrs.resteasy.eap.api.impl;

import com.github.asyncmc.mojang.api.jaxrs.resteasy.eap.api.*;
import com.github.asyncmc.mojang.api.jaxrs.resteasy.eap.model.*;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;


import com.github.asyncmc.mojang.api.jaxrs.resteasy.eap.model.Error;
import java.io.File;
import java.util.List;
import com.github.asyncmc.mojang.api.jaxrs.resteasy.eap.model.NameChange;
import com.github.asyncmc.mojang.api.jaxrs.resteasy.eap.model.SecurityAnswer;
import com.github.asyncmc.mojang.api.jaxrs.resteasy.eap.model.SecurityChallenge;
import com.github.asyncmc.mojang.api.jaxrs.resteasy.eap.model.SkinModel;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-06-06T02:33:13.397400-03:00[America/Sao_Paulo]")
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
