# openapi.api.LoginApi

## Load the API package
```dart
import 'package:openapi/api.dart';
```

All URIs are relative to *https://sessionserver.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPlayerProfile**](LoginApi.md#getPlayerProfile) | **GET** /session/minecraft/profile/{stripped_uuid} | Gets the player&#39;s game profile


# **getPlayerProfile**
> PlayerProfile getPlayerProfile(strippedUuid, unsigned)

Gets the player's game profile

This will return the player's username plus any additional information about them (e.g. skins). This has a much stricter rate limit: You can request the same profile once per minute, however you can send as many unique requests as you like.

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new LoginApi();
var strippedUuid = 853c80ef3c3749fdaa49938b674adae6; // String | The player UUID without hyphens
var unsigned = true; // bool | When set to false, the signature data are sent

try { 
    var result = api_instance.getPlayerProfile(strippedUuid, unsigned);
    print(result);
} catch (e) {
    print("Exception when calling LoginApi->getPlayerProfile: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **strippedUuid** | **String**| The player UUID without hyphens | [default to null]
 **unsigned** | **bool**| When set to false, the signature data are sent | [optional] [default to null]

### Return type

[**PlayerProfile**](PlayerProfile.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

