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
package org.openapitools.client.models

import org.openapitools.client.models.SkinModel

/**
 * 
 * @param model 
 * @param file The skin image in PNG format
 */
data class InlineObject (
    /* The skin image in PNG format */
    val file: java.io.File,
    val model: SkinModel? = null
) {

}

