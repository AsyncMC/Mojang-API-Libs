# NameHistoryApi

All URIs are relative to *https://api.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findUniqueIdsByName**](NameHistoryApi.md#findUniqueIdsByName) | **POST** /profiles/minecraft | Find the current UUID of multiple players at once
[**getNameHistory**](NameHistoryApi.md#getNameHistory) | **GET** /user/profiles/{stripped_uuid}/names | Gets the full player&#39;s name history
[**getUniqueIdByName**](NameHistoryApi.md#getUniqueIdByName) | **GET** /users/profiles/minecraft/{username} | Find the UUID by name


<a name="findUniqueIdsByName"></a>
# **findUniqueIdsByName**
> kotlin.Array&lt;CurrentPlayerIDs&gt; findUniqueIdsByName(requestBody)

Find the current UUID of multiple players at once

Find the current players name, UUID, demo status and migration flag by the current players name. The \&quot;at\&quot; parameter is not supported. Players not found are not returned. If no players are found, an empty array is returned.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import com.github.asyncmc.mojang.api.kotlin.model.*

val apiInstance = NameHistoryApi()
val requestBody : kotlin.Array<kotlin.String> = [ "joserobjr", "nonExistingPlayer", "maksimkurb" ] // kotlin.Array<kotlin.String> | Array with the player names
try {
    val result : kotlin.Array<CurrentPlayerIDs> = apiInstance.findUniqueIdsByName(requestBody)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NameHistoryApi#findUniqueIdsByName")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NameHistoryApi#findUniqueIdsByName")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestBody** | [**kotlin.Array&lt;kotlin.String&gt;**](kotlin.Array.md)| Array with the player names |

### Return type

[**kotlin.Array&lt;CurrentPlayerIDs&gt;**](CurrentPlayerIDs.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNameHistory"></a>
# **getNameHistory**
> kotlin.Array&lt;NameChange&gt; getNameHistory(strippedUuid)

Gets the full player&#39;s name history

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import com.github.asyncmc.mojang.api.kotlin.model.*

val apiInstance = NameHistoryApi()
val strippedUuid : kotlin.String = 38ba542eb5924231a54cca0f2eac2b54 // kotlin.String | The player UUID without hyphens
try {
    val result : kotlin.Array<NameChange> = apiInstance.getNameHistory(strippedUuid)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NameHistoryApi#getNameHistory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NameHistoryApi#getNameHistory")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **strippedUuid** | **kotlin.String**| The player UUID without hyphens | [default to null]

### Return type

[**kotlin.Array&lt;NameChange&gt;**](NameChange.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUniqueIdByName"></a>
# **getUniqueIdByName**
> CurrentPlayerIDs getUniqueIdByName(username, at)

Find the UUID by name

Find the current player name, UUID, demo status and migration flag by the current player name or at a given time.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import com.github.asyncmc.mojang.api.kotlin.model.*

val apiInstance = NameHistoryApi()
val username : kotlin.String = LordofMC_Playerz // kotlin.String | The username in a given time, or in present if \"at\" is not sent
val at : kotlin.Long = 1448533942 // kotlin.Long | Find the username in a given time, when 0 selects the original name however, it only works if the name was changed at least once, or if the account is legacy. The time is an UNIX timestamp (without milliseconds)
try {
    val result : CurrentPlayerIDs = apiInstance.getUniqueIdByName(username, at)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling NameHistoryApi#getUniqueIdByName")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling NameHistoryApi#getUniqueIdByName")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **kotlin.String**| The username in a given time, or in present if \&quot;at\&quot; is not sent | [default to null]
 **at** | **kotlin.Long**| Find the username in a given time, when 0 selects the original name however, it only works if the name was changed at least once, or if the account is legacy. The time is an UNIX timestamp (without milliseconds) | [optional] [default to null]

### Return type

[**CurrentPlayerIDs**](CurrentPlayerIDs.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

