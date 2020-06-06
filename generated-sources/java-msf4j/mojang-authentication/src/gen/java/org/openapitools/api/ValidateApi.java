package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.ValidateApiService;
import org.openapitools.api.factories.ValidateApiServiceFactory;

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

@Path("/validate")


@io.swagger.annotations.Api(description = "the validate API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2020-06-05T23:33:25.668599-03:00[America/Sao_Paulo]")
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
