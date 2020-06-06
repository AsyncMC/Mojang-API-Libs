# OAIDefaultApi

All URIs are relative to *https://status.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**checkStatuses**](OAIDefaultApi.md#checkstatuses) | **GET** /check | Checks the Mojang service statuses


# **checkStatuses**
```objc
-(NSURLSessionTask*) checkStatusesWithCompletionHandler: 
        (void (^)(NSArray<NSDictionary<OAIApiStatus>*>* output, NSError* error)) handler;
```

Checks the Mojang service statuses

### Example 
```objc


OAIDefaultApi*apiInstance = [[OAIDefaultApi alloc] init];

// Checks the Mojang service statuses
[apiInstance checkStatusesWithCompletionHandler: 
          ^(NSArray<NSDictionary<OAIApiStatus>*>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIDefaultApi->checkStatuses: %@", error);
                        }
                    }];
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NSArray<NSDictionary<OAIApiStatus>*>***](NSDictionary.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

