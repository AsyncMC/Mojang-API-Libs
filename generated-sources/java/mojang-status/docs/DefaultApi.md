# DefaultApi

All URIs are relative to *https://status.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**checkStatuses**](DefaultApi.md#checkStatuses) | **GET** /check | Checks the Mojang service statuses


<a name="checkStatuses"></a>
# **checkStatuses**
> List&lt;Map&lt;String, ApiStatus&gt;&gt; checkStatuses()

Checks the Mojang service statuses

### Example
```java
// Import classes:
//import org.openapitools.client.ApiException;
//import org.openapitools.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    List<Map<String, ApiStatus>> result = apiInstance.checkStatuses();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#checkStatuses");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Map&lt;String, ApiStatus&gt;&gt;**](Map.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

