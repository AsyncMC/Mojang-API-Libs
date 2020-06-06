package com.github.asyncmc.mojang.api.kotlin.spring.api

import com.github.asyncmc.mojang.api.kotlin.spring.model.CurrentPlayerIDs
import com.github.asyncmc.mojang.api.kotlin.spring.model.Error
import com.github.asyncmc.mojang.api.kotlin.spring.model.NameChange
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
class NameHistoryApiController() {


    @RequestMapping(
            value = ["/profiles/minecraft"],
            produces = ["application/json"], 
            consumes = ["application/json"],
            method = [RequestMethod.POST])
    fun findUniqueIdsByName( @Valid @RequestBody requestBody: List<String>): ResponseEntity<List<CurrentPlayerIDs>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
            value = ["/user/profiles/{stripped_uuid}/names"],
            produces = ["application/json"], 
            method = [RequestMethod.GET])
    fun getNameHistory( @PathVariable("stripped_uuid") strippedUuid: String): ResponseEntity<List<NameChange>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
            value = ["/users/profiles/minecraft/{username}"],
            produces = ["application/json"], 
            method = [RequestMethod.GET])
    fun getUniqueIdByName( @PathVariable("username") username: String, @RequestParam(value = "at", required = false, defaultValue="null") at: Long): ResponseEntity<CurrentPlayerIDs> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
