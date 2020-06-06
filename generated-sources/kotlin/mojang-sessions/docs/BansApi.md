# BansApi

All URIs are relative to *https://sessionserver.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBlockedServerHashes**](BansApi.md#getBlockedServerHashes) | **GET** /blockedservers | A list of SHA1 hashes of banned servers


<a name="getBlockedServerHashes"></a>
# **getBlockedServerHashes**
> kotlin.String getBlockedServerHashes()

A list of SHA1 hashes of banned servers

Returns a list of SHA1 hashes used to check server addresses against when the client tries to connect. Clients check the lowercase name, using the ISO-8859-1 charset, against this list. They will also attempt to check subdomains, replacing each level with a *. Specifically, it splits based off of the . in the domain, goes through each section removing one at a time. For instance, for mc.example.com, it would try mc.example.com, *.example.com, and *.com. With IP addresses (verified by having 4 split sections, with each section being a valid integer between 0 and 255, inclusive) substitution starts from the end, so for 192.168.0.1, it would try 192.168.0.1, 192.168.0.*, 192.168.*, and 192.*. This check is done by the bootstrap class in netty. The default netty class is overridden by one in the com.mojang:netty dependency loaded by the launcher. This allows it to affect any version that used netty (1.7+)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = BansApi()
try {
    val result : kotlin.String = apiInstance.getBlockedServerHashes()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BansApi#getBlockedServerHashes")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BansApi#getBlockedServerHashes")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**kotlin.String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

