package com.github.asyncmc.mojang.api.kotlin.spring.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonValue
import javax.validation.Valid
import javax.validation.constraints.*

/**
* Model is an empty string for the default model (like Steve) and \"slim\" for the slim model (like Alex)
* Values: EMPTY,SLIM
*/
enum class SkinModel(val value: String) {

    EMPTY(""),

    SLIM("slim");

}

