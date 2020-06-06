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
package com.github.asyncmc.mojang.api.kotlin.api

import com.github.asyncmc.mojang.api.kotlin.model.Error
import com.github.asyncmc.mojang.api.kotlin.model.SkinModel

import org.openapitools.client.infrastructure.*

class SkinOperationsApi(basePath: kotlin.String = "https://api.mojang.com") : ApiClient(basePath) {

    /**
    * Changes the player skin by URL
    * This will set the skin for the selected profile, but Mojang&#39;s servers will fetch the skin from a URL. This will also work for legacy accounts.
    * @param strippedUuid The player UUID without hyphens 
    * @param url The URL which Mojang servers will download and apply the skin 
    * @param model  (optional, default to null)
    * @return void
    */
    fun changePlayerSkin(strippedUuid: kotlin.String, url: kotlin.String, model: SkinModel) : Unit {
        val localVariableBody: kotlin.Any? = mapOf("model" to "$model", "url" to "$url")
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf("Content-Type" to "multipart/form-data")
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/user/profile/{stripped_uuid}/skin".replace("{"+"stripped_uuid"+"}", "$strippedUuid"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<Any?>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> Unit
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * Resets the player skin to default
    * 
    * @param strippedUuid The player UUID without hyphens 
    * @return void
    */
    fun resetPlayerSkin(strippedUuid: kotlin.String) : Unit {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.DELETE,
            "/user/profile/{stripped_uuid}/skin".replace("{"+"stripped_uuid"+"}", "$strippedUuid"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<Any?>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> Unit
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * Changes the player skin by upload
    * This uploads a skin to Mojang&#39;s servers. It also sets the users skin. This works on legacy counts as well.
    * @param strippedUuid The player UUID without hyphens 
    * @param file The skin image in PNG format 
    * @param model  (optional, default to null)
    * @return void
    */
    fun uploadPlayerSkin(strippedUuid: kotlin.String, file: java.io.File, model: SkinModel) : Unit {
        val localVariableBody: kotlin.Any? = mapOf("model" to "$model", "file" to "$file")
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf("Content-Type" to "multipart/form-data")
        val localVariableConfig = RequestConfig(
            RequestMethod.PUT,
            "/user/profile/{stripped_uuid}/skin".replace("{"+"stripped_uuid"+"}", "$strippedUuid"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<Any?>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> Unit
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

}
