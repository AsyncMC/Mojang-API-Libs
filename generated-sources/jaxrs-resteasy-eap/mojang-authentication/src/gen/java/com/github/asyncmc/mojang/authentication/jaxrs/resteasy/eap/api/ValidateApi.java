package com.github.asyncmc.mojang.authentication.jaxrs.resteasy.eap.api;

import com.github.asyncmc.mojang.authentication.jaxrs.resteasy.eap.model.*;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import com.github.asyncmc.mojang.authentication.jaxrs.resteasy.eap.model.AccessKeys;
import com.github.asyncmc.mojang.authentication.jaxrs.resteasy.eap.model.Error;

import java.util.List;
import java.util.Map;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/validate")


@io.swagger.annotations.Api(description = "the validate API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2020-06-06T05:00:05.874470300-03:00[America/Sao_Paulo]")
public interface ValidateApi  {
   
    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Void.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "The token is valid", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The token is not valid", response = Error.class) })
    public Response validate(@ApiParam(value = "" ,required=true) @NotNull @Valid AccessKeys accessKeys,@Context SecurityContext securityContext);
}
