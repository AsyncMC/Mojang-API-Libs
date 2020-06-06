# Org.OpenAPITools.Api.DefaultApi

All URIs are relative to *https://authserver.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Authenticate**](DefaultApi.md#authenticate) | **POST** /authenticate | 
[**Invalidate**](DefaultApi.md#invalidate) | **POST** /invalidate | 
[**Refresh**](DefaultApi.md#refresh) | **POST** /refresh | 
[**Siginout**](DefaultApi.md#siginout) | **POST** /signout | 
[**Validate**](DefaultApi.md#validate) | **POST** /validate | 


<a name="authenticate"></a>
# **Authenticate**
> Authentication Authenticate (AuthenticationRequest authenticationRequest)



### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class AuthenticateExample
    {
        public void main()
        {
            
            var apiInstance = new DefaultApi();
            var authenticationRequest = new AuthenticationRequest(); // AuthenticationRequest | 

            try
            {
                Authentication result = apiInstance.Authenticate(authenticationRequest);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling DefaultApi.Authenticate: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authenticationRequest** | [**AuthenticationRequest**](AuthenticationRequest.md)|  | 

### Return type

[**Authentication**](Authentication.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="invalidate"></a>
# **Invalidate**
> void Invalidate (AccessKeys accessKeys)



### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class InvalidateExample
    {
        public void main()
        {
            
            var apiInstance = new DefaultApi();
            var accessKeys = new AccessKeys(); // AccessKeys | 

            try
            {
                apiInstance.Invalidate(accessKeys);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling DefaultApi.Invalidate: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessKeys** | [**AccessKeys**](AccessKeys.md)|  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="refresh"></a>
# **Refresh**
> RefreshResponse Refresh (RefreshRequest refreshRequest)



### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class RefreshExample
    {
        public void main()
        {
            
            var apiInstance = new DefaultApi();
            var refreshRequest = new RefreshRequest(); // RefreshRequest | 

            try
            {
                RefreshResponse result = apiInstance.Refresh(refreshRequest);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling DefaultApi.Refresh: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **refreshRequest** | [**RefreshRequest**](RefreshRequest.md)|  | 

### Return type

[**RefreshResponse**](RefreshResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="siginout"></a>
# **Siginout**
> void Siginout (UsernamePassword usernamePassword)



### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class SiginoutExample
    {
        public void main()
        {
            
            var apiInstance = new DefaultApi();
            var usernamePassword = new UsernamePassword(); // UsernamePassword | 

            try
            {
                apiInstance.Siginout(usernamePassword);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling DefaultApi.Siginout: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **usernamePassword** | [**UsernamePassword**](UsernamePassword.md)|  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="validate"></a>
# **Validate**
> void Validate (AccessKeys accessKeys)



### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ValidateExample
    {
        public void main()
        {
            
            var apiInstance = new DefaultApi();
            var accessKeys = new AccessKeys(); // AccessKeys | 

            try
            {
                apiInstance.Validate(accessKeys);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling DefaultApi.Validate: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessKeys** | [**AccessKeys**](AccessKeys.md)|  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

