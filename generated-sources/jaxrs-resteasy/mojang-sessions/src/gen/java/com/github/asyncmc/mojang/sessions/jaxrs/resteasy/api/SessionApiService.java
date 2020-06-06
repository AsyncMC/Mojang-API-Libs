package com.github.asyncmc.mojang.sessions.jaxrs.resteasy.api;

import com.github.asyncmc.mojang.sessions.jaxrs.resteasy.api.*;
import com.github.asyncmc.mojang.sessions.jaxrs.resteasy.model.*;


import com.github.asyncmc.mojang.sessions.jaxrs.resteasy.model.PlayerProfile;
import com.github.asyncmc.mojang.sessions.jaxrs.resteasy.model.SessionApiError;

import java.util.List;
import com.github.asyncmc.mojang.sessions.jaxrs.resteasy.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2020-06-06T02:33:18.906240-03:00[America/Sao_Paulo]")
public interface SessionApiService {
      Response getPlayerProfile(String strippedUuid,Boolean unsigned,SecurityContext securityContext)
      throws NotFoundException;
}
