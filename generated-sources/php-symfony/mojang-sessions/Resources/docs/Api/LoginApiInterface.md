# OpenAPI\Server\Api\LoginApiInterface

All URIs are relative to *https://sessionserver.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPlayerProfile**](LoginApiInterface.md#getPlayerProfile) | **GET** /session/minecraft/profile/{stripped_uuid} | Gets the player&#39;s game profile


## Service Declaration
```yaml
# src/Acme/MyBundle/Resources/services.yml
services:
    # ...
    acme.my_bundle.api.login:
        class: Acme\MyBundle\Api\LoginApi
        tags:
            - { name: "open_apiserver.api", api: "login" }
    # ...
```

## **getPlayerProfile**
> OpenAPI\Server\Model\PlayerProfile getPlayerProfile($strippedUuid, $unsigned)

Gets the player's game profile

This will return the player's username plus any additional information about them (e.g. skins). This has a much stricter rate limit: You can request the same profile once per minute, however you can send as many unique requests as you like.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/LoginApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\LoginApiInterface;

class LoginApi implements LoginApiInterface
{

    // ...

    /**
     * Implementation of LoginApiInterface#getPlayerProfile
     */
    public function getPlayerProfile($strippedUuid, $unsigned = null)
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
 **unsigned** | **bool**| When set to false, the signature data are sent | [optional]

### Return type

[**OpenAPI\Server\Model\PlayerProfile**](../Model/PlayerProfile.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

