# MojangSessionApi.LoginApi

All URIs are relative to *https://sessionserver.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPlayerProfile**](LoginApi.md#getPlayerProfile) | **GET** /session/minecraft/profile/{stripped_uuid} | Gets the player&#39;s game profile


<a name="getPlayerProfile"></a>
# **getPlayerProfile**
> PlayerProfile getPlayerProfile(strippedUuid, opts)

Gets the player&#39;s game profile

This will return the player&#39;s username plus any additional information about them (e.g. skins). This has a much stricter rate limit: You can request the same profile once per minute, however you can send as many unique requests as you like.

### Example
```javascript
var MojangSessionApi = require('mojang_session_api');

var apiInstance = new MojangSessionApi.LoginApi();
var strippedUuid = 853c80ef3c3749fdaa49938b674adae6; // String | The player UUID without hyphens
var opts = {
  'unsigned': true // Boolean | When set to false, the signature data are sent
};
var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getPlayerProfile(strippedUuid, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **strippedUuid** | **String**| The player UUID without hyphens | 
 **unsigned** | **Boolean**| When set to false, the signature data are sent | [optional] 

### Return type

[**PlayerProfile**](PlayerProfile.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

