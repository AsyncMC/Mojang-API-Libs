# DEFAULT_API

All URIs are relative to *https://authserver.mojang.com*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**authenticate**](DEFAULT_API.md#authenticate) | **Post** /authenticate | 
[**invalidate**](DEFAULT_API.md#invalidate) | **Post** /invalidate | 
[**refresh**](DEFAULT_API.md#refresh) | **Post** /refresh | 
[**siginout**](DEFAULT_API.md#siginout) | **Post** /signout | 
[**validate**](DEFAULT_API.md#validate) | **Post** /validate | 


# **authenticate**
> authenticate (authentication_request: AUTHENTICATION_REQUEST ): detachable AUTHENTICATION
	




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authentication_request** | [**AUTHENTICATION_REQUEST**](AUTHENTICATION_REQUEST.md)|  | 

### Return type

[**AUTHENTICATION**](Authentication.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **invalidate**
> invalidate (access_keys: ACCESS_KEYS )
	




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_keys** | [**ACCESS_KEYS**](ACCESS_KEYS.md)|  | 

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **refresh**
> refresh (refresh_request: REFRESH_REQUEST ): detachable REFRESH_RESPONSE
	




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **refresh_request** | [**REFRESH_REQUEST**](REFRESH_REQUEST.md)|  | 

### Return type

[**REFRESH_RESPONSE**](RefreshResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **siginout**
> siginout (username_password: USERNAME_PASSWORD )
	




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username_password** | [**USERNAME_PASSWORD**](USERNAME_PASSWORD.md)|  | 

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **validate**
> validate (access_keys: ACCESS_KEYS )
	




### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_keys** | [**ACCESS_KEYS**](ACCESS_KEYS.md)|  | 

### Return type

{empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

