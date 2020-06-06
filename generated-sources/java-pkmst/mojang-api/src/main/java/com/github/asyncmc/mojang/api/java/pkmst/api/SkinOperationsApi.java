/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.3.4).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.github.asyncmc.mojang.api.java.pkmst.api;

import com.github.asyncmc.mojang.api.java.pkmst.model.Error;
import java.io.File;
import com.github.asyncmc.mojang.api.java.pkmst.model.SkinModel;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;

import java.util.List;
/**
 * Provides the info about api methods
 * @author pkmst
 *
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2020-06-06T02:32:33.503412200-03:00[America/Sao_Paulo]")

@Api(value = "SkinOperations", description = "the SkinOperations API")
public interface SkinOperationsApi {

    @ApiOperation(value = "Changes the player skin by URL", notes = "This will set the skin for the selected profile, but Mojang's servers will fetch the skin from a URL. This will also work for legacy accounts.", response = Void.class, authorizations = {
        @Authorization(value = "PlayerAccessToken")
    }, tags={ "Skin Operations", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "The skin has been changed. The response has no body"),
        @ApiResponse(code = 400, message = "Upon error the server will send back a JSON with the error. (Success is a blank payload)", response = Error.class) })
    @RequestMapping(value = "/user/profile/{stripped_uuid}/skin",
        produces = { "application/json" }, 
        consumes = { "application/x-www-form-urlencoded" },
        method = RequestMethod.POST)
    ResponseEntity<Void> changePlayerSkin(@ApiParam(value = "The player UUID without hyphens",required=true ) @PathVariable("stripped_uuid") String strippedUuid,@ApiParam(value = "The URL which Mojang servers will download and apply the skin", required=true) @RequestPart(value="url", required=true)  String url,@ApiParam(value = "", defaultValue="null") @RequestPart(value="model", required=false)  SkinModel model, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;


    @ApiOperation(value = "Resets the player skin to default", notes = "", response = Void.class, authorizations = {
        @Authorization(value = "PlayerAccessToken")
    }, tags={ "Skin Operations", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "The skin has been changed. The response has no body"),
        @ApiResponse(code = 400, message = "Upon error the server will send back a JSON with the error. (Success is a blank payload)", response = Error.class) })
    @RequestMapping(value = "/user/profile/{stripped_uuid}/skin",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Void> resetPlayerSkin(@ApiParam(value = "The player UUID without hyphens",required=true ) @PathVariable("stripped_uuid") String strippedUuid, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;


    @ApiOperation(value = "Changes the player skin by upload", notes = "This uploads a skin to Mojang's servers. It also sets the users skin. This works on legacy counts as well.", response = Void.class, authorizations = {
        @Authorization(value = "PlayerAccessToken")
    }, tags={ "Skin Operations", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "The skin has been changed. The response has no body"),
        @ApiResponse(code = 400, message = "Upon error the server will send back a JSON with the error. (Success is a blank payload)", response = Error.class) })
    @RequestMapping(value = "/user/profile/{stripped_uuid}/skin",
        produces = { "application/json" }, 
        consumes = { "multipart/form-data" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> uploadPlayerSkin(@ApiParam(value = "The player UUID without hyphens",required=true ) @PathVariable("stripped_uuid") String strippedUuid,@ApiParam(value = "file detail")  @RequestPart("file") MultipartFile file,@ApiParam(value = "", defaultValue="null") @RequestPart(value="model", required=false)  SkinModel model, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;

}
