package com.github.asyncmc.mojang.status.java.msf4j.api;

import com.github.asyncmc.mojang.status.java.msf4j.model.*;
import com.github.asyncmc.mojang.status.java.msf4j.api.CheckApiService;
import com.github.asyncmc.mojang.status.java.msf4j.api.factories.CheckApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import com.github.asyncmc.mojang.status.java.msf4j.model.ApiStatus;

import java.util.List;
import com.github.asyncmc.mojang.status.java.msf4j.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/check")


@io.swagger.annotations.Api(description = "the check API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2020-06-06T04:59:24.276308400-03:00[America/Sao_Paulo]")
public class CheckApi  {
   private final CheckApiService delegate = CheckApiServiceFactory.getCheckApi();

    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Checks the Mojang service statuses", notes = "", response = Map.class, responseContainer = "List", tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "An array with service status key/pairs", response = Map.class, responseContainer = "List") })
    public Response checkStatuses()
    throws NotFoundException {
        return delegate.checkStatuses();
    }
}
