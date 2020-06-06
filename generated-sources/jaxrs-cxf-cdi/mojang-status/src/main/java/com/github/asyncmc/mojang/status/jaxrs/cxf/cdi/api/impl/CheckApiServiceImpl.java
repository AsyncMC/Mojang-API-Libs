package com.github.asyncmc.mojang.status.jaxrs.cxf.cdi.api.impl;

import com.github.asyncmc.mojang.status.jaxrs.cxf.cdi.api.*;
import com.github.asyncmc.mojang.status.jaxrs.cxf.cdi.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;

import com.github.asyncmc.mojang.status.jaxrs.cxf.cdi.model.ApiStatus;

import java.util.List;

import java.io.InputStream;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@RequestScoped
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2020-06-06T02:33:01.670819300-03:00[America/Sao_Paulo]")
public class CheckApiServiceImpl implements CheckApiService {
      @Override
      public Response checkStatuses(SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
}
