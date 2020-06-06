package org.openapitools.api

import org.openapitools.model.PlayerProfile
import org.openapitools.model.SessionApiError
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestPart
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestHeader
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.validation.annotation.Validated
import org.springframework.web.context.request.NativeWebRequest
import org.springframework.web.multipart.MultipartFile
import org.springframework.beans.factory.annotation.Autowired

import javax.validation.Valid
import javax.validation.constraints.*

import kotlin.collections.List
import kotlin.collections.Map

@Controller
@Validated
@RequestMapping("\${api.base-path:}")
class LoginApiController() {


    @RequestMapping(
            value = ["/session/minecraft/profile/{stripped_uuid}"],
            produces = ["application/json"], 
            method = [RequestMethod.GET])
    fun getPlayerProfile( @PathVariable("stripped_uuid") strippedUuid: String, @RequestParam(value = "unsigned", required = false, defaultValue="null") unsigned: Boolean): ResponseEntity<PlayerProfile> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
