package com.github.asyncmc.mojang.authentication.kotlin.spring.model

import java.util.Objects
import com.github.asyncmc.mojang.authentication.kotlin.spring.model.GameProfileProperty
import com.github.asyncmc.mojang.authentication.kotlin.spring.model.ReducedUserData
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 */
data class PrivateUserData (

        @JsonProperty("id") override val id: String? = null,

        @JsonProperty("properties") override val properties: List<GameProfileProperty>? = null
) : ReducedUserData{

}

