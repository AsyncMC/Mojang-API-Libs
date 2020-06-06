package com.github.asyncmc.mojang.authentication.jaxrs.jersey.api.impl;

import com.github.asyncmc.mojang.authentication.jaxrs.jersey.api.*;
import com.github.asyncmc.mojang.authentication.jaxrs.jersey.model.*;

import com.github.asyncmc.mojang.authentication.jaxrs.jersey.model.AccessKeys;
import com.github.asyncmc.mojang.authentication.jaxrs.jersey.model.Error;
import com.github.asyncmc.mojang.authentication.jaxrs.jersey.model.RefreshRequest;
import com.github.asyncmc.mojang.authentication.jaxrs.jersey.model.RefreshResponse;

import java.util.List;
import com.github.asyncmc.mojang.authentication.jaxrs.jersey.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2020-06-06T02:33:10.678452700-03:00[America/Sao_Paulo]")
public class RefreshApiServiceImpl extends RefreshApiService {
    @Override
    public Response refresh(RefreshRequest refreshRequest, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
