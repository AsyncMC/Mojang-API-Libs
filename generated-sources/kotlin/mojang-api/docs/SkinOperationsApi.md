# SkinOperationsApi

All URIs are relative to *https://api.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**changePlayerSkin**](SkinOperationsApi.md#changePlayerSkin) | **POST** /user/profile/{stripped_uuid}/skin | Changes the player skin by URL
[**resetPlayerSkin**](SkinOperationsApi.md#resetPlayerSkin) | **DELETE** /user/profile/{stripped_uuid}/skin | Resets the player skin to default
[**uploadPlayerSkin**](SkinOperationsApi.md#uploadPlayerSkin) | **PUT** /user/profile/{stripped_uuid}/skin | Changes the player skin by upload


<a name="changePlayerSkin"></a>
# **changePlayerSkin**
> changePlayerSkin(strippedUuid, url, model)

Changes the player skin by URL

This will set the skin for the selected profile, but Mojang&#39;s servers will fetch the skin from a URL. This will also work for legacy accounts.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SkinOperationsApi()
val strippedUuid : kotlin.String = 38ba542eb5924231a54cca0f2eac2b54 // kotlin.String | The player UUID without hyphens
val url : kotlin.String = url_example // kotlin.String | The URL which Mojang servers will download and apply the skin
val model : SkinModel =  // SkinModel | 
try {
    apiInstance.changePlayerSkin(strippedUuid, url, model)
} catch (e: ClientException) {
    println("4xx response calling SkinOperationsApi#changePlayerSkin")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SkinOperationsApi#changePlayerSkin")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **strippedUuid** | **kotlin.String**| The player UUID without hyphens | [default to null]
 **url** | **kotlin.String**| The URL which Mojang servers will download and apply the skin | [default to null]
 **model** | [**SkinModel**](SkinModel.md)|  | [optional] [default to null]

### Return type

null (empty response body)

### Authorization

[PlayerAccessToken](../README.md#PlayerAccessToken)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="resetPlayerSkin"></a>
# **resetPlayerSkin**
> resetPlayerSkin(strippedUuid)

Resets the player skin to default

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SkinOperationsApi()
val strippedUuid : kotlin.String = 38ba542eb5924231a54cca0f2eac2b54 // kotlin.String | The player UUID without hyphens
try {
    apiInstance.resetPlayerSkin(strippedUuid)
} catch (e: ClientException) {
    println("4xx response calling SkinOperationsApi#resetPlayerSkin")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SkinOperationsApi#resetPlayerSkin")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **strippedUuid** | **kotlin.String**| The player UUID without hyphens | [default to null]

### Return type

null (empty response body)

### Authorization

[PlayerAccessToken](../README.md#PlayerAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="uploadPlayerSkin"></a>
# **uploadPlayerSkin**
> uploadPlayerSkin(strippedUuid, file, model)

Changes the player skin by upload

This uploads a skin to Mojang&#39;s servers. It also sets the users skin. This works on legacy counts as well.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SkinOperationsApi()
val strippedUuid : kotlin.String = 38ba542eb5924231a54cca0f2eac2b54 // kotlin.String | The player UUID without hyphens
val file : java.io.File = BINARY_DATA_HERE // java.io.File | The skin image in PNG format
val model : SkinModel =  // SkinModel | 
try {
    apiInstance.uploadPlayerSkin(strippedUuid, file, model)
} catch (e: ClientException) {
    println("4xx response calling SkinOperationsApi#uploadPlayerSkin")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SkinOperationsApi#uploadPlayerSkin")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **strippedUuid** | **kotlin.String**| The player UUID without hyphens | [default to null]
 **file** | **java.io.File**| The skin image in PNG format | [default to null]
 **model** | [**SkinModel**](SkinModel.md)|  | [optional] [default to null]

### Return type

null (empty response body)

### Authorization

[PlayerAccessToken](../README.md#PlayerAccessToken)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

