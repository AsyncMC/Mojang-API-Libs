package org.openapitools.api;

import org.openapitools.model.AccessKeys;
import org.openapitools.model.Error;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/invalidate")
@Api(description = "the invalidate API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2020-06-05T23:34:18.565718200-03:00[America/Sao_Paulo]")
public class InvalidateApi {

    @POST
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "The token have been invalidated", response = Void.class),
        @ApiResponse(code = 400, message = "Could not invalidate the token", response = Error.class)
    })
    public Response invalidate(@Valid AccessKeys accessKeys) {
        return Response.ok().entity("magic!").build();
    }
}
