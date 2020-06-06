package com.github.asyncmc.mojang.authentication.kotlin.spring.model

import java.util.Objects
import com.github.asyncmc.mojang.authentication.kotlin.spring.model.RefreshRequest
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 */
data class RefreshResponse (

        @get:NotNull 
        @JsonProperty("accessToken") override val accessToken: String,

        @JsonProperty("clientToken") override val clientToken: String? = null
) : RefreshRequest{

}

