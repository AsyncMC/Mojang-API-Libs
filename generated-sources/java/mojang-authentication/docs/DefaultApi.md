# DefaultApi

All URIs are relative to *https://authserver.mojang.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authenticate**](DefaultApi.md#authenticate) | **POST** /authenticate | 
[**invalidate**](DefaultApi.md#invalidate) | **POST** /invalidate | 
[**refresh**](DefaultApi.md#refresh) | **POST** /refresh | 
[**siginout**](DefaultApi.md#siginout) | **POST** /signout | 
[**validate**](DefaultApi.md#validate) | **POST** /validate | 


<a name="authenticate"></a>
# **authenticate**
> Authentication authenticate(authenticationRequest)



### Example
```java
// Import classes:
//import com.github.asyncmc.mojang.authentication.java.server.ApiException;
//import com.github.asyncmc.mojang.authentication.java.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
AuthenticationRequest authenticationRequest = new AuthenticationRequest(); // AuthenticationRequest | 
try {
    Authentication result = apiInstance.authenticate(authenticationRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#authenticate");
    e.printStackTrace();
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

<a name="invalidate"></a>
# **invalidate**
> invalidate(accessKeys)



### Example
```java
// Import classes:
//import com.github.asyncmc.mojang.authentication.java.server.ApiException;
//import com.github.asyncmc.mojang.authentication.java.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
AccessKeys accessKeys = new AccessKeys(); // AccessKeys | 
try {
    apiInstance.invalidate(accessKeys);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#invalidate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessKeys** | [**AccessKeys**](AccessKeys.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="refresh"></a>
# **refresh**
> RefreshResponse refresh(refreshRequest)



### Example
```java
// Import classes:
//import com.github.asyncmc.mojang.authentication.java.server.ApiException;
//import com.github.asyncmc.mojang.authentication.java.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
RefreshRequest refreshRequest = new RefreshRequest(); // RefreshRequest | 
try {
    RefreshResponse result = apiInstance.refresh(refreshRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#refresh");
    e.printStackTrace();
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

<a name="siginout"></a>
# **siginout**
> siginout(usernamePassword)



### Example
```java
// Import classes:
//import com.github.asyncmc.mojang.authentication.java.server.ApiException;
//import com.github.asyncmc.mojang.authentication.java.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
UsernamePassword usernamePassword = new UsernamePassword(); // UsernamePassword | 
try {
    apiInstance.siginout(usernamePassword);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#siginout");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **usernamePassword** | [**UsernamePassword**](UsernamePassword.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="validate"></a>
# **validate**
> validate(accessKeys)



### Example
```java
// Import classes:
//import com.github.asyncmc.mojang.authentication.java.server.ApiException;
//import com.github.asyncmc.mojang.authentication.java.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
AccessKeys accessKeys = new AccessKeys(); // AccessKeys | 
try {
    apiInstance.validate(accessKeys);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#validate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessKeys** | [**AccessKeys**](AccessKeys.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

