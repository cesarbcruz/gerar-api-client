# UsuariosetorApi

All URIs are relative to *http://localhost:8080/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**usuariosetorLoginCodigoSetorPost**](UsuariosetorApi.md#usuariosetorLoginCodigoSetorPost) | **POST** /usuariosetor/{login}/{codigoSetor} | 
[**usuariosetorLoginCodigosetorDelete**](UsuariosetorApi.md#usuariosetorLoginCodigosetorDelete) | **DELETE** /usuariosetor/{login}/{codigosetor} | 


<a name="usuariosetorLoginCodigoSetorPost"></a>
# **usuariosetorLoginCodigoSetorPost**
> usuariosetorLoginCodigoSetorPost(login, codigoSetor)



### Example
```java
// Import classes:
//import logic.smartmind.client.invoker.ApiException;
//import logic.smartmind.client.api.UsuariosetorApi;


UsuariosetorApi apiInstance = new UsuariosetorApi();
String login = "login_example"; // String | 
Integer codigoSetor = 56; // Integer | 
try {
    apiInstance.usuariosetorLoginCodigoSetorPost(login, codigoSetor);
} catch (ApiException e) {
    System.err.println("Exception when calling UsuariosetorApi#usuariosetorLoginCodigoSetorPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **login** | **String**|  |
 **codigoSetor** | **Integer**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="usuariosetorLoginCodigosetorDelete"></a>
# **usuariosetorLoginCodigosetorDelete**
> usuariosetorLoginCodigosetorDelete(login, codigosetor)



### Example
```java
// Import classes:
//import logic.smartmind.client.invoker.ApiException;
//import logic.smartmind.client.api.UsuariosetorApi;


UsuariosetorApi apiInstance = new UsuariosetorApi();
String login = "login_example"; // String | 
Integer codigosetor = 56; // Integer | 
try {
    apiInstance.usuariosetorLoginCodigosetorDelete(login, codigosetor);
} catch (ApiException e) {
    System.err.println("Exception when calling UsuariosetorApi#usuariosetorLoginCodigosetorDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **login** | **String**|  |
 **codigosetor** | **Integer**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

