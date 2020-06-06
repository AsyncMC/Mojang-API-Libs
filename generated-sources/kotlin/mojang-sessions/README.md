# org.openapitools.client - Kotlin client library for Mojang Session API

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

All URIs are relative to *https://sessionserver.mojang.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BansApi* | [**getBlockedServerHashes**](docs/BansApi.md#getblockedserverhashes) | **GET** /blockedservers | A list of SHA1 hashes of banned servers
*LoginApi* | [**getPlayerProfile**](docs/LoginApi.md#getplayerprofile) | **GET** /session/minecraft/profile/{stripped_uuid} | Gets the player's game profile


<a name="documentation-for-models"></a>
## Documentation for Models

 - [org.openapitools.client.models.PlayerProfile](docs/PlayerProfile.md)
 - [org.openapitools.client.models.PlayerProfileProperty](docs/PlayerProfileProperty.md)
 - [org.openapitools.client.models.PlayerProfileTexturePropertyValue](docs/PlayerProfileTexturePropertyValue.md)
 - [org.openapitools.client.models.PlayerSkinMetadata](docs/PlayerSkinMetadata.md)
 - [org.openapitools.client.models.PlayerSkinURL](docs/PlayerSkinURL.md)
 - [org.openapitools.client.models.PlayerTexture](docs/PlayerTexture.md)
 - [org.openapitools.client.models.PlayerTextureURL](docs/PlayerTextureURL.md)
 - [org.openapitools.client.models.SessionApiError](docs/SessionApiError.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

All endpoints do not require authorization.
