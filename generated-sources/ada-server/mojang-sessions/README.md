# No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator) - Swagger Ada Server

## Overview

This Ada server was generated by the [OpenAPI Generator](https://openapi-generator.tech) project.
By using the [OpenAPI-Spec](https://github.com/OAI/OpenAPI-Specification) from a remote server,
you can easily generate a server stub.

## Building

To build the server you will need the GNAT Ada compiler as well as
the [Swagger Ada library](https://github.com/stcarrez/swagger-ada).

When the GNAT Ada compiler and Swagger Ada libraries are installed,
run the following command:

```
  gprbuild -p -PdefaultPackage
```

After the build is successful, you will get the server binary
in bin/com-github-asyncmc-mojang-sessions-ada-server-model-server and you can start it as follows:
```
  ./bin/com-github-asyncmc-mojang-sessions-ada-server-model-server
```

## Structure of the server

The server consists of several Ada packages that are generated from
the OpenAPI specification.

Source file | Package | Description
------------ | ------------- | -------------
src/com-github-asyncmc-mojang-sessions-ada-server-model.ads|com.github.asyncmc.mojang.sessions.ada.server.model|The server root package declaration
src/com-github-asyncmc-mojang-sessions-ada-server-model-servers.ads|com.github.asyncmc.mojang.sessions.ada.server.model.Servers|The server declaration and instantiation
src/com-github-asyncmc-mojang-sessions-ada-server-model-servers.adb|com.github.asyncmc.mojang.sessions.ada.server.model.Servers|The server implementation (empty stubs)
src/server/com-github-asyncmc-mojang-sessions-ada-server-model-skeletons.ads|com.github.asyncmc.mojang.sessions.ada.server.model.Skeletons|The server skeleton declaration
src/server/com-github-asyncmc-mojang-sessions-ada-server-model-skeletons.adb|com.github.asyncmc.mojang.sessions.ada.server.model.Skeletons|The server skeleton implementation
src/server/com-github-asyncmc-mojang-sessions-ada-server-model-models.ads|com.github.asyncmc.mojang.sessions.ada.server.model.Skeletons|The server model types declaration
src/server/com-github-asyncmc-mojang-sessions-ada-server-model-models.adb|com.github.asyncmc.mojang.sessions.ada.server.model.Skeletons|The server model types implementation
src/com-github-asyncmc-mojang-sessions-ada-server-model-server.adb|com.github.asyncmc.mojang.sessions.ada.server.model.Server|The server main procedure

Files generated in **src/server** should not be modified.  The server implementation
files (**src/com-github-asyncmc-mojang-sessions-ada-server-model-server.ads** and **src/com-github-asyncmc-mojang-sessions-ada-server-model-server.adb**) should
be modified to implement the server operations.  You can also customize the server
main procedure according to your needs.

## Server model

The server instance is represented by the **com.github.asyncmc.mojang.sessions.ada.server.model.Servers.Server_Type** Ada type.
The REST API will need an instance of it to make the operation call.  Two server model
exists:

* The instance per request model creates an instance of the server type for each request.
* The shared instance model shares the same instance across all concurrent REST requests.  This instance is protected using an Ada protected object which holds the server instance.

The choice of the server model is made at the compilation time by instantiating either
the **com.github.asyncmc.mojang.sessions.ada.server.model.Skeletons.Skeleton** package or the **com.github.asyncmc.mojang.sessions.ada.server.model.Skeletons.Shared_Instance**
package.  Such instantiation is done in **src/com-github-asyncmc-mojang-sessions-ada-server-model-server.ads** and the default
is to use the **Shared_Instance**.

## Implementing a server operation

All you have to do is implement the server operation in the **src/com-github-asyncmc-mojang-sessions-ada-server-model-servers.adb** file.
The package already contains the operation with its parameters and you only have to replace
the **null** instruction by real code.

# Documentation

## API Documentation

All URIs are relative to *https://sessionserver.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Get_Blocked_Server_Hashes**](BansApi.md#Get_Blocked_Server_Hashes) | **GET** /blockedservers | A list of SHA1 hashes of banned servers
[**Get_Player_Profile**](LoginApi.md#Get_Player_Profile) | **GET** /session/minecraft/profile/{stripped_uuid} | Gets the player's game profile


## Models
 - [com.github.asyncmc.mojang.sessions.ada.server.model.Models.PlayerProfileProperty_Type](PlayerProfileProperty_Type.md)
 - [com.github.asyncmc.mojang.sessions.ada.server.model.Models.PlayerProfileTexturePropertyValue_Type](PlayerProfileTexturePropertyValue_Type.md)
 - [com.github.asyncmc.mojang.sessions.ada.server.model.Models.PlayerProfile_Type](PlayerProfile_Type.md)
 - [com.github.asyncmc.mojang.sessions.ada.server.model.Models.PlayerSkinMetadata_Type](PlayerSkinMetadata_Type.md)
 - [com.github.asyncmc.mojang.sessions.ada.server.model.Models.PlayerSkinURL_Type](PlayerSkinURL_Type.md)
 - [com.github.asyncmc.mojang.sessions.ada.server.model.Models.PlayerTextureURL_Type](PlayerTextureURL_Type.md)
 - [com.github.asyncmc.mojang.sessions.ada.server.model.Models.PlayerTexture_Type](PlayerTexture_Type.md)
 - [com.github.asyncmc.mojang.sessions.ada.server.model.Models.SessionApiError_Type](SessionApiError_Type.md)


## Authorization
 All endpoints do not require authorization.
