# openapi.api.SkinOperationsApi

## Load the API package
```dart
import 'package:openapi/api.dart';
```

All URIs are relative to *https://api.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**changePlayerSkin**](SkinOperationsApi.md#changePlayerSkin) | **POST** /user/profile/{stripped_uuid}/skin | Changes the player skin by URL
[**resetPlayerSkin**](SkinOperationsApi.md#resetPlayerSkin) | **DELETE** /user/profile/{stripped_uuid}/skin | Resets the player skin to default
[**uploadPlayerSkin**](SkinOperationsApi.md#uploadPlayerSkin) | **PUT** /user/profile/{stripped_uuid}/skin | Changes the player skin by upload


# **changePlayerSkin**
> changePlayerSkin(strippedUuid, url, model)

Changes the player skin by URL

This will set the skin for the selected profile, but Mojang's servers will fetch the skin from a URL. This will also work for legacy accounts.

### Example 
```dart
import 'package:openapi/api.dart';
// TODO Configure HTTP basic authorization: PlayerAccessToken
//openapi.api.Configuration.username = 'YOUR_USERNAME';
//openapi.api.Configuration.password = 'YOUR_PASSWORD';

var api_instance = new SkinOperationsApi();
var strippedUuid = 38ba542eb5924231a54cca0f2eac2b54; // String | The player UUID without hyphens
var url = url_example; // String | The URL which Mojang servers will download and apply the skin
var model = ; // SkinModel | 

try { 
    api_instance.changePlayerSkin(strippedUuid, url, model);
} catch (e) {
    print("Exception when calling SkinOperationsApi->changePlayerSkin: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **strippedUuid** | **String**| The player UUID without hyphens | [default to null]
 **url** | **String**| The URL which Mojang servers will download and apply the skin | [default to null]
 **model** | [**SkinModel**](SkinModel.md)|  | [optional] [default to null]

### Return type

void (empty response body)

### Authorization

[PlayerAccessToken](../README.md#PlayerAccessToken)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **resetPlayerSkin**
> resetPlayerSkin(strippedUuid)

Resets the player skin to default

### Example 
```dart
import 'package:openapi/api.dart';
// TODO Configure HTTP basic authorization: PlayerAccessToken
//openapi.api.Configuration.username = 'YOUR_USERNAME';
//openapi.api.Configuration.password = 'YOUR_PASSWORD';

var api_instance = new SkinOperationsApi();
var strippedUuid = 38ba542eb5924231a54cca0f2eac2b54; // String | The player UUID without hyphens

try { 
    api_instance.resetPlayerSkin(strippedUuid);
} catch (e) {
    print("Exception when calling SkinOperationsApi->resetPlayerSkin: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **strippedUuid** | **String**| The player UUID without hyphens | [default to null]

### Return type

void (empty response body)

### Authorization

[PlayerAccessToken](../README.md#PlayerAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **uploadPlayerSkin**
> uploadPlayerSkin(strippedUuid, file, model)

Changes the player skin by upload

This uploads a skin to Mojang's servers. It also sets the users skin. This works on legacy counts as well.

### Example 
```dart
import 'package:openapi/api.dart';
// TODO Configure HTTP basic authorization: PlayerAccessToken
//openapi.api.Configuration.username = 'YOUR_USERNAME';
//openapi.api.Configuration.password = 'YOUR_PASSWORD';

var api_instance = new SkinOperationsApi();
var strippedUuid = 38ba542eb5924231a54cca0f2eac2b54; // String | The player UUID without hyphens
var file = BINARY_DATA_HERE; // MultipartFile | The skin image in PNG format
var model = ; // SkinModel | 

try { 
    api_instance.uploadPlayerSkin(strippedUuid, file, model);
} catch (e) {
    print("Exception when calling SkinOperationsApi->uploadPlayerSkin: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **strippedUuid** | **String**| The player UUID without hyphens | [default to null]
 **file** | **MultipartFile**| The skin image in PNG format | [default to null]
 **model** | [**SkinModel**](SkinModel.md)|  | [optional] [default to null]

### Return type

void (empty response body)

### Authorization

[PlayerAccessToken](../README.md#PlayerAccessToken)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

