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
package com.github.asyncmc.mojang.authentication.kotlin.server.model


/**
 * Identifies the software doing the request
 * @param name The name of the game
 * @param version The agent version, usually 1.
 */
data class Agent (
    /* The name of the game */
    val name: Agent.Name? = null,
    /* The agent version, usually 1. */
    val version: kotlin.Int? = null
) {

    /**
    * The name of the game
    * Values: MINECRAFT,SCROLLS
    */
    enum class Name(val value: kotlin.String){
    
        MINECRAFT("Minecraft"),
    
        SCROLLS("Scrolls");
    
    }

}
