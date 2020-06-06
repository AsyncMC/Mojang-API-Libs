# com.github.asyncmc.mojang.api.go.server\SecurityQuestionAnswerApi

All URIs are relative to *https://api.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CheckSecurityStatus**](SecurityQuestionAnswerApi.md#CheckSecurityStatus) | **Get** /user/security/location | Check if security questions are needed
[**ListPendingSecurityQuestions**](SecurityQuestionAnswerApi.md#ListPendingSecurityQuestions) | **Get** /user/security/challenges | Get list of questions
[**SendSecurityQuestionAnswers**](SecurityQuestionAnswerApi.md#SendSecurityQuestionAnswers) | **Post** /user/security/location | Send back the answers


# **CheckSecurityStatus**
> CheckSecurityStatus(ctx, )
Check if security questions are needed

### Required Parameters
This endpoint does not need any parameter.

### Return type

 (empty response body)

### Authorization

[PlayerAccessToken](../README.md#PlayerAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ListPendingSecurityQuestions**
> []SecurityChallenge ListPendingSecurityQuestions(ctx, )
Get list of questions

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**[]SecurityChallenge**](SecurityChallenge.md)

### Authorization

[PlayerAccessToken](../README.md#PlayerAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **SendSecurityQuestionAnswers**
> SendSecurityQuestionAnswers(ctx, securityAnswer)
Send back the answers

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **securityAnswer** | [**[]SecurityAnswer**](array.md)| An array with all the answers | 

### Return type

 (empty response body)

### Authorization

[PlayerAccessToken](../README.md#PlayerAccessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

