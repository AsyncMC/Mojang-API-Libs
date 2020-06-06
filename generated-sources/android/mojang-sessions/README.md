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

import org.openapitools.client.api.BansApi;

public class BansApiExample {

    public static void main(String[] args) {
        BansApi apiInstance = new BansApi();
        try {
            String result = apiInstance.getBlockedServerHashes();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BansApi#getBlockedServerHashes");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://sessionserver.mojang.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BansApi* | [**getBlockedServerHashes**](docs/BansApi.md#getBlockedServerHashes) | **GET** /blockedservers | A list of SHA1 hashes of banned servers
*LoginApi* | [**getPlayerProfile**](docs/LoginApi.md#getPlayerProfile) | **GET** /session/minecraft/profile/{stripped_uuid} | Gets the player&#39;s game profile


## Documentation for Models

 - [PlayerProfile](docs/PlayerProfile.md)
 - [PlayerProfileProperty](docs/PlayerProfileProperty.md)
 - [PlayerProfileTexturePropertyValue](docs/PlayerProfileTexturePropertyValue.md)
 - [PlayerSkinMetadata](docs/PlayerSkinMetadata.md)
 - [PlayerSkinURL](docs/PlayerSkinURL.md)
 - [PlayerTexture](docs/PlayerTexture.md)
 - [PlayerTextureURL](docs/PlayerTextureURL.md)
 - [SessionApiError](docs/SessionApiError.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



