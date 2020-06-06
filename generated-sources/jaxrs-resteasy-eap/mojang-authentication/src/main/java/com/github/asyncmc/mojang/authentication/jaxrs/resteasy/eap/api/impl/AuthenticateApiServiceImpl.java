package com.github.asyncmc.mojang.authentication.jaxrs.resteasy.eap.api.impl;

import com.github.asyncmc.mojang.authentication.jaxrs.resteasy.eap.api.*;
import com.github.asyncmc.mojang.authentication.jaxrs.resteasy.eap.model.*;


import com.github.asyncmc.mojang.authentication.jaxrs.resteasy.eap.model.Authentication;
import com.github.asyncmc.mojang.authentication.jaxrs.resteasy.eap.model.AuthenticationRequest;
import com.github.asyncmc.mojang.authentication.jaxrs.resteasy.eap.model.Error;
import com.github.asyncmc.mojang.authentication.jaxrs.resteasy.eap.model.UsernamePassword;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-06-06T05:00:05.874470300-03:00[America/Sao_Paulo]")
public class AuthenticateApiServiceImpl implements AuthenticateApi {
      public Response authenticate(AuthenticationRequest authenticationRequest,SecurityContext securityContext) {
      // do some magic!
      return Response.ok().build();
  }
}
