/**
 * Mojang Authentication API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2020-06-05
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.github.asyncmc.mojang.authentication.scala.httpclient.model


case class UsernamePassword (
  // The Mojang account e-mail or username. Never store it.
  username: String,
  // The Mojang account password, never store it.
  password: String
)

