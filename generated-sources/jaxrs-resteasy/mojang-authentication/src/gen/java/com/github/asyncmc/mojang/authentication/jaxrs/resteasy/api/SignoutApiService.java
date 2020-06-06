package com.github.asyncmc.mojang.authentication.jaxrs.resteasy.api;

import com.github.asyncmc.mojang.authentication.jaxrs.resteasy.api.*;
import com.github.asyncmc.mojang.authentication.jaxrs.resteasy.model.*;


import com.github.asyncmc.mojang.authentication.jaxrs.resteasy.model.Error;
import com.github.asyncmc.mojang.authentication.jaxrs.resteasy.model.UsernamePassword;

import java.util.List;
import com.github.asyncmc.mojang.authentication.jaxrs.resteasy.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2020-06-06T02:33:18.015861900-03:00[America/Sao_Paulo]")
public interface SignoutApiService {
      Response siginout(UsernamePassword usernamePassword,SecurityContext securityContext)
      throws NotFoundException;
}
