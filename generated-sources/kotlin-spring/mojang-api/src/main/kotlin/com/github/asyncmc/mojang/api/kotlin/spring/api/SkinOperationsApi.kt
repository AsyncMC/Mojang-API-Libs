package com.github.asyncmc.mojang.api.kotlin.spring.api

import com.github.asyncmc.mojang.api.kotlin.spring.model.Error
import com.github.asyncmc.mojang.api.kotlin.spring.model.SkinModel
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
class SkinOperationsApiController() {


    @RequestMapping(
            value = ["/user/profile/{stripped_uuid}/skin"],
            produces = ["application/json"], 
            consumes = ["application/x-www-form-urlencoded"],
            method = [RequestMethod.POST])
    fun changePlayerSkin( @PathVariable("stripped_uuid") strippedUuid: String, @RequestParam(value="url", required=true) url: String , @RequestParam(value="model", required=false) model: SkinModel ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
            value = ["/user/profile/{stripped_uuid}/skin"],
            produces = ["application/json"], 
            method = [RequestMethod.DELETE])
    fun resetPlayerSkin( @PathVariable("stripped_uuid") strippedUuid: String): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
            value = ["/user/profile/{stripped_uuid}/skin"],
            produces = ["application/json"], 
            consumes = ["multipart/form-data"],
            method = [RequestMethod.PUT])
    fun uploadPlayerSkin( @PathVariable("stripped_uuid") strippedUuid: String, @Valid @RequestPart("file") file: MultipartFile, @RequestParam(value="model", required=false) model: SkinModel ): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
