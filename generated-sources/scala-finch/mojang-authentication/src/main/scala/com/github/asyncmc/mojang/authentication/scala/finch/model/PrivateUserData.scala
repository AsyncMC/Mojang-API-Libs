package com.github.asyncmc.mojang.authentication.scala.finch.model

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import com.github.asyncmc.mojang.authentication.scala.finch.model.GameProfileProperty
import com.github.asyncmc.mojang.authentication.scala.finch.model.ReducedUserData
import scala.collection.immutable.Seq

/**
 * 
 * @param id 
 * @param properties 
 */
case class PrivateUserData(id: Option[String],
                properties: Option[Seq[GameProfileProperty]]
                )

object PrivateUserData {
    /**
     * Creates the codec for converting PrivateUserData from and to JSON.
     */
    implicit val decoder: Decoder[PrivateUserData] = deriveDecoder
    implicit val encoder: ObjectEncoder[PrivateUserData] = deriveEncoder
}
