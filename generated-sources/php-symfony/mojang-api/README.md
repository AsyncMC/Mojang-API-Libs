# OpenAPIServer
No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

This [Symfony](https://symfony.com/) bundle is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 2020-06-05
- Build package: org.openapitools.codegen.languages.PhpSymfonyServerCodegen

## Requirements

PHP 5.4.0 and later

## Installation & Usage

To install the dependencies via [Composer](http://getcomposer.org/), add the following repository to `composer.json` of your Symfony project:

```json
{
    "repositories": [{
        "type": "path",
        "url": "//Path to your generated openapi bundle"
    }],
}
```

Then run:

```
composer require openapi/server-bundle:dev-master
```

to add the generated openapi bundle as a dependency.

## Tests

To run the unit tests for the generated bundle, first navigate to the directory containing the code, then run the following commands:

```
composer install
./vendor/bin/phpunit
```


## Getting Started

Step 1: Please follow the [installation procedure](#installation--usage) first.

Step 2: Enable the bundle in the kernel:

```php
<?php
// app/AppKernel.php

public function registerBundles()
{
    $bundles = array(
        // ...
        new com.github.asyncmc.mojang.api.php.symfony.server\OpenAPIServerBundle(),
        // ...
    );
}
```

Step 3: Register the routes:

```yaml
# app/config/routing.yml
open_apiserver:
    resource: "@OpenAPIServerBundle/Resources/config/routing.yml"
```

Step 4: Implement the API calls:

```php
<?php
// src/Acme/MyBundle/Api/MiscellaneousApiInterface.php

namespace Acme\MyBundle\Api;

use com.github.asyncmc.mojang.api.php.symfony.server\com.github.asyncmc.mojang.api.php.symfony.api\MiscellaneousApiInterface;

class MiscellaneousApi implements MiscellaneousApiInterface // An interface is autogenerated
{

    /**
     * Implementation of MiscellaneousApiInterface#getOrdersStatistics
     */
    public function getOrdersStatistics(OrderStatisticsRequest $orderStatisticsRequest)
    {
        // Implement the operation ...
    }

    // Other operation methods ...
}
```

Step 5: Tag your API implementation:

```yaml
# src/Acme/MyBundle/Resources/services.yml
services:
    # ...
    acme.my_bundle.api.miscellaneous:
        class: Acme\MyBundle\Api\MiscellaneousApi
        tags:
            - { name: "open_apiserver.api", api: "miscellaneous" }
    # ...
```

Now you can start using the bundle!


## Documentation for API Endpoints

All URIs are relative to *https://api.mojang.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*MiscellaneousApiInterface* | [**getOrdersStatistics**](Resources\docs\Api/MiscellaneousApiInterface.md#getordersstatistics) | **POST** /orders/statistics | Get statistics on the sales of Minecraft.
*NameHistoryApiInterface* | [**findUniqueIdsByName**](Resources\docs\Api/NameHistoryApiInterface.md#finduniqueidsbyname) | **POST** /profiles/minecraft | Find the current UUID of multiple players at once
*NameHistoryApiInterface* | [**getNameHistory**](Resources\docs\Api/NameHistoryApiInterface.md#getnamehistory) | **GET** /user/profiles/{stripped_uuid}/names | Gets the full player&#39;s name history
*NameHistoryApiInterface* | [**getUniqueIdByName**](Resources\docs\Api/NameHistoryApiInterface.md#getuniqueidbyname) | **GET** /users/profiles/minecraft/{username} | Find the UUID by name
*SecurityQuestionAnswerApiInterface* | [**checkSecurityStatus**](Resources\docs\Api/SecurityQuestionAnswerApiInterface.md#checksecuritystatus) | **GET** /user/security/location | Check if security questions are needed
*SecurityQuestionAnswerApiInterface* | [**listPendingSecurityQuestions**](Resources\docs\Api/SecurityQuestionAnswerApiInterface.md#listpendingsecurityquestions) | **GET** /user/security/challenges | Get list of questions
*SecurityQuestionAnswerApiInterface* | [**sendSecurityQuestionAnswers**](Resources\docs\Api/SecurityQuestionAnswerApiInterface.md#sendsecurityquestionanswers) | **POST** /user/security/location | Send back the answers
*SkinOperationsApiInterface* | [**changePlayerSkin**](Resources\docs\Api/SkinOperationsApiInterface.md#changeplayerskin) | **POST** /user/profile/{stripped_uuid}/skin | Changes the player skin by URL
*SkinOperationsApiInterface* | [**resetPlayerSkin**](Resources\docs\Api/SkinOperationsApiInterface.md#resetplayerskin) | **DELETE** /user/profile/{stripped_uuid}/skin | Resets the player skin to default
*SkinOperationsApiInterface* | [**uploadPlayerSkin**](Resources\docs\Api/SkinOperationsApiInterface.md#uploadplayerskin) | **PUT** /user/profile/{stripped_uuid}/skin | Changes the player skin by upload


## Documentation For Models

 - [ChangeSkinRequest](Resources\docs\Model/ChangeSkinRequest.md)
 - [CurrentPlayerIDs](Resources\docs\Model/CurrentPlayerIDs.md)
 - [Error](Resources\docs\Model/Error.md)
 - [NameChange](Resources\docs\Model/NameChange.md)
 - [OrderStatistic](Resources\docs\Model/OrderStatistic.md)
 - [OrderStatisticsRequest](Resources\docs\Model/OrderStatisticsRequest.md)
 - [OrderStatisticsResponse](Resources\docs\Model/OrderStatisticsResponse.md)
 - [SecurityAnswer](Resources\docs\Model/SecurityAnswer.md)
 - [SecurityAnswerId](Resources\docs\Model/SecurityAnswerId.md)
 - [SecurityChallenge](Resources\docs\Model/SecurityChallenge.md)
 - [SecurityQuestion](Resources\docs\Model/SecurityQuestion.md)
 - [SkinModel](Resources\docs\Model/SkinModel.md)
 - [UploadSkinRequest](Resources\docs\Model/UploadSkinRequest.md)


## Documentation For Authorization


## MojangStatisticsToken

- **Type**: HTTP basic authentication

## PlayerAccessToken

- **Type**: HTTP basic authentication


## Author



