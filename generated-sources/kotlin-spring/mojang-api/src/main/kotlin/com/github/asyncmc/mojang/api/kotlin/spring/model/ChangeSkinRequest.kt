package com.github.asyncmc.mojang.api.kotlin.spring.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.github.asyncmc.mojang.api.kotlin.spring.model.SkinModel
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * Request Mojang to download a skin from an URL and apply to the player
 * @param model 
 * @param url The URL which Mojang servers will download and apply the skin
 */
data class ChangeSkinRequest (

        @get:NotNull 
        @JsonProperty("url") val url: String,

        @JsonProperty("model") val model: SkinModel? = null
) {

}

