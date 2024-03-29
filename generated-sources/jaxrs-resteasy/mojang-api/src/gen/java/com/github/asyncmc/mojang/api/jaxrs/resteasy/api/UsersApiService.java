package com.github.asyncmc.mojang.api.jaxrs.resteasy.api;

import com.github.asyncmc.mojang.api.jaxrs.resteasy.api.*;
import com.github.asyncmc.mojang.api.jaxrs.resteasy.model.*;


import com.github.asyncmc.mojang.api.jaxrs.resteasy.model.CurrentPlayerIDs;
import com.github.asyncmc.mojang.api.jaxrs.resteasy.model.Error;

import java.util.List;
import com.github.asyncmc.mojang.api.jaxrs.resteasy.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2020-06-06T05:00:08.418392200-03:00[America/Sao_Paulo]")
public interface UsersApiService {
      Response getUniqueIdByName(String username,Long at,SecurityContext securityContext)
      throws NotFoundException;
}
