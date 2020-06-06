# PLAYER_PROFILE_TEXTURE_PROPERTY_VALUE

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**timestamp** | **INTEGER_64** | UNIX timestamp in milliseconds | [default to null]
**profile_id** | [**STRING_32**](STRING_32.md) | The player UUID without hyphens | [default to null]
**profile_name** | [**STRING_32**](STRING_32.md) | The player&#39;s name | [default to null]
**signature_required** | **BOOLEAN** | Only present if unsigned was set to false in the request | [optional] [default to false]
**textures** | [**PLAYER_TEXTURE**](PlayerTexture.md) |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


