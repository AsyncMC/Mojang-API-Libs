# mojang_api

MojangApi - JavaScript client for mojang_api
No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
This SDK is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 2020-06-05
- Package version: 2020-06-05
- Build package: org.openapitools.codegen.languages.JavascriptClientCodegen

## Installation

### For [Node.js](https://nodejs.org/)

#### npm

To publish the library as a [npm](https://www.npmjs.com/),
please follow the procedure in ["Publishing npm packages"](https://docs.npmjs.com/getting-started/publishing-npm-packages).

Then install it via:

```shell
npm install mojang_api --save
```

##### Local development

To use the library locally without publishing to a remote npm registry, first install the dependencies by changing 
into the directory containing `package.json` (and this README). Let's call this `JAVASCRIPT_CLIENT_DIR`. Then run:

```shell
npm install
```

Next, [link](https://docs.npmjs.com/cli/link) it globally in npm with the following, also from `JAVASCRIPT_CLIENT_DIR`:

```shell
npm link
```

Finally, switch to the directory you want to use your mojang_api from, and run:

```shell
npm link /path/to/<JAVASCRIPT_CLIENT_DIR>
```

You should now be able to `require('mojang_api')` in javascript files from the directory you ran the last 
command above from.

#### git
#
If the library is hosted at a git repository, e.g.
https://github.com/AsyncMC/Mojang-API-Libs
then install it via:

```shell
    npm install AsyncMC/Mojang-API-Libs --save
```

### For browser

The library also works in the browser environment via npm and [browserify](http://browserify.org/). After following
the above steps with Node.js and installing browserify with `npm install -g browserify`,
perform the following (assuming *main.js* is your entry file, that's to say your javascript file where you actually 
use this library):

```shell
browserify main.js > bundle.js
```

Then include *bundle.js* in the HTML pages.

### Webpack Configuration

Using Webpack you may encounter the following error: "Module not found: Error:
Cannot resolve module", most certainly you should disable AMD loader. Add/merge
the following section to your webpack config:

```javascript
module: {
  rules: [
    {
      parser: {
        amd: false
      }
    }
  ]
}
```

## Getting Started

Please follow the [installation](#installation) instruction and execute the following JS code:

```javascript
var MojangApi = require('mojang_api');

var defaultClient = MojangApi.ApiClient.instance;

// Configure HTTP basic authorization: MojangStatisticsToken
var MojangStatisticsToken = defaultClient.authentications['MojangStatisticsToken'];
MojangStatisticsToken.username = 'YOUR USERNAME'
MojangStatisticsToken.password = 'YOUR PASSWORD'

var api = new MojangApi.MiscellaneousApi()
var orderStatisticsRequest = new MojangApi.OrderStatisticsRequest(); // {OrderStatisticsRequest} The payload is a json list of options under the metricKeys key. You will receive a single object corresponding to the sum of sales of the requested type(s). You must request at least one type of sale. Below is the default list used by https://minecraft.net/en/stats/

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
api.getOrdersStatistics(orderStatisticsRequest, callback);

```

## Documentation for API Endpoints

All URIs are relative to *https://api.mojang.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*MojangApi.MiscellaneousApi* | [**getOrdersStatistics**](docs/MiscellaneousApi.md#getOrdersStatistics) | **POST** /orders/statistics | Get statistics on the sales of Minecraft.
*MojangApi.NameHistoryApi* | [**findUniqueIdsByName**](docs/NameHistoryApi.md#findUniqueIdsByName) | **POST** /profiles/minecraft | Find the current UUID of multiple players at once
*MojangApi.NameHistoryApi* | [**getNameHistory**](docs/NameHistoryApi.md#getNameHistory) | **GET** /user/profiles/{stripped_uuid}/names | Gets the full player&#39;s name history
*MojangApi.NameHistoryApi* | [**getUniqueIdByName**](docs/NameHistoryApi.md#getUniqueIdByName) | **GET** /users/profiles/minecraft/{username} | Find the UUID by name
*MojangApi.SecurityQuestionAnswerApi* | [**checkSecurityStatus**](docs/SecurityQuestionAnswerApi.md#checkSecurityStatus) | **GET** /user/security/location | Check if security questions are needed
*MojangApi.SecurityQuestionAnswerApi* | [**listPendingSecurityQuestions**](docs/SecurityQuestionAnswerApi.md#listPendingSecurityQuestions) | **GET** /user/security/challenges | Get list of questions
*MojangApi.SecurityQuestionAnswerApi* | [**sendSecurityQuestionAnswers**](docs/SecurityQuestionAnswerApi.md#sendSecurityQuestionAnswers) | **POST** /user/security/location | Send back the answers
*MojangApi.SkinOperationsApi* | [**changePlayerSkin**](docs/SkinOperationsApi.md#changePlayerSkin) | **POST** /user/profile/{stripped_uuid}/skin | Changes the player skin by URL
*MojangApi.SkinOperationsApi* | [**resetPlayerSkin**](docs/SkinOperationsApi.md#resetPlayerSkin) | **DELETE** /user/profile/{stripped_uuid}/skin | Resets the player skin to default
*MojangApi.SkinOperationsApi* | [**uploadPlayerSkin**](docs/SkinOperationsApi.md#uploadPlayerSkin) | **PUT** /user/profile/{stripped_uuid}/skin | Changes the player skin by upload


## Documentation for Models

 - [MojangApi.ChangeSkinRequest](docs/ChangeSkinRequest.md)
 - [MojangApi.CurrentPlayerIDs](docs/CurrentPlayerIDs.md)
 - [MojangApi.Error](docs/Error.md)
 - [MojangApi.NameChange](docs/NameChange.md)
 - [MojangApi.OrderStatistic](docs/OrderStatistic.md)
 - [MojangApi.OrderStatisticsRequest](docs/OrderStatisticsRequest.md)
 - [MojangApi.OrderStatisticsResponse](docs/OrderStatisticsResponse.md)
 - [MojangApi.SecurityAnswer](docs/SecurityAnswer.md)
 - [MojangApi.SecurityAnswerId](docs/SecurityAnswerId.md)
 - [MojangApi.SecurityChallenge](docs/SecurityChallenge.md)
 - [MojangApi.SecurityQuestion](docs/SecurityQuestion.md)
 - [MojangApi.SkinModel](docs/SkinModel.md)
 - [MojangApi.UploadSkinRequest](docs/UploadSkinRequest.md)


## Documentation for Authorization


### MojangStatisticsToken

- **Type**: HTTP basic authentication

### PlayerAccessToken

- **Type**: HTTP basic authentication

