# org.openapitools.client - Kotlin client library for Mojang API

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

All URIs are relative to *https://api.mojang.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*MiscellaneousApi* | [**getOrdersStatistics**](docs/MiscellaneousApi.md#getordersstatistics) | **POST** /orders/statistics | Get statistics on the sales of Minecraft.
*NameHistoryApi* | [**findUniqueIdsByName**](docs/NameHistoryApi.md#finduniqueidsbyname) | **POST** /profiles/minecraft | Find the current UUID of multiple players at once
*NameHistoryApi* | [**getNameHistory**](docs/NameHistoryApi.md#getnamehistory) | **GET** /user/profiles/{stripped_uuid}/names | Gets the full player's name history
*NameHistoryApi* | [**getUniqueIdByName**](docs/NameHistoryApi.md#getuniqueidbyname) | **GET** /users/profiles/minecraft/{username} | Find the UUID by name
*SecurityQuestionAnswerApi* | [**checkSecurityStatus**](docs/SecurityQuestionAnswerApi.md#checksecuritystatus) | **GET** /user/security/location | Check if security questions are needed
*SecurityQuestionAnswerApi* | [**listPendingSecurityQuestions**](docs/SecurityQuestionAnswerApi.md#listpendingsecurityquestions) | **GET** /user/security/challenges | Get list of questions
*SecurityQuestionAnswerApi* | [**sendSecurityQuestionAnswers**](docs/SecurityQuestionAnswerApi.md#sendsecurityquestionanswers) | **POST** /user/security/location | Send back the answers
*SkinOperationsApi* | [**changePlayerSkin**](docs/SkinOperationsApi.md#changeplayerskin) | **POST** /user/profile/{stripped_uuid}/skin | Changes the player skin by URL
*SkinOperationsApi* | [**resetPlayerSkin**](docs/SkinOperationsApi.md#resetplayerskin) | **DELETE** /user/profile/{stripped_uuid}/skin | Resets the player skin to default
*SkinOperationsApi* | [**uploadPlayerSkin**](docs/SkinOperationsApi.md#uploadplayerskin) | **PUT** /user/profile/{stripped_uuid}/skin | Changes the player skin by upload


<a name="documentation-for-models"></a>
## Documentation for Models

 - [com.github.asyncmc.mojang.api.kotlin.model.ChangeSkinRequest](docs/ChangeSkinRequest.md)
 - [com.github.asyncmc.mojang.api.kotlin.model.CurrentPlayerIDs](docs/CurrentPlayerIDs.md)
 - [com.github.asyncmc.mojang.api.kotlin.model.Error](docs/Error.md)
 - [com.github.asyncmc.mojang.api.kotlin.model.NameChange](docs/NameChange.md)
 - [com.github.asyncmc.mojang.api.kotlin.model.OrderStatistic](docs/OrderStatistic.md)
 - [com.github.asyncmc.mojang.api.kotlin.model.OrderStatisticsRequest](docs/OrderStatisticsRequest.md)
 - [com.github.asyncmc.mojang.api.kotlin.model.OrderStatisticsResponse](docs/OrderStatisticsResponse.md)
 - [com.github.asyncmc.mojang.api.kotlin.model.SecurityAnswer](docs/SecurityAnswer.md)
 - [com.github.asyncmc.mojang.api.kotlin.model.SecurityAnswerId](docs/SecurityAnswerId.md)
 - [com.github.asyncmc.mojang.api.kotlin.model.SecurityChallenge](docs/SecurityChallenge.md)
 - [com.github.asyncmc.mojang.api.kotlin.model.SecurityQuestion](docs/SecurityQuestion.md)
 - [com.github.asyncmc.mojang.api.kotlin.model.SkinModel](docs/SkinModel.md)
 - [com.github.asyncmc.mojang.api.kotlin.model.UploadSkinRequest](docs/UploadSkinRequest.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="MojangStatisticsToken"></a>
### MojangStatisticsToken

- **Type**: HTTP basic authentication

<a name="PlayerAccessToken"></a>
### PlayerAccessToken

- **Type**: HTTP basic authentication

