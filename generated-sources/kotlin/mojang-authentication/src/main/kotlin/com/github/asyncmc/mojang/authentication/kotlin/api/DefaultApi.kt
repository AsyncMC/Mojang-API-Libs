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
package com.github.asyncmc.mojang.authentication.kotlin.api

import com.github.asyncmc.mojang.authentication.kotlin.model.AccessKeys
import com.github.asyncmc.mojang.authentication.kotlin.model.Authentication
import com.github.asyncmc.mojang.authentication.kotlin.model.AuthenticationRequest
import com.github.asyncmc.mojang.authentication.kotlin.model.Error
import com.github.asyncmc.mojang.authentication.kotlin.model.RefreshRequest
import com.github.asyncmc.mojang.authentication.kotlin.model.RefreshResponse
import com.github.asyncmc.mojang.authentication.kotlin.model.UsernamePassword

import org.openapitools.client.infrastructure.*

class DefaultApi(basePath: kotlin.String = "https://authserver.mojang.com") : ApiClient(basePath) {

    /**
    * 
    * 
    * @param authenticationRequest  
    * @return Authentication
    */
    @Suppress("UNCHECKED_CAST")
    fun authenticate(authenticationRequest: AuthenticationRequest) : Authentication {
        val localVariableBody: kotlin.Any? = authenticationRequest
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/authenticate",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<Authentication>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as Authentication
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * 
    * 
    * @param accessKeys  
    * @return void
    */
    fun invalidate(accessKeys: AccessKeys) : Unit {
        val localVariableBody: kotlin.Any? = accessKeys
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/invalidate",
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
    * 
    * 
    * @param refreshRequest  
    * @return RefreshResponse
    */
    @Suppress("UNCHECKED_CAST")
    fun refresh(refreshRequest: RefreshRequest) : RefreshResponse {
        val localVariableBody: kotlin.Any? = refreshRequest
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/refresh",
            query = localVariableQuery,
            headers = localVariableHeaders
        )
        val response = request<RefreshResponse>(
            localVariableConfig,
            localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as RefreshResponse
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
            else -> throw kotlin.IllegalStateException("Undefined ResponseType.")
        }
    }

    /**
    * 
    * 
    * @param usernamePassword  
    * @return void
    */
    fun siginout(usernamePassword: UsernamePassword) : Unit {
        val localVariableBody: kotlin.Any? = usernamePassword
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/signout",
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
    * 
    * 
    * @param accessKeys  
    * @return void
    */
    fun validate(accessKeys: AccessKeys) : Unit {
        val localVariableBody: kotlin.Any? = accessKeys
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableHeaders: kotlin.collections.Map<kotlin.String,kotlin.String> = mapOf()
        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/validate",
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
