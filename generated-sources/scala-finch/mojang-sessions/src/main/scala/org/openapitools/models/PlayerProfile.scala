package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.PlayerProfileProperty
import scala.collection.immutable.Seq

/**
 * 
 * @param id The player UUID without hyphens
 * @param name 
 * @param legacy Will appear in the response if the user has not migrated their minecraft.net account to Mojang.
 * @param properties An array with all player properties, like skin and cape
 */
case class PlayerProfile(id: String,
                name: String,
                legacy: Option[Boolean],
                properties: Seq[PlayerProfileProperty]
                )

object PlayerProfile {
    /**
     * Creates the codec for converting PlayerProfile from and to JSON.
     */
    implicit val decoder: Decoder[PlayerProfile] = deriveDecoder
    implicit val encoder: ObjectEncoder[PlayerProfile] = deriveEncoder
}
