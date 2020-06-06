package com.github.asyncmc.mojang.api.jaxrs.cxf.cdi.api;

import com.github.asyncmc.mojang.api.jaxrs.cxf.cdi.model.Error;
import java.io.File;
import java.util.List;
import com.github.asyncmc.mojang.api.jaxrs.cxf.cdi.model.NameChange;
import com.github.asyncmc.mojang.api.jaxrs.cxf.cdi.model.SecurityAnswer;
import com.github.asyncmc.mojang.api.jaxrs.cxf.cdi.model.SecurityChallenge;
import com.github.asyncmc.mojang.api.jaxrs.cxf.cdi.model.SkinModel;
import com.github.asyncmc.mojang.api.jaxrs.cxf.cdi.api.UserApiService;

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
@Path("/user")
@RequestScoped

@Api(description = "the user API")


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2020-06-06T02:32:58.743651500-03:00[America/Sao_Paulo]")

public class UserApi  {

  @Context SecurityContext securityContext;

  @Inject UserApiService delegate;


    @POST
    @Path("/profile/{stripped_uuid}/skin")
    @Consumes({ "application/x-www-form-urlencoded" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Changes the player skin by URL", notes = "This will set the skin for the selected profile, but Mojang's servers will fetch the skin from a URL. This will also work for legacy accounts.", response = Void.class, authorizations = {
        @Authorization(value = "PlayerAccessToken")
    }, tags={ "Skin Operations",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "The skin has been changed. The response has no body", response = Void.class),
        @ApiResponse(code = 400, message = "Upon error the server will send back a JSON with the error. (Success is a blank payload)", response = Error.class) })
    public Response changePlayerSkin(@ApiParam(value = "The player UUID without hyphens",required=true) @PathParam("stripped_uuid") String strippedUuid, @Multipart(value = "url")  String url, @Multipart(value = "model", required = false)  SkinModel model) {
        return delegate.changePlayerSkin(strippedUuid, url, model, securityContext);
    }

    @GET
    @Path("/security/location")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Check if security questions are needed", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "PlayerAccessToken")
    }, tags={ "Security question-answer",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "No check is needed.", response = Void.class),
        @ApiResponse(code = 400, message = "A security check is needed or there is an other issue", response = Error.class) })
    public Response checkSecurityStatus() {
        return delegate.checkSecurityStatus(securityContext);
    }

    @GET
    @Path("/profiles/{stripped_uuid}/names")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Gets the full player's name history", notes = "", response = NameChange.class, responseContainer = "List", tags={ "Name History",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "A list of name changes, the first entry usually don't have a change time", response = NameChange.class, responseContainer = "List"),
        @ApiResponse(code = 204, message = "Username not found at the given time", response = Void.class) })
    public Response getNameHistory(@ApiParam(value = "The player UUID without hyphens",required=true) @PathParam("stripped_uuid") String strippedUuid) {
        return delegate.getNameHistory(strippedUuid, securityContext);
    }

    @GET
    @Path("/security/challenges")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Get list of questions", notes = "", response = SecurityChallenge.class, responseContainer = "List", authorizations = {
        @Authorization(value = "PlayerAccessToken")
    }, tags={ "Security question-answer",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "A list of security questions to be answered", response = SecurityChallenge.class, responseContainer = "List") })
    public Response listPendingSecurityQuestions() {
        return delegate.listPendingSecurityQuestions(securityContext);
    }

    @DELETE
    @Path("/profile/{stripped_uuid}/skin")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Resets the player skin to default", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "PlayerAccessToken")
    }, tags={ "Skin Operations",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "The skin has been changed. The response has no body", response = Void.class),
        @ApiResponse(code = 400, message = "Upon error the server will send back a JSON with the error. (Success is a blank payload)", response = Error.class) })
    public Response resetPlayerSkin(@ApiParam(value = "The player UUID without hyphens",required=true) @PathParam("stripped_uuid") String strippedUuid) {
        return delegate.resetPlayerSkin(strippedUuid, securityContext);
    }

    @POST
    @Path("/security/location")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Send back the answers", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "PlayerAccessToken")
    }, tags={ "Security question-answer",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "The answers were accepted", response = Void.class),
        @ApiResponse(code = 400, message = "At least one answer we not accepted", response = Error.class) })
    public Response sendSecurityQuestionAnswers(@ApiParam(value = "An array with all the answers" ,required=true) List<SecurityAnswer> securityAnswer) {
        return delegate.sendSecurityQuestionAnswers(securityAnswer, securityContext);
    }

    @PUT
    @Path("/profile/{stripped_uuid}/skin")
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/json" })
    @ApiOperation(value = "Changes the player skin by upload", notes = "This uploads a skin to Mojang's servers. It also sets the users skin. This works on legacy counts as well.", response = Void.class, authorizations = {
        @Authorization(value = "PlayerAccessToken")
    }, tags={ "Skin Operations" })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "The skin has been changed. The response has no body", response = Void.class),
        @ApiResponse(code = 400, message = "Upon error the server will send back a JSON with the error. (Success is a blank payload)", response = Error.class) })
    public Response uploadPlayerSkin(@ApiParam(value = "The player UUID without hyphens",required=true) @PathParam("stripped_uuid") String strippedUuid,  @Multipart(value = "file") InputStream fileInputStream, @Multipart(value = "file" ) Attachment fileDetail, @Multipart(value = "model", required = false)  SkinModel model) {
        return delegate.uploadPlayerSkin(strippedUuid, fileInputStream, fileDetail, model, securityContext);
    }
}
