package com.github.asyncmc.mojang.api.kotlin.spring.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * This is returned when the request fails
 * @param error 
 * @param errorMessage 
 */
data class Error (

        @JsonProperty("error") val error: String? = null,

        @JsonProperty("errorMessage") val errorMessage: String? = null
) {

}

