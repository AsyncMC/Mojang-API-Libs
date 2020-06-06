# openapi_client.MiscellaneousApi

All URIs are relative to *https://api.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_orders_statistics**](MiscellaneousApi.md#get_orders_statistics) | **POST** /orders/statistics | Get statistics on the sales of Minecraft.


# **get_orders_statistics**
> OrderStatisticsResponse get_orders_statistics(order_statistics_request)

Get statistics on the sales of Minecraft.

### Example

* Basic Authentication (MojangStatisticsToken): 
```python
from __future__ import print_function
import time
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Configure HTTP basic authorization: MojangStatisticsToken
configuration = openapi_client.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = openapi_client.MiscellaneousApi(openapi_client.ApiClient(configuration))
order_statistics_request = openapi_client.OrderStatisticsRequest() # OrderStatisticsRequest | The payload is a json list of options under the metricKeys key. You will receive a single object corresponding to the sum of sales of the requested type(s). You must request at least one type of sale. Below is the default list used by https://minecraft.net/en/stats/

try:
    # Get statistics on the sales of Minecraft.
    api_response = api_instance.get_orders_statistics(order_statistics_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MiscellaneousApi->get_orders_statistics: %s\n" % e)
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

