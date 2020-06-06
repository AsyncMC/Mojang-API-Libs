# openapi_client.LoginApi

All URIs are relative to *https://sessionserver.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_player_profile**](LoginApi.md#get_player_profile) | **GET** /session/minecraft/profile/{stripped_uuid} | Gets the player&#39;s game profile


# **get_player_profile**
> PlayerProfile get_player_profile(stripped_uuid, unsigned=unsigned)

Gets the player's game profile

This will return the player's username plus any additional information about them (e.g. skins). This has a much stricter rate limit: You can request the same profile once per minute, however you can send as many unique requests as you like.

### Example
```python
from __future__ import print_function
import time
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# create an instance of the API class
api_instance = openapi_client.LoginApi()
stripped_uuid = 853c80ef3c3749fdaa49938b674adae6 # str | The player UUID without hyphens
unsigned = True # bool | When set to false, the signature data are sent (optional)

try:
    # Gets the player's game profile
    api_response = api_instance.get_player_profile(stripped_uuid, unsigned=unsigned)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling LoginApi->get_player_profile: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stripped_uuid** | **str**| The player UUID without hyphens | 
 **unsigned** | **bool**| When set to false, the signature data are sent | [optional] 

### Return type

[**PlayerProfile**](PlayerProfile.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

