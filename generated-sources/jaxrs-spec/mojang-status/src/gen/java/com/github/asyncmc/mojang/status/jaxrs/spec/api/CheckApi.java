package com.github.asyncmc.mojang.status.jaxrs.spec.api;

import com.github.asyncmc.mojang.status.jaxrs.spec.model.ApiStatus;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/check")
@Api(description = "the check API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2020-06-06T02:33:23.378546700-03:00[America/Sao_Paulo]")
public class CheckApi {

    @GET
    @Produces({ "application/json" })
    @ApiOperation(value = "Checks the Mojang service statuses", notes = "", response = Map.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "An array with service status key/pairs", response = ApiStatus.class, responseContainer = "List")
    })
    public Response checkStatuses() {
        return Response.ok().entity("magic!").build();
    }
}
