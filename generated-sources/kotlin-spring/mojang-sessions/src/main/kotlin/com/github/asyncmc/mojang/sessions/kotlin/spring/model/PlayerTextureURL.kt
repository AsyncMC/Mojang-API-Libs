package com.github.asyncmc.mojang.sessions.kotlin.spring.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * Wraps the URL to the texture
 * @param url The URL to the texture, must be in Mojang's domains.
 */
data class PlayerTextureURL (

        @get:NotNull 
        @JsonProperty("url") val url: String
) {

}

