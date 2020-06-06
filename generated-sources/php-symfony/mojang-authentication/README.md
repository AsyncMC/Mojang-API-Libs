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
        new com.github.asyncmc.mojang.authentication.php.symfony.server\OpenAPIServerBundle(),
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
// src/Acme/MyBundle/Api/DefaultApiInterface.php

namespace Acme\MyBundle\Api;

use com.github.asyncmc.mojang.authentication.php.symfony.server\com.github.asyncmc.mojang.authentication.php.symfony.api\DefaultApiInterface;

class DefaultApi implements DefaultApiInterface // An interface is autogenerated
{

    // Other operation methods ...
}
```

Step 5: Tag your API implementation:

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

Now you can start using the bundle!


## Documentation for API Endpoints

All URIs are relative to *https://authserver.mojang.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApiInterface* | [**authenticate**](Resources\docs\Api/DefaultApiInterface.md#authenticate) | **POST** /authenticate | 
*DefaultApiInterface* | [**invalidate**](Resources\docs\Api/DefaultApiInterface.md#invalidate) | **POST** /invalidate | 
*DefaultApiInterface* | [**refresh**](Resources\docs\Api/DefaultApiInterface.md#refresh) | **POST** /refresh | 
*DefaultApiInterface* | [**siginout**](Resources\docs\Api/DefaultApiInterface.md#siginout) | **POST** /signout | 
*DefaultApiInterface* | [**validate**](Resources\docs\Api/DefaultApiInterface.md#validate) | **POST** /validate | 


## Documentation For Models

 - [AccessKeys](Resources\docs\Model/AccessKeys.md)
 - [Agent](Resources\docs\Model/Agent.md)
 - [Authentication](Resources\docs\Model/Authentication.md)
 - [AuthenticationRequest](Resources\docs\Model/AuthenticationRequest.md)
 - [Error](Resources\docs\Model/Error.md)
 - [GameProfile](Resources\docs\Model/GameProfile.md)
 - [GameProfileProperty](Resources\docs\Model/GameProfileProperty.md)
 - [PrivateUserData](Resources\docs\Model/PrivateUserData.md)
 - [ProfileId](Resources\docs\Model/ProfileId.md)
 - [ReducedUserData](Resources\docs\Model/ReducedUserData.md)
 - [RefreshRequest](Resources\docs\Model/RefreshRequest.md)
 - [RefreshResponse](Resources\docs\Model/RefreshResponse.md)
 - [UsernamePassword](Resources\docs\Model/UsernamePassword.md)


## Documentation For Authorization

 All endpoints do not require authorization.


## Author



