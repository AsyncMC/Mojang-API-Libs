package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.PlayerProfileProperty
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param id The player UUID without hyphens
 * @param name 
 * @param legacy Will appear in the response if the user has not migrated their minecraft.net account to Mojang.
 * @param properties An array with all player properties, like skin and cape
 */
data class PlayerProfile (

        @get:NotNull 
        @JsonProperty("id") val id: String,

        @get:NotNull 
        @JsonProperty("name") val name: String,

        @get:NotNull 
        @JsonProperty("properties") val properties: List<PlayerProfileProperty>,

        @JsonProperty("legacy") val legacy: Boolean? = null
) {

}

