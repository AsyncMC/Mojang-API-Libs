package org.openapitools.api

import org.openapitools.model.OrderStatisticsRequest
import org.openapitools.model.OrderStatisticsResponse
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
class MiscellaneousApiController() {


    @RequestMapping(
            value = ["/orders/statistics"],
            produces = ["application/json"], 
            consumes = ["application/json"],
            method = [RequestMethod.POST])
    fun getOrdersStatistics( @Valid @RequestBody orderStatisticsRequest: OrderStatisticsRequest): ResponseEntity<OrderStatisticsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
