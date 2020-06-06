package com.github.asyncmc.mojang.api.scala.finch.model

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * A json object is returned with the total amount of copies sold, the amount of copies sold in the last 24h and how many sales there are per second.
 * @param total total amount sold
 * @param last24h total sold in last 24 hours
 * @param saleVelocityPerSeconds decimal average sales per second
 */
case class OrderStatisticsResponse(total: Long,
                last24h: Long,
                saleVelocityPerSeconds: Double
                )

object OrderStatisticsResponse {
    /**
     * Creates the codec for converting OrderStatisticsResponse from and to JSON.
     */
    implicit val decoder: Decoder[OrderStatisticsResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrderStatisticsResponse] = deriveEncoder
}
