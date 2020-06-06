package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.AuthenticateApiService;
import org.openapitools.api.factories.AuthenticateApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import org.openapitools.model.Authentication;
import org.openapitools.model.AuthenticationRequest;
import org.openapitools.model.Error;
import org.openapitools.model.UsernamePassword;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;

@Path("/authenticate")


@io.swagger.annotations.Api(description = "the authenticate API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2020-06-05T23:33:25.668599-03:00[America/Sao_Paulo]")
public class AuthenticateApi  {
   private final AuthenticateApiService delegate = AuthenticateApiServiceFactory.getAuthenticateApi();

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "", notes = "", response = Authentication.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Successfully authenticated", response = Authentication.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Could not authenticate", response = Authentication.class) })
    public Response authenticate(@ApiParam(value = "" ,required=true) AuthenticationRequest authenticationRequest
)
    throws NotFoundException {
        return delegate.authenticate(authenticationRequest);
    }
}
