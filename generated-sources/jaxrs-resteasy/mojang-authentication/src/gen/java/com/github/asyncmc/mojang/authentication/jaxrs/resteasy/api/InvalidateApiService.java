package com.github.asyncmc.mojang.authentication.jaxrs.resteasy.api;

import com.github.asyncmc.mojang.authentication.jaxrs.resteasy.api.*;
import com.github.asyncmc.mojang.authentication.jaxrs.resteasy.model.*;


import com.github.asyncmc.mojang.authentication.jaxrs.resteasy.model.AccessKeys;
import com.github.asyncmc.mojang.authentication.jaxrs.resteasy.model.Error;

import java.util.List;
import com.github.asyncmc.mojang.authentication.jaxrs.resteasy.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2020-06-06T05:00:09.430070900-03:00[America/Sao_Paulo]")
public interface InvalidateApiService {
      Response invalidate(AccessKeys accessKeys,SecurityContext securityContext)
      throws NotFoundException;
}
