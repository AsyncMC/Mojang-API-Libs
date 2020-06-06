package com.github.asyncmc.mojang.api.jaxrs.resteasy.api;

import com.github.asyncmc.mojang.api.jaxrs.resteasy.model.*;
import com.github.asyncmc.mojang.api.jaxrs.resteasy.api.UserApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import com.github.asyncmc.mojang.api.jaxrs.resteasy.model.Error;
import java.io.File;
import java.util.List;
import com.github.asyncmc.mojang.api.jaxrs.resteasy.model.NameChange;
import com.github.asyncmc.mojang.api.jaxrs.resteasy.model.SecurityAnswer;
import com.github.asyncmc.mojang.api.jaxrs.resteasy.model.SecurityChallenge;
import com.github.asyncmc.mojang.api.jaxrs.resteasy.model.SkinModel;

import java.util.Map;
import java.util.List;
import com.github.asyncmc.mojang.api.jaxrs.resteasy.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.inject.Inject;

import javax.validation.constraints.*;
import javax.validation.Valid;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;

@Path("/user")


@io.swagger.annotations.Api(description = "the user API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2020-06-06T02:33:16.982094400-03:00[America/Sao_Paulo]")
public class UserApi  {

    @Inject UserApiService service;

    @POST
    @Path("/profile/{stripped_uuid}/skin")
    @Consumes({ "application/x-www-form-urlencoded" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Changes the player skin by URL", notes = "This will set the skin for the selected profile, but Mojang's servers will fetch the skin from a URL. This will also work for legacy accounts.", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "PlayerAccessToken")
    }, tags={ "Skin Operations", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "The skin has been changed. The response has no body", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Upon error the server will send back a JSON with the error. (Success is a blank payload)", response = Error.class) })
    public Response changePlayerSkin( @PathParam("stripped_uuid") String strippedUuid,@ApiParam(value = "The URL which Mojang servers will download and apply the skin", required=true)@FormParam("url")  String url,@ApiParam(value = "", defaultValue="null")@FormParam("model")  SkinModel model,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.changePlayerSkin(strippedUuid,url,model,securityContext);
    }
    @GET
    @Path("/security/location")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Check if security questions are needed", notes = "", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "PlayerAccessToken")
    }, tags={ "Security question-answer", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "No check is needed.", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "A security check is needed or there is an other issue", response = Error.class) })
    public Response checkSecurityStatus(@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.checkSecurityStatus(securityContext);
    }
    @GET
    @Path("/profiles/{stripped_uuid}/names")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Gets the full player's name history", notes = "", response = NameChange.class, responseContainer = "List", tags={ "Name History", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "A list of name changes, the first entry usually don't have a change time", response = NameChange.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 204, message = "Username not found at the given time", response = Void.class) })
    public Response getNameHistory( @PathParam("stripped_uuid") String strippedUuid,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getNameHistory(strippedUuid,securityContext);
    }
    @GET
    @Path("/security/challenges")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get list of questions", notes = "", response = SecurityChallenge.class, responseContainer = "List", authorizations = {
        @io.swagger.annotations.Authorization(value = "PlayerAccessToken")
    }, tags={ "Security question-answer", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "A list of security questions to be answered", response = SecurityChallenge.class, responseContainer = "List") })
    public Response listPendingSecurityQuestions(@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.listPendingSecurityQuestions(securityContext);
    }
    @DELETE
    @Path("/profile/{stripped_uuid}/skin")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Resets the player skin to default", notes = "", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "PlayerAccessToken")
    }, tags={ "Skin Operations", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "The skin has been changed. The response has no body", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Upon error the server will send back a JSON with the error. (Success is a blank payload)", response = Error.class) })
    public Response resetPlayerSkin( @PathParam("stripped_uuid") String strippedUuid,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.resetPlayerSkin(strippedUuid,securityContext);
    }
    @POST
    @Path("/security/location")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Send back the answers", notes = "", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "PlayerAccessToken")
    }, tags={ "Security question-answer", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "The answers were accepted", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "At least one answer we not accepted", response = Error.class) })
    public Response sendSecurityQuestionAnswers(@ApiParam(value = "An array with all the answers" ,required=true) @NotNull @Valid List<SecurityAnswer> securityAnswer,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.sendSecurityQuestionAnswers(securityAnswer,securityContext);
    }
    @PUT
    @Path("/profile/{stripped_uuid}/skin")
    @Consumes({ "multipart/form-data" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Changes the player skin by upload", notes = "This uploads a skin to Mojang's servers. It also sets the users skin. This works on legacy counts as well.", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "PlayerAccessToken")
    }, tags={ "Skin Operations", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "The skin has been changed. The response has no body", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Upon error the server will send back a JSON with the error. (Success is a blank payload)", response = Error.class) })
    public Response uploadPlayerSkin(MultipartFormDataInput input, @PathParam("stripped_uuid") String strippedUuid,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.uploadPlayerSkin(input,strippedUuid,securityContext);
    }
}
