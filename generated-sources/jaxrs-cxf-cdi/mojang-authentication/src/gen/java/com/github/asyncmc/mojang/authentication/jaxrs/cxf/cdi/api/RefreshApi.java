package com.github.asyncmc.mojang.authentication.jaxrs.cxf.cdi.api;

import com.github.asyncmc.mojang.authentication.jaxrs.cxf.cdi.model.AccessKeys;
import com.github.asyncmc.mojang.authentication.jaxrs.cxf.cdi.model.Error;
import com.github.asyncmc.mojang.authentication.jaxrs.cxf.cdi.model.RefreshRequest;
import com.github.asyncmc.mojang.authentication.jaxrs.cxf.cdi.model.RefreshResponse;
import com.github.asyncmc.mojang.authentication.jaxrs.cxf.cdi.api.RefreshApiService;

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
@Path("/refresh")
@RequestScoped

@Api(description = "the refresh API")


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2020-06-06T02:32:59.799881700-03:00[America/Sao_Paulo]")

public class RefreshApi  {

  @Context SecurityContext securityContext;

  @Inject RefreshApiService delegate;


    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "", response = RefreshResponse.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Session refreshed successfully. Note: The old access token gets invalidated.", response = RefreshResponse.class),
        @ApiResponse(code = 400, message = "Could not refresh the session", response = Error.class) })
    public Response refresh(@ApiParam(value = "" ,required=true) RefreshRequest refreshRequest) {
        return delegate.refresh(refreshRequest, securityContext);
    }
}
