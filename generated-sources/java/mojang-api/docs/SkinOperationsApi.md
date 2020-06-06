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
//import org.openapitools.client.ApiClient;
//import org.openapitools.client.ApiException;
//import org.openapitools.client.Configuration;
//import org.openapitools.client.auth.*;
//import org.openapitools.client.api.SkinOperationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: PlayerAccessToken
HttpBasicAuth PlayerAccessToken = (HttpBasicAuth) defaultClient.getAuthentication("PlayerAccessToken");
PlayerAccessToken.setUsername("YOUR USERNAME");
PlayerAccessToken.setPassword("YOUR PASSWORD");

SkinOperationsApi apiInstance = new SkinOperationsApi();
String strippedUuid = 38ba542eb5924231a54cca0f2eac2b54; // String | The player UUID without hyphens
String url = "url_example"; // String | The URL which Mojang servers will download and apply the skin
SkinModel model = new SkinModel(); // SkinModel | 
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
 **strippedUuid** | **String**| The player UUID without hyphens |
 **url** | **String**| The URL which Mojang servers will download and apply the skin |
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
//import org.openapitools.client.ApiClient;
//import org.openapitools.client.ApiException;
//import org.openapitools.client.Configuration;
//import org.openapitools.client.auth.*;
//import org.openapitools.client.api.SkinOperationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: PlayerAccessToken
HttpBasicAuth PlayerAccessToken = (HttpBasicAuth) defaultClient.getAuthentication("PlayerAccessToken");
PlayerAccessToken.setUsername("YOUR USERNAME");
PlayerAccessToken.setPassword("YOUR PASSWORD");

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
 **strippedUuid** | **String**| The player UUID without hyphens |

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
//import org.openapitools.client.ApiClient;
//import org.openapitools.client.ApiException;
//import org.openapitools.client.Configuration;
//import org.openapitools.client.auth.*;
//import org.openapitools.client.api.SkinOperationsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: PlayerAccessToken
HttpBasicAuth PlayerAccessToken = (HttpBasicAuth) defaultClient.getAuthentication("PlayerAccessToken");
PlayerAccessToken.setUsername("YOUR USERNAME");
PlayerAccessToken.setPassword("YOUR PASSWORD");

SkinOperationsApi apiInstance = new SkinOperationsApi();
String strippedUuid = 38ba542eb5924231a54cca0f2eac2b54; // String | The player UUID without hyphens
File file = new File("/path/to/file"); // File | The skin image in PNG format
SkinModel model = new SkinModel(); // SkinModel | 
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
 **strippedUuid** | **String**| The player UUID without hyphens |
 **file** | **File**| The skin image in PNG format |
 **model** | [**SkinModel**](SkinModel.md)|  | [optional] [default to null]

### Return type

null (empty response body)

### Authorization

[PlayerAccessToken](../README.md#PlayerAccessToken)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

