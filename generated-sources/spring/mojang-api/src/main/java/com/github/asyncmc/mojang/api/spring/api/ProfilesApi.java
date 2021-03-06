/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.3.4).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.github.asyncmc.mojang.api.spring.api;

import com.github.asyncmc.mojang.api.spring.model.CurrentPlayerIDs;
import java.util.List;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-06-06T05:02:20.878351200-03:00[America/Sao_Paulo]")

@Validated
@Api(value = "profiles", description = "the profiles API")
public interface ProfilesApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    @ApiOperation(value = "Find the current UUID of multiple players at once", nickname = "findUniqueIdsByName", notes = "Find the current players name, UUID, demo status and migration flag by the current players name. The \"at\" parameter is not supported. Players not found are not returned. If no players are found, an empty array is returned.", response = CurrentPlayerIDs.class, responseContainer = "List", tags={ "Name History", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "An array containing all players found", response = CurrentPlayerIDs.class, responseContainer = "List") })
    @RequestMapping(value = "/profiles/minecraft",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<List<CurrentPlayerIDs>> findUniqueIdsByName(@ApiParam(value = "Array with the player names" ,required=true )  @Valid @RequestBody List<String> requestBody) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"legacy\" : false,  \"name\" : \"Alonelord\",  \"id\" : \"38ba542eb5924231a54cca0f2eac2b54\",  \"demo\" : false}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
