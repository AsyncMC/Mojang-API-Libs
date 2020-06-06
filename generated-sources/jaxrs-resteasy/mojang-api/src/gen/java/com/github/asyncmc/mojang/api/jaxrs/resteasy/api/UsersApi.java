package com.github.asyncmc.mojang.api.jaxrs.resteasy.api;

import com.github.asyncmc.mojang.api.jaxrs.resteasy.model.*;
import com.github.asyncmc.mojang.api.jaxrs.resteasy.api.UsersApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import com.github.asyncmc.mojang.api.jaxrs.resteasy.model.CurrentPlayerIDs;
import com.github.asyncmc.mojang.api.jaxrs.resteasy.model.Error;

import java.util.Map;
import java.util.List;
import com.github.asyncmc.mojang.api.jaxrs.resteasy.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.inject.Inject;

import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/users")


@io.swagger.annotations.Api(description = "the users API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2020-06-06T02:33:16.982094400-03:00[America/Sao_Paulo]")
public class UsersApi  {

    @Inject UsersApiService service;

    @GET
    @Path("/profiles/minecraft/{username}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Find the UUID by name", notes = "Find the current player name, UUID, demo status and migration flag by the current player name or at a given time.", response = CurrentPlayerIDs.class, tags={ "Name History", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The user was found", response = CurrentPlayerIDs.class),
        
        @io.swagger.annotations.ApiResponse(code = 204, message = "User not found", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "If the timestamp is invalid", response = Error.class) })
    public Response getUniqueIdByName( @PathParam("username") String username,  @QueryParam("at") Long at,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getUniqueIdByName(username,at,securityContext);
    }
}
