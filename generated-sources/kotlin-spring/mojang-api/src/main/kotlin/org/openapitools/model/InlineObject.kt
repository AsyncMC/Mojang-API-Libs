package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.SkinModel
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param model 
 * @param file The skin image in PNG format
 */
data class InlineObject (

        @get:NotNull 
        @JsonProperty("file") val file: java.io.File,

        @JsonProperty("model") val model: SkinModel? = null
) {

}

