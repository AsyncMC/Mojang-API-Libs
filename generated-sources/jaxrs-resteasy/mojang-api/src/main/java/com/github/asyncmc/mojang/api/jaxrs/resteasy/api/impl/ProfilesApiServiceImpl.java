package com.github.asyncmc.mojang.api.jaxrs.resteasy.api.impl;

import com.github.asyncmc.mojang.api.jaxrs.resteasy.api.*;
import com.github.asyncmc.mojang.api.jaxrs.resteasy.model.*;


import com.github.asyncmc.mojang.api.jaxrs.resteasy.model.CurrentPlayerIDs;
import java.util.List;

import java.util.List;
import com.github.asyncmc.mojang.api.jaxrs.resteasy.api.NotFoundException;

import java.io.InputStream;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@RequestScoped
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2020-06-06T02:33:16.982094400-03:00[America/Sao_Paulo]")
public class ProfilesApiServiceImpl implements ProfilesApiService {
      public Response findUniqueIdsByName(List<String> requestBody,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
}
