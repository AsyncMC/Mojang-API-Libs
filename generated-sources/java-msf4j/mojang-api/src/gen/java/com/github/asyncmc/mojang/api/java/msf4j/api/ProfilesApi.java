package com.github.asyncmc.mojang.api.java.msf4j.api;

import com.github.asyncmc.mojang.api.java.msf4j.model.*;
import com.github.asyncmc.mojang.api.java.msf4j.api.ProfilesApiService;
import com.github.asyncmc.mojang.api.java.msf4j.api.factories.ProfilesApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import com.github.asyncmc.mojang.api.java.msf4j.model.CurrentPlayerIDs;
import java.util.List;

import java.util.List;
import com.github.asyncmc.mojang.api.java.msf4j.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/profiles")


@io.swagger.annotations.Api(description = "the profiles API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2020-06-06T02:32:29.917115200-03:00[America/Sao_Paulo]")
public class ProfilesApi  {
   private final ProfilesApiService delegate = ProfilesApiServiceFactory.getProfilesApi();

    @POST
    @Path("/minecraft")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Find the current UUID of multiple players at once", notes = "Find the current players name, UUID, demo status and migration flag by the current players name. The \"at\" parameter is not supported. Players not found are not returned. If no players are found, an empty array is returned.", response = CurrentPlayerIDs.class, responseContainer = "List", tags={ "Name History", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "An array containing all players found", response = CurrentPlayerIDs.class, responseContainer = "List") })
    public Response findUniqueIdsByName(@ApiParam(value = "Array with the player names" ,required=true) List<String> requestBody
)
    throws NotFoundException {
        return delegate.findUniqueIdsByName(requestBody);
    }
}
