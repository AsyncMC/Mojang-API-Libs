# LOGIN_API

All URIs are relative to *https://sessionserver.mojang.com*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**player_profile**](LOGIN_API.md#player_profile) | **Get** /session/minecraft/profile/{stripped_uuid} | Gets the player&#39;s game profile


# **player_profile**
> player_profile (stripped_uuid: STRING_32 ; unsigned:  detachable BOOLEAN ): detachable PLAYER_PROFILE
	

Gets the player's game profile

This will return the player's username plus any additional information about them (e.g. skins). This has a much stricter rate limit: You can request the same profile once per minute, however you can send as many unique requests as you like.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stripped_uuid** | **STRING_32**| The player UUID without hyphens | [default to null]
 **unsigned** | **BOOLEAN**| When set to false, the signature data are sent | [optional] [default to null]

### Return type

[**PLAYER_PROFILE**](PlayerProfile.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

