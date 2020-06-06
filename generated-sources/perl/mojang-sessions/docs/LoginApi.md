# WWW::OpenAPIClient::LoginApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::LoginApi;
```

All URIs are relative to *https://sessionserver.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_player_profile**](LoginApi.md#get_player_profile) | **GET** /session/minecraft/profile/{stripped_uuid} | Gets the player&#39;s game profile


# **get_player_profile**
> PlayerProfile get_player_profile(stripped_uuid => $stripped_uuid, unsigned => $unsigned)

Gets the player's game profile

This will return the player's username plus any additional information about them (e.g. skins). This has a much stricter rate limit: You can request the same profile once per minute, however you can send as many unique requests as you like.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::LoginApi;
my $api_instance = WWW::OpenAPIClient::LoginApi->new(
);

my $stripped_uuid = 853c80ef3c3749fdaa49938b674adae6; # string | The player UUID without hyphens
my $unsigned = null; # boolean | When set to false, the signature data are sent

eval { 
    my $result = $api_instance->get_player_profile(stripped_uuid => $stripped_uuid, unsigned => $unsigned);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling LoginApi->get_player_profile: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stripped_uuid** | **string**| The player UUID without hyphens | 
 **unsigned** | **boolean**| When set to false, the signature data are sent | [optional] 

### Return type

[**PlayerProfile**](PlayerProfile.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

