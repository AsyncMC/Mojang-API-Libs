package com.github.asyncmc.mojang.authentication.kotlin.spring.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.github.asyncmc.mojang.authentication.kotlin.spring.model.GameProfileProperty
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param id 
 * @param properties 
 */
data class ReducedUserData (

        @JsonProperty("id") val id: String? = null,

        @JsonProperty("properties") val properties: List<GameProfileProperty>? = null
) {

}

