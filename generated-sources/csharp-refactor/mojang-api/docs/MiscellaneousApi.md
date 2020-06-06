# Org.OpenAPITools.com.github.asyncmc.mojang.api.csharp.refactor.api.MiscellaneousApi

All URIs are relative to *https://api.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetOrdersStatistics**](MiscellaneousApi.md#getordersstatistics) | **POST** /orders/statistics | Get statistics on the sales of Minecraft.


<a name="getordersstatistics"></a>
# **GetOrdersStatistics**
> OrderStatisticsResponse GetOrdersStatistics (OrderStatisticsRequest orderStatisticsRequest)

Get statistics on the sales of Minecraft.

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.com.github.asyncmc.mojang.api.csharp.refactor.api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.com.github.asyncmc.mojang.api.csharp.refactor.model;

namespace Example
{
    public class GetOrdersStatisticsExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: MojangStatisticsToken
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new MiscellaneousApi();
            var orderStatisticsRequest = new OrderStatisticsRequest(); // OrderStatisticsRequest | The payload is a json list of options under the metricKeys key. You will receive a single object corresponding to the sum of sales of the requested type(s). You must request at least one type of sale. Below is the default list used by https://minecraft.net/en/stats/

            try
            {
                // Get statistics on the sales of Minecraft.
                OrderStatisticsResponse result = apiInstance.GetOrdersStatistics(orderStatisticsRequest);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling MiscellaneousApi.GetOrdersStatistics: " + e.Message );
            }
        }
    }
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

