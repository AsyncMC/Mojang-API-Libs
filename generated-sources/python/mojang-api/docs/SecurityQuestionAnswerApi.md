# openapi_client.SecurityQuestionAnswerApi

All URIs are relative to *https://api.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**check_security_status**](SecurityQuestionAnswerApi.md#check_security_status) | **GET** /user/security/location | Check if security questions are needed
[**list_pending_security_questions**](SecurityQuestionAnswerApi.md#list_pending_security_questions) | **GET** /user/security/challenges | Get list of questions
[**send_security_question_answers**](SecurityQuestionAnswerApi.md#send_security_question_answers) | **POST** /user/security/location | Send back the answers


# **check_security_status**
> check_security_status()

Check if security questions are needed

### Example

* Basic Authentication (PlayerAccessToken): 
```python
from __future__ import print_function
import time
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Configure HTTP basic authorization: PlayerAccessToken
configuration = openapi_client.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = openapi_client.SecurityQuestionAnswerApi(openapi_client.ApiClient(configuration))

try:
    # Check if security questions are needed
    api_instance.check_security_status()
except ApiException as e:
    print("Exception when calling SecurityQuestionAnswerApi->check_security_status: %s\n" % e)
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

# **list_pending_security_questions**
> list[SecurityChallenge] list_pending_security_questions()

Get list of questions

### Example

* Basic Authentication (PlayerAccessToken): 
```python
from __future__ import print_function
import time
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Configure HTTP basic authorization: PlayerAccessToken
configuration = openapi_client.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = openapi_client.SecurityQuestionAnswerApi(openapi_client.ApiClient(configuration))

try:
    # Get list of questions
    api_response = api_instance.list_pending_security_questions()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling SecurityQuestionAnswerApi->list_pending_security_questions: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**list[SecurityChallenge]**](SecurityChallenge.md)

### Authorization

[PlayerAccessToken](../README.md#PlayerAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **send_security_question_answers**
> send_security_question_answers(security_answer)

Send back the answers

### Example

* Basic Authentication (PlayerAccessToken): 
```python
from __future__ import print_function
import time
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Configure HTTP basic authorization: PlayerAccessToken
configuration = openapi_client.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = openapi_client.SecurityQuestionAnswerApi(openapi_client.ApiClient(configuration))
security_answer = NULL # list[SecurityAnswer] | An array with all the answers

try:
    # Send back the answers
    api_instance.send_security_question_answers(security_answer)
except ApiException as e:
    print("Exception when calling SecurityQuestionAnswerApi->send_security_question_answers: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **security_answer** | [**list[SecurityAnswer]**](list.md)| An array with all the answers | 

### Return type

void (empty response body)

### Authorization

[PlayerAccessToken](../README.md#PlayerAccessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

