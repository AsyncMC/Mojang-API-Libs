package com.github.asyncmc.mojang.api.jaxrs.cxf.cdi.api;

import com.github.asyncmc.mojang.api.jaxrs.cxf.cdi.model.CurrentPlayerIDs;
import com.github.asyncmc.mojang.api.jaxrs.cxf.cdi.model.Error;
import com.github.asyncmc.mojang.api.jaxrs.cxf.cdi.api.UsersApiService;

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
@Path("/users")
@RequestScoped

@Api(description = "the users API")


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2020-06-06T04:59:50.207331100-03:00[America/Sao_Paulo]")

public class UsersApi  {

  @Context SecurityContext securityContext;

  @Inject UsersApiService delegate;


    @GET
    @Path("/profiles/minecraft/{username}")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Find the UUID by name", notes = "Find the current player name, UUID, demo status and migration flag by the current player name or at a given time.", response = CurrentPlayerIDs.class, tags={ "Name History" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The user was found", response = CurrentPlayerIDs.class),
        @ApiResponse(code = 204, message = "User not found", response = Void.class),
        @ApiResponse(code = 400, message = "If the timestamp is invalid", response = Error.class) })
    public Response getUniqueIdByName(@ApiParam(value = "The username in a given time, or in present if \"at\" is not sent",required=true) @PathParam("username") String username,  @ApiParam(value = "Find the username in a given time, when 0 selects the original name however, it only works if the name was changed at least once, or if the account is legacy. The time is an UNIX timestamp (without milliseconds)")  @QueryParam("at") Long at) {
        return delegate.getUniqueIdByName(username, at, securityContext);
    }
}
