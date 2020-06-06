# openapi_client.SkinOperationsApi

All URIs are relative to *https://api.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**change_player_skin**](SkinOperationsApi.md#change_player_skin) | **POST** /user/profile/{stripped_uuid}/skin | Changes the player skin by URL
[**reset_player_skin**](SkinOperationsApi.md#reset_player_skin) | **DELETE** /user/profile/{stripped_uuid}/skin | Resets the player skin to default
[**upload_player_skin**](SkinOperationsApi.md#upload_player_skin) | **PUT** /user/profile/{stripped_uuid}/skin | Changes the player skin by upload


# **change_player_skin**
> change_player_skin(stripped_uuid, url, model=model)

Changes the player skin by URL

This will set the skin for the selected profile, but Mojang's servers will fetch the skin from a URL. This will also work for legacy accounts.

### Example

* Basic Authentication (PlayerAccessToken): 
```python
from __future__ import print_function
import time
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Configure HTTP basic authorization: PlayerAccessToken
configuration = openapi_client.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = openapi_client.SkinOperationsApi(openapi_client.ApiClient(configuration))
stripped_uuid = 38ba542eb5924231a54cca0f2eac2b54 # str | The player UUID without hyphens
url = 'url_example' # str | The URL which Mojang servers will download and apply the skin
model = openapi_client.SkinModel() # SkinModel |  (optional)

try:
    # Changes the player skin by URL
    api_instance.change_player_skin(stripped_uuid, url, model=model)
except ApiException as e:
    print("Exception when calling SkinOperationsApi->change_player_skin: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stripped_uuid** | **str**| The player UUID without hyphens | 
 **url** | **str**| The URL which Mojang servers will download and apply the skin | 
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
> reset_player_skin(stripped_uuid)

Resets the player skin to default

### Example

* Basic Authentication (PlayerAccessToken): 
```python
from __future__ import print_function
import time
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Configure HTTP basic authorization: PlayerAccessToken
configuration = openapi_client.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = openapi_client.SkinOperationsApi(openapi_client.ApiClient(configuration))
stripped_uuid = 38ba542eb5924231a54cca0f2eac2b54 # str | The player UUID without hyphens

try:
    # Resets the player skin to default
    api_instance.reset_player_skin(stripped_uuid)
except ApiException as e:
    print("Exception when calling SkinOperationsApi->reset_player_skin: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stripped_uuid** | **str**| The player UUID without hyphens | 

### Return type

void (empty response body)

### Authorization

[PlayerAccessToken](../README.md#PlayerAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **upload_player_skin**
> upload_player_skin(stripped_uuid, file, model=model)

Changes the player skin by upload

This uploads a skin to Mojang's servers. It also sets the users skin. This works on legacy counts as well.

### Example

* Basic Authentication (PlayerAccessToken): 
```python
from __future__ import print_function
import time
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Configure HTTP basic authorization: PlayerAccessToken
configuration = openapi_client.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'

# create an instance of the API class
api_instance = openapi_client.SkinOperationsApi(openapi_client.ApiClient(configuration))
stripped_uuid = 38ba542eb5924231a54cca0f2eac2b54 # str | The player UUID without hyphens
file = '/path/to/file' # file | The skin image in PNG format
model = openapi_client.SkinModel() # SkinModel |  (optional)

try:
    # Changes the player skin by upload
    api_instance.upload_player_skin(stripped_uuid, file, model=model)
except ApiException as e:
    print("Exception when calling SkinOperationsApi->upload_player_skin: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **stripped_uuid** | **str**| The player UUID without hyphens | 
 **file** | **file**| The skin image in PNG format | 
 **model** | [**SkinModel**](SkinModel.md)|  | [optional] 

### Return type

void (empty response body)

### Authorization

[PlayerAccessToken](../README.md#PlayerAccessToken)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

