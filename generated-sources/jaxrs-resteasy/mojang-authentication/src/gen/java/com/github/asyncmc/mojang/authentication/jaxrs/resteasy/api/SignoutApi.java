package com.github.asyncmc.mojang.authentication.jaxrs.resteasy.api;

import com.github.asyncmc.mojang.authentication.jaxrs.resteasy.model.*;
import com.github.asyncmc.mojang.authentication.jaxrs.resteasy.api.SignoutApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import com.github.asyncmc.mojang.authentication.jaxrs.resteasy.model.Error;
import com.github.asyncmc.mojang.authentication.jaxrs.resteasy.model.UsernamePassword;

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

@Path("/signout")


@io.swagger.annotations.Api(description = "the signout API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2020-06-06T02:33:18.015861900-03:00[America/Sao_Paulo]")
public class SignoutApi  {

    @Inject SignoutApiService service;

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Void.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "All tokens have been invalidated", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid username/password", response = Error.class) })
    public Response siginout(@ApiParam(value = "" ,required=true) @NotNull @Valid UsernamePassword usernamePassword,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.siginout(usernamePassword,securityContext);
    }
}
