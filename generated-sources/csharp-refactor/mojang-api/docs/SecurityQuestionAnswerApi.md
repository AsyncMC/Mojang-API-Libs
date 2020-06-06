# Org.OpenAPITools.com.github.asyncmc.mojang.api.csharp.refactor.api.SecurityQuestionAnswerApi

All URIs are relative to *https://api.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CheckSecurityStatus**](SecurityQuestionAnswerApi.md#checksecuritystatus) | **GET** /user/security/location | Check if security questions are needed
[**ListPendingSecurityQuestions**](SecurityQuestionAnswerApi.md#listpendingsecurityquestions) | **GET** /user/security/challenges | Get list of questions
[**SendSecurityQuestionAnswers**](SecurityQuestionAnswerApi.md#sendsecurityquestionanswers) | **POST** /user/security/location | Send back the answers


<a name="checksecuritystatus"></a>
# **CheckSecurityStatus**
> void CheckSecurityStatus ()

Check if security questions are needed

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.com.github.asyncmc.mojang.api.csharp.refactor.api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.com.github.asyncmc.mojang.api.csharp.refactor.model;

namespace Example
{
    public class CheckSecurityStatusExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: PlayerAccessToken
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new SecurityQuestionAnswerApi();

            try
            {
                // Check if security questions are needed
                apiInstance.CheckSecurityStatus();
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SecurityQuestionAnswerApi.CheckSecurityStatus: " + e.Message );
            }
        }
    }
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

<a name="listpendingsecurityquestions"></a>
# **ListPendingSecurityQuestions**
> List<SecurityChallenge> ListPendingSecurityQuestions ()

Get list of questions

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.com.github.asyncmc.mojang.api.csharp.refactor.api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.com.github.asyncmc.mojang.api.csharp.refactor.model;

namespace Example
{
    public class ListPendingSecurityQuestionsExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: PlayerAccessToken
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new SecurityQuestionAnswerApi();

            try
            {
                // Get list of questions
                List&lt;SecurityChallenge&gt; result = apiInstance.ListPendingSecurityQuestions();
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SecurityQuestionAnswerApi.ListPendingSecurityQuestions: " + e.Message );
            }
        }
    }
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

<a name="sendsecurityquestionanswers"></a>
# **SendSecurityQuestionAnswers**
> void SendSecurityQuestionAnswers (List<SecurityAnswer> securityAnswer)

Send back the answers

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.com.github.asyncmc.mojang.api.csharp.refactor.api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.com.github.asyncmc.mojang.api.csharp.refactor.model;

namespace Example
{
    public class SendSecurityQuestionAnswersExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: PlayerAccessToken
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new SecurityQuestionAnswerApi();
            var securityAnswer = new List<SecurityAnswer>(); // List<SecurityAnswer> | An array with all the answers

            try
            {
                // Send back the answers
                apiInstance.SendSecurityQuestionAnswers(securityAnswer);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SecurityQuestionAnswerApi.SendSecurityQuestionAnswers: " + e.Message );
            }
        }
    }
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

