package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.OrderStatistic
import javax.validation.Valid
import javax.validation.constraints.*

/**
 * The body of the request to get the order statistics
 * @param metricKeys 
 */
data class OrderStatisticsRequest (

        @get:NotNull 
        @JsonProperty("metricKeys") val metricKeys: List<OrderStatistic>
) {

}

