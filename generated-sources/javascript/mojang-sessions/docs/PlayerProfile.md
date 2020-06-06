# MojangSessionApi.PlayerProfile

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The player UUID without hyphens | 
**name** | **String** |  | 
**legacy** | **Boolean** | Will appear in the response if the user has not migrated their minecraft.net account to Mojang. | [optional] [default to false]
**properties** | [**[PlayerProfileProperty]**](PlayerProfileProperty.md) | An array with all player properties, like skin and cape | 


