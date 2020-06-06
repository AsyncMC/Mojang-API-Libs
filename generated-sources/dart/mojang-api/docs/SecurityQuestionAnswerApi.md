# openapi.api.SecurityQuestionAnswerApi

## Load the API package
```dart
import 'package:openapi/api.dart';
```

All URIs are relative to *https://api.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**checkSecurityStatus**](SecurityQuestionAnswerApi.md#checkSecurityStatus) | **GET** /user/security/location | Check if security questions are needed
[**listPendingSecurityQuestions**](SecurityQuestionAnswerApi.md#listPendingSecurityQuestions) | **GET** /user/security/challenges | Get list of questions
[**sendSecurityQuestionAnswers**](SecurityQuestionAnswerApi.md#sendSecurityQuestionAnswers) | **POST** /user/security/location | Send back the answers


# **checkSecurityStatus**
> checkSecurityStatus()

Check if security questions are needed

### Example 
```dart
import 'package:openapi/api.dart';
// TODO Configure HTTP basic authorization: PlayerAccessToken
//openapi.api.Configuration.username = 'YOUR_USERNAME';
//openapi.api.Configuration.password = 'YOUR_PASSWORD';

var api_instance = new SecurityQuestionAnswerApi();

try { 
    api_instance.checkSecurityStatus();
} catch (e) {
    print("Exception when calling SecurityQuestionAnswerApi->checkSecurityStatus: $e\n");
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

void (empty response body)

### Authorization

[PlayerAccessToken](../README.md#PlayerAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **listPendingSecurityQuestions**
> List<SecurityChallenge> listPendingSecurityQuestions()

Get list of questions

### Example 
```dart
import 'package:openapi/api.dart';
// TODO Configure HTTP basic authorization: PlayerAccessToken
//openapi.api.Configuration.username = 'YOUR_USERNAME';
//openapi.api.Configuration.password = 'YOUR_PASSWORD';

var api_instance = new SecurityQuestionAnswerApi();

try { 
    var result = api_instance.listPendingSecurityQuestions();
    print(result);
} catch (e) {
    print("Exception when calling SecurityQuestionAnswerApi->listPendingSecurityQuestions: $e\n");
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List<SecurityChallenge>**](SecurityChallenge.md)

### Authorization

[PlayerAccessToken](../README.md#PlayerAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **sendSecurityQuestionAnswers**
> sendSecurityQuestionAnswers(securityAnswer)

Send back the answers

### Example 
```dart
import 'package:openapi/api.dart';
// TODO Configure HTTP basic authorization: PlayerAccessToken
//openapi.api.Configuration.username = 'YOUR_USERNAME';
//openapi.api.Configuration.password = 'YOUR_PASSWORD';

var api_instance = new SecurityQuestionAnswerApi();
var securityAnswer = [new List&lt;SecurityAnswer&gt;()]; // List<SecurityAnswer> | An array with all the answers

try { 
    api_instance.sendSecurityQuestionAnswers(securityAnswer);
} catch (e) {
    print("Exception when calling SecurityQuestionAnswerApi->sendSecurityQuestionAnswers: $e\n");
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **securityAnswer** | [**List&lt;SecurityAnswer&gt;**](List.md)| An array with all the answers | 

### Return type

void (empty response body)

### Authorization

[PlayerAccessToken](../README.md#PlayerAccessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

