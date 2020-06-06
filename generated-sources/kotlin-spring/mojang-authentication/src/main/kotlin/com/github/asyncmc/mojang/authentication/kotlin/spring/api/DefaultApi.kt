package com.github.asyncmc.mojang.authentication.kotlin.spring.api

import com.github.asyncmc.mojang.authentication.kotlin.spring.model.AccessKeys
import com.github.asyncmc.mojang.authentication.kotlin.spring.model.Authentication
import com.github.asyncmc.mojang.authentication.kotlin.spring.model.AuthenticationRequest
import com.github.asyncmc.mojang.authentication.kotlin.spring.model.Error
import com.github.asyncmc.mojang.authentication.kotlin.spring.model.RefreshRequest
import com.github.asyncmc.mojang.authentication.kotlin.spring.model.RefreshResponse
import com.github.asyncmc.mojang.authentication.kotlin.spring.model.UsernamePassword
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
class DefaultApiController() {


    @RequestMapping(
            value = ["/authenticate"],
            produces = ["application/json"], 
            consumes = ["application/json"],
            method = [RequestMethod.POST])
    fun authenticate( @Valid @RequestBody authenticationRequest: AuthenticationRequest): ResponseEntity<Authentication> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
            value = ["/invalidate"],
            produces = ["application/json"], 
            consumes = ["application/json"],
            method = [RequestMethod.POST])
    fun invalidate( @Valid @RequestBody accessKeys: AccessKeys): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
            value = ["/refresh"],
            produces = ["application/json"], 
            consumes = ["application/json"],
            method = [RequestMethod.POST])
    fun refresh( @Valid @RequestBody refreshRequest: RefreshRequest): ResponseEntity<RefreshResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
            value = ["/signout"],
            produces = ["application/json"], 
            consumes = ["application/json"],
            method = [RequestMethod.POST])
    fun siginout( @Valid @RequestBody usernamePassword: UsernamePassword): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }


    @RequestMapping(
            value = ["/validate"],
            produces = ["application/json"], 
            consumes = ["application/json"],
            method = [RequestMethod.POST])
    fun validate( @Valid @RequestBody accessKeys: AccessKeys): ResponseEntity<Unit> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
