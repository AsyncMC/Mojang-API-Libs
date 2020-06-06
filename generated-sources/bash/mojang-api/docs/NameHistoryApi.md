# NameHistoryApi

All URIs are relative to **

Method | HTTP request | Description
------------- | ------------- | -------------
[**findUniqueIdsByName**](NameHistoryApi.md#findUniqueIdsByName) | **POST** /profiles/minecraft | Find the current UUID of multiple players at once
[**getNameHistory**](NameHistoryApi.md#getNameHistory) | **GET** /user/profiles/{stripped_uuid}/names | Gets the full player&#39;s name history
[**getUniqueIdByName**](NameHistoryApi.md#getUniqueIdByName) | **GET** /users/profiles/minecraft/{username} | Find the UUID by name


## **findUniqueIdsByName**

Find the current UUID of multiple players at once

Find the current players name, UUID, demo status and migration flag by the current players name. The \"at\" parameter is not supported. Players not found are not returned. If no players are found, an empty array is returned.

### Example
```bash
 findUniqueIdsByName
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestBody** | [**array[string]**](array.md) | Array with the player names |

### Return type

[**array[CurrentPlayerIDs]**](CurrentPlayerIDs.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **getNameHistory**

Gets the full player's name history

### Example
```bash
 getNameHistory stripped_uuid=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **strippedUuid** | **string** | The player UUID without hyphens | [default to null]

### Return type

[**array[NameChange]**](NameChange.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

## **getUniqueIdByName**

Find the UUID by name

Find the current player name, UUID, demo status and migration flag by the current player name or at a given time.

### Example
```bash
 getUniqueIdByName username=value  at=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **string** | The username in a given time, or in present if \"at\" is not sent | [default to null]
 **at** | **integer** | Find the username in a given time, when 0 selects the original name however, it only works if the name was changed at least once, or if the account is legacy. The time is an UNIX timestamp (without milliseconds) | [optional] [default to null]

### Return type

[**CurrentPlayerIDs**](CurrentPlayerIDs.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

