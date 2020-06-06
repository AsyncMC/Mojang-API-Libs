# OAISecurityQuestionAnswerApi

All URIs are relative to *https://api.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**checkSecurityStatus**](OAISecurityQuestionAnswerApi.md#checksecuritystatus) | **GET** /user/security/location | Check if security questions are needed
[**listPendingSecurityQuestions**](OAISecurityQuestionAnswerApi.md#listpendingsecurityquestions) | **GET** /user/security/challenges | Get list of questions
[**sendSecurityQuestionAnswers**](OAISecurityQuestionAnswerApi.md#sendsecurityquestionanswers) | **POST** /user/security/location | Send back the answers


# **checkSecurityStatus**
```objc
-(NSURLSessionTask*) checkSecurityStatusWithCompletionHandler: 
        (void (^)(NSError* error)) handler;
```

Check if security questions are needed

### Example 
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: PlayerAccessToken)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];



OAISecurityQuestionAnswerApi*apiInstance = [[OAISecurityQuestionAnswerApi alloc] init];

// Check if security questions are needed
[apiInstance checkSecurityStatusWithCompletionHandler: 
          ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling OAISecurityQuestionAnswerApi->checkSecurityStatus: %@", error);
                        }
                    }];
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
```objc
-(NSURLSessionTask*) listPendingSecurityQuestionsWithCompletionHandler: 
        (void (^)(NSArray<OAISecurityChallenge>* output, NSError* error)) handler;
```

Get list of questions

### Example 
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: PlayerAccessToken)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];



OAISecurityQuestionAnswerApi*apiInstance = [[OAISecurityQuestionAnswerApi alloc] init];

// Get list of questions
[apiInstance listPendingSecurityQuestionsWithCompletionHandler: 
          ^(NSArray<OAISecurityChallenge>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAISecurityQuestionAnswerApi->listPendingSecurityQuestions: %@", error);
                        }
                    }];
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NSArray<OAISecurityChallenge>***](OAISecurityChallenge.md)

### Authorization

[PlayerAccessToken](../README.md#PlayerAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **sendSecurityQuestionAnswers**
```objc
-(NSURLSessionTask*) sendSecurityQuestionAnswersWithSecurityAnswer: (NSArray<OAISecurityAnswer>*) securityAnswer
        completionHandler: (void (^)(NSError* error)) handler;
```

Send back the answers

### Example 
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: PlayerAccessToken)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSArray<OAISecurityAnswer>* securityAnswer = @[[[NSArray alloc] init]]; // An array with all the answers

OAISecurityQuestionAnswerApi*apiInstance = [[OAISecurityQuestionAnswerApi alloc] init];

// Send back the answers
[apiInstance sendSecurityQuestionAnswersWithSecurityAnswer:securityAnswer
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling OAISecurityQuestionAnswerApi->sendSecurityQuestionAnswers: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **securityAnswer** | [**NSArray&lt;OAISecurityAnswer&gt;***](NSArray.md)| An array with all the answers | 

### Return type

void (empty response body)

### Authorization

[PlayerAccessToken](../README.md#PlayerAccessToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

