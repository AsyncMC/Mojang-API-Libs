package com.github.asyncmc.mojang.api.kotlin.spring.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * A json object is returned with the total amount of copies sold, the amount of copies sold in the last 24h and how many sales there are per second.
 * @param total total amount sold
 * @param last24h total sold in last 24 hours
 * @param saleVelocityPerSeconds decimal average sales per second
 */
data class OrderStatisticsResponse (

        @get:NotNull 
        @JsonProperty("total") val total: Long,

        @get:NotNull 
        @JsonProperty("last24h") val last24h: Long,

        @get:NotNull 
        @JsonProperty("saleVelocityPerSeconds") val saleVelocityPerSeconds: Double
) {

}

