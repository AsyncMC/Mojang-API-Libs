# MojangApi.SkinOperationsApi

All URIs are relative to *https://api.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**changePlayerSkin**](SkinOperationsApi.md#changePlayerSkin) | **POST** /user/profile/{stripped_uuid}/skin | Changes the player skin by URL
[**resetPlayerSkin**](SkinOperationsApi.md#resetPlayerSkin) | **DELETE** /user/profile/{stripped_uuid}/skin | Resets the player skin to default
[**uploadPlayerSkin**](SkinOperationsApi.md#uploadPlayerSkin) | **PUT** /user/profile/{stripped_uuid}/skin | Changes the player skin by upload


<a name="changePlayerSkin"></a>
# **changePlayerSkin**
> changePlayerSkin(strippedUuid, url, opts)

Changes the player skin by URL

This will set the skin for the selected profile, but Mojang&#39;s servers will fetch the skin from a URL. This will also work for legacy accounts.

### Example
```javascript
var MojangApi = require('mojang_api');
var defaultClient = MojangApi.ApiClient.instance;

// Configure HTTP basic authorization: PlayerAccessToken
var PlayerAccessToken = defaultClient.authentications['PlayerAccessToken'];
PlayerAccessToken.username = 'YOUR USERNAME';
PlayerAccessToken.password = 'YOUR PASSWORD';

var apiInstance = new MojangApi.SkinOperationsApi();
var strippedUuid = 38ba542eb5924231a54cca0f2eac2b54; // String | The player UUID without hyphens
var url = "url_example"; // String | The URL which Mojang servers will download and apply the skin
var opts = {
  'model': new MojangApi.SkinModel() // SkinModel | 
};
var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.changePlayerSkin(strippedUuid, url, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **strippedUuid** | **String**| The player UUID without hyphens | 
 **url** | **String**| The URL which Mojang servers will download and apply the skin | 
 **model** | [**SkinModel**](SkinModel.md)|  | [optional] 

### Return type

null (empty response body)

### Authorization

[PlayerAccessToken](../README.md#PlayerAccessToken)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="resetPlayerSkin"></a>
# **resetPlayerSkin**
> resetPlayerSkin(strippedUuid)

Resets the player skin to default

### Example
```javascript
var MojangApi = require('mojang_api');
var defaultClient = MojangApi.ApiClient.instance;

// Configure HTTP basic authorization: PlayerAccessToken
var PlayerAccessToken = defaultClient.authentications['PlayerAccessToken'];
PlayerAccessToken.username = 'YOUR USERNAME';
PlayerAccessToken.password = 'YOUR PASSWORD';

var apiInstance = new MojangApi.SkinOperationsApi();
var strippedUuid = 38ba542eb5924231a54cca0f2eac2b54; // String | The player UUID without hyphens
var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.resetPlayerSkin(strippedUuid, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **strippedUuid** | **String**| The player UUID without hyphens | 

### Return type

null (empty response body)

### Authorization

[PlayerAccessToken](../README.md#PlayerAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="uploadPlayerSkin"></a>
# **uploadPlayerSkin**
> uploadPlayerSkin(strippedUuid, file, opts)

Changes the player skin by upload

This uploads a skin to Mojang&#39;s servers. It also sets the users skin. This works on legacy counts as well.

### Example
```javascript
var MojangApi = require('mojang_api');
var defaultClient = MojangApi.ApiClient.instance;

// Configure HTTP basic authorization: PlayerAccessToken
var PlayerAccessToken = defaultClient.authentications['PlayerAccessToken'];
PlayerAccessToken.username = 'YOUR USERNAME';
PlayerAccessToken.password = 'YOUR PASSWORD';

var apiInstance = new MojangApi.SkinOperationsApi();
var strippedUuid = 38ba542eb5924231a54cca0f2eac2b54; // String | The player UUID without hyphens
var file = "/path/to/file"; // File | The skin image in PNG format
var opts = {
  'model': new MojangApi.SkinModel() // SkinModel | 
};
var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.uploadPlayerSkin(strippedUuid, file, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **strippedUuid** | **String**| The player UUID without hyphens | 
 **file** | **File**| The skin image in PNG format | 
 **model** | [**SkinModel**](SkinModel.md)|  | [optional] 

### Return type

null (empty response body)

### Authorization

[PlayerAccessToken](../README.md#PlayerAccessToken)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

