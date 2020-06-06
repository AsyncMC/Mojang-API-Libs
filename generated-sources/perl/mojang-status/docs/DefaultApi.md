# WWW::OpenAPIClient::DefaultApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::DefaultApi;
```

All URIs are relative to *https://status.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**check_statuses**](DefaultApi.md#check_statuses) | **GET** /check | Checks the Mojang service statuses


# **check_statuses**
> ARRAY[HASH[string,ApiStatus]] check_statuses()

Checks the Mojang service statuses

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::DefaultApi;
my $api_instance = WWW::OpenAPIClient::DefaultApi->new(
);


eval { 
    my $result = $api_instance->check_statuses();
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling DefaultApi->check_statuses: $@\n";
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**ARRAY[HASH[string,ApiStatus]]**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

