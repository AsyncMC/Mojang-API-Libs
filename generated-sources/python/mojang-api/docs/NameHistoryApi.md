# openapi_client.NameHistoryApi

All URIs are relative to *https://api.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**find_unique_ids_by_name**](NameHistoryApi.md#find_unique_ids_by_name) | **POST** /profiles/minecraft | Find the current UUID of multiple players at once
[**get_name_history**](NameHistoryApi.md#get_name_history) | **GET** /user/profiles/{stripped_uuid}/names | Gets the full player&#39;s name history
[**get_unique_id_by_name**](NameHistoryApi.md#get_unique_id_by_name) | **GET** /users/profiles/minecraft/{username} | Find the UUID by name


# **find_unique_ids_by_name**
> list[CurrentPlayerIDs] find_unique_ids_by_name(request_body)

Find the current UUID of multiple players at once

Find the current players name, UUID, demo status and migration flag by the current players name. The \"at\" parameter is not supported. Players not found are not returned. If no players are found, an empty array is returned.

### Example
```python
from __future__ import print_function
import time
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = openapi_client.NameHistoryApi()
request_body = [ "joserobjr", "nonExistingPlayer", "maksimkurb" ] # list[str] | Array with the player names

try:
    # Find the current UUID of multiple players at once
    api_response = api_instance.find_unique_ids_by_name(request_body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling NameHistoryApi->find_unique_ids_by_name: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request_body** | [**list[str]**](list.md)| Array with the player names | 

### Return type

[**list[CurrentPlayerIDs]**](CurrentPlayerIDs.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_name_history**
> list[NameChange] get_name_history(stripped_uuid)

Gets the full player's name history

### Example
```python
from __future__ import print_function
import time
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = openapi_client.NameHistoryApi()
stripped_uuid = 38ba542eb5924231a54cca0f2eac2b54 # str | The player UUID without hyphens

try:
    # Gets the full player's name history
    api_response = api_instance.get_name_history(stripped_uuid)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling NameHistoryApi->get_name_history: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stripped_uuid** | **str**| The player UUID without hyphens | 

### Return type

[**list[NameChange]**](NameChange.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_unique_id_by_name**
> CurrentPlayerIDs get_unique_id_by_name(username, at=at)

Find the UUID by name

Find the current player name, UUID, demo status and migration flag by the current player name or at a given time.

### Example
```python
from __future__ import print_function
import time
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = openapi_client.NameHistoryApi()
username = LordofMC_Playerz # str | The username in a given time, or in present if \"at\" is not sent
at = 1448533942 # int | Find the username in a given time, when 0 selects the original name however, it only works if the name was changed at least once, or if the account is legacy. The time is an UNIX timestamp (without milliseconds) (optional)

try:
    # Find the UUID by name
    api_response = api_instance.get_unique_id_by_name(username, at=at)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling NameHistoryApi->get_unique_id_by_name: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **str**| The username in a given time, or in present if \&quot;at\&quot; is not sent | 
 **at** | **int**| Find the username in a given time, when 0 selects the original name however, it only works if the name was changed at least once, or if the account is legacy. The time is an UNIX timestamp (without milliseconds) | [optional] 

### Return type

[**CurrentPlayerIDs**](CurrentPlayerIDs.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

