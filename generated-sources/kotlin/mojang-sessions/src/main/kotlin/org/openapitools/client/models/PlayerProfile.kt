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
package org.openapitools.client.models

import org.openapitools.client.models.PlayerProfileProperty

/**
 * 
 * @param id The player UUID without hyphens
 * @param name 
 * @param legacy Will appear in the response if the user has not migrated their minecraft.net account to Mojang.
 * @param properties An array with all player properties, like skin and cape
 */
data class PlayerProfile (
    /* The player UUID without hyphens */
    val id: kotlin.String,
    val name: kotlin.String,
    /* An array with all player properties, like skin and cape */
    val properties: kotlin.Array<PlayerProfileProperty>,
    /* Will appear in the response if the user has not migrated their minecraft.net account to Mojang. */
    val legacy: kotlin.Boolean? = null
) {

}

