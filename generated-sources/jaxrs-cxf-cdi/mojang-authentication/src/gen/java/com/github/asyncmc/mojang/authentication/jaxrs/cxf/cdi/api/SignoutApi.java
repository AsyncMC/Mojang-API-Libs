package com.github.asyncmc.mojang.authentication.jaxrs.cxf.cdi.api;

import com.github.asyncmc.mojang.authentication.jaxrs.cxf.cdi.model.Error;
import com.github.asyncmc.mojang.authentication.jaxrs.cxf.cdi.model.UsernamePassword;
import com.github.asyncmc.mojang.authentication.jaxrs.cxf.cdi.api.SignoutApiService;

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
@Path("/signout")
@RequestScoped

@Api(description = "the signout API")


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2020-06-06T02:32:59.799881700-03:00[America/Sao_Paulo]")

public class SignoutApi  {

  @Context SecurityContext securityContext;

  @Inject SignoutApiService delegate;


    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "All tokens have been invalidated", response = Void.class),
        @ApiResponse(code = 400, message = "Invalid username/password", response = Error.class) })
    public Response siginout(@ApiParam(value = "" ,required=true) UsernamePassword usernamePassword) {
        return delegate.siginout(usernamePassword, securityContext);
    }
}
