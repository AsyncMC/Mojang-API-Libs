package com.github.asyncmc.mojang.sessions.jaxrs.jersey.api;

import com.github.asyncmc.mojang.sessions.jaxrs.jersey.api.*;
import com.github.asyncmc.mojang.sessions.jaxrs.jersey.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;


import java.util.List;
import com.github.asyncmc.mojang.sessions.jaxrs.jersey.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2020-06-06T02:33:11.618967200-03:00[America/Sao_Paulo]")
public abstract class BlockedserversApiService {
    public abstract Response getBlockedServerHashes(SecurityContext securityContext) throws NotFoundException;
}
