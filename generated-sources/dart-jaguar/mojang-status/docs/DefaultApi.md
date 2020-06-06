# openapi.api.DefaultApi

## Load the API package
```dart
import 'package:openapi/api.dart';
```

All URIs are relative to *https://status.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**checkStatuses**](DefaultApi.md#checkStatuses) | **Get** /check | Checks the Mojang service statuses


# **checkStatuses**
> List<Map<String, ApiStatus>> checkStatuses()

Checks the Mojang service statuses

### Example 
```dart
import 'package:openapi/api.dart';

var api_instance = new DefaultApi();

try { 
    var result = api_instance.checkStatuses();
    print(result);
} catch (e) {
    print("Exception when calling DefaultApi->checkStatuses: $e\n");
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List<Map<String, ApiStatus>>**](Map.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

