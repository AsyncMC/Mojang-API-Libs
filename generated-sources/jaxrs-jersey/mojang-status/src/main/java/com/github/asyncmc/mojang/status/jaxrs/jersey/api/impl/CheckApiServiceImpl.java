package com.github.asyncmc.mojang.status.jaxrs.jersey.api.impl;

import com.github.asyncmc.mojang.status.jaxrs.jersey.api.*;
import com.github.asyncmc.mojang.status.jaxrs.jersey.model.*;

import com.github.asyncmc.mojang.status.jaxrs.jersey.model.ApiStatus;

import java.util.List;
import com.github.asyncmc.mojang.status.jaxrs.jersey.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2020-06-06T02:33:12.544701600-03:00[America/Sao_Paulo]")
public class CheckApiServiceImpl extends CheckApiService {
    @Override
    public Response checkStatuses(SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
