package org.openapitools.model

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
    * Values: slim
    */
    enum class Model(val value: String) {
    
        @JsonProperty("slim") slim("slim");
    
    }

}

