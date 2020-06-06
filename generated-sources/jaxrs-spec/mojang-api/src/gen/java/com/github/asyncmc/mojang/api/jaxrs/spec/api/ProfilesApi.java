package com.github.asyncmc.mojang.api.jaxrs.spec.api;

import com.github.asyncmc.mojang.api.jaxrs.spec.model.CurrentPlayerIDs;
import java.util.List;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/profiles")
@Api(description = "the profiles API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2020-06-06T02:33:20.597648300-03:00[America/Sao_Paulo]")
public class ProfilesApi {

    @POST
    @Path("/minecraft")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Find the current UUID of multiple players at once", notes = "Find the current players name, UUID, demo status and migration flag by the current players name. The \"at\" parameter is not supported. Players not found are not returned. If no players are found, an empty array is returned.", response = CurrentPlayerIDs.class, responseContainer = "List", tags={ "Name History" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "An array containing all players found", response = CurrentPlayerIDs.class, responseContainer = "List")
    })
    public Response findUniqueIdsByName(@Valid List<String> requestBody) {
        return Response.ok().entity("magic!").build();
    }
}
