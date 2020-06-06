package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.SecurityAnswerId
import org.openapitools.model.SecurityQuestion
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * Binds a question to an answer id, the answer must respect the answer id.
 * @param question 
 * @param answer 
 */
data class SecurityChallenge (

        @get:NotNull 
        @JsonProperty("question") val question: SecurityQuestion,

        @get:NotNull 
        @JsonProperty("answer") val answer: SecurityAnswerId
) {

}

