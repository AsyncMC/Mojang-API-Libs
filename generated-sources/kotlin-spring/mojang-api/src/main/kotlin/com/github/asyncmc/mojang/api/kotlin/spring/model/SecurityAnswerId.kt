package com.github.asyncmc.mojang.api.kotlin.spring.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * A security question answer id given by Mojang
 * @param id A number giver by Mojang to reply a question
 */
data class SecurityAnswerId (

        @get:NotNull 
        @JsonProperty("id") val id: Int
) {

}

