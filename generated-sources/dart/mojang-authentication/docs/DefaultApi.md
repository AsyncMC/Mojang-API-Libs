# openapi.api.DefaultApi

## Load the API package
```dart
import 'package:openapi/api.dart';
```

All URIs are relative to *https://authserver.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authenticate**](DefaultApi.md#authenticate) | **POST** /authenticate | 
[**invalidate**](DefaultApi.md#invalidate) | **POST** /invalidate | 
[**refresh**](DefaultApi.md#refresh) | **POST** /refresh | 
[**siginout**](DefaultApi.md#siginout) | **POST** /signout | 
[**validate**](DefaultApi.md#validate) | **POST** /validate | 


# **authenticate**
> Authentication authenticate(authenticationRequest)



### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new DefaultApi();
var authenticationRequest = new AuthenticationRequest(); // AuthenticationRequest | 

try { 
    var result = api_instance.authenticate(authenticationRequest);
    print(result);
} catch (e) {
    print("Exception when calling DefaultApi->authenticate: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authenticationRequest** | [**AuthenticationRequest**](AuthenticationRequest.md)|  | 

### Return type

[**Authentication**](Authentication.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **invalidate**
> invalidate(accessKeys)



### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new DefaultApi();
var accessKeys = new AccessKeys(); // AccessKeys | 

try { 
    api_instance.invalidate(accessKeys);
} catch (e) {
    print("Exception when calling DefaultApi->invalidate: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessKeys** | [**AccessKeys**](AccessKeys.md)|  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **refresh**
> RefreshResponse refresh(refreshRequest)



### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new DefaultApi();
var refreshRequest = new RefreshRequest(); // RefreshRequest | 

try { 
    var result = api_instance.refresh(refreshRequest);
    print(result);
} catch (e) {
    print("Exception when calling DefaultApi->refresh: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **refreshRequest** | [**RefreshRequest**](RefreshRequest.md)|  | 

### Return type

[**RefreshResponse**](RefreshResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **siginout**
> siginout(usernamePassword)



### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new DefaultApi();
var usernamePassword = new UsernamePassword(); // UsernamePassword | 

try { 
    api_instance.siginout(usernamePassword);
} catch (e) {
    print("Exception when calling DefaultApi->siginout: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **usernamePassword** | [**UsernamePassword**](UsernamePassword.md)|  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **validate**
> validate(accessKeys)



### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new DefaultApi();
var accessKeys = new AccessKeys(); // AccessKeys | 

try { 
    api_instance.validate(accessKeys);
} catch (e) {
    print("Exception when calling DefaultApi->validate: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessKeys** | [**AccessKeys**](AccessKeys.md)|  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

