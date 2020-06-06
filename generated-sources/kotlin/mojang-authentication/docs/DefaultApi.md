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
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import com.github.asyncmc.mojang.authentication.kotlin.model.*

val apiInstance = DefaultApi()
val authenticationRequest : AuthenticationRequest =  // AuthenticationRequest | 
try {
    val result : Authentication = apiInstance.authenticate(authenticationRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#authenticate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#authenticate")
    e.printStackTrace()
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
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import com.github.asyncmc.mojang.authentication.kotlin.model.*

val apiInstance = DefaultApi()
val accessKeys : AccessKeys =  // AccessKeys | 
try {
    apiInstance.invalidate(accessKeys)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#invalidate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#invalidate")
    e.printStackTrace()
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
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import com.github.asyncmc.mojang.authentication.kotlin.model.*

val apiInstance = DefaultApi()
val refreshRequest : RefreshRequest =  // RefreshRequest | 
try {
    val result : RefreshResponse = apiInstance.refresh(refreshRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#refresh")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#refresh")
    e.printStackTrace()
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
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import com.github.asyncmc.mojang.authentication.kotlin.model.*

val apiInstance = DefaultApi()
val usernamePassword : UsernamePassword =  // UsernamePassword | 
try {
    apiInstance.siginout(usernamePassword)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#siginout")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#siginout")
    e.printStackTrace()
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
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import com.github.asyncmc.mojang.authentication.kotlin.model.*

val apiInstance = DefaultApi()
val accessKeys : AccessKeys =  // AccessKeys | 
try {
    apiInstance.validate(accessKeys)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#validate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#validate")
    e.printStackTrace()
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

