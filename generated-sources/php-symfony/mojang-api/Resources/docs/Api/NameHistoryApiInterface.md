# OpenAPI\Server\Api\NameHistoryApiInterface

All URIs are relative to *https://api.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findUniqueIdsByName**](NameHistoryApiInterface.md#findUniqueIdsByName) | **POST** /profiles/minecraft | Find the current UUID of multiple players at once
[**getNameHistory**](NameHistoryApiInterface.md#getNameHistory) | **GET** /user/profiles/{stripped_uuid}/names | Gets the full player&#39;s name history
[**getUniqueIdByName**](NameHistoryApiInterface.md#getUniqueIdByName) | **GET** /users/profiles/minecraft/{username} | Find the UUID by name


## Service Declaration
```yaml
# src/Acme/MyBundle/Resources/services.yml
services:
    # ...
    acme.my_bundle.api.nameHistory:
        class: Acme\MyBundle\Api\NameHistoryApi
        tags:
            - { name: "open_apiserver.api", api: "nameHistory" }
    # ...
```

## **findUniqueIdsByName**
> OpenAPI\Server\Model\CurrentPlayerIDs findUniqueIdsByName($requestBody)

Find the current UUID of multiple players at once

Find the current players name, UUID, demo status and migration flag by the current players name. The \"at\" parameter is not supported. Players not found are not returned. If no players are found, an empty array is returned.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/NameHistoryApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\NameHistoryApiInterface;

class NameHistoryApi implements NameHistoryApiInterface
{

    // ...

    /**
     * Implementation of NameHistoryApiInterface#findUniqueIdsByName
     */
    public function findUniqueIdsByName(array $requestBody)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestBody** | [**string**](../Model/array.md)| Array with the player names |

### Return type

[**OpenAPI\Server\Model\CurrentPlayerIDs**](../Model/CurrentPlayerIDs.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getNameHistory**
> OpenAPI\Server\Model\NameChange getNameHistory($strippedUuid)

Gets the full player's name history

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/NameHistoryApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\NameHistoryApiInterface;

class NameHistoryApi implements NameHistoryApiInterface
{

    // ...

    /**
     * Implementation of NameHistoryApiInterface#getNameHistory
     */
    public function getNameHistory($strippedUuid)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **strippedUuid** | **string**| The player UUID without hyphens |

### Return type

[**OpenAPI\Server\Model\NameChange**](../Model/NameChange.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getUniqueIdByName**
> OpenAPI\Server\Model\CurrentPlayerIDs getUniqueIdByName($username, $at)

Find the UUID by name

Find the current player name, UUID, demo status and migration flag by the current player name or at a given time.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/NameHistoryApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\NameHistoryApiInterface;

class NameHistoryApi implements NameHistoryApiInterface
{

    // ...

    /**
     * Implementation of NameHistoryApiInterface#getUniqueIdByName
     */
    public function getUniqueIdByName($username, $at = null)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **string**| The username in a given time, or in present if \&quot;at\&quot; is not sent |
 **at** | **int**| Find the username in a given time, when 0 selects the original name however, it only works if the name was changed at least once, or if the account is legacy. The time is an UNIX timestamp (without milliseconds) | [optional]

### Return type

[**OpenAPI\Server\Model\CurrentPlayerIDs**](../Model/CurrentPlayerIDs.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

