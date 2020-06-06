# com.github.asyncmc.mojang.api.go.server\NameHistoryApi

All URIs are relative to *https://api.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**FindUniqueIdsByName**](NameHistoryApi.md#FindUniqueIdsByName) | **Post** /profiles/minecraft | Find the current UUID of multiple players at once
[**GetNameHistory**](NameHistoryApi.md#GetNameHistory) | **Get** /user/profiles/{stripped_uuid}/names | Gets the full player&#39;s name history
[**GetUniqueIdByName**](NameHistoryApi.md#GetUniqueIdByName) | **Get** /users/profiles/minecraft/{username} | Find the UUID by name


# **FindUniqueIdsByName**
> []CurrentPlayerIDs FindUniqueIdsByName(ctx, requestBody)
Find the current UUID of multiple players at once

Find the current players name, UUID, demo status and migration flag by the current players name. The \"at\" parameter is not supported. Players not found are not returned. If no players are found, an empty array is returned.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **requestBody** | [**[]string**](array.md)| Array with the player names | 

### Return type

[**[]CurrentPlayerIDs**](CurrentPlayerIDs.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetNameHistory**
> []NameChange GetNameHistory(ctx, strippedUuid)
Gets the full player's name history

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **strippedUuid** | **string**| The player UUID without hyphens | 

### Return type

[**[]NameChange**](NameChange.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetUniqueIdByName**
> CurrentPlayerIDs GetUniqueIdByName(ctx, username, optional)
Find the UUID by name

Find the current player name, UUID, demo status and migration flag by the current player name or at a given time.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **username** | **string**| The username in a given time, or in present if \&quot;at\&quot; is not sent | 
 **optional** | ***GetUniqueIdByNameOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a GetUniqueIdByNameOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **at** | **optional.Int64**| Find the username in a given time, when 0 selects the original name however, it only works if the name was changed at least once, or if the account is legacy. The time is an UNIX timestamp (without milliseconds) | 

### Return type

[**CurrentPlayerIDs**](CurrentPlayerIDs.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

