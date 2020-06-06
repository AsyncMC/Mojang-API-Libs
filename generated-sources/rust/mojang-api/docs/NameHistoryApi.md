# com.github.asyncmc.mojang.api.rust.server\NameHistoryApi

All URIs are relative to *https://api.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**find_unique_ids_by_name**](NameHistoryApi.md#find_unique_ids_by_name) | **Post** /profiles/minecraft | Find the current UUID of multiple players at once
[**get_name_history**](NameHistoryApi.md#get_name_history) | **Get** /user/profiles/{stripped_uuid}/names | Gets the full player's name history
[**get_unique_id_by_name**](NameHistoryApi.md#get_unique_id_by_name) | **Get** /users/profiles/minecraft/{username} | Find the UUID by name


# **find_unique_ids_by_name**
> Vec<::models::CurrentPlayerIDs> find_unique_ids_by_name(request_body)
Find the current UUID of multiple players at once

Find the current players name, UUID, demo status and migration flag by the current players name. The \"at\" parameter is not supported. Players not found are not returned. If no players are found, an empty array is returned.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **request_body** | [**Vec<String>**](array.md)| Array with the player names | 

### Return type

[**Vec<::models::CurrentPlayerIDs>**](CurrentPlayerIDs.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_name_history**
> Vec<::models::NameChange> get_name_history(stripped_uuid)
Gets the full player's name history

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **stripped_uuid** | **String**| The player UUID without hyphens | 

### Return type

[**Vec<::models::NameChange>**](NameChange.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_unique_id_by_name**
> ::models::CurrentPlayerIDs get_unique_id_by_name(username, optional)
Find the UUID by name

Find the current player name, UUID, demo status and migration flag by the current player name or at a given time.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **username** | **String**| The username in a given time, or in present if \"at\" is not sent | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| The username in a given time, or in present if \"at\" is not sent | 
 **at** | **i64**| Find the username in a given time, when 0 selects the original name however, it only works if the name was changed at least once, or if the account is legacy. The time is an UNIX timestamp (without milliseconds) | 

### Return type

[**::models::CurrentPlayerIDs**](CurrentPlayerIDs.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

