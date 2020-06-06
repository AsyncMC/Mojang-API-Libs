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
package com.github.asyncmc.mojang.sessions.kotlin.api

import com.github.asyncmc.mojang.sessions.kotlin.model.PlayerProfile
import com.github.asyncmc.mojang.sessions.kotlin.model.SessionApiError

import org.openapitools.client.infrastructure.*

class LoginApi(basePath: kotlin.String = "https://sessionserver.mojang.com") : ApiClient(basePath) {

    /**
    * Gets the player&#39;s game profile
    * This will return the player&#39;s username plus any additional information about them (e.g. skins). This has a much stricter rate limit: You can request the same profile once per minute, however you can send as many unique requests as you like.
    * @param strippedUuid The player UUID without hyphens 
    * @param unsigned When set to false, the signature data are sent (optional, default to null)
    * @return PlayerProfile
    */
    @Suppress("UNCHECKED_CAST")
    fun getPlayerProfile(strippedUuid: kotlin.String, unsigned: kotlin.Boolean) : PlayerProfile {
        val localVariableBody: kotlin.Any? = null
        val localVariableQuery: MultiValueMap = mapOf("unsigned" to listOf("$unsigned"))
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/session/minecraft/profile/{stripped_uuid}".replace("{"+"stripped_uuid"+"}", "$strippedUuid"),
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<PlayerProfile>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as PlayerProfile
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

}