package com.github.asyncmc.mojang.authentication.kotlin.spring.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param accessToken 
 * @param clientToken 
 */
data class AccessKeys (

        @get:NotNull 
        @JsonProperty("accessToken") val accessToken: String,

        @JsonProperty("clientToken") val clientToken: String? = null
) {

}

