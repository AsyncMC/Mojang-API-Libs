# PlayerProfileTexturePropertyValue

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**timestamp** | **i64** | UNIX timestamp in milliseconds | 
**profile_id** | **String** | The player UUID without hyphens | 
**profile_name** | **String** | The player's name | 
**signature_required** | **bool** | Only present if unsigned was set to false in the request | [optional] [default to false]
**textures** | [***::models::PlayerTexture**](PlayerTexture.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


