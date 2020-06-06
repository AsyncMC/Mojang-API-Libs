# com.github.asyncmc.mojang.api.rust.server\MiscellaneousApi

All URIs are relative to *https://api.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_orders_statistics**](MiscellaneousApi.md#get_orders_statistics) | **Post** /orders/statistics | Get statistics on the sales of Minecraft.


# **get_orders_statistics**
> ::models::OrderStatisticsResponse get_orders_statistics(ctx, order_statistics_request)
Get statistics on the sales of Minecraft.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **order_statistics_request** | [**OrderStatisticsRequest**](OrderStatisticsRequest.md)| The payload is a json list of options under the metricKeys key. You will receive a single object corresponding to the sum of sales of the requested type(s). You must request at least one type of sale. Below is the default list used by https://minecraft.net/en/stats/ | 

### Return type

[**::models::OrderStatisticsResponse**](OrderStatisticsResponse.md)

### Authorization

[MojangStatisticsToken](../README.md#MojangStatisticsToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

