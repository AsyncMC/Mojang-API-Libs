# OpenAPI\Client\SkinOperationsApi

All URIs are relative to *https://api.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**changePlayerSkin**](SkinOperationsApi.md#changePlayerSkin) | **POST** /user/profile/{stripped_uuid}/skin | Changes the player skin by URL
[**resetPlayerSkin**](SkinOperationsApi.md#resetPlayerSkin) | **DELETE** /user/profile/{stripped_uuid}/skin | Resets the player skin to default
[**uploadPlayerSkin**](SkinOperationsApi.md#uploadPlayerSkin) | **PUT** /user/profile/{stripped_uuid}/skin | Changes the player skin by upload


# **changePlayerSkin**
> changePlayerSkin($stripped_uuid, $url, $model)

Changes the player skin by URL

This will set the skin for the selected profile, but Mojang's servers will fetch the skin from a URL. This will also work for legacy accounts.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: PlayerAccessToken
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');

$apiInstance = new OpenAPI\Client\Api\SkinOperationsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$stripped_uuid = 38ba542eb5924231a54cca0f2eac2b54; // string | The player UUID without hyphens
$url = 'url_example'; // string | The URL which Mojang servers will download and apply the skin
$model = new \OpenAPI\Client\Model\SkinModel(); // \OpenAPI\Client\Model\SkinModel | 

try {
    $apiInstance->changePlayerSkin($stripped_uuid, $url, $model);
} catch (Exception $e) {
    echo 'Exception when calling SkinOperationsApi->changePlayerSkin: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stripped_uuid** | **string**| The player UUID without hyphens |
 **url** | **string**| The URL which Mojang servers will download and apply the skin |
 **model** | [**\OpenAPI\Client\Model\SkinModel**](../Model/SkinModel.md)|  | [optional]

### Return type

void (empty response body)

### Authorization

[PlayerAccessToken](../../README.md#PlayerAccessToken)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **resetPlayerSkin**
> resetPlayerSkin($stripped_uuid)

Resets the player skin to default

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: PlayerAccessToken
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');

$apiInstance = new OpenAPI\Client\Api\SkinOperationsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$stripped_uuid = 38ba542eb5924231a54cca0f2eac2b54; // string | The player UUID without hyphens

try {
    $apiInstance->resetPlayerSkin($stripped_uuid);
} catch (Exception $e) {
    echo 'Exception when calling SkinOperationsApi->resetPlayerSkin: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stripped_uuid** | **string**| The player UUID without hyphens |

### Return type

void (empty response body)

### Authorization

[PlayerAccessToken](../../README.md#PlayerAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **uploadPlayerSkin**
> uploadPlayerSkin($stripped_uuid, $file, $model)

Changes the player skin by upload

This uploads a skin to Mojang's servers. It also sets the users skin. This works on legacy counts as well.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: PlayerAccessToken
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');

$apiInstance = new OpenAPI\Client\Api\SkinOperationsApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$stripped_uuid = 38ba542eb5924231a54cca0f2eac2b54; // string | The player UUID without hyphens
$file = "/path/to/file.txt"; // \SplFileObject | The skin image in PNG format
$model = new \OpenAPI\Client\Model\SkinModel(); // \OpenAPI\Client\Model\SkinModel | 

try {
    $apiInstance->uploadPlayerSkin($stripped_uuid, $file, $model);
} catch (Exception $e) {
    echo 'Exception when calling SkinOperationsApi->uploadPlayerSkin: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stripped_uuid** | **string**| The player UUID without hyphens |
 **file** | **\SplFileObject****\SplFileObject**| The skin image in PNG format |
 **model** | [**\OpenAPI\Client\Model\SkinModel**](../Model/SkinModel.md)|  | [optional]

### Return type

void (empty response body)

### Authorization

[PlayerAccessToken](../../README.md#PlayerAccessToken)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

