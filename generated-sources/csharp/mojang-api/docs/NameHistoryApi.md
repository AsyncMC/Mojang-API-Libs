# Org.OpenAPITools.com.github.asyncmc.mojang.api.csharp.api.NameHistoryApi

All URIs are relative to *https://api.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**FindUniqueIdsByName**](NameHistoryApi.md#finduniqueidsbyname) | **POST** /profiles/minecraft | Find the current UUID of multiple players at once
[**GetNameHistory**](NameHistoryApi.md#getnamehistory) | **GET** /user/profiles/{stripped_uuid}/names | Gets the full player&#39;s name history
[**GetUniqueIdByName**](NameHistoryApi.md#getuniqueidbyname) | **GET** /users/profiles/minecraft/{username} | Find the UUID by name


<a name="finduniqueidsbyname"></a>
# **FindUniqueIdsByName**
> List<CurrentPlayerIDs> FindUniqueIdsByName (List<string> requestBody)

Find the current UUID of multiple players at once

Find the current players name, UUID, demo status and migration flag by the current players name. The \"at\" parameter is not supported. Players not found are not returned. If no players are found, an empty array is returned.

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.com.github.asyncmc.mojang.api.csharp.api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.com.github.asyncmc.mojang.api.csharp.model;

namespace Example
{
    public class FindUniqueIdsByNameExample
    {
        public void main()
        {
            var apiInstance = new NameHistoryApi();
            var requestBody = new List<string>(); // List<string> | Array with the player names

            try
            {
                // Find the current UUID of multiple players at once
                List&lt;CurrentPlayerIDs&gt; result = apiInstance.FindUniqueIdsByName(requestBody);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling NameHistoryApi.FindUniqueIdsByName: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **requestBody** | [**List&lt;string&gt;**](List.md)| Array with the player names | 

### Return type

[**List<CurrentPlayerIDs>**](CurrentPlayerIDs.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getnamehistory"></a>
# **GetNameHistory**
> List<NameChange> GetNameHistory (string strippedUuid)

Gets the full player's name history

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.com.github.asyncmc.mojang.api.csharp.api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.com.github.asyncmc.mojang.api.csharp.model;

namespace Example
{
    public class GetNameHistoryExample
    {
        public void main()
        {
            var apiInstance = new NameHistoryApi();
            var strippedUuid = 38ba542eb5924231a54cca0f2eac2b54;  // string | The player UUID without hyphens

            try
            {
                // Gets the full player's name history
                List&lt;NameChange&gt; result = apiInstance.GetNameHistory(strippedUuid);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling NameHistoryApi.GetNameHistory: " + e.Message );
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

[**List<NameChange>**](NameChange.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getuniqueidbyname"></a>
# **GetUniqueIdByName**
> CurrentPlayerIDs GetUniqueIdByName (string username, long? at = null)

Find the UUID by name

Find the current player name, UUID, demo status and migration flag by the current player name or at a given time.

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.com.github.asyncmc.mojang.api.csharp.api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.com.github.asyncmc.mojang.api.csharp.model;

namespace Example
{
    public class GetUniqueIdByNameExample
    {
        public void main()
        {
            var apiInstance = new NameHistoryApi();
            var username = LordofMC_Playerz;  // string | The username in a given time, or in present if \"at\" is not sent
            var at = 1448533942;  // long? | Find the username in a given time, when 0 selects the original name however, it only works if the name was changed at least once, or if the account is legacy. The time is an UNIX timestamp (without milliseconds) (optional) 

            try
            {
                // Find the UUID by name
                CurrentPlayerIDs result = apiInstance.GetUniqueIdByName(username, at);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling NameHistoryApi.GetUniqueIdByName: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **string**| The username in a given time, or in present if \&quot;at\&quot; is not sent | 
 **at** | **long?**| Find the username in a given time, when 0 selects the original name however, it only works if the name was changed at least once, or if the account is legacy. The time is an UNIX timestamp (without milliseconds) | [optional] 

### Return type

[**CurrentPlayerIDs**](CurrentPlayerIDs.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

