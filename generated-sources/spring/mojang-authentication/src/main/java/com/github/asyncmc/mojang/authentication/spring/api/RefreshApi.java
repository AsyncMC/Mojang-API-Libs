/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.3.4).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.github.asyncmc.mojang.authentication.spring.api;

import com.github.asyncmc.mojang.authentication.spring.model.AccessKeys;
import com.github.asyncmc.mojang.authentication.spring.model.Error;
import com.github.asyncmc.mojang.authentication.spring.model.RefreshRequest;
import com.github.asyncmc.mojang.authentication.spring.model.RefreshResponse;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-06-06T02:35:20.256253900-03:00[America/Sao_Paulo]")

@Validated
@Api(value = "refresh", description = "the refresh API")
public interface RefreshApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    @ApiOperation(value = "", nickname = "refresh", notes = "", response = RefreshResponse.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Session refreshed successfully. Note: The old access token gets invalidated.", response = RefreshResponse.class),
        @ApiResponse(code = 400, message = "Could not refresh the session", response = Error.class) })
    @RequestMapping(value = "/refresh",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<RefreshResponse> refresh(@ApiParam(value = "" ,required=true )  @Valid @RequestBody RefreshRequest refreshRequest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"selectedProfile\" : {    \"name\" : \"name\",    \"id\" : \"id\"  },  \"user\" : {    \"id\" : \"id\",    \"properties\" : [ {      \"name\" : \"name\",      \"value\" : \"value\"    }, {      \"name\" : \"name\",      \"value\" : \"value\"    } ]  }}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}