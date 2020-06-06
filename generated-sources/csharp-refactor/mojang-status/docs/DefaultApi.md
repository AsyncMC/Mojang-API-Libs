# Org.OpenAPITools.com.github.asyncmc.mojang.status.csharp.refactor.api.DefaultApi

All URIs are relative to *https://status.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CheckStatuses**](DefaultApi.md#checkstatuses) | **GET** /check | Checks the Mojang service statuses


<a name="checkstatuses"></a>
# **CheckStatuses**
> List<Dictionary<string, ApiStatus>> CheckStatuses ()

Checks the Mojang service statuses

### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.com.github.asyncmc.mojang.status.csharp.refactor.api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.com.github.asyncmc.mojang.status.csharp.refactor.model;

namespace Example
{
    public class CheckStatusesExample
    {
        public void main()
        {
            var apiInstance = new DefaultApi();

            try
            {
                // Checks the Mojang service statuses
                List&lt;Dictionary&lt;string, ApiStatus&gt;&gt; result = apiInstance.CheckStatuses();
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling DefaultApi.CheckStatuses: " + e.Message );
            }
        }
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**List<Dictionary<string, ApiStatus>>**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

