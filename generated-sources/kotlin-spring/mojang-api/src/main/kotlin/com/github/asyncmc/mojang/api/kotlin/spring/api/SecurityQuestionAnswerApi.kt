package com.github.asyncmc.mojang.api.kotlin.spring.api

import com.github.asyncmc.mojang.api.kotlin.spring.model.Error
import com.github.asyncmc.mojang.api.kotlin.spring.model.SecurityAnswer
import com.github.asyncmc.mojang.api.kotlin.spring.model.SecurityChallenge
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
class SecurityQuestionAnswerApiController() {


    @RequestMapping(
            value = ["/user/security/location"],
            produces = ["application/json"], 
            method = [RequestMethod.GET])
    fun checkSecurityStatus(): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
            value = ["/user/security/challenges"],
            produces = ["application/json"], 
            method = [RequestMethod.GET])
    fun listPendingSecurityQuestions(): ResponseEntity<List<SecurityChallenge>> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
            value = ["/user/security/location"],
            produces = ["application/json"], 
            consumes = ["application/json"],
            method = [RequestMethod.POST])
    fun sendSecurityQuestionAnswers( @Valid @RequestBody securityAnswer: List<SecurityAnswer>): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
