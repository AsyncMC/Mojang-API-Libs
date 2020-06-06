package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.PlayerTexture
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * This is obtained by decoding the \"textures\" property
 * @param timestamp UNIX timestamp in milliseconds
 * @param profileId The player UUID without hyphens
 * @param profileName The player's name
 * @param signatureRequired Only present if unsigned was set to false in the request
 * @param textures 
 */
data class PlayerProfileTexturePropertyValue (

        @get:NotNull 
        @JsonProperty("timestamp") val timestamp: Long,

        @get:NotNull 
        @JsonProperty("profileId") val profileId: String,

        @get:NotNull 
        @JsonProperty("profileName") val profileName: String,

        @JsonProperty("signatureRequired") val signatureRequired: Boolean? = null,

        @JsonProperty("textures") val textures: PlayerTexture? = null
) {

}

