# OpenapiClient::NameHistoryApi

All URIs are relative to *https://api.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**find_unique_ids_by_name**](NameHistoryApi.md#find_unique_ids_by_name) | **POST** /profiles/minecraft | Find the current UUID of multiple players at once
[**get_name_history**](NameHistoryApi.md#get_name_history) | **GET** /user/profiles/{stripped_uuid}/names | Gets the full player&#39;s name history
[**get_unique_id_by_name**](NameHistoryApi.md#get_unique_id_by_name) | **GET** /users/profiles/minecraft/{username} | Find the UUID by name


# **find_unique_ids_by_name**
> Array&lt;CurrentPlayerIDs&gt; find_unique_ids_by_name(request_body)

Find the current UUID of multiple players at once

Find the current players name, UUID, demo status and migration flag by the current players name. The \"at\" parameter is not supported. Players not found are not returned. If no players are found, an empty array is returned.

### Example
```ruby
# load the gem
require 'openapi_client'

api_instance = OpenapiClient::NameHistoryApi.new
request_body = [ "joserobjr", "nonExistingPlayer", "maksimkurb" ] # Array<String> | Array with the player names

begin
  #Find the current UUID of multiple players at once
  result = api_instance.find_unique_ids_by_name(request_body)
  p result
rescue OpenapiClient::ApiError => e
  puts "Exception when calling NameHistoryApi->find_unique_ids_by_name: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request_body** | [**Array&lt;String&gt;**](Array.md)| Array with the player names | 

### Return type

[**Array&lt;CurrentPlayerIDs&gt;**](CurrentPlayerIDs.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json



# **get_name_history**
> Array&lt;NameChange&gt; get_name_history(stripped_uuid)

Gets the full player's name history

### Example
```ruby
# load the gem
require 'openapi_client'

api_instance = OpenapiClient::NameHistoryApi.new
stripped_uuid = '38ba542eb5924231a54cca0f2eac2b54' # String | The player UUID without hyphens

begin
  #Gets the full player's name history
  result = api_instance.get_name_history(stripped_uuid)
  p result
rescue OpenapiClient::ApiError => e
  puts "Exception when calling NameHistoryApi->get_name_history: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stripped_uuid** | **String**| The player UUID without hyphens | 

### Return type

[**Array&lt;NameChange&gt;**](NameChange.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



# **get_unique_id_by_name**
> CurrentPlayerIDs get_unique_id_by_name(username, opts)

Find the UUID by name

Find the current player name, UUID, demo status and migration flag by the current player name or at a given time.

### Example
```ruby
# load the gem
require 'openapi_client'

api_instance = OpenapiClient::NameHistoryApi.new
username = 'LordofMC_Playerz' # String | The username in a given time, or in present if \"at\" is not sent
opts = {
  at: 1448533942 # Integer | Find the username in a given time, when 0 selects the original name however, it only works if the name was changed at least once, or if the account is legacy. The time is an UNIX timestamp (without milliseconds)
}

begin
  #Find the UUID by name
  result = api_instance.get_unique_id_by_name(username, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Exception when calling NameHistoryApi->get_unique_id_by_name: #{e}"
end
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| The username in a given time, or in present if \&quot;at\&quot; is not sent | 
 **at** | **Integer**| Find the username in a given time, when 0 selects the original name however, it only works if the name was changed at least once, or if the account is legacy. The time is an UNIX timestamp (without milliseconds) | [optional] 

### Return type

[**CurrentPlayerIDs**](CurrentPlayerIDs.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json



