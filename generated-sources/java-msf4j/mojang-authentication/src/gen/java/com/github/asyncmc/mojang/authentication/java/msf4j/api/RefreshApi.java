package com.github.asyncmc.mojang.authentication.java.msf4j.api;

import com.github.asyncmc.mojang.authentication.java.msf4j.model.*;
import com.github.asyncmc.mojang.authentication.java.msf4j.api.RefreshApiService;
import com.github.asyncmc.mojang.authentication.java.msf4j.api.factories.RefreshApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import com.github.asyncmc.mojang.authentication.java.msf4j.model.AccessKeys;
import com.github.asyncmc.mojang.authentication.java.msf4j.model.Error;
import com.github.asyncmc.mojang.authentication.java.msf4j.model.RefreshRequest;
import com.github.asyncmc.mojang.authentication.java.msf4j.model.RefreshResponse;

import java.util.List;
import com.github.asyncmc.mojang.authentication.java.msf4j.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/refresh")


@io.swagger.annotations.Api(description = "the refresh API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2020-06-06T04:59:22.475532300-03:00[America/Sao_Paulo]")
public class RefreshApi  {
   private final RefreshApiService delegate = RefreshApiServiceFactory.getRefreshApi();

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = RefreshResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Session refreshed successfully. Note: The old access token gets invalidated.", response = RefreshResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Could not refresh the session", response = RefreshResponse.class) })
    public Response refresh(@ApiParam(value = "" ,required=true) RefreshRequest refreshRequest
)
    throws NotFoundException {
        return delegate.refresh(refreshRequest);
    }
}
