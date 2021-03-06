# com.github.asyncmc.mojang.api.php.server\MiscellaneousApi

All URIs are relative to *https://api.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getOrdersStatistics**](MiscellaneousApi.md#getOrdersStatistics) | **POST** /orders/statistics | Get statistics on the sales of Minecraft.


# **getOrdersStatistics**
> \com.github.asyncmc.mojang.api.php.server\com.github.asyncmc.mojang.api.php.model\OrderStatisticsResponse getOrdersStatistics($order_statistics_request)

Get statistics on the sales of Minecraft.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: MojangStatisticsToken
$config = com.github.asyncmc.mojang.api.php.server\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');

$apiInstance = new com.github.asyncmc.mojang.api.php.server\Api\MiscellaneousApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$order_statistics_request = new \com.github.asyncmc.mojang.api.php.server\com.github.asyncmc.mojang.api.php.model\OrderStatisticsRequest(); // \com.github.asyncmc.mojang.api.php.server\com.github.asyncmc.mojang.api.php.model\OrderStatisticsRequest | The payload is a json list of options under the metricKeys key. You will receive a single object corresponding to the sum of sales of the requested type(s). You must request at least one type of sale. Below is the default list used by https://minecraft.net/en/stats/

try {
    $result = $apiInstance->getOrdersStatistics($order_statistics_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MiscellaneousApi->getOrdersStatistics: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order_statistics_request** | [**\com.github.asyncmc.mojang.api.php.server\com.github.asyncmc.mojang.api.php.model\OrderStatisticsRequest**](../Model/OrderStatisticsRequest.md)| The payload is a json list of options under the metricKeys key. You will receive a single object corresponding to the sum of sales of the requested type(s). You must request at least one type of sale. Below is the default list used by https://minecraft.net/en/stats/ |

### Return type

[**\com.github.asyncmc.mojang.api.php.server\com.github.asyncmc.mojang.api.php.model\OrderStatisticsResponse**](../Model/OrderStatisticsResponse.md)

### Authorization

[MojangStatisticsToken](../../README.md#MojangStatisticsToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

