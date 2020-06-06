package com.github.asyncmc.mojang.sessions.java.msf4j.api;

import com.github.asyncmc.mojang.sessions.java.msf4j.model.*;
import com.github.asyncmc.mojang.sessions.java.msf4j.api.SessionApiService;
import com.github.asyncmc.mojang.sessions.java.msf4j.api.factories.SessionApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import com.github.asyncmc.mojang.sessions.java.msf4j.model.PlayerProfile;
import com.github.asyncmc.mojang.sessions.java.msf4j.model.SessionApiError;

import java.util.List;
import com.github.asyncmc.mojang.sessions.java.msf4j.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/session")


@io.swagger.annotations.Api(description = "the session API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2020-06-06T02:32:31.865898300-03:00[America/Sao_Paulo]")
public class SessionApi  {
   private final SessionApiService delegate = SessionApiServiceFactory.getSessionApi();

    @GET
    @Path("/minecraft/profile/{stripped_uuid}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Gets the player's game profile", notes = "This will return the player's username plus any additional information about them (e.g. skins). This has a much stricter rate limit: You can request the same profile once per minute, however you can send as many unique requests as you like.", response = PlayerProfile.class, tags={ "Login", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The player profile and all properties", response = PlayerProfile.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "UUID is invalid", response = PlayerProfile.class) })
    public Response getPlayerProfile(@ApiParam(value = "The player UUID without hyphens",required=true) @PathParam("stripped_uuid") String strippedUuid
,@ApiParam(value = "When set to false, the signature data are sent") @QueryParam("unsigned") Boolean unsigned
)
    throws NotFoundException {
        return delegate.getPlayerProfile(strippedUuid,unsigned);
    }
}
