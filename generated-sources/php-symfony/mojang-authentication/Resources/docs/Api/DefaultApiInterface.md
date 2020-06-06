# com.github.asyncmc.mojang.authentication.php.symfony.server\com.github.asyncmc.mojang.authentication.php.symfony.api\DefaultApiInterface

All URIs are relative to *https://authserver.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authenticate**](DefaultApiInterface.md#authenticate) | **POST** /authenticate | 
[**invalidate**](DefaultApiInterface.md#invalidate) | **POST** /invalidate | 
[**refresh**](DefaultApiInterface.md#refresh) | **POST** /refresh | 
[**siginout**](DefaultApiInterface.md#siginout) | **POST** /signout | 
[**validate**](DefaultApiInterface.md#validate) | **POST** /validate | 


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

## **authenticate**
> com.github.asyncmc.mojang.authentication.php.symfony.server\com.github.asyncmc.mojang.authentication.php.symfony.model\Authentication authenticate($authenticationRequest)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/DefaultApiInterface.php

namespace Acme\MyBundle\Api;

use com.github.asyncmc.mojang.authentication.php.symfony.server\com.github.asyncmc.mojang.authentication.php.symfony.api\DefaultApiInterface;

class DefaultApi implements DefaultApiInterface
{

    // ...

    /**
     * Implementation of DefaultApiInterface#authenticate
     */
    public function authenticate(AuthenticationRequest $authenticationRequest)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authenticationRequest** | [**com.github.asyncmc.mojang.authentication.php.symfony.server\com.github.asyncmc.mojang.authentication.php.symfony.model\AuthenticationRequest**](../Model/AuthenticationRequest.md)|  |

### Return type

[**com.github.asyncmc.mojang.authentication.php.symfony.server\com.github.asyncmc.mojang.authentication.php.symfony.model\Authentication**](../Model/Authentication.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **invalidate**
> invalidate($accessKeys)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/DefaultApiInterface.php

namespace Acme\MyBundle\Api;

use com.github.asyncmc.mojang.authentication.php.symfony.server\com.github.asyncmc.mojang.authentication.php.symfony.api\DefaultApiInterface;

class DefaultApi implements DefaultApiInterface
{

    // ...

    /**
     * Implementation of DefaultApiInterface#invalidate
     */
    public function invalidate(AccessKeys $accessKeys)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessKeys** | [**com.github.asyncmc.mojang.authentication.php.symfony.server\com.github.asyncmc.mojang.authentication.php.symfony.model\AccessKeys**](../Model/AccessKeys.md)|  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **refresh**
> com.github.asyncmc.mojang.authentication.php.symfony.server\com.github.asyncmc.mojang.authentication.php.symfony.model\RefreshResponse refresh($refreshRequest)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/DefaultApiInterface.php

namespace Acme\MyBundle\Api;

use com.github.asyncmc.mojang.authentication.php.symfony.server\com.github.asyncmc.mojang.authentication.php.symfony.api\DefaultApiInterface;

class DefaultApi implements DefaultApiInterface
{

    // ...

    /**
     * Implementation of DefaultApiInterface#refresh
     */
    public function refresh(RefreshRequest $refreshRequest)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **refreshRequest** | [**com.github.asyncmc.mojang.authentication.php.symfony.server\com.github.asyncmc.mojang.authentication.php.symfony.model\RefreshRequest**](../Model/RefreshRequest.md)|  |

### Return type

[**com.github.asyncmc.mojang.authentication.php.symfony.server\com.github.asyncmc.mojang.authentication.php.symfony.model\RefreshResponse**](../Model/RefreshResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **siginout**
> siginout($usernamePassword)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/DefaultApiInterface.php

namespace Acme\MyBundle\Api;

use com.github.asyncmc.mojang.authentication.php.symfony.server\com.github.asyncmc.mojang.authentication.php.symfony.api\DefaultApiInterface;

class DefaultApi implements DefaultApiInterface
{

    // ...

    /**
     * Implementation of DefaultApiInterface#siginout
     */
    public function siginout(UsernamePassword $usernamePassword)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **usernamePassword** | [**com.github.asyncmc.mojang.authentication.php.symfony.server\com.github.asyncmc.mojang.authentication.php.symfony.model\UsernamePassword**](../Model/UsernamePassword.md)|  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **validate**
> validate($accessKeys)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/DefaultApiInterface.php

namespace Acme\MyBundle\Api;

use com.github.asyncmc.mojang.authentication.php.symfony.server\com.github.asyncmc.mojang.authentication.php.symfony.api\DefaultApiInterface;

class DefaultApi implements DefaultApiInterface
{

    // ...

    /**
     * Implementation of DefaultApiInterface#validate
     */
    public function validate(AccessKeys $accessKeys)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessKeys** | [**com.github.asyncmc.mojang.authentication.php.symfony.server\com.github.asyncmc.mojang.authentication.php.symfony.model\AccessKeys**](../Model/AccessKeys.md)|  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

