package com.github.asyncmc.mojang.sessions.jaxrs.resteasy.api;

import com.github.asyncmc.mojang.sessions.jaxrs.resteasy.api.*;
import com.github.asyncmc.mojang.sessions.jaxrs.resteasy.model.*;



import java.util.List;
import com.github.asyncmc.mojang.sessions.jaxrs.resteasy.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2020-06-06T05:00:10.317348300-03:00[America/Sao_Paulo]")
public interface BlockedserversApiService {
      Response getBlockedServerHashes(SecurityContext securityContext)
      throws NotFoundException;
}
