package com.github.asyncmc.mojang.authentication.jaxrs.cxf.cdi.api;

import com.github.asyncmc.mojang.authentication.jaxrs.cxf.cdi.model.Authentication;
import com.github.asyncmc.mojang.authentication.jaxrs.cxf.cdi.model.AuthenticationRequest;
import com.github.asyncmc.mojang.authentication.jaxrs.cxf.cdi.model.Error;
import com.github.asyncmc.mojang.authentication.jaxrs.cxf.cdi.model.UsernamePassword;
import com.github.asyncmc.mojang.authentication.jaxrs.cxf.cdi.api.AuthenticateApiService;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import io.swagger.annotations.*;
import java.io.InputStream;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
@Path("/authenticate")
@RequestScoped

@Api(description = "the authenticate API")


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2020-06-06T04:59:51.255462600-03:00[America/Sao_Paulo]")

public class AuthenticateApi  {

  @Context SecurityContext securityContext;

  @Inject AuthenticateApiService delegate;


    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "", response = Authentication.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfully authenticated", response = Authentication.class),
        @ApiResponse(code = 400, message = "Could not authenticate", response = Error.class) })
    public Response authenticate(@ApiParam(value = "" ,required=true) AuthenticationRequest authenticationRequest) {
        return delegate.authenticate(authenticationRequest, securityContext);
    }
}
