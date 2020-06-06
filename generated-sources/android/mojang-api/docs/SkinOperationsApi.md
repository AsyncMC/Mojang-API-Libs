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
```java
// Import classes:
//import com.github.asyncmc.mojang.api.android.api.SkinOperationsApi;

SkinOperationsApi apiInstance = new SkinOperationsApi();
String strippedUuid = 38ba542eb5924231a54cca0f2eac2b54; // String | The player UUID without hyphens
String url = null; // String | The URL which Mojang servers will download and apply the skin
SkinModel model = null; // SkinModel | 
try {
    apiInstance.changePlayerSkin(strippedUuid, url, model);
} catch (ApiException e) {
    System.err.println("Exception when calling SkinOperationsApi#changePlayerSkin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **strippedUuid** | **String**| The player UUID without hyphens | [default to null]
 **url** | **String**| The URL which Mojang servers will download and apply the skin | [default to null]
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
```java
// Import classes:
//import com.github.asyncmc.mojang.api.android.api.SkinOperationsApi;

SkinOperationsApi apiInstance = new SkinOperationsApi();
String strippedUuid = 38ba542eb5924231a54cca0f2eac2b54; // String | The player UUID without hyphens
try {
    apiInstance.resetPlayerSkin(strippedUuid);
} catch (ApiException e) {
    System.err.println("Exception when calling SkinOperationsApi#resetPlayerSkin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **strippedUuid** | **String**| The player UUID without hyphens | [default to null]

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
```java
// Import classes:
//import com.github.asyncmc.mojang.api.android.api.SkinOperationsApi;

SkinOperationsApi apiInstance = new SkinOperationsApi();
String strippedUuid = 38ba542eb5924231a54cca0f2eac2b54; // String | The player UUID without hyphens
File file = null; // File | The skin image in PNG format
SkinModel model = null; // SkinModel | 
try {
    apiInstance.uploadPlayerSkin(strippedUuid, file, model);
} catch (ApiException e) {
    System.err.println("Exception when calling SkinOperationsApi#uploadPlayerSkin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **strippedUuid** | **String**| The player UUID without hyphens | [default to null]
 **file** | **File**| The skin image in PNG format | [default to null]
 **model** | [**SkinModel**](SkinModel.md)|  | [optional] [default to null]

### Return type

null (empty response body)

### Authorization

[PlayerAccessToken](../README.md#PlayerAccessToken)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

