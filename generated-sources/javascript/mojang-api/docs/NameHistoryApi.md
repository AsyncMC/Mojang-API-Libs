# MojangApi.NameHistoryApi

All URIs are relative to *https://api.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findUniqueIdsByName**](NameHistoryApi.md#findUniqueIdsByName) | **POST** /profiles/minecraft | Find the current UUID of multiple players at once
[**getNameHistory**](NameHistoryApi.md#getNameHistory) | **GET** /user/profiles/{stripped_uuid}/names | Gets the full player&#39;s name history
[**getUniqueIdByName**](NameHistoryApi.md#getUniqueIdByName) | **GET** /users/profiles/minecraft/{username} | Find the UUID by name


<a name="findUniqueIdsByName"></a>
# **findUniqueIdsByName**
> [CurrentPlayerIDs] findUniqueIdsByName(requestBody)

Find the current UUID of multiple players at once

Find the current players name, UUID, demo status and migration flag by the current players name. The \&quot;at\&quot; parameter is not supported. Players not found are not returned. If no players are found, an empty array is returned.

### Example
```javascript
var MojangApi = require('mojang_api');

var apiInstance = new MojangApi.NameHistoryApi();
var requestBody = [ "joserobjr", "nonExistingPlayer", "maksimkurb" ]; // [String] | Array with the player names
var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.findUniqueIdsByName(requestBody, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestBody** | [**[String]**](Array.md)| Array with the player names | 

### Return type

[**[CurrentPlayerIDs]**](CurrentPlayerIDs.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNameHistory"></a>
# **getNameHistory**
> [NameChange] getNameHistory(strippedUuid)

Gets the full player&#39;s name history

### Example
```javascript
var MojangApi = require('mojang_api');

var apiInstance = new MojangApi.NameHistoryApi();
var strippedUuid = 38ba542eb5924231a54cca0f2eac2b54; // String | The player UUID without hyphens
var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getNameHistory(strippedUuid, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **strippedUuid** | **String**| The player UUID without hyphens | 

### Return type

[**[NameChange]**](NameChange.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUniqueIdByName"></a>
# **getUniqueIdByName**
> CurrentPlayerIDs getUniqueIdByName(username, opts)

Find the UUID by name

Find the current player name, UUID, demo status and migration flag by the current player name or at a given time.

### Example
```javascript
var MojangApi = require('mojang_api');

var apiInstance = new MojangApi.NameHistoryApi();
var username = LordofMC_Playerz; // String | The username in a given time, or in present if \"at\" is not sent
var opts = {
  'at': 1448533942 // Number | Find the username in a given time, when 0 selects the original name however, it only works if the name was changed at least once, or if the account is legacy. The time is an UNIX timestamp (without milliseconds)
};
var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getUniqueIdByName(username, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| The username in a given time, or in present if \&quot;at\&quot; is not sent | 
 **at** | **Number**| Find the username in a given time, when 0 selects the original name however, it only works if the name was changed at least once, or if the account is legacy. The time is an UNIX timestamp (without milliseconds) | [optional] 

### Return type

[**CurrentPlayerIDs**](CurrentPlayerIDs.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

