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

case class AuthenticationRequest(
  /* The Mojang account e-mail or username. Never store it. */
  username: String,

  /* The Mojang account password, never store it. */
  password: String

 )
