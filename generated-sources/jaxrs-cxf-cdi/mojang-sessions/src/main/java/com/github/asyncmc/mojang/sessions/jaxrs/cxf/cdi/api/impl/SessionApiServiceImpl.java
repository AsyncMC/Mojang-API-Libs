package com.github.asyncmc.mojang.sessions.jaxrs.cxf.cdi.api.impl;

import com.github.asyncmc.mojang.sessions.jaxrs.cxf.cdi.api.*;
import com.github.asyncmc.mojang.sessions.jaxrs.cxf.cdi.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;

import com.github.asyncmc.mojang.sessions.jaxrs.cxf.cdi.model.PlayerProfile;
import com.github.asyncmc.mojang.sessions.jaxrs.cxf.cdi.model.SessionApiError;

import java.util.List;

import java.io.InputStream;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@RequestScoped
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2020-06-06T04:59:52.199488500-03:00[America/Sao_Paulo]")
public class SessionApiServiceImpl implements SessionApiService {
      @Override
      public Response getPlayerProfile(String strippedUuid, Boolean unsigned, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
}
