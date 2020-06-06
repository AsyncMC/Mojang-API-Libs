package com.github.asyncmc.mojang.authentication.kotlin.spring.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param id 
 * @param name The player name
 */
data class ProfileId (

        @get:NotNull 
        @JsonProperty("id") val id: String,

        @get:NotNull 
        @JsonProperty("name") val name: String
) {

}

