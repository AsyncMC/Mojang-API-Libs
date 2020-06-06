package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.AuthenticateApiService;
import org.openapitools.api.factories.AuthenticateApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.Authentication;
import org.openapitools.model.AuthenticationRequest;
import org.openapitools.model.Error;
import org.openapitools.model.UsernamePassword;

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

@Path("/authenticate")


@io.swagger.annotations.Api(description = "the authenticate API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2020-06-05T23:34:08.066001300-03:00[America/Sao_Paulo]")
public class AuthenticateApi  {
   private final AuthenticateApiService delegate;

   public AuthenticateApi(@Context ServletConfig servletContext) {
      AuthenticateApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("AuthenticateApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (AuthenticateApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = AuthenticateApiServiceFactory.getAuthenticateApi();
      }

      this.delegate = delegate;
   }

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Authentication.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successfully authenticated", response = Authentication.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Could not authenticate", response = Error.class) })
    public Response authenticate(@ApiParam(value = "" ,required=true) @Valid AuthenticationRequest authenticationRequest
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.authenticate(authenticationRequest,securityContext);
    }
}
