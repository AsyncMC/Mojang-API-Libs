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
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = MiscellaneousApi()
val orderStatisticsRequest : OrderStatisticsRequest =  // OrderStatisticsRequest | The payload is a json list of options under the metricKeys key. You will receive a single object corresponding to the sum of sales of the requested type(s). You must request at least one type of sale. Below is the default list used by https://minecraft.net/en/stats/
try {
    val result : OrderStatisticsResponse = apiInstance.getOrdersStatistics(orderStatisticsRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling MiscellaneousApi#getOrdersStatistics")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling MiscellaneousApi#getOrdersStatistics")
    e.printStackTrace()
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

