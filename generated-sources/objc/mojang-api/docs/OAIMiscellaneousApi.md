# OAIMiscellaneousApi

All URIs are relative to *https://api.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getOrdersStatistics**](OAIMiscellaneousApi.md#getordersstatistics) | **POST** /orders/statistics | Get statistics on the sales of Minecraft.


# **getOrdersStatistics**
```objc
-(NSURLSessionTask*) getOrdersStatisticsWithOrderStatisticsRequest: (OAIOrderStatisticsRequest*) orderStatisticsRequest
        completionHandler: (void (^)(OAIOrderStatisticsResponse* output, NSError* error)) handler;
```

Get statistics on the sales of Minecraft.

### Example 
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: MojangStatisticsToken)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];


OAIOrderStatisticsRequest* orderStatisticsRequest = [[OAIOrderStatisticsRequest alloc] init]; // The payload is a json list of options under the metricKeys key. You will receive a single object corresponding to the sum of sales of the requested type(s). You must request at least one type of sale. Below is the default list used by https://minecraft.net/en/stats/

OAIMiscellaneousApi*apiInstance = [[OAIMiscellaneousApi alloc] init];

// Get statistics on the sales of Minecraft.
[apiInstance getOrdersStatisticsWithOrderStatisticsRequest:orderStatisticsRequest
          completionHandler: ^(OAIOrderStatisticsResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIMiscellaneousApi->getOrdersStatistics: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderStatisticsRequest** | [**OAIOrderStatisticsRequest***](OAIOrderStatisticsRequest.md)| The payload is a json list of options under the metricKeys key. You will receive a single object corresponding to the sum of sales of the requested type(s). You must request at least one type of sale. Below is the default list used by https://minecraft.net/en/stats/ | 

### Return type

[**OAIOrderStatisticsResponse***](OAIOrderStatisticsResponse.md)

### Authorization

[MojangStatisticsToken](../README.md#MojangStatisticsToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

