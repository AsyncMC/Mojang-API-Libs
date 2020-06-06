# OAILoginApi

All URIs are relative to *https://sessionserver.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPlayerProfile**](OAILoginApi.md#getplayerprofile) | **GET** /session/minecraft/profile/{stripped_uuid} | Gets the player&#39;s game profile


# **getPlayerProfile**
```objc
-(NSURLSessionTask*) getPlayerProfileWithStrippedUuid: (NSString*) strippedUuid
    _unsigned: (NSNumber*) _unsigned
        completionHandler: (void (^)(OAIPlayerProfile* output, NSError* error)) handler;
```

Gets the player's game profile

This will return the player's username plus any additional information about them (e.g. skins). This has a much stricter rate limit: You can request the same profile once per minute, however you can send as many unique requests as you like.

### Example 
```objc

NSString* strippedUuid = 853c80ef3c3749fdaa49938b674adae6; // The player UUID without hyphens
NSNumber* _unsigned = @56; // When set to false, the signature data are sent (optional)

OAILoginApi*apiInstance = [[OAILoginApi alloc] init];

// Gets the player's game profile
[apiInstance getPlayerProfileWithStrippedUuid:strippedUuid
              _unsigned:_unsigned
          completionHandler: ^(OAIPlayerProfile* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAILoginApi->getPlayerProfile: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **strippedUuid** | **NSString***| The player UUID without hyphens | 
 **_unsigned** | **NSNumber***| When set to false, the signature data are sent | [optional] 

### Return type

[**OAIPlayerProfile***](OAIPlayerProfile.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

