package com.github.asyncmc.mojang.sessions.kotlin.spring.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * An object describing giving a bit of information about the error
 * @param error A message describing the error
 * @param path The request path
 */
data class SessionApiError (

        @JsonProperty("error") val error: String? = null,

        @JsonProperty("path") val path: String? = null
) {

}

