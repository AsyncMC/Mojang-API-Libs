# php-base - PHP Slim Server library for Mojang Session API

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

All URIs are relative to *https://sessionserver.mojang.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BansApi* | **getBlockedServerHashes** | **GET** /blockedservers | A list of SHA1 hashes of banned servers
*LoginApi* | **getPlayerProfile** | **GET** /session/minecraft/profile/{stripped_uuid} | Gets the player's game profile


## Models

* com.github.asyncmc.mojang.sessions.php.slim.server\com.github.asyncmc.mojang.sessions.php.slim.model\PlayerProfile
* com.github.asyncmc.mojang.sessions.php.slim.server\com.github.asyncmc.mojang.sessions.php.slim.model\PlayerProfileProperty
* com.github.asyncmc.mojang.sessions.php.slim.server\com.github.asyncmc.mojang.sessions.php.slim.model\PlayerProfileTexturePropertyValue
* com.github.asyncmc.mojang.sessions.php.slim.server\com.github.asyncmc.mojang.sessions.php.slim.model\PlayerSkinMetadata
* com.github.asyncmc.mojang.sessions.php.slim.server\com.github.asyncmc.mojang.sessions.php.slim.model\PlayerSkinURL
* com.github.asyncmc.mojang.sessions.php.slim.server\com.github.asyncmc.mojang.sessions.php.slim.model\PlayerTexture
* com.github.asyncmc.mojang.sessions.php.slim.server\com.github.asyncmc.mojang.sessions.php.slim.model\PlayerTextureURL
* com.github.asyncmc.mojang.sessions.php.slim.server\com.github.asyncmc.mojang.sessions.php.slim.model\SessionApiError


