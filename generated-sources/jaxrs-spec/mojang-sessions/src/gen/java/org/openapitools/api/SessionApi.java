package org.openapitools.api;

import org.openapitools.model.PlayerProfile;
import org.openapitools.model.SessionApiError;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/session")
@Api(description = "the session API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2020-06-05T23:34:19.426086-03:00[America/Sao_Paulo]")
public class SessionApi {

    @GET
    @Path("/minecraft/profile/{stripped_uuid}")
    @Produces({ "application/json" })
    @ApiOperation(value = "Gets the player's game profile", notes = "This will return the player's username plus any additional information about them (e.g. skins). This has a much stricter rate limit: You can request the same profile once per minute, however you can send as many unique requests as you like.", response = PlayerProfile.class, tags={ "Login" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The player profile and all properties", response = PlayerProfile.class),
        @ApiResponse(code = 400, message = "UUID is invalid", response = SessionApiError.class)
    })
    public Response getPlayerProfile(@PathParam("stripped_uuid") @ApiParam("The player UUID without hyphens") String strippedUuid,@QueryParam("unsigned")   @ApiParam("When set to false, the signature data are sent")  Boolean unsigned) {
        return Response.ok().entity("magic!").build();
    }
}
