# SKINOPERATIONS_API

All URIs are relative to *https://api.mojang.com*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**change_player_skin**](SKINOPERATIONS_API.md#change_player_skin) | **Post** /user/profile/{stripped_uuid}/skin | Changes the player skin by URL
[**reset_player_skin**](SKINOPERATIONS_API.md#reset_player_skin) | **Delete** /user/profile/{stripped_uuid}/skin | Resets the player skin to default
[**upload_player_skin**](SKINOPERATIONS_API.md#upload_player_skin) | **Put** /user/profile/{stripped_uuid}/skin | Changes the player skin by upload


# **change_player_skin**
> change_player_skin (stripped_uuid: STRING_32 ; url: STRING_32 ; model:  detachable SKIN_MODEL )
	

Changes the player skin by URL

This will set the skin for the selected profile, but Mojang's servers will fetch the skin from a URL. This will also work for legacy accounts.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stripped_uuid** | **STRING_32**| The player UUID without hyphens | [default to null]
 **url** | **STRING_32**| The URL which Mojang servers will download and apply the skin | [default to null]
 **model** | [**SKIN_MODEL**](SkinModel.md)|  | [optional] [default to null]

### Return type

{empty response body)

### Authorization

[PlayerAccessToken](../README.md#PlayerAccessToken)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **reset_player_skin**
> reset_player_skin (stripped_uuid: STRING_32 )
	

Resets the player skin to default


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stripped_uuid** | **STRING_32**| The player UUID without hyphens | [default to null]

### Return type

{empty response body)

### Authorization

[PlayerAccessToken](../README.md#PlayerAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **upload_player_skin**
> upload_player_skin (stripped_uuid: STRING_32 ; file: FILE ; model:  detachable SKIN_MODEL )
	

Changes the player skin by upload

This uploads a skin to Mojang's servers. It also sets the users skin. This works on legacy counts as well.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stripped_uuid** | **STRING_32**| The player UUID without hyphens | [default to null]
 **file** | **FILE**| The skin image in PNG format | [default to null]
 **model** | [**SKIN_MODEL**](SkinModel.md)|  | [optional] [default to null]

### Return type

{empty response body)

### Authorization

[PlayerAccessToken](../README.md#PlayerAccessToken)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

