/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.3.4).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.github.asyncmc.mojang.sessions.java.pkmst.api;

import com.github.asyncmc.mojang.sessions.java.pkmst.model.PlayerProfile;
import com.github.asyncmc.mojang.sessions.java.pkmst.model.SessionApiError;

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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2020-06-06T02:32:35.513066100-03:00[America/Sao_Paulo]")

@Api(value = "Login", description = "the Login API")
public interface LoginApi {

    @ApiOperation(value = "Gets the player's game profile", notes = "This will return the player's username plus any additional information about them (e.g. skins). This has a much stricter rate limit: You can request the same profile once per minute, however you can send as many unique requests as you like.", response = PlayerProfile.class, tags={ "Login", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The player profile and all properties", response = PlayerProfile.class),
        @ApiResponse(code = 400, message = "UUID is invalid", response = SessionApiError.class) })
    @RequestMapping(value = "/session/minecraft/profile/{stripped_uuid}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<PlayerProfile> getPlayerProfile(@ApiParam(value = "The player UUID without hyphens",required=true ) @PathVariable("stripped_uuid") String strippedUuid,@ApiParam(value = "When set to false, the signature data are sent")  @RequestParam(value = "unsigned", required = false) Boolean unsigned, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;

}