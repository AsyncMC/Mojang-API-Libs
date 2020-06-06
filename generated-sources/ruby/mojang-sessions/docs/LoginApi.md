# OpenapiClient::LoginApi

All URIs are relative to *https://sessionserver.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_player_profile**](LoginApi.md#get_player_profile) | **GET** /session/minecraft/profile/{stripped_uuid} | Gets the player&#39;s game profile


# **get_player_profile**
> PlayerProfile get_player_profile(stripped_uuid, opts)

Gets the player's game profile

This will return the player's username plus any additional information about them (e.g. skins). This has a much stricter rate limit: You can request the same profile once per minute, however you can send as many unique requests as you like.

### Example
```ruby
# load the gem
require 'openapi_client'

api_instance = OpenapiClient::LoginApi.new
stripped_uuid = '853c80ef3c3749fdaa49938b674adae6' # String | The player UUID without hyphens
opts = {
  unsigned: true # BOOLEAN | When set to false, the signature data are sent
}

begin
  #Gets the player's game profile
  result = api_instance.get_player_profile(stripped_uuid, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Exception when calling LoginApi->get_player_profile: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stripped_uuid** | **String**| The player UUID without hyphens | 
 **unsigned** | **BOOLEAN**| When set to false, the signature data are sent | [optional] 

### Return type

[**PlayerProfile**](PlayerProfile.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



