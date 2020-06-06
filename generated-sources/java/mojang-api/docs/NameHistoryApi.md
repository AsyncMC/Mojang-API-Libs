# NameHistoryApi

All URIs are relative to *https://api.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findUniqueIdsByName**](NameHistoryApi.md#findUniqueIdsByName) | **POST** /profiles/minecraft | Find the current UUID of multiple players at once
[**getNameHistory**](NameHistoryApi.md#getNameHistory) | **GET** /user/profiles/{stripped_uuid}/names | Gets the full player&#39;s name history
[**getUniqueIdByName**](NameHistoryApi.md#getUniqueIdByName) | **GET** /users/profiles/minecraft/{username} | Find the UUID by name


<a name="findUniqueIdsByName"></a>
# **findUniqueIdsByName**
> List&lt;CurrentPlayerIDs&gt; findUniqueIdsByName(requestBody)

Find the current UUID of multiple players at once

Find the current players name, UUID, demo status and migration flag by the current players name. The \&quot;at\&quot; parameter is not supported. Players not found are not returned. If no players are found, an empty array is returned.

### Example
```java
// Import classes:
//import com.github.asyncmc.mojang.api.java.server.ApiException;
//import com.github.asyncmc.mojang.api.java.api.NameHistoryApi;


NameHistoryApi apiInstance = new NameHistoryApi();
List<String> requestBody = [ "joserobjr", "nonExistingPlayer", "maksimkurb" ]; // List<String> | Array with the player names
try {
    List<CurrentPlayerIDs> result = apiInstance.findUniqueIdsByName(requestBody);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NameHistoryApi#findUniqueIdsByName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestBody** | [**List&lt;String&gt;**](List.md)| Array with the player names |

### Return type

[**List&lt;CurrentPlayerIDs&gt;**](CurrentPlayerIDs.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNameHistory"></a>
# **getNameHistory**
> List&lt;NameChange&gt; getNameHistory(strippedUuid)

Gets the full player&#39;s name history

### Example
```java
// Import classes:
//import com.github.asyncmc.mojang.api.java.server.ApiException;
//import com.github.asyncmc.mojang.api.java.api.NameHistoryApi;


NameHistoryApi apiInstance = new NameHistoryApi();
String strippedUuid = 38ba542eb5924231a54cca0f2eac2b54; // String | The player UUID without hyphens
try {
    List<NameChange> result = apiInstance.getNameHistory(strippedUuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NameHistoryApi#getNameHistory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **strippedUuid** | **String**| The player UUID without hyphens |

### Return type

[**List&lt;NameChange&gt;**](NameChange.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUniqueIdByName"></a>
# **getUniqueIdByName**
> CurrentPlayerIDs getUniqueIdByName(username, at)

Find the UUID by name

Find the current player name, UUID, demo status and migration flag by the current player name or at a given time.

### Example
```java
// Import classes:
//import com.github.asyncmc.mojang.api.java.server.ApiException;
//import com.github.asyncmc.mojang.api.java.api.NameHistoryApi;


NameHistoryApi apiInstance = new NameHistoryApi();
String username = LordofMC_Playerz; // String | The username in a given time, or in present if \"at\" is not sent
Long at = 1448533942; // Long | Find the username in a given time, when 0 selects the original name however, it only works if the name was changed at least once, or if the account is legacy. The time is an UNIX timestamp (without milliseconds)
try {
    CurrentPlayerIDs result = apiInstance.getUniqueIdByName(username, at);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NameHistoryApi#getUniqueIdByName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| The username in a given time, or in present if \&quot;at\&quot; is not sent |
 **at** | **Long**| Find the username in a given time, when 0 selects the original name however, it only works if the name was changed at least once, or if the account is legacy. The time is an UNIX timestamp (without milliseconds) | [optional]

### Return type

[**CurrentPlayerIDs**](CurrentPlayerIDs.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

