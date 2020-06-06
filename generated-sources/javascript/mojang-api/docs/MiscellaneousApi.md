# MojangApi.MiscellaneousApi

All URIs are relative to *https://api.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getOrdersStatistics**](MiscellaneousApi.md#getOrdersStatistics) | **POST** /orders/statistics | Get statistics on the sales of Minecraft.


<a name="getOrdersStatistics"></a>
# **getOrdersStatistics**
> OrderStatisticsResponse getOrdersStatistics(orderStatisticsRequest)

Get statistics on the sales of Minecraft.

### Example
```javascript
var MojangApi = require('mojang_api');
var defaultClient = MojangApi.ApiClient.instance;

// Configure HTTP basic authorization: MojangStatisticsToken
var MojangStatisticsToken = defaultClient.authentications['MojangStatisticsToken'];
MojangStatisticsToken.username = 'YOUR USERNAME';
MojangStatisticsToken.password = 'YOUR PASSWORD';

var apiInstance = new MojangApi.MiscellaneousApi();
var orderStatisticsRequest = new MojangApi.OrderStatisticsRequest(); // OrderStatisticsRequest | The payload is a json list of options under the metricKeys key. You will receive a single object corresponding to the sum of sales of the requested type(s). You must request at least one type of sale. Below is the default list used by https://minecraft.net/en/stats/
var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getOrdersStatistics(orderStatisticsRequest, callback);
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

