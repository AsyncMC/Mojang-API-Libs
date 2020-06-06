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
package com.github.asyncmc.mojang.sessions.kotlin.server.model

import com.github.asyncmc.mojang.sessions.kotlin.server.model.PlayerTexture

/**
 * This is obtained by decoding the \"textures\" property
 * @param timestamp UNIX timestamp in milliseconds
 * @param profileId The player UUID without hyphens
 * @param profileName The player's name
 * @param signatureRequired Only present if unsigned was set to false in the request
 * @param textures 
 */
data class PlayerProfileTexturePropertyValue (
    /* UNIX timestamp in milliseconds */
    val timestamp: kotlin.Long,
    /* The player UUID without hyphens */
    val profileId: kotlin.String,
    /* The player's name */
    val profileName: kotlin.String,
    /* Only present if unsigned was set to false in the request */
    val signatureRequired: kotlin.Boolean? = null,
    val textures: PlayerTexture? = null
) {

}

