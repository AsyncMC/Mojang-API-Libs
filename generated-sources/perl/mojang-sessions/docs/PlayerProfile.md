# WWW::OpenAPIClient::Object::PlayerProfile

## Load the model package
```perl
use WWW::OpenAPIClient::Object::PlayerProfile;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** | The player UUID without hyphens | 
**name** | **string** |  | 
**legacy** | **boolean** | Will appear in the response if the user has not migrated their minecraft.net account to Mojang. | [optional] [default to false]
**properties** | [**ARRAY[PlayerProfileProperty]**](PlayerProfileProperty.md) | An array with all player properties, like skin and cape | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


