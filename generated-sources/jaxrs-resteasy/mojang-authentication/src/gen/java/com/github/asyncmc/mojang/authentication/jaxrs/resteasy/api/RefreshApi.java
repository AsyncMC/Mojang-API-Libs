package com.github.asyncmc.mojang.authentication.jaxrs.resteasy.api;

import com.github.asyncmc.mojang.authentication.jaxrs.resteasy.model.*;
import com.github.asyncmc.mojang.authentication.jaxrs.resteasy.api.RefreshApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import com.github.asyncmc.mojang.authentication.jaxrs.resteasy.model.AccessKeys;
import com.github.asyncmc.mojang.authentication.jaxrs.resteasy.model.Error;
import com.github.asyncmc.mojang.authentication.jaxrs.resteasy.model.RefreshRequest;
import com.github.asyncmc.mojang.authentication.jaxrs.resteasy.model.RefreshResponse;

import java.util.Map;
import java.util.List;
import com.github.asyncmc.mojang.authentication.jaxrs.resteasy.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.inject.Inject;

import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/refresh")


@io.swagger.annotations.Api(description = "the refresh API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2020-06-06T02:33:18.015861900-03:00[America/Sao_Paulo]")
public class RefreshApi  {

    @Inject RefreshApiService service;

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = RefreshResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Session refreshed successfully. Note: The old access token gets invalidated.", response = RefreshResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Could not refresh the session", response = Error.class) })
    public Response refresh(@ApiParam(value = "" ,required=true) @NotNull @Valid RefreshRequest refreshRequest,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.refresh(refreshRequest,securityContext);
    }
}
