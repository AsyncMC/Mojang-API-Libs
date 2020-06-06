package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.UsersApiService;
import org.openapitools.api.factories.UsersApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.CurrentPlayerIDs;
import org.openapitools.model.Error;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/users")


@io.swagger.annotations.Api(description = "the users API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2020-06-05T23:33:24.655917700-03:00[America/Sao_Paulo]")
public class UsersApi  {
   private final UsersApiService delegate = UsersApiServiceFactory.getUsersApi();

    @GET
    @Path("/profiles/minecraft/{username}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Find the UUID by name", notes = "Find the current player name, UUID, demo status and migration flag by the current player name or at a given time.", response = CurrentPlayerIDs.class, tags={ "Name History", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "The user was found", response = CurrentPlayerIDs.class),
        
        @io.swagger.annotations.ApiResponse(code = 204, message = "User not found", response = CurrentPlayerIDs.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "If the timestamp is invalid", response = CurrentPlayerIDs.class) })
    public Response getUniqueIdByName(@ApiParam(value = "The username in a given time, or in present if \"at\" is not sent",required=true) @PathParam("username") String username
,@ApiParam(value = "Find the username in a given time, when 0 selects the original name however, it only works if the name was changed at least once, or if the account is legacy. The time is an UNIX timestamp (without milliseconds)") @QueryParam("at") Long at
)
    throws NotFoundException {
        return delegate.getUniqueIdByName(username,at);
    }
}
