package com.github.asyncmc.mojang.status.jaxrs.resteasy.api;

import com.github.asyncmc.mojang.status.jaxrs.resteasy.model.*;
import com.github.asyncmc.mojang.status.jaxrs.resteasy.api.CheckApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import com.github.asyncmc.mojang.status.jaxrs.resteasy.model.ApiStatus;

import java.util.Map;
import java.util.List;
import com.github.asyncmc.mojang.status.jaxrs.resteasy.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.inject.Inject;

import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/check")


@io.swagger.annotations.Api(description = "the check API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2020-06-06T02:33:19.790805300-03:00[America/Sao_Paulo]")
public class CheckApi  {

    @Inject CheckApiService service;

    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Checks the Mojang service statuses", notes = "", response = Map.class, responseContainer = "List", tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "An array with service status key/pairs", response = ApiStatus.class, responseContainer = "List") })
    public Response checkStatuses(@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.checkStatuses(securityContext);
    }
}
