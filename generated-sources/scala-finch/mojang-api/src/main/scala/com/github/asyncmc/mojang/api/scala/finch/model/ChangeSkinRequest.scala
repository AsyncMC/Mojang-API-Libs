package com.github.asyncmc.mojang.api.scala.finch.model

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import com.github.asyncmc.mojang.api.scala.finch.model.SkinModel

/**
 * Request Mojang to download a skin from an URL and apply to the player
 * @param model 
 * @param url The URL which Mojang servers will download and apply the skin
 */
case class ChangeSkinRequest(model: Option[SkinModel],
                url: String
                )

object ChangeSkinRequest {
    /**
     * Creates the codec for converting ChangeSkinRequest from and to JSON.
     */
    implicit val decoder: Decoder[ChangeSkinRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[ChangeSkinRequest] = deriveEncoder
}
