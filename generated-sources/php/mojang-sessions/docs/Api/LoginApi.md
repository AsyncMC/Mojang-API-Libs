# com.github.asyncmc.mojang.sessions.php.server\LoginApi

All URIs are relative to *https://sessionserver.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPlayerProfile**](LoginApi.md#getPlayerProfile) | **GET** /session/minecraft/profile/{stripped_uuid} | Gets the player&#39;s game profile


# **getPlayerProfile**
> \com.github.asyncmc.mojang.sessions.php.server\com.github.asyncmc.mojang.sessions.php.model\PlayerProfile getPlayerProfile($stripped_uuid, $unsigned)

Gets the player's game profile

This will return the player's username plus any additional information about them (e.g. skins). This has a much stricter rate limit: You can request the same profile once per minute, however you can send as many unique requests as you like.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new com.github.asyncmc.mojang.sessions.php.server\Api\LoginApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$stripped_uuid = 853c80ef3c3749fdaa49938b674adae6; // string | The player UUID without hyphens
$unsigned = True; // bool | When set to false, the signature data are sent

try {
    $result = $apiInstance->getPlayerProfile($stripped_uuid, $unsigned);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling LoginApi->getPlayerProfile: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stripped_uuid** | **string**| The player UUID without hyphens |
 **unsigned** | **bool**| When set to false, the signature data are sent | [optional]

### Return type

[**\com.github.asyncmc.mojang.sessions.php.server\com.github.asyncmc.mojang.sessions.php.model\PlayerProfile**](../Model/PlayerProfile.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

