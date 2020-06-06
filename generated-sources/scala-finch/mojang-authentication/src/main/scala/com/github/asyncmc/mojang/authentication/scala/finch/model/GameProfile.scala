package com.github.asyncmc.mojang.authentication.scala.finch.model

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

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
                userId: Option[String],
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
