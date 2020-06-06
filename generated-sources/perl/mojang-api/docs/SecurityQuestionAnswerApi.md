# WWW::OpenAPIClient::SecurityQuestionAnswerApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::SecurityQuestionAnswerApi;
```

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
```perl
use Data::Dumper;
use WWW::OpenAPIClient::SecurityQuestionAnswerApi;
my $api_instance = WWW::OpenAPIClient::SecurityQuestionAnswerApi->new(

    # Configure HTTP basic authorization: PlayerAccessToken
    username => 'YOUR_USERNAME',
    password => 'YOUR_PASSWORD',
);


eval { 
    $api_instance->check_security_status();
};
if ($@) {
    warn "Exception when calling SecurityQuestionAnswerApi->check_security_status: $@\n";
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

# **list_pending_security_questions**
> ARRAY[SecurityChallenge] list_pending_security_questions()

Get list of questions

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::SecurityQuestionAnswerApi;
my $api_instance = WWW::OpenAPIClient::SecurityQuestionAnswerApi->new(

    # Configure HTTP basic authorization: PlayerAccessToken
    username => 'YOUR_USERNAME',
    password => 'YOUR_PASSWORD',
);


eval { 
    my $result = $api_instance->list_pending_security_questions();
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling SecurityQuestionAnswerApi->list_pending_security_questions: $@\n";
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ARRAY[SecurityChallenge]**](SecurityChallenge.md)

### Authorization

[PlayerAccessToken](../README.md#PlayerAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **send_security_question_answers**
> send_security_question_answers(security_answer => $security_answer)

Send back the answers

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::SecurityQuestionAnswerApi;
my $api_instance = WWW::OpenAPIClient::SecurityQuestionAnswerApi->new(

    # Configure HTTP basic authorization: PlayerAccessToken
    username => 'YOUR_USERNAME',
    password => 'YOUR_PASSWORD',
);

my $security_answer = [WWW::OpenAPIClient::Object::ARRAY[SecurityAnswer]->new()]; # ARRAY[SecurityAnswer] | An array with all the answers

eval { 
    $api_instance->send_security_question_answers(security_answer => $security_answer);
};
if ($@) {
    warn "Exception when calling SecurityQuestionAnswerApi->send_security_question_answers: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **security_answer** | [**ARRAY[SecurityAnswer]**](ARRAY.md)| An array with all the answers | 

### Return type

void (empty response body)

### Authorization

[PlayerAccessToken](../README.md#PlayerAccessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

