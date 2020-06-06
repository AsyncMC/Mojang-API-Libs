# \LoginApi

All URIs are relative to *https://sessionserver.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetPlayerProfile**](LoginApi.md#GetPlayerProfile) | **Get** /session/minecraft/profile/{stripped_uuid} | Gets the player&#39;s game profile


# **GetPlayerProfile**
> PlayerProfile GetPlayerProfile(ctx, strippedUuid, optional)
Gets the player's game profile

This will return the player's username plus any additional information about them (e.g. skins). This has a much stricter rate limit: You can request the same profile once per minute, however you can send as many unique requests as you like.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **strippedUuid** | **string**| The player UUID without hyphens | 
 **optional** | ***GetPlayerProfileOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a GetPlayerProfileOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **unsigned** | **optional.Bool**| When set to false, the signature data are sent | 

### Return type

[**PlayerProfile**](PlayerProfile.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

