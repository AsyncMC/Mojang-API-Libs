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
package org.openapitools.server.models


/**
 * This is returned when the request fails
 * @param error 
 * @param errorMessage 
 */
data class Error (
    val error: kotlin.String? = null,
    val errorMessage: kotlin.String? = null
) {

}

