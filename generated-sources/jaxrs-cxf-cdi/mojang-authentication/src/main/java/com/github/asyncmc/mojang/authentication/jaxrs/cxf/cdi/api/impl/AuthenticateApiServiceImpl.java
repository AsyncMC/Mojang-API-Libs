package com.github.asyncmc.mojang.authentication.jaxrs.cxf.cdi.api.impl;

import com.github.asyncmc.mojang.authentication.jaxrs.cxf.cdi.api.*;
import com.github.asyncmc.mojang.authentication.jaxrs.cxf.cdi.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;

import com.github.asyncmc.mojang.authentication.jaxrs.cxf.cdi.model.Authentication;
import com.github.asyncmc.mojang.authentication.jaxrs.cxf.cdi.model.AuthenticationRequest;
import com.github.asyncmc.mojang.authentication.jaxrs.cxf.cdi.model.Error;
import com.github.asyncmc.mojang.authentication.jaxrs.cxf.cdi.model.UsernamePassword;

import java.util.List;

import java.io.InputStream;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@RequestScoped
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2020-06-06T04:59:51.255462600-03:00[America/Sao_Paulo]")
public class AuthenticateApiServiceImpl implements AuthenticateApiService {
      @Override
      public Response authenticate(AuthenticationRequest authenticationRequest, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
}
