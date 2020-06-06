package com.github.asyncmc.mojang.api.jaxrs.jersey.api;

import com.github.asyncmc.mojang.api.jaxrs.jersey.model.*;
import com.github.asyncmc.mojang.api.jaxrs.jersey.api.ProfilesApiService;
import com.github.asyncmc.mojang.api.jaxrs.jersey.api.factories.ProfilesApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import com.github.asyncmc.mojang.api.jaxrs.jersey.model.CurrentPlayerIDs;
import java.util.List;

import java.util.Map;
import java.util.List;
import com.github.asyncmc.mojang.api.jaxrs.jersey.api.NotFoundException;

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

@Path("/profiles")


@io.swagger.annotations.Api(description = "the profiles API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2020-06-06T02:33:09.626845200-03:00[America/Sao_Paulo]")
public class ProfilesApi  {
   private final ProfilesApiService delegate;

   public ProfilesApi(@Context ServletConfig servletContext) {
      ProfilesApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("ProfilesApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (ProfilesApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = ProfilesApiServiceFactory.getProfilesApi();
      }

      this.delegate = delegate;
   }

    @POST
    @Path("/minecraft")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Find the current UUID of multiple players at once", notes = "Find the current players name, UUID, demo status and migration flag by the current players name. The \"at\" parameter is not supported. Players not found are not returned. If no players are found, an empty array is returned.", response = CurrentPlayerIDs.class, responseContainer = "List", tags={ "Name History", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "An array containing all players found", response = CurrentPlayerIDs.class, responseContainer = "List") })
    public Response findUniqueIdsByName(@ApiParam(value = "Array with the player names" ,required=true) @Valid List<String> requestBody
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.findUniqueIdsByName(requestBody,securityContext);
    }
}
