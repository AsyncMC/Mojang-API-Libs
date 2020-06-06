package com.github.asyncmc.mojang.api.kotlin.spring.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.github.asyncmc.mojang.api.kotlin.spring.model.SkinModel
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param model 
 * @param file The skin image in PNG format
 */
data class UploadSkinRequest (

        @get:NotNull 
        @JsonProperty("file") val file: java.io.File,

        @JsonProperty("model") val model: SkinModel? = null
) {

}

