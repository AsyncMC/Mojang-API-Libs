# Org.OpenAPITools - the C# library for the Mojang API

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

This C# SDK is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 2020-06-05
- SDK version: 1.0.0
- Build package: org.openapitools.codegen.languages.CSharpDotNet2ClientCodegen

<a name="frameworks-supported"></a>
## Frameworks supported
- .NET 2.0

<a name="dependencies"></a>
## Dependencies
- Mono compiler
- Newtonsoft.Json.7.0.1
- RestSharp.Net2.1.1.11

Note: NuGet is downloaded by the mono compilation script and packages are installed with it. No dependency DLLs are bundled with this generator

<a name="installation"></a>
## Installation
Run the following command to generate the DLL
- [Mac/Linux] `/bin/sh compile-mono.sh`
- [Windows] TODO

Then include the DLL (under the `bin` folder) in the C# project, and use the namespaces:
```csharp
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;
```
<a name="getting-started"></a>
## Getting Started

```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class Example
    {
        public void main()
        {
            
            // Configure HTTP basic authorization: MojangStatisticsToken
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new MiscellaneousApi();
            var orderStatisticsRequest = new OrderStatisticsRequest(); // OrderStatisticsRequest | The payload is a json list of options under the metricKeys key. You will receive a single object corresponding to the sum of sales of the requested type(s). You must request at least one type of sale. Below is the default list used by https://minecraft.net/en/stats/

            try
            {
                // Get statistics on the sales of Minecraft.
                OrderStatisticsResponse result = apiInstance.GetOrdersStatistics(orderStatisticsRequest);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling MiscellaneousApi.GetOrdersStatistics: " + e.Message );
            }
        }
    }
}
```

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://api.mojang.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*MiscellaneousApi* | [**GetOrdersStatistics**](docs/MiscellaneousApi.md#getordersstatistics) | **POST** /orders/statistics | Get statistics on the sales of Minecraft.
*NameHistoryApi* | [**FindUniqueIdsByName**](docs/NameHistoryApi.md#finduniqueidsbyname) | **POST** /profiles/minecraft | Find the current UUID of multiple players at once
*NameHistoryApi* | [**GetNameHistory**](docs/NameHistoryApi.md#getnamehistory) | **GET** /user/profiles/{stripped_uuid}/names | Gets the full player's name history
*NameHistoryApi* | [**GetUniqueIdByName**](docs/NameHistoryApi.md#getuniqueidbyname) | **GET** /users/profiles/minecraft/{username} | Find the UUID by name
*SecurityQuestionAnswerApi* | [**CheckSecurityStatus**](docs/SecurityQuestionAnswerApi.md#checksecuritystatus) | **GET** /user/security/location | Check if security questions are needed
*SecurityQuestionAnswerApi* | [**ListPendingSecurityQuestions**](docs/SecurityQuestionAnswerApi.md#listpendingsecurityquestions) | **GET** /user/security/challenges | Get list of questions
*SecurityQuestionAnswerApi* | [**SendSecurityQuestionAnswers**](docs/SecurityQuestionAnswerApi.md#sendsecurityquestionanswers) | **POST** /user/security/location | Send back the answers
*SkinOperationsApi* | [**ChangePlayerSkin**](docs/SkinOperationsApi.md#changeplayerskin) | **POST** /user/profile/{stripped_uuid}/skin | Changes the player skin by URL
*SkinOperationsApi* | [**ResetPlayerSkin**](docs/SkinOperationsApi.md#resetplayerskin) | **DELETE** /user/profile/{stripped_uuid}/skin | Resets the player skin to default
*SkinOperationsApi* | [**UploadPlayerSkin**](docs/SkinOperationsApi.md#uploadplayerskin) | **PUT** /user/profile/{stripped_uuid}/skin | Changes the player skin by upload


<a name="documentation-for-models"></a>
## Documentation for Models

 - [Org.OpenAPITools.Model.ChangeSkinRequest](docs/ChangeSkinRequest.md)
 - [Org.OpenAPITools.Model.CurrentPlayerIDs](docs/CurrentPlayerIDs.md)
 - [Org.OpenAPITools.Model.Error](docs/Error.md)
 - [Org.OpenAPITools.Model.NameChange](docs/NameChange.md)
 - [Org.OpenAPITools.Model.OrderStatistic](docs/OrderStatistic.md)
 - [Org.OpenAPITools.Model.OrderStatisticsRequest](docs/OrderStatisticsRequest.md)
 - [Org.OpenAPITools.Model.OrderStatisticsResponse](docs/OrderStatisticsResponse.md)
 - [Org.OpenAPITools.Model.SecurityAnswer](docs/SecurityAnswer.md)
 - [Org.OpenAPITools.Model.SecurityAnswerId](docs/SecurityAnswerId.md)
 - [Org.OpenAPITools.Model.SecurityChallenge](docs/SecurityChallenge.md)
 - [Org.OpenAPITools.Model.SecurityQuestion](docs/SecurityQuestion.md)
 - [Org.OpenAPITools.Model.SkinModel](docs/SkinModel.md)
 - [Org.OpenAPITools.Model.UploadSkinRequest](docs/UploadSkinRequest.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="MojangStatisticsToken"></a>
### MojangStatisticsToken

- **Type**: HTTP basic authentication

<a name="PlayerAccessToken"></a>
### PlayerAccessToken

- **Type**: HTTP basic authentication
