package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.SessionApiService;
import org.openapitools.api.factories.SessionApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.PlayerProfile;
import org.openapitools.model.SessionApiError;

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

@Path("/session")


@io.swagger.annotations.Api(description = "the session API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2020-06-05T23:34:08.961495700-03:00[America/Sao_Paulo]")
public class SessionApi  {
   private final SessionApiService delegate;

   public SessionApi(@Context ServletConfig servletContext) {
      SessionApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("SessionApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (SessionApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = SessionApiServiceFactory.getSessionApi();
      }

      this.delegate = delegate;
   }

    @GET
    @Path("/minecraft/profile/{stripped_uuid}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Gets the player's game profile", notes = "This will return the player's username plus any additional information about them (e.g. skins). This has a much stricter rate limit: You can request the same profile once per minute, however you can send as many unique requests as you like.", response = PlayerProfile.class, tags={ "Login", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The player profile and all properties", response = PlayerProfile.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "UUID is invalid", response = SessionApiError.class) })
    public Response getPlayerProfile(@ApiParam(value = "The player UUID without hyphens",required=true) @PathParam("stripped_uuid") String strippedUuid
,@ApiParam(value = "When set to false, the signature data are sent") @QueryParam("unsigned") Boolean unsigned
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getPlayerProfile(strippedUuid,unsigned,securityContext);
    }
}
