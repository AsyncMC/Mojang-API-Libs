# openapi.model.PlayerProfile

## Load the model package
```dart
import 'package:openapi/api.dart';
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The player UUID without hyphens | [default to null]
**name** | **String** |  | [default to null]
**legacy** | **bool** | Will appear in the response if the user has not migrated their minecraft.net account to Mojang. | [optional] [default to false]
**properties** | [**List&lt;PlayerProfileProperty&gt;**](PlayerProfileProperty.md) | An array with all player properties, like skin and cape | [default to []]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


