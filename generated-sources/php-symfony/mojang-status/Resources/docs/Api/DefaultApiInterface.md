# OpenAPI\Server\Api\DefaultApiInterface

All URIs are relative to *https://status.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**checkStatuses**](DefaultApiInterface.md#checkStatuses) | **GET** /check | Checks the Mojang service statuses


## Service Declaration
```yaml
# src/Acme/MyBundle/Resources/services.yml
services:
    # ...
    acme.my_bundle.api.default:
        class: Acme\MyBundle\Api\DefaultApi
        tags:
            - { name: "open_apiserver.api", api: "default" }
    # ...
```

## **checkStatuses**
> OpenAPI\Server\Model\ApiStatus checkStatuses()

Checks the Mojang service statuses

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/DefaultApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\DefaultApiInterface;

class DefaultApi implements DefaultApiInterface
{

    // ...

    /**
     * Implementation of DefaultApiInterface#checkStatuses
     */
    public function checkStatuses()
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**OpenAPI\Server\Model\ApiStatus**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

