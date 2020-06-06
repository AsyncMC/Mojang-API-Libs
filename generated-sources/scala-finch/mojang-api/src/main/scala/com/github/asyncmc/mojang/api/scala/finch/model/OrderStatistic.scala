package com.github.asyncmc.mojang.api.scala.finch.model

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Valid options to query the order statistics
 */
case class OrderStatistic()

object OrderStatistic {
    /**
     * Creates the codec for converting OrderStatistic from and to JSON.
     */
    implicit val decoder: Decoder[OrderStatistic] = deriveDecoder
    implicit val encoder: ObjectEncoder[OrderStatistic] = deriveEncoder
}
