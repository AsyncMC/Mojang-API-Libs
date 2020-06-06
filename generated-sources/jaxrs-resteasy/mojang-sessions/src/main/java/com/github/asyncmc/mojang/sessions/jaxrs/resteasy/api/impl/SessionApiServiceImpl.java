package com.github.asyncmc.mojang.sessions.jaxrs.resteasy.api.impl;

import com.github.asyncmc.mojang.sessions.jaxrs.resteasy.api.*;
import com.github.asyncmc.mojang.sessions.jaxrs.resteasy.model.*;


import com.github.asyncmc.mojang.sessions.jaxrs.resteasy.model.PlayerProfile;
import com.github.asyncmc.mojang.sessions.jaxrs.resteasy.model.SessionApiError;

import java.util.List;
import com.github.asyncmc.mojang.sessions.jaxrs.resteasy.api.NotFoundException;

import java.io.InputStream;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@RequestScoped
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2020-06-06T02:33:18.906240-03:00[America/Sao_Paulo]")
public class SessionApiServiceImpl implements SessionApiService {
      public Response getPlayerProfile(String strippedUuid,Boolean unsigned,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
}
