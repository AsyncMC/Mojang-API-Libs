# php-base - PHP Slim Server library for Mojang API

[Slim Framework Documentation](https://www.slimframework.com/docs/)

## Requirements

* Web server with URL rewriting
* PHP 5.5.9 or newer

This package contains `.htaccess` for Apache configuration.
If you use another server(Nginx, HHVM, IIS, lighttpd) check out [Web Servers](https://www.slimframework.com/docs/v3/start/web-servers.html) doc.

## Installation via [Composer](https://getcomposer.org/)

Navigate into your project's root directory and execute the bash command shown below.
This command downloads the Slim Framework and its third-party dependencies into your project's `vendor/` directory.
```bash
$ composer install
```

## Start devserver

Run the following command in terminal to start localhost web server, assuming `./php-slim-server/` is public-accessible directory with `index.php` file:
```bash
$ php -S localhost:8888 -t php-slim-server
```
> **Warning** This web server was designed to aid application development.
> It may also be useful for testing purposes or for application demonstrations that are run in controlled environments.
> It is not intended to be a full-featured web server. It should not be used on a public network.

## Run tests

This package uses PHPUnit 4.8 for unit testing and PHP Codesniffer to check source code against user defined coding standard(`phpcsStandard` generator config option).
[Test folder](test) contains templates which you can fill with real test assertions.
How to write tests read at [PHPUnit Manual - Chapter 2. Writing Tests for PHPUnit](https://phpunit.de/manual/4.8/en/writing-tests-for-phpunit.html).
How to configure PHP CodeSniffer read at [PHP CodeSniffer Documentation](https://github.com/squizlabs/PHP_CodeSniffer/wiki).
There is [phplint](https://github.com/overtrue/phplint) tool to check php syntax automatically.

Command | Tool | Target
---- | ---- | ----
`$ composer test` | PHPUnit | All tests
`$ composer run test-apis` | PHPUnit | Apis tests
`$ composer run test-models` | PHPUnit | Models tests
`$ composer run phpcs` | PHP CodeSniffer | All files
`$ composer run phplint` | phplint | All files


## API Endpoints

All URIs are relative to *https://api.mojang.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*MiscellaneousApi* | **getOrdersStatistics** | **POST** /orders/statistics | Get statistics on the sales of Minecraft.
*NameHistoryApi* | **findUniqueIdsByName** | **POST** /profiles/minecraft | Find the current UUID of multiple players at once
*NameHistoryApi* | **getNameHistory** | **GET** /user/profiles/{stripped_uuid}/names | Gets the full player's name history
*NameHistoryApi* | **getUniqueIdByName** | **GET** /users/profiles/minecraft/{username} | Find the UUID by name
*SecurityQuestionAnswerApi* | **checkSecurityStatus** | **GET** /user/security/location | Check if security questions are needed
*SecurityQuestionAnswerApi* | **listPendingSecurityQuestions** | **GET** /user/security/challenges | Get list of questions
*SecurityQuestionAnswerApi* | **sendSecurityQuestionAnswers** | **POST** /user/security/location | Send back the answers
*SkinOperationsApi* | **changePlayerSkin** | **POST** /user/profile/{stripped_uuid}/skin | Changes the player skin by URL
*SkinOperationsApi* | **resetPlayerSkin** | **DELETE** /user/profile/{stripped_uuid}/skin | Resets the player skin to default
*SkinOperationsApi* | **uploadPlayerSkin** | **PUT** /user/profile/{stripped_uuid}/skin | Changes the player skin by upload


## Models

* OpenAPIServer\Model\CurrentPlayerIDs
* OpenAPIServer\Model\Error
* OpenAPIServer\Model\InlineObject
* OpenAPIServer\Model\InlineObject1
* OpenAPIServer\Model\NameChange
* OpenAPIServer\Model\OrderStatistic
* OpenAPIServer\Model\OrderStatisticsRequest
* OpenAPIServer\Model\OrderStatisticsResponse
* OpenAPIServer\Model\SecurityAnswer
* OpenAPIServer\Model\SecurityAnswerId
* OpenAPIServer\Model\SecurityChallenge
* OpenAPIServer\Model\SecurityQuestion
* OpenAPIServer\Model\SkinModel


## Authentication

> Important! To make Basic Authentication work you need to implement `authenticator` function in [SlimRouter](lib/SlimRouter.php) class.
> Documentation [tuupola/slim-basic-auth](https://github.com/tuupola/slim-basic-auth#readme)
> Important! To make Basic Authentication work you need to implement `authenticator` function in [SlimRouter](lib/SlimRouter.php) class.
> Documentation [tuupola/slim-basic-auth](https://github.com/tuupola/slim-basic-auth#readme)
