package org.openapitools.api;

import org.openapitools.model.ApiStatus;
import org.openapitools.api.CheckApiService;

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
@Path("/check")
@RequestScoped

@Api(description = "the check API")


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2020-06-05T23:33:58.790797400-03:00[America/Sao_Paulo]")

public class CheckApi  {

  @Context SecurityContext securityContext;

  @Inject CheckApiService delegate;


    @GET
    
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Checks the Mojang service statuses", notes = "", response = Map.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "An array with service status key/pairs", response = ApiStatus.class, responseContainer = "List") })
    public Response checkStatuses() {
        return delegate.checkStatuses(securityContext);
    }
}
