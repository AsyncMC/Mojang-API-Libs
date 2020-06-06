# com.github.asyncmc.mojang.api.php.server\SecurityQuestionAnswerApi

All URIs are relative to *https://api.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**checkSecurityStatus**](SecurityQuestionAnswerApi.md#checkSecurityStatus) | **GET** /user/security/location | Check if security questions are needed
[**listPendingSecurityQuestions**](SecurityQuestionAnswerApi.md#listPendingSecurityQuestions) | **GET** /user/security/challenges | Get list of questions
[**sendSecurityQuestionAnswers**](SecurityQuestionAnswerApi.md#sendSecurityQuestionAnswers) | **POST** /user/security/location | Send back the answers


# **checkSecurityStatus**
> checkSecurityStatus()

Check if security questions are needed

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: PlayerAccessToken
$config = com.github.asyncmc.mojang.api.php.server\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');

$apiInstance = new com.github.asyncmc.mojang.api.php.server\Api\SecurityQuestionAnswerApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);

try {
    $apiInstance->checkSecurityStatus();
} catch (Exception $e) {
    echo 'Exception when calling SecurityQuestionAnswerApi->checkSecurityStatus: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters
This endpoint does not need any parameter.

### Return type

void (empty response body)

### Authorization

[PlayerAccessToken](../../README.md#PlayerAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **listPendingSecurityQuestions**
> \com.github.asyncmc.mojang.api.php.server\com.github.asyncmc.mojang.api.php.model\SecurityChallenge[] listPendingSecurityQuestions()

Get list of questions

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: PlayerAccessToken
$config = com.github.asyncmc.mojang.api.php.server\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');

$apiInstance = new com.github.asyncmc.mojang.api.php.server\Api\SecurityQuestionAnswerApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);

try {
    $result = $apiInstance->listPendingSecurityQuestions();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling SecurityQuestionAnswerApi->listPendingSecurityQuestions: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**\com.github.asyncmc.mojang.api.php.server\com.github.asyncmc.mojang.api.php.model\SecurityChallenge[]**](../Model/SecurityChallenge.md)

### Authorization

[PlayerAccessToken](../../README.md#PlayerAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **sendSecurityQuestionAnswers**
> sendSecurityQuestionAnswers($security_answer)

Send back the answers

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure HTTP basic authorization: PlayerAccessToken
$config = com.github.asyncmc.mojang.api.php.server\Configuration::getDefaultConfiguration()
              ->setUsername('YOUR_USERNAME')
              ->setPassword('YOUR_PASSWORD');

$apiInstance = new com.github.asyncmc.mojang.api.php.server\Api\SecurityQuestionAnswerApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$security_answer = array(new \com.github.asyncmc.mojang.api.php.server\com.github.asyncmc.mojang.api.php.model\array()); // \com.github.asyncmc.mojang.api.php.server\com.github.asyncmc.mojang.api.php.model\SecurityAnswer[] | An array with all the answers

try {
    $apiInstance->sendSecurityQuestionAnswers($security_answer);
} catch (Exception $e) {
    echo 'Exception when calling SecurityQuestionAnswerApi->sendSecurityQuestionAnswers: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **security_answer** | [**\com.github.asyncmc.mojang.api.php.server\com.github.asyncmc.mojang.api.php.model\SecurityAnswer[]**](../Model/array.md)| An array with all the answers |

### Return type

void (empty response body)

### Authorization

[PlayerAccessToken](../../README.md#PlayerAccessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

