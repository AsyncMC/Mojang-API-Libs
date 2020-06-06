# \SecurityQuestionAnswerApi

All URIs are relative to *https://api.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**check_security_status**](SecurityQuestionAnswerApi.md#check_security_status) | **Get** /user/security/location | Check if security questions are needed
[**list_pending_security_questions**](SecurityQuestionAnswerApi.md#list_pending_security_questions) | **Get** /user/security/challenges | Get list of questions
[**send_security_question_answers**](SecurityQuestionAnswerApi.md#send_security_question_answers) | **Post** /user/security/location | Send back the answers


# **check_security_status**
> check_security_status(ctx, )
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

# **list_pending_security_questions**
> Vec<::models::SecurityChallenge> list_pending_security_questions(ctx, )
Get list of questions

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**Vec<::models::SecurityChallenge>**](SecurityChallenge.md)

### Authorization

[PlayerAccessToken](../README.md#PlayerAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **send_security_question_answers**
> send_security_question_answers(ctx, security_answer)
Send back the answers

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context containing the authentication | nil if no authentication
  **security_answer** | [**Vec<::models::SecurityAnswer>**](array.md)| An array with all the answers | 

### Return type

 (empty response body)

### Authorization

[PlayerAccessToken](../README.md#PlayerAccessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

