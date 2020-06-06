package com.github.asyncmc.mojang.authentication.jaxrs.spec.api;

import com.github.asyncmc.mojang.authentication.jaxrs.spec.model.Error;
import com.github.asyncmc.mojang.authentication.jaxrs.spec.model.UsernamePassword;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/signout")
@Api(description = "the signout API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2020-06-06T02:33:21.607123300-03:00[America/Sao_Paulo]")
public class SignoutApi {

    @POST
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "All tokens have been invalidated", response = Void.class),
        @ApiResponse(code = 400, message = "Invalid username/password", response = Error.class)
    })
    public Response siginout(@Valid UsernamePassword usernamePassword) {
        return Response.ok().entity("magic!").build();
    }
}
