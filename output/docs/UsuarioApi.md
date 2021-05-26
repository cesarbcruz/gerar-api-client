# UsuarioApi

All URIs are relative to *http://localhost:8080/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**usuarioGet**](UsuarioApi.md#usuarioGet) | **GET** /usuario | 
[**usuarioLoginDelete**](UsuarioApi.md#usuarioLoginDelete) | **DELETE** /usuario/{login} | 
[**usuarioLoginGet**](UsuarioApi.md#usuarioLoginGet) | **GET** /usuario/{login} | 
[**usuarioLoginPatch**](UsuarioApi.md#usuarioLoginPatch) | **PATCH** /usuario/{login} | 
[**usuarioPost**](UsuarioApi.md#usuarioPost) | **POST** /usuario | 


<a name="usuarioGet"></a>
# **usuarioGet**
> List&lt;Usuario&gt; usuarioGet()



### Example
```java
// Import classes:
//import logic.smartmind.client.invoker.ApiException;
//import logic.smartmind.client.api.UsuarioApi;


UsuarioApi apiInstance = new UsuarioApi();
try {
    List<Usuario> result = apiInstance.usuarioGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsuarioApi#usuarioGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Usuario&gt;**](Usuario.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="usuarioLoginDelete"></a>
# **usuarioLoginDelete**
> usuarioLoginDelete(login)



### Example
```java
// Import classes:
//import logic.smartmind.client.invoker.ApiException;
//import logic.smartmind.client.api.UsuarioApi;


UsuarioApi apiInstance = new UsuarioApi();
String login = "login_example"; // String | 
try {
    apiInstance.usuarioLoginDelete(login);
} catch (ApiException e) {
    System.err.println("Exception when calling UsuarioApi#usuarioLoginDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **login** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="usuarioLoginGet"></a>
# **usuarioLoginGet**
> Usuario usuarioLoginGet(login)



### Example
```java
// Import classes:
//import logic.smartmind.client.invoker.ApiException;
//import logic.smartmind.client.api.UsuarioApi;


UsuarioApi apiInstance = new UsuarioApi();
String login = "login_example"; // String | 
try {
    Usuario result = apiInstance.usuarioLoginGet(login);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UsuarioApi#usuarioLoginGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **login** | **String**|  |

### Return type

[**Usuario**](Usuario.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="usuarioLoginPatch"></a>
# **usuarioLoginPatch**
> usuarioLoginPatch(login, body)



### Example
```java
// Import classes:
//import logic.smartmind.client.invoker.ApiException;
//import logic.smartmind.client.api.UsuarioApi;


UsuarioApi apiInstance = new UsuarioApi();
String login = "login_example"; // String | 
Usuario body = new Usuario(); // Usuario | 
try {
    apiInstance.usuarioLoginPatch(login, body);
} catch (ApiException e) {
    System.err.println("Exception when calling UsuarioApi#usuarioLoginPatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **login** | **String**|  |
 **body** | [**Usuario**](Usuario.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="usuarioPost"></a>
# **usuarioPost**
> usuarioPost(body)



### Example
```java
// Import classes:
//import logic.smartmind.client.invoker.ApiException;
//import logic.smartmind.client.api.UsuarioApi;


UsuarioApi apiInstance = new UsuarioApi();
Usuario body = new Usuario(); // Usuario | 
try {
    apiInstance.usuarioPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling UsuarioApi#usuarioPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Usuario**](Usuario.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

