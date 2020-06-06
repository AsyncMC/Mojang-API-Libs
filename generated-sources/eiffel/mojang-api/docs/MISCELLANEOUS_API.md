# MISCELLANEOUS_API

All URIs are relative to *https://api.mojang.com*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**orders_statistics**](MISCELLANEOUS_API.md#orders_statistics) | **Post** /orders/statistics | Get statistics on the sales of Minecraft.


# **orders_statistics**
> orders_statistics (order_statistics_request: ORDER_STATISTICS_REQUEST ): detachable ORDER_STATISTICS_RESPONSE
	

Get statistics on the sales of Minecraft.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order_statistics_request** | [**ORDER_STATISTICS_REQUEST**](ORDER_STATISTICS_REQUEST.md)| The payload is a json list of options under the metricKeys key. You will receive a single object corresponding to the sum of sales of the requested type(s). You must request at least one type of sale. Below is the default list used by https://minecraft.net/en/stats/ | 

### Return type

[**ORDER_STATISTICS_RESPONSE**](OrderStatisticsResponse.md)

### Authorization

[MojangStatisticsToken](../README.md#MojangStatisticsToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

