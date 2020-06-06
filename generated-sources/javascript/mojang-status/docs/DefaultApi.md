# MojangApi.DefaultApi

All URIs are relative to *https://status.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**checkStatuses**](DefaultApi.md#checkStatuses) | **GET** /check | Checks the Mojang service statuses


<a name="checkStatuses"></a>
# **checkStatuses**
> [{String: ApiStatus}] checkStatuses()

Checks the Mojang service statuses

### Example
```javascript
var MojangApi = require('mojang_api');

var apiInstance = new MojangApi.DefaultApi();
var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.checkStatuses(callback);
```

### Parameters
This endpoint does not need any parameter.

### Return type

**[{String: ApiStatus}]**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

