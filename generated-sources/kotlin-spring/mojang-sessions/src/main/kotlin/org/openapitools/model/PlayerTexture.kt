package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.PlayerSkinURL
import org.openapitools.model.PlayerTextureURL
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

