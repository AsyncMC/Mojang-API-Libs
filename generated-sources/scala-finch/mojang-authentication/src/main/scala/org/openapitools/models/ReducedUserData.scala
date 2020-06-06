package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import java.io.File
import org.openapitools.models.GameProfileProperty
import scala.collection.immutable.Seq

/**
 * 
 * @param id 
 * @param properties 
 */
case class ReducedUserData(id: Option[File],
                properties: Option[Seq[GameProfileProperty]]
                )

object ReducedUserData {
    /**
     * Creates the codec for converting ReducedUserData from and to JSON.
     */
    implicit val decoder: Decoder[ReducedUserData] = deriveDecoder
    implicit val encoder: ObjectEncoder[ReducedUserData] = deriveEncoder
}
