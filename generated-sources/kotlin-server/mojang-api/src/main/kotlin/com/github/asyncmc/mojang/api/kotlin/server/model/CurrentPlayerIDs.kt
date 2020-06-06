/**
* Mojang API
* No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
*
* OpenAPI spec version: 2020-06-05
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package com.github.asyncmc.mojang.api.kotlin.server.model


/**
 * The current player, demo and legacy status of a player identified by the id
 * @param id The player UUID without hyphens
 * @param name The current name being used by this player
 * @param legacy If account has not been converted
 * @param demo If the player has not puchased the game
 */
data class CurrentPlayerIDs (
    /* The player UUID without hyphens */
    val id: kotlin.String,
    /* The current name being used by this player */
    val name: kotlin.String,
    /* If account has not been converted */
    val legacy: kotlin.Boolean? = null,
    /* If the player has not puchased the game */
    val demo: kotlin.Boolean? = null
) {

}

