# openapi.api.NameHistoryApi

## Load the API package
```dart
import 'package:openapi/api.dart';
```

All URIs are relative to *https://api.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findUniqueIdsByName**](NameHistoryApi.md#findUniqueIdsByName) | **POST** /profiles/minecraft | Find the current UUID of multiple players at once
[**getNameHistory**](NameHistoryApi.md#getNameHistory) | **GET** /user/profiles/{stripped_uuid}/names | Gets the full player&#39;s name history
[**getUniqueIdByName**](NameHistoryApi.md#getUniqueIdByName) | **GET** /users/profiles/minecraft/{username} | Find the UUID by name


# **findUniqueIdsByName**
> List<CurrentPlayerIDs> findUniqueIdsByName(requestBody)

Find the current UUID of multiple players at once

Find the current players name, UUID, demo status and migration flag by the current players name. The \"at\" parameter is not supported. Players not found are not returned. If no players are found, an empty array is returned.

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new NameHistoryApi();
var requestBody = [new List&lt;String&gt;()]; // List<String> | Array with the player names

try { 
    var result = api_instance.findUniqueIdsByName(requestBody);
    print(result);
} catch (e) {
    print("Exception when calling NameHistoryApi->findUniqueIdsByName: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestBody** | [**List&lt;String&gt;**](List.md)| Array with the player names | 

### Return type

[**List<CurrentPlayerIDs>**](CurrentPlayerIDs.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getNameHistory**
> List<NameChange> getNameHistory(strippedUuid)

Gets the full player's name history

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new NameHistoryApi();
var strippedUuid = 38ba542eb5924231a54cca0f2eac2b54; // String | The player UUID without hyphens

try { 
    var result = api_instance.getNameHistory(strippedUuid);
    print(result);
} catch (e) {
    print("Exception when calling NameHistoryApi->getNameHistory: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **strippedUuid** | **String**| The player UUID without hyphens | [default to null]

### Return type

[**List<NameChange>**](NameChange.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getUniqueIdByName**
> CurrentPlayerIDs getUniqueIdByName(username, at)

Find the UUID by name

Find the current player name, UUID, demo status and migration flag by the current player name or at a given time.

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new NameHistoryApi();
var username = LordofMC_Playerz; // String | The username in a given time, or in present if \"at\" is not sent
var at = 1448533942; // int | Find the username in a given time, when 0 selects the original name however, it only works if the name was changed at least once, or if the account is legacy. The time is an UNIX timestamp (without milliseconds)

try { 
    var result = api_instance.getUniqueIdByName(username, at);
    print(result);
} catch (e) {
    print("Exception when calling NameHistoryApi->getUniqueIdByName: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| The username in a given time, or in present if \&quot;at\&quot; is not sent | [default to null]
 **at** | **int**| Find the username in a given time, when 0 selects the original name however, it only works if the name was changed at least once, or if the account is legacy. The time is an UNIX timestamp (without milliseconds) | [optional] [default to null]

### Return type

[**CurrentPlayerIDs**](CurrentPlayerIDs.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

