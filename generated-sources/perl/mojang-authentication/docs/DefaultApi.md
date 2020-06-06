# WWW::OpenAPIClient::DefaultApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::DefaultApi;
```

All URIs are relative to *https://authserver.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authenticate**](DefaultApi.md#authenticate) | **POST** /authenticate | 
[**invalidate**](DefaultApi.md#invalidate) | **POST** /invalidate | 
[**refresh**](DefaultApi.md#refresh) | **POST** /refresh | 
[**siginout**](DefaultApi.md#siginout) | **POST** /signout | 
[**validate**](DefaultApi.md#validate) | **POST** /validate | 


# **authenticate**
> Authentication authenticate(authentication_request => $authentication_request)



### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::DefaultApi;
my $api_instance = WWW::OpenAPIClient::DefaultApi->new(
);

my $authentication_request = WWW::OpenAPIClient::Object::AuthenticationRequest->new(); # AuthenticationRequest | 

eval { 
    my $result = $api_instance->authenticate(authentication_request => $authentication_request);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling DefaultApi->authenticate: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authentication_request** | [**AuthenticationRequest**](AuthenticationRequest.md)|  | 

### Return type

[**Authentication**](Authentication.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **invalidate**
> invalidate(access_keys => $access_keys)



### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::DefaultApi;
my $api_instance = WWW::OpenAPIClient::DefaultApi->new(
);

my $access_keys = WWW::OpenAPIClient::Object::AccessKeys->new(); # AccessKeys | 

eval { 
    $api_instance->invalidate(access_keys => $access_keys);
};
if ($@) {
    warn "Exception when calling DefaultApi->invalidate: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_keys** | [**AccessKeys**](AccessKeys.md)|  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **refresh**
> RefreshResponse refresh(refresh_request => $refresh_request)



### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::DefaultApi;
my $api_instance = WWW::OpenAPIClient::DefaultApi->new(
);

my $refresh_request = WWW::OpenAPIClient::Object::RefreshRequest->new(); # RefreshRequest | 

eval { 
    my $result = $api_instance->refresh(refresh_request => $refresh_request);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling DefaultApi->refresh: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **refresh_request** | [**RefreshRequest**](RefreshRequest.md)|  | 

### Return type

[**RefreshResponse**](RefreshResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **siginout**
> siginout(username_password => $username_password)



### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::DefaultApi;
my $api_instance = WWW::OpenAPIClient::DefaultApi->new(
);

my $username_password = WWW::OpenAPIClient::Object::UsernamePassword->new(); # UsernamePassword | 

eval { 
    $api_instance->siginout(username_password => $username_password);
};
if ($@) {
    warn "Exception when calling DefaultApi->siginout: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username_password** | [**UsernamePassword**](UsernamePassword.md)|  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **validate**
> validate(access_keys => $access_keys)



### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::DefaultApi;
my $api_instance = WWW::OpenAPIClient::DefaultApi->new(
);

my $access_keys = WWW::OpenAPIClient::Object::AccessKeys->new(); # AccessKeys | 

eval { 
    $api_instance->validate(access_keys => $access_keys);
};
if ($@) {
    warn "Exception when calling DefaultApi->validate: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **access_keys** | [**AccessKeys**](AccessKeys.md)|  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

