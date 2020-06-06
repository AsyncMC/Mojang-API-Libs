package com.github.asyncmc.mojang.status.jaxrs.resteasy.eap.api.impl;

import com.github.asyncmc.mojang.status.jaxrs.resteasy.eap.api.*;
import com.github.asyncmc.mojang.status.jaxrs.resteasy.eap.model.*;


import com.github.asyncmc.mojang.status.jaxrs.resteasy.eap.model.ApiStatus;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-06-06T02:33:16.185232300-03:00[America/Sao_Paulo]")
public class CheckApiServiceImpl implements CheckApi {
      public Response checkStatuses(SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
}
