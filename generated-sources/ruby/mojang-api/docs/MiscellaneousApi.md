# OpenapiClient::MiscellaneousApi

All URIs are relative to *https://api.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_orders_statistics**](MiscellaneousApi.md#get_orders_statistics) | **POST** /orders/statistics | Get statistics on the sales of Minecraft.


# **get_orders_statistics**
> OrderStatisticsResponse get_orders_statistics(order_statistics_request)

Get statistics on the sales of Minecraft.

### Example
```ruby
# load the gem
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure HTTP basic authorization: MojangStatisticsToken
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = OpenapiClient::MiscellaneousApi.new
order_statistics_request = OpenapiClient::OrderStatisticsRequest.new # OrderStatisticsRequest | The payload is a json list of options under the metricKeys key. You will receive a single object corresponding to the sum of sales of the requested type(s). You must request at least one type of sale. Below is the default list used by https://minecraft.net/en/stats/

begin
  #Get statistics on the sales of Minecraft.
  result = api_instance.get_orders_statistics(order_statistics_request)
  p result
rescue OpenapiClient::ApiError => e
  puts "Exception when calling MiscellaneousApi->get_orders_statistics: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order_statistics_request** | [**OrderStatisticsRequest**](OrderStatisticsRequest.md)| The payload is a json list of options under the metricKeys key. You will receive a single object corresponding to the sum of sales of the requested type(s). You must request at least one type of sale. Below is the default list used by https://minecraft.net/en/stats/ | 

### Return type

[**OrderStatisticsResponse**](OrderStatisticsResponse.md)

### Authorization

[MojangStatisticsToken](../README.md#MojangStatisticsToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



