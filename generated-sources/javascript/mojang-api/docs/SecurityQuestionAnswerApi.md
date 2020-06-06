# MojangApi.SecurityQuestionAnswerApi

All URIs are relative to *https://api.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**checkSecurityStatus**](SecurityQuestionAnswerApi.md#checkSecurityStatus) | **GET** /user/security/location | Check if security questions are needed
[**listPendingSecurityQuestions**](SecurityQuestionAnswerApi.md#listPendingSecurityQuestions) | **GET** /user/security/challenges | Get list of questions
[**sendSecurityQuestionAnswers**](SecurityQuestionAnswerApi.md#sendSecurityQuestionAnswers) | **POST** /user/security/location | Send back the answers


<a name="checkSecurityStatus"></a>
# **checkSecurityStatus**
> checkSecurityStatus()

Check if security questions are needed

### Example
```javascript
var MojangApi = require('mojang_api');
var defaultClient = MojangApi.ApiClient.instance;

// Configure HTTP basic authorization: PlayerAccessToken
var PlayerAccessToken = defaultClient.authentications['PlayerAccessToken'];
PlayerAccessToken.username = 'YOUR USERNAME';
PlayerAccessToken.password = 'YOUR PASSWORD';

var apiInstance = new MojangApi.SecurityQuestionAnswerApi();
var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.checkSecurityStatus(callback);
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[PlayerAccessToken](../README.md#PlayerAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listPendingSecurityQuestions"></a>
# **listPendingSecurityQuestions**
> [SecurityChallenge] listPendingSecurityQuestions()

Get list of questions

### Example
```javascript
var MojangApi = require('mojang_api');
var defaultClient = MojangApi.ApiClient.instance;

// Configure HTTP basic authorization: PlayerAccessToken
var PlayerAccessToken = defaultClient.authentications['PlayerAccessToken'];
PlayerAccessToken.username = 'YOUR USERNAME';
PlayerAccessToken.password = 'YOUR PASSWORD';

var apiInstance = new MojangApi.SecurityQuestionAnswerApi();
var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.listPendingSecurityQuestions(callback);
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**[SecurityChallenge]**](SecurityChallenge.md)

### Authorization

[PlayerAccessToken](../README.md#PlayerAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="sendSecurityQuestionAnswers"></a>
# **sendSecurityQuestionAnswers**
> sendSecurityQuestionAnswers(securityAnswer)

Send back the answers

### Example
```javascript
var MojangApi = require('mojang_api');
var defaultClient = MojangApi.ApiClient.instance;

// Configure HTTP basic authorization: PlayerAccessToken
var PlayerAccessToken = defaultClient.authentications['PlayerAccessToken'];
PlayerAccessToken.username = 'YOUR USERNAME';
PlayerAccessToken.password = 'YOUR PASSWORD';

var apiInstance = new MojangApi.SecurityQuestionAnswerApi();
var securityAnswer = [new MojangApi.SecurityAnswer()]; // [SecurityAnswer] | An array with all the answers
var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.sendSecurityQuestionAnswers(securityAnswer, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **securityAnswer** | [**[SecurityAnswer]**](Array.md)| An array with all the answers | 

### Return type

null (empty response body)

### Authorization

[PlayerAccessToken](../README.md#PlayerAccessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

