package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * The current player, demo and legacy status of a player identified by the id
 * @param id The player UUID without hyphens
 * @param name The current name being used by this player
 * @param legacy If account has not been converted
 * @param demo If the player has not puchased the game
 */
data class CurrentPlayerIDs (

        @get:NotNull 
        @JsonProperty("id") val id: String,

        @get:NotNull 
        @JsonProperty("name") val name: String,

        @JsonProperty("legacy") val legacy: Boolean? = null,

        @JsonProperty("demo") val demo: Boolean? = null
) {

}

