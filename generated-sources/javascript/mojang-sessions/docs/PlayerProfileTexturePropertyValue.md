# MojangSessionApi.PlayerProfileTexturePropertyValue

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**timestamp** | **Number** | UNIX timestamp in milliseconds | 
**profileId** | **String** | The player UUID without hyphens | 
**profileName** | **String** | The player&#39;s name | 
**signatureRequired** | **Boolean** | Only present if unsigned was set to false in the request | [optional] [default to false]
**textures** | [**PlayerTexture**](PlayerTexture.md) |  | [optional] 


