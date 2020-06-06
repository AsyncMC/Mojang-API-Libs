package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * Identifies the software doing the request
 * @param name The name of the game
 * @param version The agent version, usually 1.
 */
data class Agent (

        @JsonProperty("name") val name: Agent.Name? = null,

        @JsonProperty("version") val version: Int? = null
) {

    /**
    * The name of the game
    * Values: minecraft,scrolls
    */
    enum class Name(val value: String) {
    
        @JsonProperty("Minecraft") minecraft("Minecraft"),
    
        @JsonProperty("Scrolls") scrolls("Scrolls");
    
    }

}

