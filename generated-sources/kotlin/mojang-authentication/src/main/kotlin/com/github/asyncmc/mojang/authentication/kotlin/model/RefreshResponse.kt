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

import com.github.asyncmc.mojang.authentication.kotlin.model.RefreshRequest

/**
 * 
 */
data class RefreshResponse (
    val accessToken: kotlin.String,
    val clientToken: kotlin.String? = null
) {

}

