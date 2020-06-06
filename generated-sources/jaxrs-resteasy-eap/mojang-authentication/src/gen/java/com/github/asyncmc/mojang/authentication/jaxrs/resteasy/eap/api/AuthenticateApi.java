package com.github.asyncmc.mojang.authentication.jaxrs.resteasy.eap.api;

import com.github.asyncmc.mojang.authentication.jaxrs.resteasy.eap.model.*;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import com.github.asyncmc.mojang.authentication.jaxrs.resteasy.eap.model.Authentication;
import com.github.asyncmc.mojang.authentication.jaxrs.resteasy.eap.model.AuthenticationRequest;
import com.github.asyncmc.mojang.authentication.jaxrs.resteasy.eap.model.Error;
import com.github.asyncmc.mojang.authentication.jaxrs.resteasy.eap.model.UsernamePassword;

import java.util.List;
import java.util.Map;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/authenticate")


@io.swagger.annotations.Api(description = "the authenticate API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-06-06T05:00:05.874470300-03:00[America/Sao_Paulo]")
public interface AuthenticateApi  {
   
    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Authentication.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successfully authenticated", response = Authentication.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Could not authenticate", response = Error.class) })
    public Response authenticate(@ApiParam(value = "" ,required=true) @NotNull @Valid AuthenticationRequest authenticationRequest,@Context SecurityContext securityContext);
}
