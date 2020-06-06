# LoginApi

All URIs are relative to *https://sessionserver.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPlayerProfile**](LoginApi.md#getPlayerProfile) | **GET** /session/minecraft/profile/{stripped_uuid} | Gets the player&#39;s game profile


<a name="getPlayerProfile"></a>
# **getPlayerProfile**
> PlayerProfile getPlayerProfile(strippedUuid, unsigned)

Gets the player&#39;s game profile

This will return the player&#39;s username plus any additional information about them (e.g. skins). This has a much stricter rate limit: You can request the same profile once per minute, however you can send as many unique requests as you like.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import com.github.asyncmc.mojang.sessions.kotlin.model.*

val apiInstance = LoginApi()
val strippedUuid : kotlin.String = 853c80ef3c3749fdaa49938b674adae6 // kotlin.String | The player UUID without hyphens
val unsigned : kotlin.Boolean = true // kotlin.Boolean | When set to false, the signature data are sent
try {
    val result : PlayerProfile = apiInstance.getPlayerProfile(strippedUuid, unsigned)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling LoginApi#getPlayerProfile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling LoginApi#getPlayerProfile")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **strippedUuid** | **kotlin.String**| The player UUID without hyphens | [default to null]
 **unsigned** | **kotlin.Boolean**| When set to false, the signature data are sent | [optional] [default to null]

### Return type

[**PlayerProfile**](PlayerProfile.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

