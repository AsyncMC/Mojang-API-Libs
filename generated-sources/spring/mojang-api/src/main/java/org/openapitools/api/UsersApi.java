/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.3.4).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.CurrentPlayerIDs;
import org.openapitools.model.Error;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-06-05T23:36:11.663568600-03:00[America/Sao_Paulo]")

@Validated
@Api(value = "users", description = "the users API")
public interface UsersApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    @ApiOperation(value = "Find the UUID by name", nickname = "getUniqueIdByName", notes = "Find the current player name, UUID, demo status and migration flag by the current player name or at a given time.", response = CurrentPlayerIDs.class, tags={ "Name History", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The user was found", response = CurrentPlayerIDs.class),
        @ApiResponse(code = 204, message = "User not found"),
        @ApiResponse(code = 400, message = "If the timestamp is invalid", response = Error.class) })
    @RequestMapping(value = "/users/profiles/minecraft/{username}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<CurrentPlayerIDs> getUniqueIdByName(@ApiParam(value = "The username in a given time, or in present if \"at\" is not sent",required=true) @PathVariable("username") String username,@ApiParam(value = "Find the username in a given time, when 0 selects the original name however, it only works if the name was changed at least once, or if the account is legacy. The time is an UNIX timestamp (without milliseconds)") @Valid @RequestParam(value = "at", required = false) Long at) {
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
