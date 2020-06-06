# OAISkinOperationsApi

All URIs are relative to *https://api.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**changePlayerSkin**](OAISkinOperationsApi.md#changeplayerskin) | **POST** /user/profile/{stripped_uuid}/skin | Changes the player skin by URL
[**resetPlayerSkin**](OAISkinOperationsApi.md#resetplayerskin) | **DELETE** /user/profile/{stripped_uuid}/skin | Resets the player skin to default
[**uploadPlayerSkin**](OAISkinOperationsApi.md#uploadplayerskin) | **PUT** /user/profile/{stripped_uuid}/skin | Changes the player skin by upload


# **changePlayerSkin**
```objc
-(NSURLSessionTask*) changePlayerSkinWithStrippedUuid: (NSString*) strippedUuid
    url: (NSString*) url
    model: (OAISkinModel*) model
        completionHandler: (void (^)(NSError* error)) handler;
```

Changes the player skin by URL

This will set the skin for the selected profile, but Mojang's servers will fetch the skin from a URL. This will also work for legacy accounts.

### Example 
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: PlayerAccessToken)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* strippedUuid = 38ba542eb5924231a54cca0f2eac2b54; // The player UUID without hyphens
NSString* url = @"url_example"; // The URL which Mojang servers will download and apply the skin
OAISkinModel* model = [[OAISkinModel alloc] init]; //  (optional)

OAISkinOperationsApi*apiInstance = [[OAISkinOperationsApi alloc] init];

// Changes the player skin by URL
[apiInstance changePlayerSkinWithStrippedUuid:strippedUuid
              url:url
              model:model
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling OAISkinOperationsApi->changePlayerSkin: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **strippedUuid** | **NSString***| The player UUID without hyphens | 
 **url** | **NSString***| The URL which Mojang servers will download and apply the skin | 
 **model** | [**OAISkinModel***](OAISkinModel.md)|  | [optional] 

### Return type

void (empty response body)

### Authorization

[PlayerAccessToken](../README.md#PlayerAccessToken)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **resetPlayerSkin**
```objc
-(NSURLSessionTask*) resetPlayerSkinWithStrippedUuid: (NSString*) strippedUuid
        completionHandler: (void (^)(NSError* error)) handler;
```

Resets the player skin to default

### Example 
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: PlayerAccessToken)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* strippedUuid = 38ba542eb5924231a54cca0f2eac2b54; // The player UUID without hyphens

OAISkinOperationsApi*apiInstance = [[OAISkinOperationsApi alloc] init];

// Resets the player skin to default
[apiInstance resetPlayerSkinWithStrippedUuid:strippedUuid
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling OAISkinOperationsApi->resetPlayerSkin: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **strippedUuid** | **NSString***| The player UUID without hyphens | 

### Return type

void (empty response body)

### Authorization

[PlayerAccessToken](../README.md#PlayerAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **uploadPlayerSkin**
```objc
-(NSURLSessionTask*) uploadPlayerSkinWithStrippedUuid: (NSString*) strippedUuid
    file: (NSURL*) file
    model: (OAISkinModel*) model
        completionHandler: (void (^)(NSError* error)) handler;
```

Changes the player skin by upload

This uploads a skin to Mojang's servers. It also sets the users skin. This works on legacy counts as well.

### Example 
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: PlayerAccessToken)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


NSString* strippedUuid = 38ba542eb5924231a54cca0f2eac2b54; // The player UUID without hyphens
NSURL* file = [NSURL fileURLWithPath:@"/path/to/file"]; // The skin image in PNG format
OAISkinModel* model = [[OAISkinModel alloc] init]; //  (optional)

OAISkinOperationsApi*apiInstance = [[OAISkinOperationsApi alloc] init];

// Changes the player skin by upload
[apiInstance uploadPlayerSkinWithStrippedUuid:strippedUuid
              file:file
              model:model
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling OAISkinOperationsApi->uploadPlayerSkin: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **strippedUuid** | **NSString***| The player UUID without hyphens | 
 **file** | **NSURL*****NSURL***| The skin image in PNG format | 
 **model** | [**OAISkinModel***](OAISkinModel.md)|  | [optional] 

### Return type

void (empty response body)

### Authorization

[PlayerAccessToken](../README.md#PlayerAccessToken)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

