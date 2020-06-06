/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.3.4).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.ApiStatus;

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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2020-06-05T23:33:30.972558600-03:00[America/Sao_Paulo]")

@Api(value = "Default", description = "the Default API")
public interface DefaultApi {

    @ApiOperation(value = "Checks the Mojang service statuses", notes = "", response = Map<String, ApiStatus>.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "An array with service status key/pairs", response = ApiStatus.class, responseContainer = "List") })
    @RequestMapping(value = "/check",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Map<String, ApiStatus>>> checkStatuses( @RequestHeader(value = "Accept", required = false) String accept) throws Exception;

}
