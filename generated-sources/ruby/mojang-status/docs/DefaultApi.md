# OpenapiClient::DefaultApi

All URIs are relative to *https://status.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**check_statuses**](DefaultApi.md#check_statuses) | **GET** /check | Checks the Mojang service statuses


# **check_statuses**
> Array&lt;Hash&lt;String, ApiStatus&gt;&gt; check_statuses

Checks the Mojang service statuses

### Example
```ruby
# load the gem
require 'openapi_client'

api_instance = OpenapiClient::DefaultApi.new

begin
  #Checks the Mojang service statuses
  result = api_instance.check_statuses
  p result
rescue OpenapiClient::ApiError => e
  puts "Exception when calling DefaultApi->check_statuses: #{e}"
end
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Array&lt;Hash&lt;String, ApiStatus&gt;&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



