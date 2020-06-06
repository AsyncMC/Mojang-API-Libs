package com.github.asyncmc.mojang.authentication.kotlin.spring.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * 
 * @param agent 
 * @param id 
 * @param name 
 * @param userId 
 * @param createdAt Unix timestamp in milliseconds
 * @param legacyProfile 
 * @param suspended 
 * @param paid 
 * @param migrated 
 * @param legacy 
 */
data class GameProfile (

        @JsonProperty("agent") val agent: String? = null,

        @JsonProperty("id") val id: String? = null,

        @JsonProperty("name") val name: String? = null,

        @JsonProperty("userId") val userId: String? = null,

        @JsonProperty("createdAt") val createdAt: Long? = null,

        @JsonProperty("legacyProfile") val legacyProfile: Boolean? = null,

        @JsonProperty("suspended") val suspended: Boolean? = null,

        @JsonProperty("paid") val paid: Boolean? = null,

        @JsonProperty("migrated") val migrated: Boolean? = null,

        @JsonProperty("legacy") val legacy: Boolean? = null
) {

}

