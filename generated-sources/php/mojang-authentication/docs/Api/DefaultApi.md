# com.github.asyncmc.mojang.authentication.php.server\DefaultApi

All URIs are relative to *https://authserver.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authenticate**](DefaultApi.md#authenticate) | **POST** /authenticate | 
[**invalidate**](DefaultApi.md#invalidate) | **POST** /invalidate | 
[**refresh**](DefaultApi.md#refresh) | **POST** /refresh | 
[**siginout**](DefaultApi.md#siginout) | **POST** /signout | 
[**validate**](DefaultApi.md#validate) | **POST** /validate | 


# **authenticate**
> \com.github.asyncmc.mojang.authentication.php.server\com.github.asyncmc.mojang.authentication.php.model\Authentication authenticate($authentication_request)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new com.github.asyncmc.mojang.authentication.php.server\Api\DefaultApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$authentication_request = new \com.github.asyncmc.mojang.authentication.php.server\com.github.asyncmc.mojang.authentication.php.model\AuthenticationRequest(); // \com.github.asyncmc.mojang.authentication.php.server\com.github.asyncmc.mojang.authentication.php.model\AuthenticationRequest | 

try {
    $result = $apiInstance->authenticate($authentication_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DefaultApi->authenticate: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authentication_request** | [**\com.github.asyncmc.mojang.authentication.php.server\com.github.asyncmc.mojang.authentication.php.model\AuthenticationRequest**](../Model/AuthenticationRequest.md)|  |

### Return type

[**\com.github.asyncmc.mojang.authentication.php.server\com.github.asyncmc.mojang.authentication.php.model\Authentication**](../Model/Authentication.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **invalidate**
> invalidate($access_keys)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new com.github.asyncmc.mojang.authentication.php.server\Api\DefaultApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$access_keys = new \com.github.asyncmc.mojang.authentication.php.server\com.github.asyncmc.mojang.authentication.php.model\AccessKeys(); // \com.github.asyncmc.mojang.authentication.php.server\com.github.asyncmc.mojang.authentication.php.model\AccessKeys | 

try {
    $apiInstance->invalidate($access_keys);
} catch (Exception $e) {
    echo 'Exception when calling DefaultApi->invalidate: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_keys** | [**\com.github.asyncmc.mojang.authentication.php.server\com.github.asyncmc.mojang.authentication.php.model\AccessKeys**](../Model/AccessKeys.md)|  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **refresh**
> \com.github.asyncmc.mojang.authentication.php.server\com.github.asyncmc.mojang.authentication.php.model\RefreshResponse refresh($refresh_request)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new com.github.asyncmc.mojang.authentication.php.server\Api\DefaultApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$refresh_request = new \com.github.asyncmc.mojang.authentication.php.server\com.github.asyncmc.mojang.authentication.php.model\RefreshRequest(); // \com.github.asyncmc.mojang.authentication.php.server\com.github.asyncmc.mojang.authentication.php.model\RefreshRequest | 

try {
    $result = $apiInstance->refresh($refresh_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling DefaultApi->refresh: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **refresh_request** | [**\com.github.asyncmc.mojang.authentication.php.server\com.github.asyncmc.mojang.authentication.php.model\RefreshRequest**](../Model/RefreshRequest.md)|  |

### Return type

[**\com.github.asyncmc.mojang.authentication.php.server\com.github.asyncmc.mojang.authentication.php.model\RefreshResponse**](../Model/RefreshResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **siginout**
> siginout($username_password)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new com.github.asyncmc.mojang.authentication.php.server\Api\DefaultApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$username_password = new \com.github.asyncmc.mojang.authentication.php.server\com.github.asyncmc.mojang.authentication.php.model\UsernamePassword(); // \com.github.asyncmc.mojang.authentication.php.server\com.github.asyncmc.mojang.authentication.php.model\UsernamePassword | 

try {
    $apiInstance->siginout($username_password);
} catch (Exception $e) {
    echo 'Exception when calling DefaultApi->siginout: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username_password** | [**\com.github.asyncmc.mojang.authentication.php.server\com.github.asyncmc.mojang.authentication.php.model\UsernamePassword**](../Model/UsernamePassword.md)|  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **validate**
> validate($access_keys)



### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new com.github.asyncmc.mojang.authentication.php.server\Api\DefaultApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$access_keys = new \com.github.asyncmc.mojang.authentication.php.server\com.github.asyncmc.mojang.authentication.php.model\AccessKeys(); // \com.github.asyncmc.mojang.authentication.php.server\com.github.asyncmc.mojang.authentication.php.model\AccessKeys | 

try {
    $apiInstance->validate($access_keys);
} catch (Exception $e) {
    echo 'Exception when calling DefaultApi->validate: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_keys** | [**\com.github.asyncmc.mojang.authentication.php.server\com.github.asyncmc.mojang.authentication.php.model\AccessKeys**](../Model/AccessKeys.md)|  |

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

