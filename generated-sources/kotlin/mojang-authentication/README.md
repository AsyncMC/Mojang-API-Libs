# org.openapitools.client - Kotlin client library for Mojang Authentication API

## Requires

* Kotlin 1.1.2
* Gradle 3.3

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

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

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

 - [com.github.asyncmc.mojang.authentication.kotlin.model.AccessKeys](docs/AccessKeys.md)
 - [com.github.asyncmc.mojang.authentication.kotlin.model.Agent](docs/Agent.md)
 - [com.github.asyncmc.mojang.authentication.kotlin.model.Authentication](docs/Authentication.md)
 - [com.github.asyncmc.mojang.authentication.kotlin.model.AuthenticationRequest](docs/AuthenticationRequest.md)
 - [com.github.asyncmc.mojang.authentication.kotlin.model.Error](docs/Error.md)
 - [com.github.asyncmc.mojang.authentication.kotlin.model.GameProfile](docs/GameProfile.md)
 - [com.github.asyncmc.mojang.authentication.kotlin.model.GameProfileProperty](docs/GameProfileProperty.md)
 - [com.github.asyncmc.mojang.authentication.kotlin.model.PrivateUserData](docs/PrivateUserData.md)
 - [com.github.asyncmc.mojang.authentication.kotlin.model.ProfileId](docs/ProfileId.md)
 - [com.github.asyncmc.mojang.authentication.kotlin.model.ReducedUserData](docs/ReducedUserData.md)
 - [com.github.asyncmc.mojang.authentication.kotlin.model.RefreshRequest](docs/RefreshRequest.md)
 - [com.github.asyncmc.mojang.authentication.kotlin.model.RefreshResponse](docs/RefreshResponse.md)
 - [com.github.asyncmc.mojang.authentication.kotlin.model.UsernamePassword](docs/UsernamePassword.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

All endpoints do not require authorization.
