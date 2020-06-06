# com.github.asyncmc.mojang.status.php.server\DefaultApi

All URIs are relative to *https://status.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**checkStatuses**](DefaultApi.md#checkStatuses) | **GET** /check | Checks the Mojang service statuses


# **checkStatuses**
> map[string,\com.github.asyncmc.mojang.status.php.server\com.github.asyncmc.mojang.status.php.model\ApiStatus][] checkStatuses()

Checks the Mojang service statuses

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new com.github.asyncmc.mojang.status.php.server\Api\DefaultApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);

try {
    $result = $apiInstance->checkStatuses();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DefaultApi->checkStatuses: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**map[string,\com.github.asyncmc.mojang.status.php.server\com.github.asyncmc.mojang.status.php.model\ApiStatus][]**](../Model/map.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

