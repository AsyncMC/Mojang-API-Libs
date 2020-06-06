package com.github.asyncmc.mojang.sessions.scala.finch.model

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import com.github.asyncmc.mojang.sessions.scala.finch.model.PlayerTextureURL

/**
 * Wraps the URL to the texture and configures the player's model
 * @param url The URL to the texture, must be in Mojang's domains.
 */
case class PlayerSkinURL(url: String
                )

object PlayerSkinURL {
    /**
     * Creates the codec for converting PlayerSkinURL from and to JSON.
     */
    implicit val decoder: Decoder[PlayerSkinURL] = deriveDecoder
    implicit val encoder: ObjectEncoder[PlayerSkinURL] = deriveEncoder
}
