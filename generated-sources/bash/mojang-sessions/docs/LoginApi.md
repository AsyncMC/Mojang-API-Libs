# LoginApi

All URIs are relative to **

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPlayerProfile**](LoginApi.md#getPlayerProfile) | **GET** /session/minecraft/profile/{stripped_uuid} | Gets the player&#39;s game profile


## **getPlayerProfile**

Gets the player's game profile

This will return the player's username plus any additional information about them (e.g. skins).
This has a much stricter rate limit: You can request the same profile once per minute, however you can send as many unique requests as you like.

### Example
```bash
 getPlayerProfile stripped_uuid=value  unsigned=value
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **strippedUuid** | **string** | The player UUID without hyphens | [default to null]
 **unsigned** | **boolean** | When set to false, the signature data are sent | [optional] [default to null]

### Return type

[**PlayerProfile**](PlayerProfile.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not Applicable
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

