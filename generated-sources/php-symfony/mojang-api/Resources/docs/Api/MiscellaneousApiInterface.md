# com.github.asyncmc.mojang.api.php.symfony.server\com.github.asyncmc.mojang.api.php.symfony.api\MiscellaneousApiInterface

All URIs are relative to *https://api.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getOrdersStatistics**](MiscellaneousApiInterface.md#getOrdersStatistics) | **POST** /orders/statistics | Get statistics on the sales of Minecraft.


## Service Declaration
```yaml
# src/Acme/MyBundle/Resources/services.yml
services:
    # ...
    acme.my_bundle.api.miscellaneous:
        class: Acme\MyBundle\Api\MiscellaneousApi
        tags:
            - { name: "open_apiserver.api", api: "miscellaneous" }
    # ...
```

## **getOrdersStatistics**
> com.github.asyncmc.mojang.api.php.symfony.server\com.github.asyncmc.mojang.api.php.symfony.model\OrderStatisticsResponse getOrdersStatistics($orderStatisticsRequest)

Get statistics on the sales of Minecraft.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/MiscellaneousApiInterface.php

namespace Acme\MyBundle\Api;

use com.github.asyncmc.mojang.api.php.symfony.server\com.github.asyncmc.mojang.api.php.symfony.api\MiscellaneousApiInterface;

class MiscellaneousApi implements MiscellaneousApiInterface
{

    // ...

    /**
     * Implementation of MiscellaneousApiInterface#getOrdersStatistics
     */
    public function getOrdersStatistics(OrderStatisticsRequest $orderStatisticsRequest)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderStatisticsRequest** | [**com.github.asyncmc.mojang.api.php.symfony.server\com.github.asyncmc.mojang.api.php.symfony.model\OrderStatisticsRequest**](../Model/OrderStatisticsRequest.md)| The payload is a json list of options under the metricKeys key. You will receive a single object corresponding to the sum of sales of the requested type(s). You must request at least one type of sale. Below is the default list used by https://minecraft.net/en/stats/ |

### Return type

[**com.github.asyncmc.mojang.api.php.symfony.server\com.github.asyncmc.mojang.api.php.symfony.model\OrderStatisticsResponse**](../Model/OrderStatisticsResponse.md)

### Authorization

[MojangStatisticsToken](../../README.md#MojangStatisticsToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

