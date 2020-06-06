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

 - [org.openapitools.client.models.AccessKeys](docs/AccessKeys.md)
 - [org.openapitools.client.models.Agent](docs/Agent.md)
 - [org.openapitools.client.models.Authentication](docs/Authentication.md)
 - [org.openapitools.client.models.AuthenticationRequest](docs/AuthenticationRequest.md)
 - [org.openapitools.client.models.Error](docs/Error.md)
 - [org.openapitools.client.models.GameProfile](docs/GameProfile.md)
 - [org.openapitools.client.models.GameProfileProperty](docs/GameProfileProperty.md)
 - [org.openapitools.client.models.PrivateUserData](docs/PrivateUserData.md)
 - [org.openapitools.client.models.ProfileId](docs/ProfileId.md)
 - [org.openapitools.client.models.ReducedUserData](docs/ReducedUserData.md)
 - [org.openapitools.client.models.RefreshRequest](docs/RefreshRequest.md)
 - [org.openapitools.client.models.RefreshResponse](docs/RefreshResponse.md)
 - [org.openapitools.client.models.UsernamePassword](docs/UsernamePassword.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

All endpoints do not require authorization.
