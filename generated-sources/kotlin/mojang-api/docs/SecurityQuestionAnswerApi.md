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
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import com.github.asyncmc.mojang.api.kotlin.model.*

val apiInstance = SecurityQuestionAnswerApi()
try {
    apiInstance.checkSecurityStatus()
} catch (e: ClientException) {
    println("4xx response calling SecurityQuestionAnswerApi#checkSecurityStatus")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SecurityQuestionAnswerApi#checkSecurityStatus")
    e.printStackTrace()
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
> kotlin.Array&lt;SecurityChallenge&gt; listPendingSecurityQuestions()

Get list of questions

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import com.github.asyncmc.mojang.api.kotlin.model.*

val apiInstance = SecurityQuestionAnswerApi()
try {
    val result : kotlin.Array<SecurityChallenge> = apiInstance.listPendingSecurityQuestions()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SecurityQuestionAnswerApi#listPendingSecurityQuestions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SecurityQuestionAnswerApi#listPendingSecurityQuestions")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Array&lt;SecurityChallenge&gt;**](SecurityChallenge.md)

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
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import com.github.asyncmc.mojang.api.kotlin.model.*

val apiInstance = SecurityQuestionAnswerApi()
val securityAnswer : kotlin.Array<SecurityAnswer> =  // kotlin.Array<SecurityAnswer> | An array with all the answers
try {
    apiInstance.sendSecurityQuestionAnswers(securityAnswer)
} catch (e: ClientException) {
    println("4xx response calling SecurityQuestionAnswerApi#sendSecurityQuestionAnswers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SecurityQuestionAnswerApi#sendSecurityQuestionAnswers")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **securityAnswer** | [**kotlin.Array&lt;SecurityAnswer&gt;**](kotlin.Array.md)| An array with all the answers |

### Return type

null (empty response body)

### Authorization

[PlayerAccessToken](../README.md#PlayerAccessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

