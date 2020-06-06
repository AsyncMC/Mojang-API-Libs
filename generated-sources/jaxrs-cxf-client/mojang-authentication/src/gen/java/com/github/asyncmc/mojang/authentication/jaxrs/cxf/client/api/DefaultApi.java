package com.github.asyncmc.mojang.authentication.jaxrs.cxf.client.api;

import com.github.asyncmc.mojang.authentication.jaxrs.cxf.client.model.AccessKeys;
import com.github.asyncmc.mojang.authentication.jaxrs.cxf.client.model.Authentication;
import com.github.asyncmc.mojang.authentication.jaxrs.cxf.client.model.AuthenticationRequest;
import com.github.asyncmc.mojang.authentication.jaxrs.cxf.client.model.Error;
import com.github.asyncmc.mojang.authentication.jaxrs.cxf.client.model.RefreshRequest;
import com.github.asyncmc.mojang.authentication.jaxrs.cxf.client.model.RefreshResponse;
import com.github.asyncmc.mojang.authentication.jaxrs.cxf.client.model.UsernamePassword;

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

/**
 * Mojang Authentication API
 *
 * <p>No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 */
@Path("/")
@Api(value = "/", description = "")
public interface DefaultApi  {

    @POST
    @Path("/authenticate")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfully authenticated", response = Authentication.class),
        @ApiResponse(code = 400, message = "Could not authenticate", response = Error.class) })
    public Authentication authenticate(AuthenticationRequest authenticationRequest);

    @POST
    @Path("/invalidate")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "The token have been invalidated"),
        @ApiResponse(code = 400, message = "Could not invalidate the token", response = Error.class) })
    public void invalidate(AccessKeys accessKeys);

    @POST
    @Path("/refresh")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Session refreshed successfully. Note: The old access token gets invalidated.", response = RefreshResponse.class),
        @ApiResponse(code = 400, message = "Could not refresh the session", response = Error.class) })
    public RefreshResponse refresh(RefreshRequest refreshRequest);

    @POST
    @Path("/signout")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "All tokens have been invalidated"),
        @ApiResponse(code = 400, message = "Invalid username/password", response = Error.class) })
    public void siginout(UsernamePassword usernamePassword);

    @POST
    @Path("/validate")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "The token is valid"),
        @ApiResponse(code = 403, message = "The token is not valid", response = Error.class) })
    public void validate(AccessKeys accessKeys);
}
