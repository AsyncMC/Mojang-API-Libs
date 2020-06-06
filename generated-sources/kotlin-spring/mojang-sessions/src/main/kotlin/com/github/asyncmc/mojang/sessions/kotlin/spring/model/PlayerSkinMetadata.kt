package com.github.asyncmc.mojang.sessions.kotlin.spring.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * Contains details about the skin
 * @param model The player model, currently only \"slim\" (Alex) is valid, for Steve's model this property must be absent.
 */
data class PlayerSkinMetadata (

        @JsonProperty("model") val model: PlayerSkinMetadata.Model? = null
) {

    /**
    * The player model, currently only \"slim\" (Alex) is valid, for Steve's model this property must be absent.
    * Values: SLIM
    */
    enum class Model(val value: String) {
    
        @JsonProperty("slim") SLIM("slim");
    
    }

}

