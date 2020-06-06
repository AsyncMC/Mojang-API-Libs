# OpenapiClient::DefaultApi

All URIs are relative to *https://authserver.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authenticate**](DefaultApi.md#authenticate) | **POST** /authenticate | 
[**invalidate**](DefaultApi.md#invalidate) | **POST** /invalidate | 
[**refresh**](DefaultApi.md#refresh) | **POST** /refresh | 
[**siginout**](DefaultApi.md#siginout) | **POST** /signout | 
[**validate**](DefaultApi.md#validate) | **POST** /validate | 


# **authenticate**
> Authentication authenticate(authentication_request)



### Example
```ruby
# load the gem
require 'openapi_client'

api_instance = OpenapiClient::DefaultApi.new
authentication_request = OpenapiClient::AuthenticationRequest.new # AuthenticationRequest | 

begin
  result = api_instance.authenticate(authentication_request)
  p result
rescue OpenapiClient::ApiError => e
  puts "Exception when calling DefaultApi->authenticate: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authentication_request** | [**AuthenticationRequest**](AuthenticationRequest.md)|  | 

### Return type

[**Authentication**](Authentication.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **invalidate**
> invalidate(access_keys)



### Example
```ruby
# load the gem
require 'openapi_client'

api_instance = OpenapiClient::DefaultApi.new
access_keys = OpenapiClient::AccessKeys.new # AccessKeys | 

begin
  api_instance.invalidate(access_keys)
rescue OpenapiClient::ApiError => e
  puts "Exception when calling DefaultApi->invalidate: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_keys** | [**AccessKeys**](AccessKeys.md)|  | 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **refresh**
> RefreshResponse refresh(refresh_request)



### Example
```ruby
# load the gem
require 'openapi_client'

api_instance = OpenapiClient::DefaultApi.new
refresh_request = OpenapiClient::RefreshRequest.new # RefreshRequest | 

begin
  result = api_instance.refresh(refresh_request)
  p result
rescue OpenapiClient::ApiError => e
  puts "Exception when calling DefaultApi->refresh: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **refresh_request** | [**RefreshRequest**](RefreshRequest.md)|  | 

### Return type

[**RefreshResponse**](RefreshResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **siginout**
> siginout(username_password)



### Example
```ruby
# load the gem
require 'openapi_client'

api_instance = OpenapiClient::DefaultApi.new
username_password = OpenapiClient::UsernamePassword.new # UsernamePassword | 

begin
  api_instance.siginout(username_password)
rescue OpenapiClient::ApiError => e
  puts "Exception when calling DefaultApi->siginout: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username_password** | [**UsernamePassword**](UsernamePassword.md)|  | 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **validate**
> validate(access_keys)



### Example
```ruby
# load the gem
require 'openapi_client'

api_instance = OpenapiClient::DefaultApi.new
access_keys = OpenapiClient::AccessKeys.new # AccessKeys | 

begin
  api_instance.validate(access_keys)
rescue OpenapiClient::ApiError => e
  puts "Exception when calling DefaultApi->validate: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_keys** | [**AccessKeys**](AccessKeys.md)|  | 

### Return type

nil (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



