# WWW::OpenAPIClient::Object::PlayerProfileTexturePropertyValue

## Load the model package
```perl
use WWW::OpenAPIClient::Object::PlayerProfileTexturePropertyValue;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**timestamp** | **int** | UNIX timestamp in milliseconds | 
**profile_id** | **string** | The player UUID without hyphens | 
**profile_name** | **string** | The player&#39;s name | 
**signature_required** | **boolean** | Only present if unsigned was set to false in the request | [optional] [default to false]
**textures** | [**PlayerTexture**](PlayerTexture.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


