# \SkinOperationsApi

All URIs are relative to *https://api.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ChangePlayerSkin**](SkinOperationsApi.md#ChangePlayerSkin) | **Post** /user/profile/{stripped_uuid}/skin | Changes the player skin by URL
[**ResetPlayerSkin**](SkinOperationsApi.md#ResetPlayerSkin) | **Delete** /user/profile/{stripped_uuid}/skin | Resets the player skin to default
[**UploadPlayerSkin**](SkinOperationsApi.md#UploadPlayerSkin) | **Put** /user/profile/{stripped_uuid}/skin | Changes the player skin by upload


# **ChangePlayerSkin**
> ChangePlayerSkin(ctx, strippedUuid, url, optional)
Changes the player skin by URL

This will set the skin for the selected profile, but Mojang's servers will fetch the skin from a URL. This will also work for legacy accounts.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **strippedUuid** | **string**| The player UUID without hyphens | 
  **url** | **string**| The URL which Mojang servers will download and apply the skin | 
 **optional** | ***ChangePlayerSkinOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a ChangePlayerSkinOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **model** | [**optional.Interface of SkinModel**](SkinModel.md)|  | 

### Return type

 (empty response body)

### Authorization

[PlayerAccessToken](../README.md#PlayerAccessToken)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ResetPlayerSkin**
> ResetPlayerSkin(ctx, strippedUuid)
Resets the player skin to default

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **strippedUuid** | **string**| The player UUID without hyphens | 

### Return type

 (empty response body)

### Authorization

[PlayerAccessToken](../README.md#PlayerAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **UploadPlayerSkin**
> UploadPlayerSkin(ctx, strippedUuid, file, optional)
Changes the player skin by upload

This uploads a skin to Mojang's servers. It also sets the users skin. This works on legacy counts as well.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **strippedUuid** | **string**| The player UUID without hyphens | 
  **file** | ***os.File*****os.File**| The skin image in PNG format | 
 **optional** | ***UploadPlayerSkinOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a UploadPlayerSkinOpts struct

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **model** | [**optional.Interface of SkinModel**](SkinModel.md)|  | 

### Return type

 (empty response body)

### Authorization

[PlayerAccessToken](../README.md#PlayerAccessToken)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

