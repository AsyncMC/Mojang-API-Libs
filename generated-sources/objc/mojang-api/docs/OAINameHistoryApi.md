# OAINameHistoryApi

All URIs are relative to *https://api.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findUniqueIdsByName**](OAINameHistoryApi.md#finduniqueidsbyname) | **POST** /profiles/minecraft | Find the current UUID of multiple players at once
[**getNameHistory**](OAINameHistoryApi.md#getnamehistory) | **GET** /user/profiles/{stripped_uuid}/names | Gets the full player&#39;s name history
[**getUniqueIdByName**](OAINameHistoryApi.md#getuniqueidbyname) | **GET** /users/profiles/minecraft/{username} | Find the UUID by name


# **findUniqueIdsByName**
```objc
-(NSURLSessionTask*) findUniqueIdsByNameWithRequestBody: (NSArray<NSString*>*) requestBody
        completionHandler: (void (^)(NSArray<OAICurrentPlayerIDs>* output, NSError* error)) handler;
```

Find the current UUID of multiple players at once

Find the current players name, UUID, demo status and migration flag by the current players name. The \"at\" parameter is not supported. Players not found are not returned. If no players are found, an empty array is returned.

### Example 
```objc

NSArray<NSString*>* requestBody = [ "joserobjr", "nonExistingPlayer", "maksimkurb" ]; // Array with the player names

OAINameHistoryApi*apiInstance = [[OAINameHistoryApi alloc] init];

// Find the current UUID of multiple players at once
[apiInstance findUniqueIdsByNameWithRequestBody:requestBody
          completionHandler: ^(NSArray<OAICurrentPlayerIDs>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAINameHistoryApi->findUniqueIdsByName: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestBody** | [**NSArray&lt;NSString*&gt;***](NSArray.md)| Array with the player names | 

### Return type

[**NSArray<OAICurrentPlayerIDs>***](OAICurrentPlayerIDs.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getNameHistory**
```objc
-(NSURLSessionTask*) getNameHistoryWithStrippedUuid: (NSString*) strippedUuid
        completionHandler: (void (^)(NSArray<OAINameChange>* output, NSError* error)) handler;
```

Gets the full player's name history

### Example 
```objc

NSString* strippedUuid = 38ba542eb5924231a54cca0f2eac2b54; // The player UUID without hyphens

OAINameHistoryApi*apiInstance = [[OAINameHistoryApi alloc] init];

// Gets the full player's name history
[apiInstance getNameHistoryWithStrippedUuid:strippedUuid
          completionHandler: ^(NSArray<OAINameChange>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAINameHistoryApi->getNameHistory: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **strippedUuid** | **NSString***| The player UUID without hyphens | 

### Return type

[**NSArray<OAINameChange>***](OAINameChange.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getUniqueIdByName**
```objc
-(NSURLSessionTask*) getUniqueIdByNameWithUsername: (NSString*) username
    at: (NSNumber*) at
        completionHandler: (void (^)(OAICurrentPlayerIDs* output, NSError* error)) handler;
```

Find the UUID by name

Find the current player name, UUID, demo status and migration flag by the current player name or at a given time.

### Example 
```objc

NSString* username = LordofMC_Playerz; // The username in a given time, or in present if \"at\" is not sent
NSNumber* at = 1448533942; // Find the username in a given time, when 0 selects the original name however, it only works if the name was changed at least once, or if the account is legacy. The time is an UNIX timestamp (without milliseconds) (optional)

OAINameHistoryApi*apiInstance = [[OAINameHistoryApi alloc] init];

// Find the UUID by name
[apiInstance getUniqueIdByNameWithUsername:username
              at:at
          completionHandler: ^(OAICurrentPlayerIDs* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAINameHistoryApi->getUniqueIdByName: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **NSString***| The username in a given time, or in present if \&quot;at\&quot; is not sent | 
 **at** | **NSNumber***| Find the username in a given time, when 0 selects the original name however, it only works if the name was changed at least once, or if the account is legacy. The time is an UNIX timestamp (without milliseconds) | [optional] 

### Return type

[**OAICurrentPlayerIDs***](OAICurrentPlayerIDs.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

