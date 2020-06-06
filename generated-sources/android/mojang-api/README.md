# openapi-android-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>org.openapitools</groupId>
    <artifactId>openapi-android-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.openapitools:openapi-android-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/openapi-android-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import org.openapitools.client.api.MiscellaneousApi;

public class MiscellaneousApiExample {

    public static void main(String[] args) {
        MiscellaneousApi apiInstance = new MiscellaneousApi();
        OrderStatisticsRequest orderStatisticsRequest = new OrderStatisticsRequest(); // OrderStatisticsRequest | The payload is a json list of options under the metricKeys key. You will receive a single object corresponding to the sum of sales of the requested type(s). You must request at least one type of sale. Below is the default list used by https://minecraft.net/en/stats/
        try {
            OrderStatisticsResponse result = apiInstance.getOrdersStatistics(orderStatisticsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MiscellaneousApi#getOrdersStatistics");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.mojang.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*MiscellaneousApi* | [**getOrdersStatistics**](docs/MiscellaneousApi.md#getOrdersStatistics) | **POST** /orders/statistics | Get statistics on the sales of Minecraft.
*NameHistoryApi* | [**findUniqueIdsByName**](docs/NameHistoryApi.md#findUniqueIdsByName) | **POST** /profiles/minecraft | Find the current UUID of multiple players at once
*NameHistoryApi* | [**getNameHistory**](docs/NameHistoryApi.md#getNameHistory) | **GET** /user/profiles/{stripped_uuid}/names | Gets the full player&#39;s name history
*NameHistoryApi* | [**getUniqueIdByName**](docs/NameHistoryApi.md#getUniqueIdByName) | **GET** /users/profiles/minecraft/{username} | Find the UUID by name
*SecurityQuestionAnswerApi* | [**checkSecurityStatus**](docs/SecurityQuestionAnswerApi.md#checkSecurityStatus) | **GET** /user/security/location | Check if security questions are needed
*SecurityQuestionAnswerApi* | [**listPendingSecurityQuestions**](docs/SecurityQuestionAnswerApi.md#listPendingSecurityQuestions) | **GET** /user/security/challenges | Get list of questions
*SecurityQuestionAnswerApi* | [**sendSecurityQuestionAnswers**](docs/SecurityQuestionAnswerApi.md#sendSecurityQuestionAnswers) | **POST** /user/security/location | Send back the answers
*SkinOperationsApi* | [**changePlayerSkin**](docs/SkinOperationsApi.md#changePlayerSkin) | **POST** /user/profile/{stripped_uuid}/skin | Changes the player skin by URL
*SkinOperationsApi* | [**resetPlayerSkin**](docs/SkinOperationsApi.md#resetPlayerSkin) | **DELETE** /user/profile/{stripped_uuid}/skin | Resets the player skin to default
*SkinOperationsApi* | [**uploadPlayerSkin**](docs/SkinOperationsApi.md#uploadPlayerSkin) | **PUT** /user/profile/{stripped_uuid}/skin | Changes the player skin by upload


## Documentation for Models

 - [CurrentPlayerIDs](docs/CurrentPlayerIDs.md)
 - [Error](docs/Error.md)
 - [InlineObject](docs/InlineObject.md)
 - [InlineObject1](docs/InlineObject1.md)
 - [NameChange](docs/NameChange.md)
 - [OrderStatistic](docs/OrderStatistic.md)
 - [OrderStatisticsRequest](docs/OrderStatisticsRequest.md)
 - [OrderStatisticsResponse](docs/OrderStatisticsResponse.md)
 - [SecurityAnswer](docs/SecurityAnswer.md)
 - [SecurityAnswerId](docs/SecurityAnswerId.md)
 - [SecurityChallenge](docs/SecurityChallenge.md)
 - [SecurityQuestion](docs/SecurityQuestion.md)
 - [SkinModel](docs/SkinModel.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### MojangStatisticsToken

- **Type**: HTTP basic authentication

### PlayerAccessToken

- **Type**: HTTP basic authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



