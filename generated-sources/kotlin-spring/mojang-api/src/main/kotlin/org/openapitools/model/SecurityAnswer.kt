package org.openapitools.model

import java.util.Objects
import org.openapitools.model.SecurityAnswerId
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * A security question answer given by the player using the id given by Mojang
 */
data class SecurityAnswer (

        @get:NotNull 
        @JsonProperty("id") override val id: Int
) : SecurityAnswerId{

}

