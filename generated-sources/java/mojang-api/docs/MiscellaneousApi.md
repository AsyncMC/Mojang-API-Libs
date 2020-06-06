# MiscellaneousApi

All URIs are relative to *https://api.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getOrdersStatistics**](MiscellaneousApi.md#getOrdersStatistics) | **POST** /orders/statistics | Get statistics on the sales of Minecraft.


<a name="getOrdersStatistics"></a>
# **getOrdersStatistics**
> OrderStatisticsResponse getOrdersStatistics(orderStatisticsRequest)

Get statistics on the sales of Minecraft.

### Example
```java
// Import classes:
//import com.github.asyncmc.mojang.api.java.server.ApiClient;
//import com.github.asyncmc.mojang.api.java.server.ApiException;
//import com.github.asyncmc.mojang.api.java.server.Configuration;
//import com.github.asyncmc.mojang.api.java.server.auth.*;
//import com.github.asyncmc.mojang.api.java.api.MiscellaneousApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: MojangStatisticsToken
HttpBasicAuth MojangStatisticsToken = (HttpBasicAuth) defaultClient.getAuthentication("MojangStatisticsToken");
MojangStatisticsToken.setUsername("YOUR USERNAME");
MojangStatisticsToken.setPassword("YOUR PASSWORD");

MiscellaneousApi apiInstance = new MiscellaneousApi();
OrderStatisticsRequest orderStatisticsRequest = new OrderStatisticsRequest(); // OrderStatisticsRequest | The payload is a json list of options under the metricKeys key. You will receive a single object corresponding to the sum of sales of the requested type(s). You must request at least one type of sale. Below is the default list used by https://minecraft.net/en/stats/
try {
    OrderStatisticsResponse result = apiInstance.getOrdersStatistics(orderStatisticsRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MiscellaneousApi#getOrdersStatistics");
    e.printStackTrace();
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

