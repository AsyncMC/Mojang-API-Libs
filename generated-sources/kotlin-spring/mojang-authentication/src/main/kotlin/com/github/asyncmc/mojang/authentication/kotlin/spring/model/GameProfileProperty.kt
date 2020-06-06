package com.github.asyncmc.mojang.authentication.kotlin.spring.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param name 
 * @param value 
 */
data class GameProfileProperty (

        @JsonProperty("name") val name: String? = null,

        @JsonProperty("value") val value: String? = null
) {

}

