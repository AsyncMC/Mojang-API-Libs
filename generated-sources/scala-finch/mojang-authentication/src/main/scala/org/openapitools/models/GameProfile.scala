package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import java.io.File

/**
 * 
 * @param agent 
 * @param id 
 * @param name 
 * @param userId 
 * @param createdAt Unix timestamp in milliseconds
 * @param legacyProfile 
 * @param suspended 
 * @param paid 
 * @param migrated 
 * @param legacy 
 */
case class GameProfile(agent: Option[String],
                id: Option[String],
                name: Option[String],
                userId: Option[File],
                createdAt: Option[Long],
                legacyProfile: Option[Boolean],
                suspended: Option[Boolean],
                paid: Option[Boolean],
                migrated: Option[Boolean],
                legacy: Option[Boolean]
                )

object GameProfile {
    /**
     * Creates the codec for converting GameProfile from and to JSON.
     */
    implicit val decoder: Decoder[GameProfile] = deriveDecoder
    implicit val encoder: ObjectEncoder[GameProfile] = deriveEncoder
}
