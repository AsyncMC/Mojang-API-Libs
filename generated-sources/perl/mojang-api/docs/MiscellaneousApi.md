# WWW::OpenAPIClient::MiscellaneousApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::MiscellaneousApi;
```

All URIs are relative to *https://api.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_orders_statistics**](MiscellaneousApi.md#get_orders_statistics) | **POST** /orders/statistics | Get statistics on the sales of Minecraft.


# **get_orders_statistics**
> OrderStatisticsResponse get_orders_statistics(order_statistics_request => $order_statistics_request)

Get statistics on the sales of Minecraft.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::MiscellaneousApi;
my $api_instance = WWW::OpenAPIClient::MiscellaneousApi->new(

    # Configure HTTP basic authorization: MojangStatisticsToken
    username => 'YOUR_USERNAME',
    password => 'YOUR_PASSWORD',
);

my $order_statistics_request = WWW::OpenAPIClient::Object::OrderStatisticsRequest->new(); # OrderStatisticsRequest | The payload is a json list of options under the metricKeys key. You will receive a single object corresponding to the sum of sales of the requested type(s). You must request at least one type of sale. Below is the default list used by https://minecraft.net/en/stats/

eval { 
    my $result = $api_instance->get_orders_statistics(order_statistics_request => $order_statistics_request);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling MiscellaneousApi->get_orders_statistics: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order_statistics_request** | [**OrderStatisticsRequest**](OrderStatisticsRequest.md)| The payload is a json list of options under the metricKeys key. You will receive a single object corresponding to the sum of sales of the requested type(s). You must request at least one type of sale. Below is the default list used by https://minecraft.net/en/stats/ | 

### Return type

[**OrderStatisticsResponse**](OrderStatisticsResponse.md)

### Authorization

[MojangStatisticsToken](../README.md#MojangStatisticsToken)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

