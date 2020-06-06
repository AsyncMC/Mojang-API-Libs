package org.openapitools.api;

import org.openapitools.model.Authentication;
import org.openapitools.model.AuthenticationRequest;
import org.openapitools.model.Error;
import org.openapitools.model.UsernamePassword;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/authenticate")
@Api(description = "the authenticate API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2020-06-05T23:34:18.565718200-03:00[America/Sao_Paulo]")
public class AuthenticateApi {

    @POST
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "", response = Authentication.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfully authenticated", response = Authentication.class),
        @ApiResponse(code = 400, message = "Could not authenticate", response = Error.class)
    })
    public Response authenticate(@Valid AuthenticationRequest authenticationRequest) {
        return Response.ok().entity("magic!").build();
    }
}
