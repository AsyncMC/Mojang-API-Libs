# SECURITYQUESTIONANSWER_API

All URIs are relative to *https://api.mojang.com*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**check_security_status**](SECURITYQUESTIONANSWER_API.md#check_security_status) | **Get** /user/security/location | Check if security questions are needed
[**list_pending_security_questions**](SECURITYQUESTIONANSWER_API.md#list_pending_security_questions) | **Get** /user/security/challenges | Get list of questions
[**send_security_question_answers**](SECURITYQUESTIONANSWER_API.md#send_security_question_answers) | **Post** /user/security/location | Send back the answers


# **check_security_status**
> check_security_status 
	

Check if security questions are needed


### Parameters
This endpoint does not need any parameter.

### Return type

{empty response body)

### Authorization

[PlayerAccessToken](../README.md#PlayerAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_pending_security_questions**
> list_pending_security_questions : detachable LIST [SECURITY_CHALLENGE]
	

Get list of questions


### Parameters
This endpoint does not need any parameter.

### Return type

[**LIST [SECURITY_CHALLENGE]**](SecurityChallenge.md)

### Authorization

[PlayerAccessToken](../README.md#PlayerAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **send_security_question_answers**
> send_security_question_answers (security_answer: LIST [SECURITY_ANSWER] )
	

Send back the answers


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **security_answer** | [**LIST [SECURITY_ANSWER]**](LIST.md)| An array with all the answers | 

### Return type

{empty response body)

### Authorization

[PlayerAccessToken](../README.md#PlayerAccessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

