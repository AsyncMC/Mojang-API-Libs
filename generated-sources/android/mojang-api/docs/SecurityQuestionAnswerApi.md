# SecurityQuestionAnswerApi

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
```java
// Import classes:
//import com.github.asyncmc.mojang.api.android.api.SecurityQuestionAnswerApi;

SecurityQuestionAnswerApi apiInstance = new SecurityQuestionAnswerApi();
try {
    apiInstance.checkSecurityStatus();
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityQuestionAnswerApi#checkSecurityStatus");
    e.printStackTrace();
}
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
> List&lt;SecurityChallenge&gt; listPendingSecurityQuestions()

Get list of questions

### Example
```java
// Import classes:
//import com.github.asyncmc.mojang.api.android.api.SecurityQuestionAnswerApi;

SecurityQuestionAnswerApi apiInstance = new SecurityQuestionAnswerApi();
try {
    List<SecurityChallenge> result = apiInstance.listPendingSecurityQuestions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityQuestionAnswerApi#listPendingSecurityQuestions");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;SecurityChallenge&gt;**](SecurityChallenge.md)

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
```java
// Import classes:
//import com.github.asyncmc.mojang.api.android.api.SecurityQuestionAnswerApi;

SecurityQuestionAnswerApi apiInstance = new SecurityQuestionAnswerApi();
List<SecurityAnswer> securityAnswer = Arrays.asList(new List()); // List<SecurityAnswer> | An array with all the answers
try {
    apiInstance.sendSecurityQuestionAnswers(securityAnswer);
} catch (ApiException e) {
    System.err.println("Exception when calling SecurityQuestionAnswerApi#sendSecurityQuestionAnswers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **securityAnswer** | [**List&lt;SecurityAnswer&gt;**](List.md)| An array with all the answers |

### Return type

null (empty response body)

### Authorization

[PlayerAccessToken](../README.md#PlayerAccessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

