package org.openapitools.model

import java.util.Objects
import org.openapitools.model.UsernamePassword
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * Request body needed to authenticate the player using the username/e-mail and password. Use with care. This is a risky operation.
 */
data class AuthenticationRequest (

        @get:NotNull 
        @JsonProperty("username") override val username: String,

        @get:NotNull 
        @JsonProperty("password") override val password: String
) : UsernamePassword{

}

