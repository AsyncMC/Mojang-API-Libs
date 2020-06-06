# openapi.model.PlayerProfileTexturePropertyValue

## Load the model package
```dart
import 'package:openapi/api.dart';
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**timestamp** | **int** | UNIX timestamp in milliseconds | [default to null]
**profileId** | **String** | The player UUID without hyphens | [default to null]
**profileName** | **String** | The player&#39;s name | [default to null]
**signatureRequired** | **bool** | Only present if unsigned was set to false in the request | [optional] [default to false]
**textures** | [**PlayerTexture**](PlayerTexture.md) |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


