package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * The current player, demo and legacy status of a player identified by the id
 * @param id The player UUID without hyphens
 * @param name The current name being used by this player
 * @param legacy If account has not been converted
 * @param demo If the player has not puchased the game
 */
case class CurrentPlayerIDs(id: String,
                name: String,
                legacy: Option[Boolean],
                demo: Option[Boolean]
                )

object CurrentPlayerIDs {
    /**
     * Creates the codec for converting CurrentPlayerIDs from and to JSON.
     */
    implicit val decoder: Decoder[CurrentPlayerIDs] = deriveDecoder
    implicit val encoder: ObjectEncoder[CurrentPlayerIDs] = deriveEncoder
}
