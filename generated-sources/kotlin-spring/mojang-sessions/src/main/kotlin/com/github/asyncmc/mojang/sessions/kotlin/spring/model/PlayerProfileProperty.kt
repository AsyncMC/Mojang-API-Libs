package com.github.asyncmc.mojang.sessions.kotlin.spring.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * A profile property, may be signed. The values are encoded by base64 and usually contains a json. The schema for the textures are described at PlayerProfileTexturePropertyValue
 * @param name The property name
 * @param value The serialized property value in base64.
 * @param signature signed data using Yggdrasil's private key
 */
data class PlayerProfileProperty (

        @get:NotNull 
        @JsonProperty("name") val name: String,

        @get:NotNull 
        @JsonProperty("value") val value: ByteArray,

        @JsonProperty("signature") val signature: ByteArray? = null
) {

}

