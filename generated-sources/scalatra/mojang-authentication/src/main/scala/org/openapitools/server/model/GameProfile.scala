/**
 * Mojang Authentication API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2020-06-05
 * Contact: team@openapitools.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 */

package org.openapitools.server.model
import java.io.File

case class GameProfile(
  agent: Option[String],

  id: Option[String],

  name: Option[String],

  userId: Option[File],

  /* Unix timestamp in milliseconds */
  createdAt: Option[Long],

  legacyProfile: Option[Boolean],

  suspended: Option[Boolean],

  paid: Option[Boolean],

  migrated: Option[Boolean],

  legacy: Option[Boolean]

 )
