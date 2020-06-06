# DefaultApi

All URIs are relative to *https://status.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**checkStatuses**](DefaultApi.md#checkStatuses) | **GET** /check | Checks the Mojang service statuses


<a name="checkStatuses"></a>
# **checkStatuses**
> kotlin.Array&lt;kotlin.collections.Map&lt;kotlin.String, ApiStatus&gt;&gt; checkStatuses()

Checks the Mojang service statuses

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DefaultApi()
try {
    val result : kotlin.Array<kotlin.collections.Map<kotlin.String, ApiStatus>> = apiInstance.checkStatuses()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#checkStatuses")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#checkStatuses")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**kotlin.Array&lt;kotlin.collections.Map&lt;kotlin.String, ApiStatus&gt;&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

