package com.github.asyncmc.mojang.sessions.jaxrs.jersey.api;

import com.github.asyncmc.mojang.sessions.jaxrs.jersey.model.*;
import com.github.asyncmc.mojang.sessions.jaxrs.jersey.api.BlockedserversApiService;
import com.github.asyncmc.mojang.sessions.jaxrs.jersey.api.factories.BlockedserversApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;


import java.util.Map;
import java.util.List;
import com.github.asyncmc.mojang.sessions.jaxrs.jersey.api.NotFoundException;

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

@Path("/blockedservers")


@io.swagger.annotations.Api(description = "the blockedservers API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2020-06-06T05:00:03.118240-03:00[America/Sao_Paulo]")
public class BlockedserversApi  {
   private final BlockedserversApiService delegate;

   public BlockedserversApi(@Context ServletConfig servletContext) {
      BlockedserversApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("BlockedserversApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (BlockedserversApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = BlockedserversApiServiceFactory.getBlockedserversApi();
      }

      this.delegate = delegate;
   }

    @GET
    
    
    @Produces({ "text/plain" })
    @io.swagger.annotations.ApiOperation(value = "A list of SHA1 hashes of banned servers", notes = "Returns a list of SHA1 hashes used to check server addresses against when the client tries to connect. Clients check the lowercase name, using the ISO-8859-1 charset, against this list. They will also attempt to check subdomains, replacing each level with a *. Specifically, it splits based off of the . in the domain, goes through each section removing one at a time. For instance, for mc.example.com, it would try mc.example.com, *.example.com, and *.com. With IP addresses (verified by having 4 split sections, with each section being a valid integer between 0 and 255, inclusive) substitution starts from the end, so for 192.168.0.1, it would try 192.168.0.1, 192.168.0.*, 192.168.*, and 192.*. This check is done by the bootstrap class in netty. The default netty class is overridden by one in the com.mojang:netty dependency loaded by the launcher. This allows it to affect any version that used netty (1.7+)", response = String.class, tags={ "Bans", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "A list of SHA1 hashes, one hash per line", response = String.class) })
    public Response getBlockedServerHashes(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getBlockedServerHashes(securityContext);
    }
}
