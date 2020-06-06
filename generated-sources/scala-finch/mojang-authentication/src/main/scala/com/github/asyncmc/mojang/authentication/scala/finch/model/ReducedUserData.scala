package com.github.asyncmc.mojang.authentication.scala.finch.model

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import com.github.asyncmc.mojang.authentication.scala.finch.model.GameProfileProperty
import scala.collection.immutable.Seq

/**
 * 
 * @param id 
 * @param properties 
 */
case class ReducedUserData(id: Option[String],
                properties: Option[Seq[GameProfileProperty]]
                )

object ReducedUserData {
    /**
     * Creates the codec for converting ReducedUserData from and to JSON.
     */
    implicit val decoder: Decoder[ReducedUserData] = deriveDecoder
    implicit val encoder: ObjectEncoder[ReducedUserData] = deriveEncoder
}
