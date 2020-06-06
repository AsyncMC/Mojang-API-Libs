package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.InvalidateApiService;
import org.openapitools.api.factories.InvalidateApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.AccessKeys;
import org.openapitools.model.Error;

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/invalidate")


@io.swagger.annotations.Api(description = "the invalidate API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2020-06-05T23:34:08.066001300-03:00[America/Sao_Paulo]")
public class InvalidateApi  {
   private final InvalidateApiService delegate;

   public InvalidateApi(@Context ServletConfig servletContext) {
      InvalidateApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("InvalidateApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (InvalidateApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = InvalidateApiServiceFactory.getInvalidateApi();
      }

      this.delegate = delegate;
   }

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Void.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "The token have been invalidated", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Could not invalidate the token", response = Error.class) })
    public Response invalidate(@ApiParam(value = "" ,required=true) @Valid AccessKeys accessKeys
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.invalidate(accessKeys,securityContext);
    }
}
