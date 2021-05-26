# ParamvariavelnotificacaoApi

All URIs are relative to *http://localhost:8080/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**paramvariavelnotificacaoCodigoDelete**](ParamvariavelnotificacaoApi.md#paramvariavelnotificacaoCodigoDelete) | **DELETE** /paramvariavelnotificacao/{codigo} | 
[**paramvariavelnotificacaoCodigoGet**](ParamvariavelnotificacaoApi.md#paramvariavelnotificacaoCodigoGet) | **GET** /paramvariavelnotificacao/{codigo} | 
[**paramvariavelnotificacaoCodigoPatch**](ParamvariavelnotificacaoApi.md#paramvariavelnotificacaoCodigoPatch) | **PATCH** /paramvariavelnotificacao/{codigo} | 
[**paramvariavelnotificacaoGet**](ParamvariavelnotificacaoApi.md#paramvariavelnotificacaoGet) | **GET** /paramvariavelnotificacao | 
[**paramvariavelnotificacaoPost**](ParamvariavelnotificacaoApi.md#paramvariavelnotificacaoPost) | **POST** /paramvariavelnotificacao | 


<a name="paramvariavelnotificacaoCodigoDelete"></a>
# **paramvariavelnotificacaoCodigoDelete**
> paramvariavelnotificacaoCodigoDelete(codigo)



### Example
```java
// Import classes:
//import logic.smartmind.client.invoker.ApiException;
//import logic.smartmind.client.api.ParamvariavelnotificacaoApi;


ParamvariavelnotificacaoApi apiInstance = new ParamvariavelnotificacaoApi();
Integer codigo = 56; // Integer | 
try {
    apiInstance.paramvariavelnotificacaoCodigoDelete(codigo);
} catch (ApiException e) {
    System.err.println("Exception when calling ParamvariavelnotificacaoApi#paramvariavelnotificacaoCodigoDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **codigo** | **Integer**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="paramvariavelnotificacaoCodigoGet"></a>
# **paramvariavelnotificacaoCodigoGet**
> ParamVariavelNotificacao paramvariavelnotificacaoCodigoGet(codigo)



### Example
```java
// Import classes:
//import logic.smartmind.client.invoker.ApiException;
//import logic.smartmind.client.api.ParamvariavelnotificacaoApi;


ParamvariavelnotificacaoApi apiInstance = new ParamvariavelnotificacaoApi();
Integer codigo = 56; // Integer | 
try {
    ParamVariavelNotificacao result = apiInstance.paramvariavelnotificacaoCodigoGet(codigo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ParamvariavelnotificacaoApi#paramvariavelnotificacaoCodigoGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **codigo** | **Integer**|  |

### Return type

[**ParamVariavelNotificacao**](ParamVariavelNotificacao.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="paramvariavelnotificacaoCodigoPatch"></a>
# **paramvariavelnotificacaoCodigoPatch**
> paramvariavelnotificacaoCodigoPatch(codigo, body)



### Example
```java
// Import classes:
//import logic.smartmind.client.invoker.ApiException;
//import logic.smartmind.client.api.ParamvariavelnotificacaoApi;


ParamvariavelnotificacaoApi apiInstance = new ParamvariavelnotificacaoApi();
Integer codigo = 56; // Integer | 
ParamVariavelNotificacao2 body = new ParamVariavelNotificacao2(); // ParamVariavelNotificacao2 | 
try {
    apiInstance.paramvariavelnotificacaoCodigoPatch(codigo, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ParamvariavelnotificacaoApi#paramvariavelnotificacaoCodigoPatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **codigo** | **Integer**|  |
 **body** | [**ParamVariavelNotificacao2**](ParamVariavelNotificacao2.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="paramvariavelnotificacaoGet"></a>
# **paramvariavelnotificacaoGet**
> List&lt;ParamVariavelNotificacao&gt; paramvariavelnotificacaoGet()



### Example
```java
// Import classes:
//import logic.smartmind.client.invoker.ApiException;
//import logic.smartmind.client.api.ParamvariavelnotificacaoApi;


ParamvariavelnotificacaoApi apiInstance = new ParamvariavelnotificacaoApi();
try {
    List<ParamVariavelNotificacao> result = apiInstance.paramvariavelnotificacaoGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ParamvariavelnotificacaoApi#paramvariavelnotificacaoGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;ParamVariavelNotificacao&gt;**](ParamVariavelNotificacao.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="paramvariavelnotificacaoPost"></a>
# **paramvariavelnotificacaoPost**
> paramvariavelnotificacaoPost(body)



### Example
```java
// Import classes:
//import logic.smartmind.client.invoker.ApiException;
//import logic.smartmind.client.api.ParamvariavelnotificacaoApi;


ParamvariavelnotificacaoApi apiInstance = new ParamvariavelnotificacaoApi();
ParamVariavelNotificacao2 body = new ParamVariavelNotificacao2(); // ParamVariavelNotificacao2 | 
try {
    apiInstance.paramvariavelnotificacaoPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling ParamvariavelnotificacaoApi#paramvariavelnotificacaoPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ParamVariavelNotificacao2**](ParamVariavelNotificacao2.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

