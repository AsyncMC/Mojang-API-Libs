package org.openapitools.api;

import org.openapitools.model.AccessKeys;
import org.openapitools.model.Error;
import org.openapitools.model.RefreshRequest;
import org.openapitools.model.RefreshResponse;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/refresh")
@Api(description = "the refresh API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2020-06-05T23:34:18.565718200-03:00[America/Sao_Paulo]")
public class RefreshApi {

    @POST
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "", response = RefreshResponse.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Session refreshed successfully. Note: The old access token gets invalidated.", response = RefreshResponse.class),
        @ApiResponse(code = 400, message = "Could not refresh the session", response = Error.class)
    })
    public Response refresh(@Valid RefreshRequest refreshRequest) {
        return Response.ok().entity("magic!").build();
    }
}
