# org.openapitools.server - Kotlin Server library for Mojang Authentication API

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

Generated by OpenAPI Generator 3.3.4.

## Requires

* Kotlin 1.2.10
* Gradle 4.3

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Running

The server builds as a fat jar with a main entrypoint. To start the service, run `java -jar ./build/libs/mojang-authentication-kotlin-server.jar`.

You may also run in docker:

```
docker build -t mojang-authentication-kotlin-server .
docker run -p 8080:8080 mojang-authentication-kotlin-server
```

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs (see ktor documentation for more info).
* ~Supports collection formats for query parameters: csv, tsv, ssv, pipes.~
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://authserver.mojang.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**authenticate**](docs/DefaultApi.md#authenticate) | **POST** /authenticate | 
*DefaultApi* | [**invalidate**](docs/DefaultApi.md#invalidate) | **POST** /invalidate | 
*DefaultApi* | [**refresh**](docs/DefaultApi.md#refresh) | **POST** /refresh | 
*DefaultApi* | [**siginout**](docs/DefaultApi.md#siginout) | **POST** /signout | 
*DefaultApi* | [**validate**](docs/DefaultApi.md#validate) | **POST** /validate | 


<a name="documentation-for-models"></a>
## Documentation for Models

 - [com.github.asyncmc.mojang.authentication.kotlin.server.model.AccessKeys](docs/AccessKeys.md)
 - [com.github.asyncmc.mojang.authentication.kotlin.server.model.Agent](docs/Agent.md)
 - [com.github.asyncmc.mojang.authentication.kotlin.server.model.Authentication](docs/Authentication.md)
 - [com.github.asyncmc.mojang.authentication.kotlin.server.model.AuthenticationRequest](docs/AuthenticationRequest.md)
 - [com.github.asyncmc.mojang.authentication.kotlin.server.model.Error](docs/Error.md)
 - [com.github.asyncmc.mojang.authentication.kotlin.server.model.GameProfile](docs/GameProfile.md)
 - [com.github.asyncmc.mojang.authentication.kotlin.server.model.GameProfileProperty](docs/GameProfileProperty.md)
 - [com.github.asyncmc.mojang.authentication.kotlin.server.model.PrivateUserData](docs/PrivateUserData.md)
 - [com.github.asyncmc.mojang.authentication.kotlin.server.model.ProfileId](docs/ProfileId.md)
 - [com.github.asyncmc.mojang.authentication.kotlin.server.model.ReducedUserData](docs/ReducedUserData.md)
 - [com.github.asyncmc.mojang.authentication.kotlin.server.model.RefreshRequest](docs/RefreshRequest.md)
 - [com.github.asyncmc.mojang.authentication.kotlin.server.model.RefreshResponse](docs/RefreshResponse.md)
 - [com.github.asyncmc.mojang.authentication.kotlin.server.model.UsernamePassword](docs/UsernamePassword.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

All endpoints do not require authorization.