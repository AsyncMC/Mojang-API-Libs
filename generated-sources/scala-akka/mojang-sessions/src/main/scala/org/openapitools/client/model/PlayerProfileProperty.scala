/**
 * Mojang Session API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2020-06-05
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.client.model

import org.openapitools.client.core.ApiModel
import org.joda.time.DateTime
import java.util.UUID

case class PlayerProfileProperty (
  /* The property name */
  name: String,
  /* The serialized property value in base64. */
  value: ByteArray,
  /* signed data using Yggdrasil's private key */
  signature: Option[ByteArray] = None
) extends ApiModel


