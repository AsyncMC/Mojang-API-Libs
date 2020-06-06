# com.github.asyncmc.mojang.sessions.php.server\BansApi

All URIs are relative to *https://sessionserver.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBlockedServerHashes**](BansApi.md#getBlockedServerHashes) | **GET** /blockedservers | A list of SHA1 hashes of banned servers


# **getBlockedServerHashes**
> string getBlockedServerHashes()

A list of SHA1 hashes of banned servers

Returns a list of SHA1 hashes used to check server addresses against when the client tries to connect. Clients check the lowercase name, using the ISO-8859-1 charset, against this list. They will also attempt to check subdomains, replacing each level with a *. Specifically, it splits based off of the . in the domain, goes through each section removing one at a time. For instance, for mc.example.com, it would try mc.example.com, *.example.com, and *.com. With IP addresses (verified by having 4 split sections, with each section being a valid integer between 0 and 255, inclusive) substitution starts from the end, so for 192.168.0.1, it would try 192.168.0.1, 192.168.0.*, 192.168.*, and 192.*. This check is done by the bootstrap class in netty. The default netty class is overridden by one in the com.mojang:netty dependency loaded by the launcher. This allows it to affect any version that used netty (1.7+)

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new com.github.asyncmc.mojang.sessions.php.server\Api\BansApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);

try {
    $result = $apiInstance->getBlockedServerHashes();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling BansApi->getBlockedServerHashes: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters
This endpoint does not need any parameter.

### Return type

**string**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

