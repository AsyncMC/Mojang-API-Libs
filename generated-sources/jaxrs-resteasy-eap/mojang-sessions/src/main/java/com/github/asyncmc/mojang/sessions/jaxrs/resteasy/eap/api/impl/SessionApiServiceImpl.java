package com.github.asyncmc.mojang.sessions.jaxrs.resteasy.eap.api.impl;

import com.github.asyncmc.mojang.sessions.jaxrs.resteasy.eap.api.*;
import com.github.asyncmc.mojang.sessions.jaxrs.resteasy.eap.model.*;


import com.github.asyncmc.mojang.sessions.jaxrs.resteasy.eap.model.PlayerProfile;
import com.github.asyncmc.mojang.sessions.jaxrs.resteasy.eap.model.SessionApiError;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-06-06T02:33:15.320512100-03:00[America/Sao_Paulo]")
public class SessionApiServiceImpl implements SessionApi {
      public Response getPlayerProfile(String strippedUuid,Boolean unsigned,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
}
