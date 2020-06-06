# PLAYER_PROFILE

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**STRING_32**](STRING_32.md) | The player UUID without hyphens | [default to null]
**name** | [**STRING_32**](STRING_32.md) |  | [default to null]
**legacy** | **BOOLEAN** | Will appear in the response if the user has not migrated their minecraft.net account to Mojang. | [optional] [default to false]
**properties** | [**LIST [PLAYER_PROFILE_PROPERTY]**](PlayerProfileProperty.md) | An array with all player properties, like skin and cape | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


