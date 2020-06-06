package com.github.asyncmc.mojang.authentication.java.msf4j.api;

import com.github.asyncmc.mojang.authentication.java.msf4j.model.*;
import com.github.asyncmc.mojang.authentication.java.msf4j.api.ValidateApiService;
import com.github.asyncmc.mojang.authentication.java.msf4j.api.factories.ValidateApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import com.github.asyncmc.mojang.authentication.java.msf4j.model.AccessKeys;
import com.github.asyncmc.mojang.authentication.java.msf4j.model.Error;

import java.util.List;
import com.github.asyncmc.mojang.authentication.java.msf4j.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/validate")


@io.swagger.annotations.Api(description = "the validate API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2020-06-06T04:59:22.475532300-03:00[America/Sao_Paulo]")
public class ValidateApi  {
   private final ValidateApiService delegate = ValidateApiServiceFactory.getValidateApi();

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Void.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "The token is valid", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "The token is not valid", response = Void.class) })
    public Response validate(@ApiParam(value = "" ,required=true) AccessKeys accessKeys
)
    throws NotFoundException {
        return delegate.validate(accessKeys);
    }
}
