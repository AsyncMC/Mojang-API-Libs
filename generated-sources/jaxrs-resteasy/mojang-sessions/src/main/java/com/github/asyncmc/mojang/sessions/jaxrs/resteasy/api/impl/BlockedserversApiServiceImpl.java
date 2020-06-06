package com.github.asyncmc.mojang.sessions.jaxrs.resteasy.api.impl;

import com.github.asyncmc.mojang.sessions.jaxrs.resteasy.api.*;
import com.github.asyncmc.mojang.sessions.jaxrs.resteasy.model.*;



import java.util.List;
import com.github.asyncmc.mojang.sessions.jaxrs.resteasy.api.NotFoundException;

import java.io.InputStream;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@RequestScoped
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2020-06-06T05:00:10.317348300-03:00[America/Sao_Paulo]")
public class BlockedserversApiServiceImpl implements BlockedserversApiService {
      public Response getBlockedServerHashes(SecurityContext securityContext)
      throws NotFoundException {
      // do some magic!
      return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
  }
}
