package com.github.asyncmc.mojang.status.jaxrs.jersey.api;

import com.github.asyncmc.mojang.status.jaxrs.jersey.model.*;
import com.github.asyncmc.mojang.status.jaxrs.jersey.api.CheckApiService;
import com.github.asyncmc.mojang.status.jaxrs.jersey.api.factories.CheckApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import com.github.asyncmc.mojang.status.jaxrs.jersey.model.ApiStatus;

import java.util.Map;
import java.util.List;
import com.github.asyncmc.mojang.status.jaxrs.jersey.api.NotFoundException;

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

@Path("/check")


@io.swagger.annotations.Api(description = "the check API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2020-06-06T05:00:04.026871200-03:00[America/Sao_Paulo]")
public class CheckApi  {
   private final CheckApiService delegate;

   public CheckApi(@Context ServletConfig servletContext) {
      CheckApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("CheckApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (CheckApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = CheckApiServiceFactory.getCheckApi();
      }

      this.delegate = delegate;
   }

    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Checks the Mojang service statuses", notes = "", response = Map.class, responseContainer = "List", tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "An array with service status key/pairs", response = ApiStatus.class, responseContainer = "List") })
    public Response checkStatuses(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.checkStatuses(securityContext);
    }
}
