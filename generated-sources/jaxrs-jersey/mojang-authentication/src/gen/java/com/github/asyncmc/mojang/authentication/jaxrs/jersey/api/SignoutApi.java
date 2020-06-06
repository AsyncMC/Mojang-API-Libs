package com.github.asyncmc.mojang.authentication.jaxrs.jersey.api;

import com.github.asyncmc.mojang.authentication.jaxrs.jersey.model.*;
import com.github.asyncmc.mojang.authentication.jaxrs.jersey.api.SignoutApiService;
import com.github.asyncmc.mojang.authentication.jaxrs.jersey.api.factories.SignoutApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import com.github.asyncmc.mojang.authentication.jaxrs.jersey.model.Error;
import com.github.asyncmc.mojang.authentication.jaxrs.jersey.model.UsernamePassword;

import java.util.Map;
import java.util.List;
import com.github.asyncmc.mojang.authentication.jaxrs.jersey.api.NotFoundException;

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

@Path("/signout")


@io.swagger.annotations.Api(description = "the signout API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2020-06-06T02:33:10.678452700-03:00[America/Sao_Paulo]")
public class SignoutApi  {
   private final SignoutApiService delegate;

   public SignoutApi(@Context ServletConfig servletContext) {
      SignoutApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("SignoutApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (SignoutApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = SignoutApiServiceFactory.getSignoutApi();
      }

      this.delegate = delegate;
   }

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Void.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "All tokens have been invalidated", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid username/password", response = Error.class) })
    public Response siginout(@ApiParam(value = "" ,required=true) @Valid UsernamePassword usernamePassword
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.siginout(usernamePassword,securityContext);
    }
}
