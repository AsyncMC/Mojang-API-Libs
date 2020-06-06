# NAMEHISTORY_API

All URIs are relative to *https://api.mojang.com*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**find_unique_ids_by_name**](NAMEHISTORY_API.md#find_unique_ids_by_name) | **Post** /profiles/minecraft | Find the current UUID of multiple players at once
[**name_history**](NAMEHISTORY_API.md#name_history) | **Get** /user/profiles/{stripped_uuid}/names | Gets the full player&#39;s name history
[**unique_id_by_name**](NAMEHISTORY_API.md#unique_id_by_name) | **Get** /users/profiles/minecraft/{username} | Find the UUID by name


# **find_unique_ids_by_name**
> find_unique_ids_by_name (s_tr_in_g_32: LIST [STRING_32] ): detachable LIST [CURRENT_PLAYER_I_DS]
	

Find the current UUID of multiple players at once

Find the current players name, UUID, demo status and migration flag by the current players name. The \"at\" parameter is not supported. Players not found are not returned. If no players are found, an empty array is returned.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **s_tr_in_g_32** | [**LIST [STRING_32]**](LIST.md)| Array with the player names | 

### Return type

[**LIST [CURRENT_PLAYER_I_DS]**](CurrentPlayerIDs.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **name_history**
> name_history (stripped_uuid: STRING_32 ): detachable LIST [NAME_CHANGE]
	

Gets the full player's name history


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stripped_uuid** | **STRING_32**| The player UUID without hyphens | [default to null]

### Return type

[**LIST [NAME_CHANGE]**](NameChange.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **unique_id_by_name**
> unique_id_by_name (username: STRING_32 ; at:  detachable INTEGER_64 ): detachable CURRENT_PLAYER_I_DS
	

Find the UUID by name

Find the current player name, UUID, demo status and migration flag by the current player name or at a given time.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **STRING_32**| The username in a given time, or in present if \&quot;at\&quot; is not sent | [default to null]
 **at** | **INTEGER_64**| Find the username in a given time, when 0 selects the original name however, it only works if the name was changed at least once, or if the account is legacy. The time is an UNIX timestamp (without milliseconds) | [optional] [default to null]

### Return type

[**CURRENT_PLAYER_I_DS**](CurrentPlayerIDs.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

