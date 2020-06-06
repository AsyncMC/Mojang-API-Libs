package org.openapitools.api;

import org.openapitools.model.*;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.CurrentPlayerIDs;
import java.util.List;

import java.util.List;
import java.util.Map;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/profiles")


@io.swagger.annotations.Api(description = "the profiles API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-06-05T23:34:10.608540300-03:00[America/Sao_Paulo]")
public interface ProfilesApi  {
   
    @POST
    @Path("/minecraft")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Find the current UUID of multiple players at once", notes = "Find the current players name, UUID, demo status and migration flag by the current players name. The \"at\" parameter is not supported. Players not found are not returned. If no players are found, an empty array is returned.", response = CurrentPlayerIDs.class, responseContainer = "List", tags={ "Name History", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "An array containing all players found", response = CurrentPlayerIDs.class, responseContainer = "List") })
    public Response findUniqueIdsByName(@ApiParam(value = "Array with the player names" ,required=true) @NotNull @Valid List<String> requestBody,@Context SecurityContext securityContext);
}
