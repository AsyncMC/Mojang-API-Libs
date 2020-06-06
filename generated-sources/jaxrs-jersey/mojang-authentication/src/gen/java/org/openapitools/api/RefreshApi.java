package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.RefreshApiService;
import org.openapitools.api.factories.RefreshApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.AccessKeys;
import org.openapitools.model.Error;
import org.openapitools.model.RefreshRequest;
import org.openapitools.model.RefreshResponse;

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

@Path("/refresh")


@io.swagger.annotations.Api(description = "the refresh API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2020-06-05T23:34:08.066001300-03:00[America/Sao_Paulo]")
public class RefreshApi  {
   private final RefreshApiService delegate;

   public RefreshApi(@Context ServletConfig servletContext) {
      RefreshApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("RefreshApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (RefreshApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = RefreshApiServiceFactory.getRefreshApi();
      }

      this.delegate = delegate;
   }

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = RefreshResponse.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Session refreshed successfully. Note: The old access token gets invalidated.", response = RefreshResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Could not refresh the session", response = Error.class) })
    public Response refresh(@ApiParam(value = "" ,required=true) @Valid RefreshRequest refreshRequest
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.refresh(refreshRequest,securityContext);
    }
}
