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

package com.github.asyncmc.mojang.authentication.scalatra.model

case class Agent(
  /* The name of the game */
  name: Option[String],

  /* The agent version, usually 1. */
  version: Option[Int]

 )
