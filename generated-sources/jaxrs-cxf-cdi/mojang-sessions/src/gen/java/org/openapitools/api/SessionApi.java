package org.openapitools.api;

import org.openapitools.model.PlayerProfile;
import org.openapitools.model.SessionApiError;
import org.openapitools.api.SessionApiService;

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
@Path("/session")
@RequestScoped

@Api(description = "the session API")


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2020-06-05T23:33:57.923500-03:00[America/Sao_Paulo]")

public class SessionApi  {

  @Context SecurityContext securityContext;

  @Inject SessionApiService delegate;


    @GET
    @Path("/minecraft/profile/{stripped_uuid}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Gets the player's game profile", notes = "This will return the player's username plus any additional information about them (e.g. skins). This has a much stricter rate limit: You can request the same profile once per minute, however you can send as many unique requests as you like.", response = PlayerProfile.class, tags={ "Login" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The player profile and all properties", response = PlayerProfile.class),
        @ApiResponse(code = 400, message = "UUID is invalid", response = SessionApiError.class) })
    public Response getPlayerProfile(@ApiParam(value = "The player UUID without hyphens",required=true) @PathParam("stripped_uuid") String strippedUuid,  @ApiParam(value = "When set to false, the signature data are sent")  @QueryParam("unsigned") Boolean unsigned) {
        return delegate.getPlayerProfile(strippedUuid, unsigned, securityContext);
    }
}
