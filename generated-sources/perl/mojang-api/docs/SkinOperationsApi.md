# WWW::OpenAPIClient::SkinOperationsApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::SkinOperationsApi;
```

All URIs are relative to *https://api.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**change_player_skin**](SkinOperationsApi.md#change_player_skin) | **POST** /user/profile/{stripped_uuid}/skin | Changes the player skin by URL
[**reset_player_skin**](SkinOperationsApi.md#reset_player_skin) | **DELETE** /user/profile/{stripped_uuid}/skin | Resets the player skin to default
[**upload_player_skin**](SkinOperationsApi.md#upload_player_skin) | **PUT** /user/profile/{stripped_uuid}/skin | Changes the player skin by upload


# **change_player_skin**
> change_player_skin(stripped_uuid => $stripped_uuid, url => $url, model => $model)

Changes the player skin by URL

This will set the skin for the selected profile, but Mojang's servers will fetch the skin from a URL. This will also work for legacy accounts.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::SkinOperationsApi;
my $api_instance = WWW::OpenAPIClient::SkinOperationsApi->new(

    # Configure HTTP basic authorization: PlayerAccessToken
    username => 'YOUR_USERNAME',
    password => 'YOUR_PASSWORD',
);

my $stripped_uuid = 38ba542eb5924231a54cca0f2eac2b54; # string | The player UUID without hyphens
my $url = "url_example"; # string | The URL which Mojang servers will download and apply the skin
my $model = new WWW::OpenAPIClient.SkinModel(); # SkinModel | 

eval { 
    $api_instance->change_player_skin(stripped_uuid => $stripped_uuid, url => $url, model => $model);
};
if ($@) {
    warn "Exception when calling SkinOperationsApi->change_player_skin: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stripped_uuid** | **string**| The player UUID without hyphens | 
 **url** | **string**| The URL which Mojang servers will download and apply the skin | 
 **model** | [**SkinModel**](SkinModel.md)|  | [optional] 

### Return type

void (empty response body)

### Authorization

[PlayerAccessToken](../README.md#PlayerAccessToken)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **reset_player_skin**
> reset_player_skin(stripped_uuid => $stripped_uuid)

Resets the player skin to default

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::SkinOperationsApi;
my $api_instance = WWW::OpenAPIClient::SkinOperationsApi->new(

    # Configure HTTP basic authorization: PlayerAccessToken
    username => 'YOUR_USERNAME',
    password => 'YOUR_PASSWORD',
);

my $stripped_uuid = 38ba542eb5924231a54cca0f2eac2b54; # string | The player UUID without hyphens

eval { 
    $api_instance->reset_player_skin(stripped_uuid => $stripped_uuid);
};
if ($@) {
    warn "Exception when calling SkinOperationsApi->reset_player_skin: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stripped_uuid** | **string**| The player UUID without hyphens | 

### Return type

void (empty response body)

### Authorization

[PlayerAccessToken](../README.md#PlayerAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **upload_player_skin**
> upload_player_skin(stripped_uuid => $stripped_uuid, file => $file, model => $model)

Changes the player skin by upload

This uploads a skin to Mojang's servers. It also sets the users skin. This works on legacy counts as well.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::SkinOperationsApi;
my $api_instance = WWW::OpenAPIClient::SkinOperationsApi->new(

    # Configure HTTP basic authorization: PlayerAccessToken
    username => 'YOUR_USERNAME',
    password => 'YOUR_PASSWORD',
);

my $stripped_uuid = 38ba542eb5924231a54cca0f2eac2b54; # string | The player UUID without hyphens
my $file = "/path/to/file"; # string | The skin image in PNG format
my $model = new WWW::OpenAPIClient.SkinModel(); # SkinModel | 

eval { 
    $api_instance->upload_player_skin(stripped_uuid => $stripped_uuid, file => $file, model => $model);
};
if ($@) {
    warn "Exception when calling SkinOperationsApi->upload_player_skin: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stripped_uuid** | **string**| The player UUID without hyphens | 
 **file** | **string****string**| The skin image in PNG format | 
 **model** | [**SkinModel**](SkinModel.md)|  | [optional] 

### Return type

void (empty response body)

### Authorization

[PlayerAccessToken](../README.md#PlayerAccessToken)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

