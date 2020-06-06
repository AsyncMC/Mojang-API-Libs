package com.github.asyncmc.mojang.sessions.java.pkmst.api;

import com.github.asyncmc.mojang.sessions.java.pkmst.model.PlayerProfile;
import com.github.asyncmc.mojang.sessions.java.pkmst.model.SessionApiError;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
/**
 * Api implemention
 * @author pkmst
 *
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2020-06-06T02:32:35.513066100-03:00[America/Sao_Paulo]")

@Controller
public class LoginApiController implements LoginApi {
    private final ObjectMapper objectMapper;
@Autowired
    public LoginApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<PlayerProfile> getPlayerProfile(@ApiParam(value = "The player UUID without hyphens",required=true ) @PathVariable("stripped_uuid") String strippedUuid,
        @ApiParam(value = "When set to false, the signature data are sent")  @RequestParam(value = "unsigned", required = false) Boolean unsigned,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<PlayerProfile>(objectMapper.readValue("", PlayerProfile.class), HttpStatus.OK);
        }

        return new ResponseEntity<PlayerProfile>(HttpStatus.OK);
    }

}
