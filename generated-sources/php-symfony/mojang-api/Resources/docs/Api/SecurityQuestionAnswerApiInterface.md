# OpenAPI\Server\Api\SecurityQuestionAnswerApiInterface

All URIs are relative to *https://api.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**checkSecurityStatus**](SecurityQuestionAnswerApiInterface.md#checkSecurityStatus) | **GET** /user/security/location | Check if security questions are needed
[**listPendingSecurityQuestions**](SecurityQuestionAnswerApiInterface.md#listPendingSecurityQuestions) | **GET** /user/security/challenges | Get list of questions
[**sendSecurityQuestionAnswers**](SecurityQuestionAnswerApiInterface.md#sendSecurityQuestionAnswers) | **POST** /user/security/location | Send back the answers


## Service Declaration
```yaml
# src/Acme/MyBundle/Resources/services.yml
services:
    # ...
    acme.my_bundle.api.securityQuestionAnswer:
        class: Acme\MyBundle\Api\SecurityQuestionAnswerApi
        tags:
            - { name: "open_apiserver.api", api: "securityQuestionAnswer" }
    # ...
```

## **checkSecurityStatus**
> checkSecurityStatus()

Check if security questions are needed

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/SecurityQuestionAnswerApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\SecurityQuestionAnswerApiInterface;

class SecurityQuestionAnswerApi implements SecurityQuestionAnswerApiInterface
{

    // ...

    /**
     * Implementation of SecurityQuestionAnswerApiInterface#checkSecurityStatus
     */
    public function checkSecurityStatus()
    {
        // Implement the operation ...
    }

    // ...
}
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

## **listPendingSecurityQuestions**
> OpenAPI\Server\Model\SecurityChallenge listPendingSecurityQuestions()

Get list of questions

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/SecurityQuestionAnswerApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\SecurityQuestionAnswerApiInterface;

class SecurityQuestionAnswerApi implements SecurityQuestionAnswerApiInterface
{

    // ...

    /**
     * Implementation of SecurityQuestionAnswerApiInterface#listPendingSecurityQuestions
     */
    public function listPendingSecurityQuestions()
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OpenAPI\Server\Model\SecurityChallenge**](../Model/SecurityChallenge.md)

### Authorization

[PlayerAccessToken](../../README.md#PlayerAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **sendSecurityQuestionAnswers**
> sendSecurityQuestionAnswers($securityAnswer)

Send back the answers

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/SecurityQuestionAnswerApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\SecurityQuestionAnswerApiInterface;

class SecurityQuestionAnswerApi implements SecurityQuestionAnswerApiInterface
{

    // ...

    /**
     * Implementation of SecurityQuestionAnswerApiInterface#sendSecurityQuestionAnswers
     */
    public function sendSecurityQuestionAnswers(array $securityAnswer)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **securityAnswer** | [**OpenAPI\Server\Model\SecurityAnswer**](../Model/array.md)| An array with all the answers |

### Return type

void (empty response body)

### Authorization

[PlayerAccessToken](../../README.md#PlayerAccessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

