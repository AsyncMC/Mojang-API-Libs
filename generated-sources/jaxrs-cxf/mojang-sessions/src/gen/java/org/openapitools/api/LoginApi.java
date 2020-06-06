package org.openapitools.api;

import org.openapitools.model.PlayerProfile;
import org.openapitools.model.SessionApiError;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.jaxrs.PATCH;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Mojang Session API
 *
 * <p>No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 */
@Path("/")
@Api(value = "/", description = "")
public interface LoginApi  {

    /**
     * Gets the player&#39;s game profile
     *
     * This will return the player&#39;s username plus any additional information about them (e.g. skins). This has a much stricter rate limit: You can request the same profile once per minute, however you can send as many unique requests as you like.
     *
     */
    @GET
    @Path("/session/minecraft/profile/{stripped_uuid}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Gets the player's game profile", tags={ "Login" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The player profile and all properties", response = PlayerProfile.class),
        @ApiResponse(code = 400, message = "UUID is invalid", response = SessionApiError.class) })
    public PlayerProfile getPlayerProfile(@PathParam("stripped_uuid") String strippedUuid, @QueryParam("unsigned") Boolean unsigned);
}

