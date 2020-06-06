package com.github.asyncmc.mojang.status.jaxrs.resteasy.api;

import com.github.asyncmc.mojang.status.jaxrs.resteasy.api.*;
import com.github.asyncmc.mojang.status.jaxrs.resteasy.model.*;


import com.github.asyncmc.mojang.status.jaxrs.resteasy.model.ApiStatus;

import java.util.List;
import com.github.asyncmc.mojang.status.jaxrs.resteasy.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2020-06-06T05:00:11.170640600-03:00[America/Sao_Paulo]")
public interface CheckApiService {
      Response checkStatuses(SecurityContext securityContext)
      throws NotFoundException;
}
