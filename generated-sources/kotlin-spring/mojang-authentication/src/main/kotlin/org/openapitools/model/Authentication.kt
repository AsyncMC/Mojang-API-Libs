package org.openapitools.model

import java.util.Objects
import org.openapitools.model.AccessKeys
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 */
data class Authentication (

        @get:NotNull 
        @JsonProperty("accessToken") override val accessToken: String,

        @JsonProperty("clientToken") override val clientToken: String? = null
) : AccessKeys{

}

