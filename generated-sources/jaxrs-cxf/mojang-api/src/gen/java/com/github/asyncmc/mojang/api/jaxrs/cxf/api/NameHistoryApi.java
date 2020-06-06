package com.github.asyncmc.mojang.api.jaxrs.cxf.api;

import com.github.asyncmc.mojang.api.jaxrs.cxf.model.CurrentPlayerIDs;
import com.github.asyncmc.mojang.api.jaxrs.cxf.model.Error;
import java.util.List;
import com.github.asyncmc.mojang.api.jaxrs.cxf.model.NameChange;

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
 * Mojang API
 *
 * <p>No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 */
@Path("/")
@Api(value = "/", description = "")
public interface NameHistoryApi  {

    /**
     * Find the current UUID of multiple players at once
     *
     * Find the current players name, UUID, demo status and migration flag by the current players name. The \&quot;at\&quot; parameter is not supported. Players not found are not returned. If no players are found, an empty array is returned.
     *
     */
    @POST
    @Path("/profiles/minecraft")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Find the current UUID of multiple players at once", tags={ "Name History",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "An array containing all players found", response = CurrentPlayerIDs.class, responseContainer = "List") })
    public List<CurrentPlayerIDs> findUniqueIdsByName(@Valid List<String> requestBody);

    /**
     * Gets the full player&#39;s name history
     *
     */
    @GET
    @Path("/user/profiles/{stripped_uuid}/names")
    @Produces({ "application/json" })
    @ApiOperation(value = "Gets the full player's name history", tags={ "Name History",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "A list of name changes, the first entry usually don't have a change time", response = NameChange.class, responseContainer = "List"),
        @ApiResponse(code = 204, message = "Username not found at the given time") })
    public List<NameChange> getNameHistory(@PathParam("stripped_uuid") String strippedUuid);

    /**
     * Find the UUID by name
     *
     * Find the current player name, UUID, demo status and migration flag by the current player name or at a given time.
     *
     */
    @GET
    @Path("/users/profiles/minecraft/{username}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Find the UUID by name", tags={ "Name History" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The user was found", response = CurrentPlayerIDs.class),
        @ApiResponse(code = 204, message = "User not found"),
        @ApiResponse(code = 400, message = "If the timestamp is invalid", response = Error.class) })
    public CurrentPlayerIDs getUniqueIdByName(@PathParam("username") String username, @QueryParam("at") Long at);
}

