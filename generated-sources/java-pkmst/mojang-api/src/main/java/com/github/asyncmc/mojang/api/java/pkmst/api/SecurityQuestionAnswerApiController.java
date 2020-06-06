package com.github.asyncmc.mojang.api.java.pkmst.api;

import com.github.asyncmc.mojang.api.java.pkmst.model.Error;
import java.util.List;
import com.github.asyncmc.mojang.api.java.pkmst.model.SecurityAnswer;
import com.github.asyncmc.mojang.api.java.pkmst.model.SecurityChallenge;

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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2020-06-06T02:32:33.503412200-03:00[America/Sao_Paulo]")

@Controller
public class SecurityQuestionAnswerApiController implements SecurityQuestionAnswerApi {
    private final ObjectMapper objectMapper;
@Autowired
    public SecurityQuestionAnswerApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<Void> checkSecurityStatus(@RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<List<SecurityChallenge>> listPendingSecurityQuestions(@RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<List<SecurityChallenge>>(objectMapper.readValue("", List.class), HttpStatus.OK);
        }

        return new ResponseEntity<List<SecurityChallenge>>(HttpStatus.OK);
    }

    public ResponseEntity<Void> sendSecurityQuestionAnswers(@ApiParam(value = "An array with all the answers" ,required=true )   @RequestBody List<SecurityAnswer> securityAnswer,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
