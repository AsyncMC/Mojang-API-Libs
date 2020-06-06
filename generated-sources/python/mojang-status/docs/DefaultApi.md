# openapi_client.DefaultApi

All URIs are relative to *https://status.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**check_statuses**](DefaultApi.md#check_statuses) | **GET** /check | Checks the Mojang service statuses


# **check_statuses**
> list[dict(str, ApiStatus)] check_statuses()

Checks the Mojang service statuses

### Example
```python
from __future__ import print_function
import time
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = openapi_client.DefaultApi()

try:
    # Checks the Mojang service statuses
    api_response = api_instance.check_statuses()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DefaultApi->check_statuses: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

**list[dict(str, ApiStatus)]**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

