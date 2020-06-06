package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.CurrentPlayerIDs;
import com.prokarma.pkmst.model.Error;
import java.util.List;
import com.prokarma.pkmst.model.NameChange;

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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2020-06-05T23:33:28.165765-03:00[America/Sao_Paulo]")

@Controller
public class NameHistoryApiController implements NameHistoryApi {
    private final ObjectMapper objectMapper;
@Autowired
    public NameHistoryApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<List<CurrentPlayerIDs>> findUniqueIdsByName(@ApiParam(value = "Array with the player names" ,required=true )   @RequestBody List<String> requestBody,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<CurrentPlayerIDs>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }

        return new ResponseEntity<List<CurrentPlayerIDs>>(HttpStatus.OK);
    }

    public ResponseEntity<List<NameChange>> getNameHistory(@ApiParam(value = "The player UUID without hyphens",required=true ) @PathVariable("stripped_uuid") String strippedUuid,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<List<NameChange>>(HttpStatus.OK);
    }

    public ResponseEntity<CurrentPlayerIDs> getUniqueIdByName(@ApiParam(value = "The username in a given time, or in present if \"at\" is not sent",required=true ) @PathVariable("username") String username,
        @ApiParam(value = "Find the username in a given time, when 0 selects the original name however, it only works if the name was changed at least once, or if the account is legacy. The time is an UNIX timestamp (without milliseconds)")  @RequestParam(value = "at", required = false) Long at,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<CurrentPlayerIDs>(objectMapper.readValue("", CurrentPlayerIDs.class), HttpStatus.OK);
        }

        return new ResponseEntity<CurrentPlayerIDs>(HttpStatus.OK);
    }

}
