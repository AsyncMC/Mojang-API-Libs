# com.github.asyncmc.mojang.api.php.symfony.server\com.github.asyncmc.mojang.api.php.symfony.api\SkinOperationsApiInterface

All URIs are relative to *https://api.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**changePlayerSkin**](SkinOperationsApiInterface.md#changePlayerSkin) | **POST** /user/profile/{stripped_uuid}/skin | Changes the player skin by URL
[**resetPlayerSkin**](SkinOperationsApiInterface.md#resetPlayerSkin) | **DELETE** /user/profile/{stripped_uuid}/skin | Resets the player skin to default
[**uploadPlayerSkin**](SkinOperationsApiInterface.md#uploadPlayerSkin) | **PUT** /user/profile/{stripped_uuid}/skin | Changes the player skin by upload


## Service Declaration
```yaml
# src/Acme/MyBundle/Resources/services.yml
services:
    # ...
    acme.my_bundle.api.skinOperations:
        class: Acme\MyBundle\Api\SkinOperationsApi
        tags:
            - { name: "open_apiserver.api", api: "skinOperations" }
    # ...
```

## **changePlayerSkin**
> changePlayerSkin($strippedUuid, $url, $model)

Changes the player skin by URL

This will set the skin for the selected profile, but Mojang's servers will fetch the skin from a URL. This will also work for legacy accounts.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/SkinOperationsApiInterface.php

namespace Acme\MyBundle\Api;

use com.github.asyncmc.mojang.api.php.symfony.server\com.github.asyncmc.mojang.api.php.symfony.api\SkinOperationsApiInterface;

class SkinOperationsApi implements SkinOperationsApiInterface
{

    // ...

    /**
     * Implementation of SkinOperationsApiInterface#changePlayerSkin
     */
    public function changePlayerSkin($strippedUuid, $url, SkinModel $model = null)
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
 **url** | **string**| The URL which Mojang servers will download and apply the skin |
 **model** | [**com.github.asyncmc.mojang.api.php.symfony.server\com.github.asyncmc.mojang.api.php.symfony.model\SkinModel**](../Model/SkinModel.md)|  | [optional]

### Return type

void (empty response body)

### Authorization

[PlayerAccessToken](../../README.md#PlayerAccessToken)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **resetPlayerSkin**
> resetPlayerSkin($strippedUuid)

Resets the player skin to default

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/SkinOperationsApiInterface.php

namespace Acme\MyBundle\Api;

use com.github.asyncmc.mojang.api.php.symfony.server\com.github.asyncmc.mojang.api.php.symfony.api\SkinOperationsApiInterface;

class SkinOperationsApi implements SkinOperationsApiInterface
{

    // ...

    /**
     * Implementation of SkinOperationsApiInterface#resetPlayerSkin
     */
    public function resetPlayerSkin($strippedUuid)
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

void (empty response body)

### Authorization

[PlayerAccessToken](../../README.md#PlayerAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **uploadPlayerSkin**
> uploadPlayerSkin($strippedUuid, $file, $model)

Changes the player skin by upload

This uploads a skin to Mojang's servers. It also sets the users skin. This works on legacy counts as well.

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/SkinOperationsApiInterface.php

namespace Acme\MyBundle\Api;

use com.github.asyncmc.mojang.api.php.symfony.server\com.github.asyncmc.mojang.api.php.symfony.api\SkinOperationsApiInterface;

class SkinOperationsApi implements SkinOperationsApiInterface
{

    // ...

    /**
     * Implementation of SkinOperationsApiInterface#uploadPlayerSkin
     */
    public function uploadPlayerSkin($strippedUuid, UploadedFile $file, SkinModel $model = null)
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
 **file** | **UploadedFile****UploadedFile**| The skin image in PNG format |
 **model** | [**com.github.asyncmc.mojang.api.php.symfony.server\com.github.asyncmc.mojang.api.php.symfony.model\SkinModel**](../Model/SkinModel.md)|  | [optional]

### Return type

void (empty response body)

### Authorization

[PlayerAccessToken](../../README.md#PlayerAccessToken)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

