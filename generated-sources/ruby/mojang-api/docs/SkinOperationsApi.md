# OpenapiClient::SkinOperationsApi

All URIs are relative to *https://api.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**change_player_skin**](SkinOperationsApi.md#change_player_skin) | **POST** /user/profile/{stripped_uuid}/skin | Changes the player skin by URL
[**reset_player_skin**](SkinOperationsApi.md#reset_player_skin) | **DELETE** /user/profile/{stripped_uuid}/skin | Resets the player skin to default
[**upload_player_skin**](SkinOperationsApi.md#upload_player_skin) | **PUT** /user/profile/{stripped_uuid}/skin | Changes the player skin by upload


# **change_player_skin**
> change_player_skin(stripped_uuid, url, opts)

Changes the player skin by URL

This will set the skin for the selected profile, but Mojang's servers will fetch the skin from a URL. This will also work for legacy accounts.

### Example
```ruby
# load the gem
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure HTTP basic authorization: PlayerAccessToken
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = OpenapiClient::SkinOperationsApi.new
stripped_uuid = '38ba542eb5924231a54cca0f2eac2b54' # String | The player UUID without hyphens
url = 'url_example' # String | The URL which Mojang servers will download and apply the skin
opts = {
  model: OpenapiClient::SkinModel.new # SkinModel | 
}

begin
  #Changes the player skin by URL
  api_instance.change_player_skin(stripped_uuid, url, opts)
rescue OpenapiClient::ApiError => e
  puts "Exception when calling SkinOperationsApi->change_player_skin: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stripped_uuid** | **String**| The player UUID without hyphens | 
 **url** | **String**| The URL which Mojang servers will download and apply the skin | 
 **model** | [**SkinModel**](SkinModel.md)|  | [optional] 

### Return type

nil (empty response body)

### Authorization

[PlayerAccessToken](../README.md#PlayerAccessToken)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json



# **reset_player_skin**
> reset_player_skin(stripped_uuid)

Resets the player skin to default

### Example
```ruby
# load the gem
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure HTTP basic authorization: PlayerAccessToken
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = OpenapiClient::SkinOperationsApi.new
stripped_uuid = '38ba542eb5924231a54cca0f2eac2b54' # String | The player UUID without hyphens

begin
  #Resets the player skin to default
  api_instance.reset_player_skin(stripped_uuid)
rescue OpenapiClient::ApiError => e
  puts "Exception when calling SkinOperationsApi->reset_player_skin: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stripped_uuid** | **String**| The player UUID without hyphens | 

### Return type

nil (empty response body)

### Authorization

[PlayerAccessToken](../README.md#PlayerAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **upload_player_skin**
> upload_player_skin(stripped_uuid, file, opts)

Changes the player skin by upload

This uploads a skin to Mojang's servers. It also sets the users skin. This works on legacy counts as well.

### Example
```ruby
# load the gem
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure HTTP basic authorization: PlayerAccessToken
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'
end

api_instance = OpenapiClient::SkinOperationsApi.new
stripped_uuid = '38ba542eb5924231a54cca0f2eac2b54' # String | The player UUID without hyphens
file = File.new('/path/to/file') # File | The skin image in PNG format
opts = {
  model: OpenapiClient::SkinModel.new # SkinModel | 
}

begin
  #Changes the player skin by upload
  api_instance.upload_player_skin(stripped_uuid, file, opts)
rescue OpenapiClient::ApiError => e
  puts "Exception when calling SkinOperationsApi->upload_player_skin: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stripped_uuid** | **String**| The player UUID without hyphens | 
 **file** | **File**| The skin image in PNG format | 
 **model** | [**SkinModel**](SkinModel.md)|  | [optional] 

### Return type

nil (empty response body)

### Authorization

[PlayerAccessToken](../README.md#PlayerAccessToken)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json



