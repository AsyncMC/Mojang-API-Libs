# MojangAuthenticationApi.DefaultApi

All URIs are relative to *https://authserver.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authenticate**](DefaultApi.md#authenticate) | **POST** /authenticate | 
[**invalidate**](DefaultApi.md#invalidate) | **POST** /invalidate | 
[**refresh**](DefaultApi.md#refresh) | **POST** /refresh | 
[**siginout**](DefaultApi.md#siginout) | **POST** /signout | 
[**validate**](DefaultApi.md#validate) | **POST** /validate | 


<a name="authenticate"></a>
# **authenticate**
> Authentication authenticate(authenticationRequest)



### Example
```javascript
var MojangAuthenticationApi = require('mojang_authentication_api');

var apiInstance = new MojangAuthenticationApi.DefaultApi();
var authenticationRequest = new MojangAuthenticationApi.AuthenticationRequest(); // AuthenticationRequest | 
var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.authenticate(authenticationRequest, callback);
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

<a name="invalidate"></a>
# **invalidate**
> invalidate(accessKeys)



### Example
```javascript
var MojangAuthenticationApi = require('mojang_authentication_api');

var apiInstance = new MojangAuthenticationApi.DefaultApi();
var accessKeys = new MojangAuthenticationApi.AccessKeys(); // AccessKeys | 
var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.invalidate(accessKeys, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessKeys** | [**AccessKeys**](AccessKeys.md)|  | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="refresh"></a>
# **refresh**
> RefreshResponse refresh(refreshRequest)



### Example
```javascript
var MojangAuthenticationApi = require('mojang_authentication_api');

var apiInstance = new MojangAuthenticationApi.DefaultApi();
var refreshRequest = new MojangAuthenticationApi.RefreshRequest(); // RefreshRequest | 
var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.refresh(refreshRequest, callback);
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

<a name="siginout"></a>
# **siginout**
> siginout(usernamePassword)



### Example
```javascript
var MojangAuthenticationApi = require('mojang_authentication_api');

var apiInstance = new MojangAuthenticationApi.DefaultApi();
var usernamePassword = new MojangAuthenticationApi.UsernamePassword(); // UsernamePassword | 
var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.siginout(usernamePassword, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **usernamePassword** | [**UsernamePassword**](UsernamePassword.md)|  | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="validate"></a>
# **validate**
> validate(accessKeys)



### Example
```javascript
var MojangAuthenticationApi = require('mojang_authentication_api');

var apiInstance = new MojangAuthenticationApi.DefaultApi();
var accessKeys = new MojangAuthenticationApi.AccessKeys(); // AccessKeys | 
var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.validate(accessKeys, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessKeys** | [**AccessKeys**](AccessKeys.md)|  | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

