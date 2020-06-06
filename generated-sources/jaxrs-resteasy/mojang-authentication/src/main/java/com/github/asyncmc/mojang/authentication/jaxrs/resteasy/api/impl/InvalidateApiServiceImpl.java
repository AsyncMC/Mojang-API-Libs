package com.github.asyncmc.mojang.authentication.jaxrs.resteasy.api.impl;

import com.github.asyncmc.mojang.authentication.jaxrs.resteasy.api.*;
import com.github.asyncmc.mojang.authentication.jaxrs.resteasy.model.*;


import com.github.asyncmc.mojang.authentication.jaxrs.resteasy.model.AccessKeys;
import com.github.asyncmc.mojang.authentication.jaxrs.resteasy.model.Error;

import java.util.List;
import com.github.asyncmc.mojang.authentication.jaxrs.resteasy.api.NotFoundException;

import java.io.InputStream;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@RequestScoped
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2020-06-06T02:33:18.015861900-03:00[America/Sao_Paulo]")
public class InvalidateApiServiceImpl implements InvalidateApiService {
      public Response invalidate(AccessKeys accessKeys,SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
}
