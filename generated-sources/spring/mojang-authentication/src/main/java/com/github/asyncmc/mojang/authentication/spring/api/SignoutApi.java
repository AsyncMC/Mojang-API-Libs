/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.3.4).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.github.asyncmc.mojang.authentication.spring.api;

import com.github.asyncmc.mojang.authentication.spring.model.Error;
import com.github.asyncmc.mojang.authentication.spring.model.UsernamePassword;
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-06-06T05:02:21.986099700-03:00[America/Sao_Paulo]")

@Validated
@Api(value = "signout", description = "the signout API")
public interface SignoutApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    @ApiOperation(value = "", nickname = "siginout", notes = "", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "All tokens have been invalidated"),
        @ApiResponse(code = 400, message = "Invalid username/password", response = Error.class) })
    @RequestMapping(value = "/signout",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<Void> siginout(@ApiParam(value = "" ,required=true )  @Valid @RequestBody UsernamePassword usernamePassword) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
