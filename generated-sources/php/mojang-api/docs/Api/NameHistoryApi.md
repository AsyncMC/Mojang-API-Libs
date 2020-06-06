# OpenAPI\Client\NameHistoryApi

All URIs are relative to *https://api.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findUniqueIdsByName**](NameHistoryApi.md#findUniqueIdsByName) | **POST** /profiles/minecraft | Find the current UUID of multiple players at once
[**getNameHistory**](NameHistoryApi.md#getNameHistory) | **GET** /user/profiles/{stripped_uuid}/names | Gets the full player&#39;s name history
[**getUniqueIdByName**](NameHistoryApi.md#getUniqueIdByName) | **GET** /users/profiles/minecraft/{username} | Find the UUID by name


# **findUniqueIdsByName**
> \OpenAPI\Client\Model\CurrentPlayerIDs[] findUniqueIdsByName($request_body)

Find the current UUID of multiple players at once

Find the current players name, UUID, demo status and migration flag by the current players name. The \"at\" parameter is not supported. Players not found are not returned. If no players are found, an empty array is returned.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new OpenAPI\Client\Api\NameHistoryApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$request_body = [ "joserobjr", "nonExistingPlayer", "maksimkurb" ]; // string[] | Array with the player names

try {
    $result = $apiInstance->findUniqueIdsByName($request_body);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling NameHistoryApi->findUniqueIdsByName: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request_body** | [**string[]**](../Model/array.md)| Array with the player names |

### Return type

[**\OpenAPI\Client\Model\CurrentPlayerIDs[]**](../Model/CurrentPlayerIDs.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getNameHistory**
> \OpenAPI\Client\Model\NameChange[] getNameHistory($stripped_uuid)

Gets the full player's name history

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new OpenAPI\Client\Api\NameHistoryApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$stripped_uuid = 38ba542eb5924231a54cca0f2eac2b54; // string | The player UUID without hyphens

try {
    $result = $apiInstance->getNameHistory($stripped_uuid);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling NameHistoryApi->getNameHistory: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stripped_uuid** | **string**| The player UUID without hyphens |

### Return type

[**\OpenAPI\Client\Model\NameChange[]**](../Model/NameChange.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **getUniqueIdByName**
> \OpenAPI\Client\Model\CurrentPlayerIDs getUniqueIdByName($username, $at)

Find the UUID by name

Find the current player name, UUID, demo status and migration flag by the current player name or at a given time.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new OpenAPI\Client\Api\NameHistoryApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$username = LordofMC_Playerz; // string | The username in a given time, or in present if \"at\" is not sent
$at = 1448533942; // int | Find the username in a given time, when 0 selects the original name however, it only works if the name was changed at least once, or if the account is legacy. The time is an UNIX timestamp (without milliseconds)

try {
    $result = $apiInstance->getUniqueIdByName($username, $at);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling NameHistoryApi->getUniqueIdByName: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **string**| The username in a given time, or in present if \&quot;at\&quot; is not sent |
 **at** | **int**| Find the username in a given time, when 0 selects the original name however, it only works if the name was changed at least once, or if the account is legacy. The time is an UNIX timestamp (without milliseconds) | [optional]

### Return type

[**\OpenAPI\Client\Model\CurrentPlayerIDs**](../Model/CurrentPlayerIDs.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

