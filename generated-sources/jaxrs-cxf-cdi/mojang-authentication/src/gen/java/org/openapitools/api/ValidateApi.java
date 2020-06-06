package org.openapitools.api;

import org.openapitools.model.AccessKeys;
import org.openapitools.model.Error;
import org.openapitools.api.ValidateApiService;

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
@Path("/validate")
@RequestScoped

@Api(description = "the validate API")


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2020-06-05T23:33:57.027574300-03:00[America/Sao_Paulo]")

public class ValidateApi  {

  @Context SecurityContext securityContext;

  @Inject ValidateApiService delegate;


    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "", notes = "", response = Void.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "The token is valid", response = Void.class),
        @ApiResponse(code = 403, message = "The token is not valid", response = Error.class) })
    public Response validate(@ApiParam(value = "" ,required=true) AccessKeys accessKeys) {
        return delegate.validate(accessKeys, securityContext);
    }
}
