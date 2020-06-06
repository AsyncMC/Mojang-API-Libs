# \SkinOperationsApi

All URIs are relative to *https://api.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**change_player_skin**](SkinOperationsApi.md#change_player_skin) | **Post** /user/profile/{stripped_uuid}/skin | Changes the player skin by URL
[**reset_player_skin**](SkinOperationsApi.md#reset_player_skin) | **Delete** /user/profile/{stripped_uuid}/skin | Resets the player skin to default
[**upload_player_skin**](SkinOperationsApi.md#upload_player_skin) | **Put** /user/profile/{stripped_uuid}/skin | Changes the player skin by upload


# **change_player_skin**
> change_player_skin(ctx, stripped_uuid, url, optional)
Changes the player skin by URL

This will set the skin for the selected profile, but Mojang's servers will fetch the skin from a URL. This will also work for legacy accounts.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **stripped_uuid** | **String**| The player UUID without hyphens | 
  **url** | **String**| The URL which Mojang servers will download and apply the skin | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stripped_uuid** | **String**| The player UUID without hyphens | 
 **url** | **String**| The URL which Mojang servers will download and apply the skin | 
 **model** | [**::models::SkinModel**](SkinModel.md)|  | 

### Return type

 (empty response body)

### Authorization

[PlayerAccessToken](../README.md#PlayerAccessToken)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **reset_player_skin**
> reset_player_skin(ctx, stripped_uuid)
Resets the player skin to default

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **stripped_uuid** | **String**| The player UUID without hyphens | 

### Return type

 (empty response body)

### Authorization

[PlayerAccessToken](../README.md#PlayerAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **upload_player_skin**
> upload_player_skin(ctx, stripped_uuid, file, optional)
Changes the player skin by upload

This uploads a skin to Mojang's servers. It also sets the users skin. This works on legacy counts as well.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **stripped_uuid** | **String**| The player UUID without hyphens | 
  **file** | **::models::File**| The skin image in PNG format | 
 **optional** | **map[string]interface{}** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a map[string]interface{}.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stripped_uuid** | **String**| The player UUID without hyphens | 
 **file** | **::models::File**| The skin image in PNG format | 
 **model** | [**::models::SkinModel**](SkinModel.md)|  | 

### Return type

 (empty response body)

### Authorization

[PlayerAccessToken](../README.md#PlayerAccessToken)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

