package com.github.asyncmc.mojang.sessions.kotlin.spring.model

import java.util.Objects
import com.github.asyncmc.mojang.sessions.kotlin.spring.model.PlayerTextureURL
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * Wraps the URL to the texture and configures the player's model
 */
data class PlayerSkinURL (

        @get:NotNull 
        @JsonProperty("url") override val url: String
) : PlayerTextureURL{

}

