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
package com.github.asyncmc.mojang.authentication.kotlin.model

import com.github.asyncmc.mojang.authentication.kotlin.model.GameProfileProperty
import com.github.asyncmc.mojang.authentication.kotlin.model.ReducedUserData

/**
 * 
 */
data class PrivateUserData (
    val id: kotlin.String? = null,
    val properties: kotlin.Array<GameProfileProperty>? = null
) {

}
