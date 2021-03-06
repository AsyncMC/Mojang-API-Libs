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


/**
 * An object describing giving a bit of information about the error
 * @param error A message describing the error
 * @param path The request path
 */
data class SessionApiError (
    /* A message describing the error */
    val error: kotlin.String? = null,
    /* The request path */
    val path: kotlin.String? = null
) {

}

