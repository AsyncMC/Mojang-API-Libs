# OpenapiClient::SecurityQuestionAnswerApi

All URIs are relative to *https://api.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**check_security_status**](SecurityQuestionAnswerApi.md#check_security_status) | **GET** /user/security/location | Check if security questions are needed
[**list_pending_security_questions**](SecurityQuestionAnswerApi.md#list_pending_security_questions) | **GET** /user/security/challenges | Get list of questions
[**send_security_question_answers**](SecurityQuestionAnswerApi.md#send_security_question_answers) | **POST** /user/security/location | Send back the answers


# **check_security_status**
> check_security_status

Check if security questions are needed

### Example
```ruby
# load the gem
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure HTTP basic authorization: PlayerAccessToken
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = OpenapiClient::SecurityQuestionAnswerApi.new

begin
  #Check if security questions are needed
  api_instance.check_security_status
rescue OpenapiClient::ApiError => e
  puts "Exception when calling SecurityQuestionAnswerApi->check_security_status: #{e}"
end
```

### Parameters
This endpoint does not need any parameter.

### Return type

nil (empty response body)

### Authorization

[PlayerAccessToken](../README.md#PlayerAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **list_pending_security_questions**
> Array&lt;SecurityChallenge&gt; list_pending_security_questions

Get list of questions

### Example
```ruby
# load the gem
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure HTTP basic authorization: PlayerAccessToken
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = OpenapiClient::SecurityQuestionAnswerApi.new

begin
  #Get list of questions
  result = api_instance.list_pending_security_questions
  p result
rescue OpenapiClient::ApiError => e
  puts "Exception when calling SecurityQuestionAnswerApi->list_pending_security_questions: #{e}"
end
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Array&lt;SecurityChallenge&gt;**](SecurityChallenge.md)

### Authorization

[PlayerAccessToken](../README.md#PlayerAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **send_security_question_answers**
> send_security_question_answers(security_answer)

Send back the answers

### Example
```ruby
# load the gem
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure HTTP basic authorization: PlayerAccessToken
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = OpenapiClient::SecurityQuestionAnswerApi.new
security_answer = nil # Array<SecurityAnswer> | An array with all the answers

begin
  #Send back the answers
  api_instance.send_security_question_answers(security_answer)
rescue OpenapiClient::ApiError => e
  puts "Exception when calling SecurityQuestionAnswerApi->send_security_question_answers: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **security_answer** | [**Array&lt;SecurityAnswer&gt;**](Array.md)| An array with all the answers | 

### Return type

nil (empty response body)

### Authorization

[PlayerAccessToken](../README.md#PlayerAccessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



