# openapi.api.MiscellaneousApi

## Load the API package
```dart
import 'package:openapi/api.dart';
```

All URIs are relative to *https://api.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getOrdersStatistics**](MiscellaneousApi.md#getOrdersStatistics) | **Post** /orders/statistics | Get statistics on the sales of Minecraft.


# **getOrdersStatistics**
> OrderStatisticsResponse getOrdersStatistics(orderStatisticsRequest)

Get statistics on the sales of Minecraft.

### Example 
```dart
import 'package:openapi/api.dart';
// TODO Configure HTTP basic authorization: MojangStatisticsToken
//openapi.api.Configuration.username = 'YOUR_USERNAME';
//openapi.api.Configuration.password = 'YOUR_PASSWORD';

var api_instance = new MiscellaneousApi();
var orderStatisticsRequest = new OrderStatisticsRequest(); // OrderStatisticsRequest | The payload is a json list of options under the metricKeys key. You will receive a single object corresponding to the sum of sales of the requested type(s). You must request at least one type of sale. Below is the default list used by https://minecraft.net/en/stats/

try { 
    var result = api_instance.getOrdersStatistics(orderStatisticsRequest);
    print(result);
} catch (e) {
    print("Exception when calling MiscellaneousApi->getOrdersStatistics: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderStatisticsRequest** | [**OrderStatisticsRequest**](OrderStatisticsRequest.md)| The payload is a json list of options under the metricKeys key. You will receive a single object corresponding to the sum of sales of the requested type(s). You must request at least one type of sale. Below is the default list used by https://minecraft.net/en/stats/ | 

### Return type

[**OrderStatisticsResponse**](OrderStatisticsResponse.md)

### Authorization

[MojangStatisticsToken](../README.md#MojangStatisticsToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

