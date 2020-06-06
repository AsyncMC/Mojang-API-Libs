package com.github.asyncmc.mojang.api.jaxrs.jersey.api.impl;

import com.github.asyncmc.mojang.api.jaxrs.jersey.api.*;
import com.github.asyncmc.mojang.api.jaxrs.jersey.model.*;

import com.github.asyncmc.mojang.api.jaxrs.jersey.model.CurrentPlayerIDs;
import java.util.List;

import java.util.List;
import com.github.asyncmc.mojang.api.jaxrs.jersey.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2020-06-06T05:00:01.117726-03:00[America/Sao_Paulo]")
public class ProfilesApiServiceImpl extends ProfilesApiService {
    @Override
    public Response findUniqueIdsByName(List<String> requestBody, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
