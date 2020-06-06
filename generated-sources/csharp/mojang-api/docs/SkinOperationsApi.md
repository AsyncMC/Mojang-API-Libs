# Org.OpenAPITools.com.github.asyncmc.mojang.api.csharp.api.SkinOperationsApi

All URIs are relative to *https://api.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ChangePlayerSkin**](SkinOperationsApi.md#changeplayerskin) | **POST** /user/profile/{stripped_uuid}/skin | Changes the player skin by URL
[**ResetPlayerSkin**](SkinOperationsApi.md#resetplayerskin) | **DELETE** /user/profile/{stripped_uuid}/skin | Resets the player skin to default
[**UploadPlayerSkin**](SkinOperationsApi.md#uploadplayerskin) | **PUT** /user/profile/{stripped_uuid}/skin | Changes the player skin by upload


<a name="changeplayerskin"></a>
# **ChangePlayerSkin**
> void ChangePlayerSkin (string strippedUuid, string url, SkinModel model = null)

Changes the player skin by URL

This will set the skin for the selected profile, but Mojang's servers will fetch the skin from a URL. This will also work for legacy accounts.

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.com.github.asyncmc.mojang.api.csharp.api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.com.github.asyncmc.mojang.api.csharp.model;

namespace Example
{
    public class ChangePlayerSkinExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: PlayerAccessToken
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new SkinOperationsApi();
            var strippedUuid = 38ba542eb5924231a54cca0f2eac2b54;  // string | The player UUID without hyphens
            var url = url_example;  // string | The URL which Mojang servers will download and apply the skin
            var model = new SkinModel(); // SkinModel |  (optional) 

            try
            {
                // Changes the player skin by URL
                apiInstance.ChangePlayerSkin(strippedUuid, url, model);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SkinOperationsApi.ChangePlayerSkin: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **strippedUuid** | **string**| The player UUID without hyphens | 
 **url** | **string**| The URL which Mojang servers will download and apply the skin | 
 **model** | [**SkinModel**](SkinModel.md)|  | [optional] 

### Return type

void (empty response body)

### Authorization

[PlayerAccessToken](../README.md#PlayerAccessToken)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="resetplayerskin"></a>
# **ResetPlayerSkin**
> void ResetPlayerSkin (string strippedUuid)

Resets the player skin to default

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.com.github.asyncmc.mojang.api.csharp.api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.com.github.asyncmc.mojang.api.csharp.model;

namespace Example
{
    public class ResetPlayerSkinExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: PlayerAccessToken
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new SkinOperationsApi();
            var strippedUuid = 38ba542eb5924231a54cca0f2eac2b54;  // string | The player UUID without hyphens

            try
            {
                // Resets the player skin to default
                apiInstance.ResetPlayerSkin(strippedUuid);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SkinOperationsApi.ResetPlayerSkin: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **strippedUuid** | **string**| The player UUID without hyphens | 

### Return type

void (empty response body)

### Authorization

[PlayerAccessToken](../README.md#PlayerAccessToken)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="uploadplayerskin"></a>
# **UploadPlayerSkin**
> void UploadPlayerSkin (string strippedUuid, System.IO.Stream file, SkinModel model = null)

Changes the player skin by upload

This uploads a skin to Mojang's servers. It also sets the users skin. This works on legacy counts as well.

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.com.github.asyncmc.mojang.api.csharp.api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.com.github.asyncmc.mojang.api.csharp.model;

namespace Example
{
    public class UploadPlayerSkinExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: PlayerAccessToken
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new SkinOperationsApi();
            var strippedUuid = 38ba542eb5924231a54cca0f2eac2b54;  // string | The player UUID without hyphens
            var file = BINARY_DATA_HERE;  // System.IO.Stream | The skin image in PNG format
            var model = new SkinModel(); // SkinModel |  (optional) 

            try
            {
                // Changes the player skin by upload
                apiInstance.UploadPlayerSkin(strippedUuid, file, model);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling SkinOperationsApi.UploadPlayerSkin: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **strippedUuid** | **string**| The player UUID without hyphens | 
 **file** | **System.IO.Stream**| The skin image in PNG format | 
 **model** | [**SkinModel**](SkinModel.md)|  | [optional] 

### Return type

void (empty response body)

### Authorization

[PlayerAccessToken](../README.md#PlayerAccessToken)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

