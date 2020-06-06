package com.github.asyncmc.mojang.api.java.pkmst.api;

import com.github.asyncmc.mojang.api.java.pkmst.model.Error;
import java.io.File;
import com.github.asyncmc.mojang.api.java.pkmst.model.SkinModel;

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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2020-06-06T04:59:25.087174700-03:00[America/Sao_Paulo]")

@Controller
public class SkinOperationsApiController implements SkinOperationsApi {
    private final ObjectMapper objectMapper;
@Autowired
    public SkinOperationsApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<Void> changePlayerSkin(@ApiParam(value = "The player UUID without hyphens",required=true ) @PathVariable("stripped_uuid") String strippedUuid,
        @ApiParam(value = "The URL which Mojang servers will download and apply the skin", required=true) @RequestPart(value="url", required=true)  String url,
        @ApiParam(value = "", defaultValue="null") @RequestPart(value="model", required=false)  SkinModel model,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> resetPlayerSkin(@ApiParam(value = "The player UUID without hyphens",required=true ) @PathVariable("stripped_uuid") String strippedUuid,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> uploadPlayerSkin(@ApiParam(value = "The player UUID without hyphens",required=true ) @PathVariable("stripped_uuid") String strippedUuid,
        @ApiParam(value = "file detail")  @RequestPart("file") MultipartFile file,
        @ApiParam(value = "", defaultValue="null") @RequestPart(value="model", required=false)  SkinModel model,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
