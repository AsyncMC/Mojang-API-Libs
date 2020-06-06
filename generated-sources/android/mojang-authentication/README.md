# mojang-authentication-android

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
    <groupId>com.github.asyncmc</groupId>
    <artifactId>mojang-authentication-android</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.github.asyncmc:mojang-authentication-android:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/mojang-authentication-android-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.github.asyncmc.mojang.authentication.android.api.DefaultApi;

public class DefaultApiExample {

    public static void main(String[] args) {
        DefaultApi apiInstance = new DefaultApi();
        AuthenticationRequest authenticationRequest = new AuthenticationRequest(); // AuthenticationRequest | 
        try {
            Authentication result = apiInstance.authenticate(authenticationRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#authenticate");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://authserver.mojang.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**authenticate**](docs/DefaultApi.md#authenticate) | **POST** /authenticate | 
*DefaultApi* | [**invalidate**](docs/DefaultApi.md#invalidate) | **POST** /invalidate | 
*DefaultApi* | [**refresh**](docs/DefaultApi.md#refresh) | **POST** /refresh | 
*DefaultApi* | [**siginout**](docs/DefaultApi.md#siginout) | **POST** /signout | 
*DefaultApi* | [**validate**](docs/DefaultApi.md#validate) | **POST** /validate | 


## Documentation for Models

 - [AccessKeys](docs/AccessKeys.md)
 - [Agent](docs/Agent.md)
 - [Authentication](docs/Authentication.md)
 - [AuthenticationRequest](docs/AuthenticationRequest.md)
 - [Error](docs/Error.md)
 - [GameProfile](docs/GameProfile.md)
 - [GameProfileProperty](docs/GameProfileProperty.md)
 - [PrivateUserData](docs/PrivateUserData.md)
 - [ProfileId](docs/ProfileId.md)
 - [ReducedUserData](docs/ReducedUserData.md)
 - [RefreshRequest](docs/RefreshRequest.md)
 - [RefreshResponse](docs/RefreshResponse.md)
 - [UsernamePassword](docs/UsernamePassword.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



