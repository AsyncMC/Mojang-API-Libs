package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.InvalidateApiService;
import org.openapitools.api.factories.InvalidateApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.AccessKeys;
import org.openapitools.model.Error;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/invalidate")


@io.swagger.annotations.Api(description = "the invalidate API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2020-06-05T23:33:25.668599-03:00[America/Sao_Paulo]")
public class InvalidateApi  {
   private final InvalidateApiService delegate = InvalidateApiServiceFactory.getInvalidateApi();

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Void.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "The token have been invalidated", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Could not invalidate the token", response = Void.class) })
    public Response invalidate(@ApiParam(value = "" ,required=true) AccessKeys accessKeys
)
    throws NotFoundException {
        return delegate.invalidate(accessKeys);
    }
}
