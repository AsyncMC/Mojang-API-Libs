package com.github.asyncmc.mojang.api.jaxrs.resteasy.api.impl;

import com.github.asyncmc.mojang.api.jaxrs.resteasy.api.*;
import com.github.asyncmc.mojang.api.jaxrs.resteasy.model.*;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;


import com.github.asyncmc.mojang.api.jaxrs.resteasy.model.Error;
import java.io.File;
import java.util.List;
import com.github.asyncmc.mojang.api.jaxrs.resteasy.model.NameChange;
import com.github.asyncmc.mojang.api.jaxrs.resteasy.model.SecurityAnswer;
import com.github.asyncmc.mojang.api.jaxrs.resteasy.model.SecurityChallenge;
import com.github.asyncmc.mojang.api.jaxrs.resteasy.model.SkinModel;

import java.util.List;
import com.github.asyncmc.mojang.api.jaxrs.resteasy.api.NotFoundException;

import java.io.InputStream;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@RequestScoped
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2020-06-06T05:00:08.418392200-03:00[America/Sao_Paulo]")
public class UserApiServiceImpl implements UserApiService {
      public Response changePlayerSkin(String strippedUuid,String url,SkinModel model,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response checkSecurityStatus(SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response getNameHistory(String strippedUuid,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response listPendingSecurityQuestions(SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response resetPlayerSkin(String strippedUuid,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response sendSecurityQuestionAnswers(List<SecurityAnswer> securityAnswer,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
      public Response uploadPlayerSkin(MultipartFormDataInput input,String strippedUuid,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
}
