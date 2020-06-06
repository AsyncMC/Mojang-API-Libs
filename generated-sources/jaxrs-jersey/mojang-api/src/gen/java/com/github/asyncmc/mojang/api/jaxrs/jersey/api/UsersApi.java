package com.github.asyncmc.mojang.api.jaxrs.jersey.api;

import com.github.asyncmc.mojang.api.jaxrs.jersey.model.*;
import com.github.asyncmc.mojang.api.jaxrs.jersey.api.UsersApiService;
import com.github.asyncmc.mojang.api.jaxrs.jersey.api.factories.UsersApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import com.github.asyncmc.mojang.api.jaxrs.jersey.model.CurrentPlayerIDs;
import com.github.asyncmc.mojang.api.jaxrs.jersey.model.Error;

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

@Path("/users")


@io.swagger.annotations.Api(description = "the users API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2020-06-06T02:33:09.626845200-03:00[America/Sao_Paulo]")
public class UsersApi  {
   private final UsersApiService delegate;

   public UsersApi(@Context ServletConfig servletContext) {
      UsersApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("UsersApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (UsersApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = UsersApiServiceFactory.getUsersApi();
      }

      this.delegate = delegate;
   }

    @GET
    @Path("/profiles/minecraft/{username}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Find the UUID by name", notes = "Find the current player name, UUID, demo status and migration flag by the current player name or at a given time.", response = CurrentPlayerIDs.class, tags={ "Name History", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The user was found", response = CurrentPlayerIDs.class),
        
        @io.swagger.annotations.ApiResponse(code = 204, message = "User not found", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "If the timestamp is invalid", response = Error.class) })
    public Response getUniqueIdByName(@ApiParam(value = "The username in a given time, or in present if \"at\" is not sent",required=true) @PathParam("username") String username
,@ApiParam(value = "Find the username in a given time, when 0 selects the original name however, it only works if the name was changed at least once, or if the account is legacy. The time is an UNIX timestamp (without milliseconds)") @QueryParam("at") Long at
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getUniqueIdByName(username,at,securityContext);
    }
}
