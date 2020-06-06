package com.github.asyncmc.mojang.sessions.jaxrs.resteasy.eap.api;

import com.github.asyncmc.mojang.sessions.jaxrs.resteasy.eap.model.*;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import com.github.asyncmc.mojang.sessions.jaxrs.resteasy.eap.model.PlayerProfile;
import com.github.asyncmc.mojang.sessions.jaxrs.resteasy.eap.model.SessionApiError;

import java.util.List;
import java.util.Map;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/session")


@io.swagger.annotations.Api(description = "the session API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-06-06T02:33:15.320512100-03:00[America/Sao_Paulo]")
public interface SessionApi  {
   
    @GET
    @Path("/minecraft/profile/{stripped_uuid}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Gets the player's game profile", notes = "This will return the player's username plus any additional information about them (e.g. skins). This has a much stricter rate limit: You can request the same profile once per minute, however you can send as many unique requests as you like.", response = PlayerProfile.class, tags={ "Login", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The player profile and all properties", response = PlayerProfile.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "UUID is invalid", response = SessionApiError.class) })
    public Response getPlayerProfile( @PathParam("stripped_uuid") String strippedUuid, @QueryParam("unsigned") Boolean unsigned,@Context SecurityContext securityContext);
}
