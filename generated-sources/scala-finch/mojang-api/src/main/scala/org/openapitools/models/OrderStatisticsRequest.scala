package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.OrderStatistic
import scala.collection.immutable.Seq

/**
 * The body of the request to get the order statistics
 * @param metricKeys 
 */
case class OrderStatisticsRequest(metricKeys: Seq[OrderStatistic]
                )

object OrderStatisticsRequest {
    /**
     * Creates the codec for converting OrderStatisticsRequest from and to JSON.
     */
    implicit val decoder: Decoder[OrderStatisticsRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrderStatisticsRequest] = deriveEncoder
}
