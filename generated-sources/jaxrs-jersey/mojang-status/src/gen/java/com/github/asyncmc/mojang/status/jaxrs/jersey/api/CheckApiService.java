package com.github.asyncmc.mojang.status.jaxrs.jersey.api;

import com.github.asyncmc.mojang.status.jaxrs.jersey.api.*;
import com.github.asyncmc.mojang.status.jaxrs.jersey.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import com.github.asyncmc.mojang.status.jaxrs.jersey.model.ApiStatus;

import java.util.List;
import com.github.asyncmc.mojang.status.jaxrs.jersey.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2020-06-06T05:00:04.026871200-03:00[America/Sao_Paulo]")
public abstract class CheckApiService {
    public abstract Response checkStatuses(SecurityContext securityContext) throws NotFoundException;
}
