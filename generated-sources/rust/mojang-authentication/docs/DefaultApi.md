# com.github.asyncmc.mojang.authentication.rust.server\DefaultApi

All URIs are relative to *https://authserver.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authenticate**](DefaultApi.md#authenticate) | **Post** /authenticate | 
[**invalidate**](DefaultApi.md#invalidate) | **Post** /invalidate | 
[**refresh**](DefaultApi.md#refresh) | **Post** /refresh | 
[**siginout**](DefaultApi.md#siginout) | **Post** /signout | 
[**validate**](DefaultApi.md#validate) | **Post** /validate | 


# **authenticate**
> ::models::Authentication authenticate(authentication_request)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **authentication_request** | [**AuthenticationRequest**](AuthenticationRequest.md)|  | 

### Return type

[**::models::Authentication**](Authentication.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **invalidate**
> invalidate(access_keys)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_keys** | [**AccessKeys**](AccessKeys.md)|  | 

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **refresh**
> ::models::RefreshResponse refresh(refresh_request)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **refresh_request** | [**RefreshRequest**](RefreshRequest.md)|  | 

### Return type

[**::models::RefreshResponse**](RefreshResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **siginout**
> siginout(username_password)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **username_password** | [**UsernamePassword**](UsernamePassword.md)|  | 

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **validate**
> validate(access_keys)


### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
  **access_keys** | [**AccessKeys**](AccessKeys.md)|  | 

### Return type

 (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

