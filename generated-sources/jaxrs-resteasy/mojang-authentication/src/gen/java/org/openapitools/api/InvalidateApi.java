package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.InvalidateApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.AccessKeys;
import org.openapitools.model.Error;

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.inject.Inject;

import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/invalidate")


@io.swagger.annotations.Api(description = "the invalidate API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2020-06-05T23:34:15.056337600-03:00[America/Sao_Paulo]")
public class InvalidateApi  {

    @Inject InvalidateApiService service;

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Void.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "The token have been invalidated", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Could not invalidate the token", response = Error.class) })
    public Response invalidate(@ApiParam(value = "" ,required=true) @NotNull @Valid AccessKeys accessKeys,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.invalidate(accessKeys,securityContext);
    }
}
