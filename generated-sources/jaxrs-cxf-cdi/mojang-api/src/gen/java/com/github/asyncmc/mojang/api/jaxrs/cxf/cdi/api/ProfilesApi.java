package com.github.asyncmc.mojang.api.jaxrs.cxf.cdi.api;

import com.github.asyncmc.mojang.api.jaxrs.cxf.cdi.model.CurrentPlayerIDs;
import java.util.List;
import com.github.asyncmc.mojang.api.jaxrs.cxf.cdi.api.ProfilesApiService;

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
@Path("/profiles")
@RequestScoped

@Api(description = "the profiles API")


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2020-06-06T04:59:50.207331100-03:00[America/Sao_Paulo]")

public class ProfilesApi  {

  @Context SecurityContext securityContext;

  @Inject ProfilesApiService delegate;


    @POST
    @Path("/minecraft")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Find the current UUID of multiple players at once", notes = "Find the current players name, UUID, demo status and migration flag by the current players name. The \"at\" parameter is not supported. Players not found are not returned. If no players are found, an empty array is returned.", response = CurrentPlayerIDs.class, responseContainer = "List", tags={ "Name History" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "An array containing all players found", response = CurrentPlayerIDs.class, responseContainer = "List") })
    public Response findUniqueIdsByName(@ApiParam(value = "Array with the player names" ,required=true) List<String> requestBody) {
        return delegate.findUniqueIdsByName(requestBody, securityContext);
    }
}
