package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.SkinModel
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * Request Mojang to download a skin from an URL and apply to the player
 * @param model 
 * @param url The URL which Mojang servers will download and apply the skin
 */
data class InlineObject1 (

        @get:NotNull 
        @JsonProperty("url") val url: String,

        @JsonProperty("model") val model: SkinModel? = null
) {

}

