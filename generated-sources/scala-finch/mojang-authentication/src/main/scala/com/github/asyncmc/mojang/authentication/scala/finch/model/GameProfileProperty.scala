package com.github.asyncmc.mojang.authentication.scala.finch.model

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param name 
 * @param value 
 */
case class GameProfileProperty(name: Option[String],
                value: Option[String]
                )

object GameProfileProperty {
    /**
     * Creates the codec for converting GameProfileProperty from and to JSON.
     */
    implicit val decoder: Decoder[GameProfileProperty] = deriveDecoder
    implicit val encoder: ObjectEncoder[GameProfileProperty] = deriveEncoder
}
