package com.github.asyncmc.mojang.sessions.jaxrs.jersey.api.impl;

import com.github.asyncmc.mojang.sessions.jaxrs.jersey.api.*;
import com.github.asyncmc.mojang.sessions.jaxrs.jersey.model.*;


import java.util.List;
import com.github.asyncmc.mojang.sessions.jaxrs.jersey.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2020-06-06T05:00:03.118240-03:00[America/Sao_Paulo]")
public class BlockedserversApiServiceImpl extends BlockedserversApiService {
    @Override
    public Response getBlockedServerHashes(SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
