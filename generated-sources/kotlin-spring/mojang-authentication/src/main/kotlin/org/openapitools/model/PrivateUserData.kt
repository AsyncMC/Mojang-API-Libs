package org.openapitools.model

import java.util.Objects
import org.openapitools.model.GameProfileProperty
import org.openapitools.model.ReducedUserData
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 */
data class PrivateUserData (

        @JsonProperty("id") override val id: java.io.File? = null,

        @JsonProperty("properties") override val properties: List<GameProfileProperty>? = null
) : ReducedUserData{

}

