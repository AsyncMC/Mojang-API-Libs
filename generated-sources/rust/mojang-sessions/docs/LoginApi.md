# com.github.asyncmc.mojang.sessions.rust.server\LoginApi

All URIs are relative to *https://sessionserver.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_player_profile**](LoginApi.md#get_player_profile) | **Get** /session/minecraft/profile/{stripped_uuid} | Gets the player's game profile


# **get_player_profile**
> ::models::PlayerProfile get_player_profile(stripped_uuid, optional)
Gets the player's game profile

This will return the player's username plus any additional information about them (e.g. skins). This has a much stricter rate limit: You can request the same profile once per minute, however you can send as many unique requests as you like.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **stripped_uuid** | **String**| The player UUID without hyphens | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stripped_uuid** | **String**| The player UUID without hyphens | 
 **unsigned** | **bool**| When set to false, the signature data are sent | 

### Return type

[**::models::PlayerProfile**](PlayerProfile.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

