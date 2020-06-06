package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.GameProfileProperty
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param id 
 * @param properties 
 */
data class ReducedUserData (

        @JsonProperty("id") val id: java.io.File? = null,

        @JsonProperty("properties") val properties: List<GameProfileProperty>? = null
) {

}

