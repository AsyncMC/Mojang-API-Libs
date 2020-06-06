package com.github.asyncmc.mojang.authentication.java.pkmst.api;

import com.github.asyncmc.mojang.authentication.java.pkmst.model.AccessKeys;
import com.github.asyncmc.mojang.authentication.java.pkmst.model.Authentication;
import com.github.asyncmc.mojang.authentication.java.pkmst.model.AuthenticationRequest;
import com.github.asyncmc.mojang.authentication.java.pkmst.model.Error;
import com.github.asyncmc.mojang.authentication.java.pkmst.model.RefreshRequest;
import com.github.asyncmc.mojang.authentication.java.pkmst.model.RefreshResponse;
import com.github.asyncmc.mojang.authentication.java.pkmst.model.UsernamePassword;

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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2020-06-06T02:32:34.594494700-03:00[America/Sao_Paulo]")

@Controller
public class DefaultApiController implements DefaultApi {
    private final ObjectMapper objectMapper;
@Autowired
    public DefaultApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<Authentication> authenticate(@ApiParam(value = "" ,required=true )   @RequestBody AuthenticationRequest authenticationRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Authentication>(objectMapper.readValue("", Authentication.class), HttpStatus.OK);
        }

        return new ResponseEntity<Authentication>(HttpStatus.OK);
    }

    public ResponseEntity<Void> invalidate(@ApiParam(value = "" ,required=true )   @RequestBody AccessKeys accessKeys,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<RefreshResponse> refresh(@ApiParam(value = "" ,required=true )   @RequestBody RefreshRequest refreshRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<RefreshResponse>(objectMapper.readValue("", RefreshResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<RefreshResponse>(HttpStatus.OK);
    }

    public ResponseEntity<Void> siginout(@ApiParam(value = "" ,required=true )   @RequestBody UsernamePassword usernamePassword,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> validate(@ApiParam(value = "" ,required=true )   @RequestBody AccessKeys accessKeys,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
