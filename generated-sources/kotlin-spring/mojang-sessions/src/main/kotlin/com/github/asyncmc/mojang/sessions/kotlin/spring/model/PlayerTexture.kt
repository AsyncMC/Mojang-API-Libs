package com.github.asyncmc.mojang.sessions.kotlin.spring.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.github.asyncmc.mojang.sessions.kotlin.spring.model.PlayerSkinURL
import com.github.asyncmc.mojang.sessions.kotlin.spring.model.PlayerTextureURL
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * Provide links to the player's skin and cape
 * @param SKIN 
 * @param CAPE 
 */
data class PlayerTexture (

        @JsonProperty("SKIN") val SKIN: PlayerSkinURL? = null,

        @JsonProperty("CAPE") val CAPE: PlayerTextureURL? = null
) {

}

