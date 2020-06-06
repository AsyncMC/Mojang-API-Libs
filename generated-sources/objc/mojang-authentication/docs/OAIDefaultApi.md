# OAIDefaultApi

All URIs are relative to *https://authserver.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authenticate**](OAIDefaultApi.md#authenticate) | **POST** /authenticate | 
[**invalidate**](OAIDefaultApi.md#invalidate) | **POST** /invalidate | 
[**refresh**](OAIDefaultApi.md#refresh) | **POST** /refresh | 
[**siginout**](OAIDefaultApi.md#siginout) | **POST** /signout | 
[**validate**](OAIDefaultApi.md#validate) | **POST** /validate | 


# **authenticate**
```objc
-(NSURLSessionTask*) authenticateWithAuthenticationRequest: (OAIAuthenticationRequest*) authenticationRequest
        completionHandler: (void (^)(OAIAuthentication* output, NSError* error)) handler;
```



### Example 
```objc

OAIAuthenticationRequest* authenticationRequest = [[OAIAuthenticationRequest alloc] init]; // 

OAIDefaultApi*apiInstance = [[OAIDefaultApi alloc] init];

[apiInstance authenticateWithAuthenticationRequest:authenticationRequest
          completionHandler: ^(OAIAuthentication* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIDefaultApi->authenticate: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authenticationRequest** | [**OAIAuthenticationRequest***](OAIAuthenticationRequest.md)|  | 

### Return type

[**OAIAuthentication***](OAIAuthentication.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **invalidate**
```objc
-(NSURLSessionTask*) invalidateWithAccessKeys: (OAIAccessKeys*) accessKeys
        completionHandler: (void (^)(NSError* error)) handler;
```



### Example 
```objc

OAIAccessKeys* accessKeys = [[OAIAccessKeys alloc] init]; // 

OAIDefaultApi*apiInstance = [[OAIDefaultApi alloc] init];

[apiInstance invalidateWithAccessKeys:accessKeys
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling OAIDefaultApi->invalidate: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessKeys** | [**OAIAccessKeys***](OAIAccessKeys.md)|  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **refresh**
```objc
-(NSURLSessionTask*) refreshWithRefreshRequest: (OAIRefreshRequest*) refreshRequest
        completionHandler: (void (^)(OAIRefreshResponse* output, NSError* error)) handler;
```



### Example 
```objc

OAIRefreshRequest* refreshRequest = [[OAIRefreshRequest alloc] init]; // 

OAIDefaultApi*apiInstance = [[OAIDefaultApi alloc] init];

[apiInstance refreshWithRefreshRequest:refreshRequest
          completionHandler: ^(OAIRefreshResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIDefaultApi->refresh: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **refreshRequest** | [**OAIRefreshRequest***](OAIRefreshRequest.md)|  | 

### Return type

[**OAIRefreshResponse***](OAIRefreshResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **siginout**
```objc
-(NSURLSessionTask*) siginoutWithUsernamePassword: (OAIUsernamePassword*) usernamePassword
        completionHandler: (void (^)(NSError* error)) handler;
```



### Example 
```objc

OAIUsernamePassword* usernamePassword = [[OAIUsernamePassword alloc] init]; // 

OAIDefaultApi*apiInstance = [[OAIDefaultApi alloc] init];

[apiInstance siginoutWithUsernamePassword:usernamePassword
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling OAIDefaultApi->siginout: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **usernamePassword** | [**OAIUsernamePassword***](OAIUsernamePassword.md)|  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **validate**
```objc
-(NSURLSessionTask*) validateWithAccessKeys: (OAIAccessKeys*) accessKeys
        completionHandler: (void (^)(NSError* error)) handler;
```



### Example 
```objc

OAIAccessKeys* accessKeys = [[OAIAccessKeys alloc] init]; // 

OAIDefaultApi*apiInstance = [[OAIDefaultApi alloc] init];

[apiInstance validateWithAccessKeys:accessKeys
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling OAIDefaultApi->validate: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessKeys** | [**OAIAccessKeys***](OAIAccessKeys.md)|  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

