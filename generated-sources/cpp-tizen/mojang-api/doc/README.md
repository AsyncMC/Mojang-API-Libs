# Documentation for Mojang API 2020-06-05 Tizen Client SDK

## How do I get the doc files?
First generate source code by running `openapi-generator`
Then run `doc/generateDocumentation.sh` from the output folder. It will generate all the doc files and put them in the `doc/SDK` directory.
To successfully generate documentation it needs `Doxygen` installed in the path.
*Note* - Before generating the documentation, put the logo of the project as the file `doc/logo.png` before running `doxygen`.


## How do I use this?
This is the structure of the doc folder:

```
.
├── logo.png                  \\Logo of the project
├── Doxyfile                  \\Doxygen config files
├── generateDocumentation.sh  \\Script to run to generate documentation
├── README.md                 \\This file
├── SDK                       \\Documentation for all classes in Mojang API Tizen Client SDK. See ./html/index.html
│   └── html

```

## *tl;dr* run this:

```
doc/generateDocumentation.sh
```

The above SDK folder will be generated. See the index.html inside the SDK folder.


## What's Doxygen?
Doxygen is the de facto standard tool for generating/extracting documentation from annotated/unannotated C++ sources, but it also supports other popular programming languages such as C, Objective-C, C#, PHP, Java, Python, IDL (Corba, Microsoft, and UNO/OpenOffice flavors), Fortran, VHDL, Tcl, and to some extent D.

Check out [Doxygen](https://www.doxygen.org/) for additional information about the Doxygen project.

## I Don't want to run Doxygen. What are the API files for accessing the REST endpoints?
All URIs are relative to https://api.mojang.comhttps://api.mojang.com

### MiscellaneousManager
Method | HTTP request | Description
------------- | ------------- | -------------
*getOrdersStatisticsSync* | *POST* /orders/statistics | Get statistics on the sales of Minecraft..
*getOrdersStatisticsASync* | *POST* /orders/statistics | Get statistics on the sales of Minecraft..

### NameHistoryManager
Method | HTTP request | Description
------------- | ------------- | -------------
*findUniqueIdsByNameSync* | *POST* /profiles/minecraft | Find the current UUID of multiple players at once.
*findUniqueIdsByNameASync* | *POST* /profiles/minecraft | Find the current UUID of multiple players at once.
*getNameHistorySync* | *GET* /user/profiles/{stripped_uuid}/names | Gets the full player's name history.
*getNameHistoryASync* | *GET* /user/profiles/{stripped_uuid}/names | Gets the full player's name history.
*getUniqueIdByNameSync* | *GET* /users/profiles/minecraft/{username} | Find the UUID by name.
*getUniqueIdByNameASync* | *GET* /users/profiles/minecraft/{username} | Find the UUID by name.

### SecurityQuestionAnswerManager
Method | HTTP request | Description
------------- | ------------- | -------------
*checkSecurityStatusSync* | *GET* /user/security/location | Check if security questions are needed.
*checkSecurityStatusASync* | *GET* /user/security/location | Check if security questions are needed.
*listPendingSecurityQuestionsSync* | *GET* /user/security/challenges | Get list of questions.
*listPendingSecurityQuestionsASync* | *GET* /user/security/challenges | Get list of questions.
*sendSecurityQuestionAnswersSync* | *POST* /user/security/location | Send back the answers.
*sendSecurityQuestionAnswersASync* | *POST* /user/security/location | Send back the answers.

### SkinOperationsManager
Method | HTTP request | Description
------------- | ------------- | -------------
*changePlayerSkinSync* | *POST* /user/profile/{stripped_uuid}/skin | Changes the player skin by URL.
*changePlayerSkinASync* | *POST* /user/profile/{stripped_uuid}/skin | Changes the player skin by URL.
*resetPlayerSkinSync* | *DELETE* /user/profile/{stripped_uuid}/skin | Resets the player skin to default.
*resetPlayerSkinASync* | *DELETE* /user/profile/{stripped_uuid}/skin | Resets the player skin to default.
*uploadPlayerSkinSync* | *PUT* /user/profile/{stripped_uuid}/skin | Changes the player skin by upload.
*uploadPlayerSkinASync* | *PUT* /user/profile/{stripped_uuid}/skin | Changes the player skin by upload.


## What are the Model files for the data structures/objects?
Class | Description
------------- | -------------
 *ChangeSkinRequest* | Request Mojang to download a skin from an URL and apply to the player
 *CurrentPlayerIDs* | The current player, demo and legacy status of a player identified by the id
 *Error* | This is returned when the request fails
 *NameChange* | A registered name change.
 *OrderStatistic* | Valid options to query the order statistics
 *OrderStatisticsRequest* | The body of the request to get the order statistics
 *OrderStatisticsResponse* | A json object is returned with the total amount of copies sold, the amount of copies sold in the last 24h and how many sales there are per second.
 *SecurityAnswer* | A security question answer given by the player using the id given by Mojang
 *SecurityAnswerId* | A security question answer id given by Mojang
 *SecurityChallenge* | Binds a question to an answer id, the answer must respect the answer id.
 *SecurityQuestion* | A security question requested by Mojang
 *SkinModel* | Model is an empty string for the default model (like Steve) and \"slim\" for the slim model (like Alex)
 *UploadSkinRequest* | 

