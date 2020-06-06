package com.github.asyncmc.mojang.api.jaxrs.spec.api;

import com.github.asyncmc.mojang.api.jaxrs.spec.model.CurrentPlayerIDs;
import com.github.asyncmc.mojang.api.jaxrs.spec.model.Error;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/users")
@Api(description = "the users API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2020-06-06T05:00:11.972163-03:00[America/Sao_Paulo]")
public class UsersApi {

    @GET
    @Path("/profiles/minecraft/{username}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Find the UUID by name", notes = "Find the current player name, UUID, demo status and migration flag by the current player name or at a given time.", response = CurrentPlayerIDs.class, tags={ "Name History" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The user was found", response = CurrentPlayerIDs.class),
        @ApiResponse(code = 204, message = "User not found", response = Void.class),
        @ApiResponse(code = 400, message = "If the timestamp is invalid", response = Error.class)
    })
    public Response getUniqueIdByName(@PathParam("username") @ApiParam("The username in a given time, or in present if \&quot;at\&quot; is not sent") String username,@QueryParam("at")   @ApiParam("Find the username in a given time, when 0 selects the original name however, it only works if the name was changed at least once, or if the account is legacy. The time is an UNIX timestamp (without milliseconds)")  Long at) {
        return Response.ok().entity("magic!").build();
    }
}
