# php-base - PHP Slim Server library for Mojang Authentication API

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

All URIs are relative to *https://authserver.mojang.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | **authenticate** | **POST** /authenticate | 
*DefaultApi* | **invalidate** | **POST** /invalidate | 
*DefaultApi* | **refresh** | **POST** /refresh | 
*DefaultApi* | **siginout** | **POST** /signout | 
*DefaultApi* | **validate** | **POST** /validate | 


## Models

* com.github.asyncmc.mojang.authentication.php.slim.server\com.github.asyncmc.mojang.authentication.php.slim.model\AccessKeys
* com.github.asyncmc.mojang.authentication.php.slim.server\com.github.asyncmc.mojang.authentication.php.slim.model\Agent
* com.github.asyncmc.mojang.authentication.php.slim.server\com.github.asyncmc.mojang.authentication.php.slim.model\Authentication
* com.github.asyncmc.mojang.authentication.php.slim.server\com.github.asyncmc.mojang.authentication.php.slim.model\AuthenticationRequest
* com.github.asyncmc.mojang.authentication.php.slim.server\com.github.asyncmc.mojang.authentication.php.slim.model\Error
* com.github.asyncmc.mojang.authentication.php.slim.server\com.github.asyncmc.mojang.authentication.php.slim.model\GameProfile
* com.github.asyncmc.mojang.authentication.php.slim.server\com.github.asyncmc.mojang.authentication.php.slim.model\GameProfileProperty
* com.github.asyncmc.mojang.authentication.php.slim.server\com.github.asyncmc.mojang.authentication.php.slim.model\PrivateUserData
* com.github.asyncmc.mojang.authentication.php.slim.server\com.github.asyncmc.mojang.authentication.php.slim.model\ProfileId
* com.github.asyncmc.mojang.authentication.php.slim.server\com.github.asyncmc.mojang.authentication.php.slim.model\ReducedUserData
* com.github.asyncmc.mojang.authentication.php.slim.server\com.github.asyncmc.mojang.authentication.php.slim.model\RefreshRequest
* com.github.asyncmc.mojang.authentication.php.slim.server\com.github.asyncmc.mojang.authentication.php.slim.model\RefreshResponse
* com.github.asyncmc.mojang.authentication.php.slim.server\com.github.asyncmc.mojang.authentication.php.slim.model\UsernamePassword


