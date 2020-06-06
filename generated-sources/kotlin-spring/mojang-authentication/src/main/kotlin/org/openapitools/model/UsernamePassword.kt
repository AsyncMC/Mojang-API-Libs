package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param username The Mojang account e-mail or username. Never store it.
 * @param password The Mojang account password, never store it.
 */
data class UsernamePassword (

        @get:NotNull 
        @JsonProperty("username") val username: String,

        @get:NotNull 
        @JsonProperty("password") val password: String
) {

}

