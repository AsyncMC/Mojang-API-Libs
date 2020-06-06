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
package com.github.asyncmc.mojang.api.kotlin.model


/**
 * A registered name change.
 * @param name The new player name
 * @param changedToAt Time which the name was changed in UNIX Timestamp without milliseconds. Usually absent for the first entry.
 */
data class NameChange (
    /* The new player name */
    val name: kotlin.String,
    /* Time which the name was changed in UNIX Timestamp without milliseconds. Usually absent for the first entry. */
    val changedToAt: kotlin.Long? = null
) {

}
