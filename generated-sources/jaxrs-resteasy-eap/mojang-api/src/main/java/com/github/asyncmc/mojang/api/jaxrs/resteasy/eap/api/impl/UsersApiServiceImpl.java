package com.github.asyncmc.mojang.api.jaxrs.resteasy.eap.api.impl;

import com.github.asyncmc.mojang.api.jaxrs.resteasy.eap.api.*;
import com.github.asyncmc.mojang.api.jaxrs.resteasy.eap.model.*;


import com.github.asyncmc.mojang.api.jaxrs.resteasy.eap.model.CurrentPlayerIDs;
import com.github.asyncmc.mojang.api.jaxrs.resteasy.eap.model.Error;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-06-06T02:33:13.397400-03:00[America/Sao_Paulo]")
public class UsersApiServiceImpl implements UsersApi {
      public Response getUniqueIdByName(String username,Long at,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
}
