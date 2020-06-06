# com.github.asyncmc.mojang.sessions.csharp.dotnet2.api.LoginApi

All URIs are relative to *https://sessionserver.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetPlayerProfile**](LoginApi.md#getplayerprofile) | **GET** /session/minecraft/profile/{stripped_uuid} | Gets the player&#39;s game profile


<a name="getplayerprofile"></a>
# **GetPlayerProfile**
> PlayerProfile GetPlayerProfile (string strippedUuid, bool? unsigned)

Gets the player's game profile

This will return the player's username plus any additional information about them (e.g. skins). This has a much stricter rate limit: You can request the same profile once per minute, however you can send as many unique requests as you like.

### Example
```csharp
using System;
using System.Diagnostics;
using com.github.asyncmc.mojang.sessions.csharp.dotnet2.api;
using Org.OpenAPITools.Client;
using com.github.asyncmc.mojang.sessions.csharp.dotnet2.model;

namespace Example
{
    public class GetPlayerProfileExample
    {
        public void main()
        {
            
            var apiInstance = new LoginApi();
            var strippedUuid = 853c80ef3c3749fdaa49938b674adae6;  // string | The player UUID without hyphens
            var unsigned = true;  // bool? | When set to false, the signature data are sent (optional) 

            try
            {
                // Gets the player's game profile
                PlayerProfile result = apiInstance.GetPlayerProfile(strippedUuid, unsigned);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling LoginApi.GetPlayerProfile: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **strippedUuid** | **string**| The player UUID without hyphens | 
 **unsigned** | **bool?**| When set to false, the signature data are sent | [optional] 

### Return type

[**PlayerProfile**](PlayerProfile.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

