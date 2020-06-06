package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.CheckApiService;
import org.openapitools.api.factories.CheckApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.ApiStatus;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/check")


@io.swagger.annotations.Api(description = "the check API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2020-06-05T23:33:27.391872900-03:00[America/Sao_Paulo]")
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
