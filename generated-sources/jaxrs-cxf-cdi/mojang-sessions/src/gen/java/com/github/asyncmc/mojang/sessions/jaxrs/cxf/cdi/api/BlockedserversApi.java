package com.github.asyncmc.mojang.sessions.jaxrs.cxf.cdi.api;

import com.github.asyncmc.mojang.sessions.jaxrs.cxf.cdi.api.BlockedserversApiService;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

import io.swagger.annotations.*;
import java.io.InputStream;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
@Path("/blockedservers")
@RequestScoped

@Api(description = "the blockedservers API")


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2020-06-06T02:33:00.757857600-03:00[America/Sao_Paulo]")

public class BlockedserversApi  {

  @Context SecurityContext securityContext;

  @Inject BlockedserversApiService delegate;


    @GET
    
    
    @Produces({ "text/plain" })
    @ApiOperation(value = "A list of SHA1 hashes of banned servers", notes = "Returns a list of SHA1 hashes used to check server addresses against when the client tries to connect. Clients check the lowercase name, using the ISO-8859-1 charset, against this list. They will also attempt to check subdomains, replacing each level with a *. Specifically, it splits based off of the . in the domain, goes through each section removing one at a time. For instance, for mc.example.com, it would try mc.example.com, *.example.com, and *.com. With IP addresses (verified by having 4 split sections, with each section being a valid integer between 0 and 255, inclusive) substitution starts from the end, so for 192.168.0.1, it would try 192.168.0.1, 192.168.0.*, 192.168.*, and 192.*. This check is done by the bootstrap class in netty. The default netty class is overridden by one in the com.mojang:netty dependency loaded by the launcher. This allows it to affect any version that used netty (1.7+)", response = String.class, tags={ "Bans" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "A list of SHA1 hashes, one hash per line", response = String.class) })
    public Response getBlockedServerHashes() {
        return delegate.getBlockedServerHashes(securityContext);
    }
}
