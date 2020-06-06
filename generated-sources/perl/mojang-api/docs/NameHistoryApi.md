# WWW::OpenAPIClient::NameHistoryApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::NameHistoryApi;
```

All URIs are relative to *https://api.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**find_unique_ids_by_name**](NameHistoryApi.md#find_unique_ids_by_name) | **POST** /profiles/minecraft | Find the current UUID of multiple players at once
[**get_name_history**](NameHistoryApi.md#get_name_history) | **GET** /user/profiles/{stripped_uuid}/names | Gets the full player&#39;s name history
[**get_unique_id_by_name**](NameHistoryApi.md#get_unique_id_by_name) | **GET** /users/profiles/minecraft/{username} | Find the UUID by name


# **find_unique_ids_by_name**
> ARRAY[CurrentPlayerIDs] find_unique_ids_by_name(request_body => $request_body)

Find the current UUID of multiple players at once

Find the current players name, UUID, demo status and migration flag by the current players name. The \"at\" parameter is not supported. Players not found are not returned. If no players are found, an empty array is returned.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::NameHistoryApi;
my $api_instance = WWW::OpenAPIClient::NameHistoryApi->new(
);

my $request_body = [WWW::OpenAPIClient::Object::ARRAY[string]->new()]; # ARRAY[string] | Array with the player names

eval { 
    my $result = $api_instance->find_unique_ids_by_name(request_body => $request_body);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling NameHistoryApi->find_unique_ids_by_name: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request_body** | [**ARRAY[string]**](ARRAY.md)| Array with the player names | 

### Return type

[**ARRAY[CurrentPlayerIDs]**](CurrentPlayerIDs.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_name_history**
> ARRAY[NameChange] get_name_history(stripped_uuid => $stripped_uuid)

Gets the full player's name history

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::NameHistoryApi;
my $api_instance = WWW::OpenAPIClient::NameHistoryApi->new(
);

my $stripped_uuid = 38ba542eb5924231a54cca0f2eac2b54; # string | The player UUID without hyphens

eval { 
    my $result = $api_instance->get_name_history(stripped_uuid => $stripped_uuid);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling NameHistoryApi->get_name_history: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stripped_uuid** | **string**| The player UUID without hyphens | 

### Return type

[**ARRAY[NameChange]**](NameChange.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_unique_id_by_name**
> CurrentPlayerIDs get_unique_id_by_name(username => $username, at => $at)

Find the UUID by name

Find the current player name, UUID, demo status and migration flag by the current player name or at a given time.

### Example 
```perl
use Data::Dumper;
use WWW::OpenAPIClient::NameHistoryApi;
my $api_instance = WWW::OpenAPIClient::NameHistoryApi->new(
);

my $username = LordofMC_Playerz; # string | The username in a given time, or in present if \"at\" is not sent
my $at = 1448533942; # int | Find the username in a given time, when 0 selects the original name however, it only works if the name was changed at least once, or if the account is legacy. The time is an UNIX timestamp (without milliseconds)

eval { 
    my $result = $api_instance->get_unique_id_by_name(username => $username, at => $at);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling NameHistoryApi->get_unique_id_by_name: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **string**| The username in a given time, or in present if \&quot;at\&quot; is not sent | 
 **at** | **int**| Find the username in a given time, when 0 selects the original name however, it only works if the name was changed at least once, or if the account is legacy. The time is an UNIX timestamp (without milliseconds) | [optional] 

### Return type

[**CurrentPlayerIDs**](CurrentPlayerIDs.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

