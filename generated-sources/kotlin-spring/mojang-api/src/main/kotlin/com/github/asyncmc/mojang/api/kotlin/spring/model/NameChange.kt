package com.github.asyncmc.mojang.api.kotlin.spring.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * A registered name change.
 * @param name The new player name
 * @param changedToAt Time which the name was changed in UNIX Timestamp without milliseconds. Usually absent for the first entry.
 */
data class NameChange (

        @get:NotNull 
        @JsonProperty("name") val name: String,

        @JsonProperty("changedToAt") val changedToAt: Long? = null
) {

}

