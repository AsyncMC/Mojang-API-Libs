package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * A registered name change.
 * @param name The new player name
 * @param changedToAt Time which the name was changed in UNIX Timestamp without milliseconds. Usually absent for the first entry.
 */
case class NameChange(name: String,
                changedToAt: Option[Long]
                )

object NameChange {
    /**
     * Creates the codec for converting NameChange from and to JSON.
     */
    implicit val decoder: Decoder[NameChange] = deriveDecoder
    implicit val encoder: ObjectEncoder[NameChange] = deriveEncoder
}
