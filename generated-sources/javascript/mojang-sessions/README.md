# mojang_session_api

MojangSessionApi - JavaScript client for mojang_session_api
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
npm install mojang_session_api --save
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

Finally, switch to the directory you want to use your mojang_session_api from, and run:

```shell
npm link /path/to/<JAVASCRIPT_CLIENT_DIR>
```

You should now be able to `require('mojang_session_api')` in javascript files from the directory you ran the last 
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
var MojangSessionApi = require('mojang_session_api');

var api = new MojangSessionApi.BansApi()

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
api.getBlockedServerHashes(callback);

```

## Documentation for API Endpoints

All URIs are relative to *https://sessionserver.mojang.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*MojangSessionApi.BansApi* | [**getBlockedServerHashes**](docs/BansApi.md#getBlockedServerHashes) | **GET** /blockedservers | A list of SHA1 hashes of banned servers
*MojangSessionApi.LoginApi* | [**getPlayerProfile**](docs/LoginApi.md#getPlayerProfile) | **GET** /session/minecraft/profile/{stripped_uuid} | Gets the player&#39;s game profile


## Documentation for Models

 - [MojangSessionApi.PlayerProfile](docs/PlayerProfile.md)
 - [MojangSessionApi.PlayerProfileProperty](docs/PlayerProfileProperty.md)
 - [MojangSessionApi.PlayerProfileTexturePropertyValue](docs/PlayerProfileTexturePropertyValue.md)
 - [MojangSessionApi.PlayerSkinMetadata](docs/PlayerSkinMetadata.md)
 - [MojangSessionApi.PlayerSkinURL](docs/PlayerSkinURL.md)
 - [MojangSessionApi.PlayerTexture](docs/PlayerTexture.md)
 - [MojangSessionApi.PlayerTextureURL](docs/PlayerTextureURL.md)
 - [MojangSessionApi.SessionApiError](docs/SessionApiError.md)


## Documentation for Authorization

 All endpoints do not require authorization.
