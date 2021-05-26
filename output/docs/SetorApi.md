# SetorApi

All URIs are relative to *http://localhost:8080/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**setorCodigoDelete**](SetorApi.md#setorCodigoDelete) | **DELETE** /setor/{codigo} | 
[**setorCodigoGet**](SetorApi.md#setorCodigoGet) | **GET** /setor/{codigo} | 
[**setorCodigoPatch**](SetorApi.md#setorCodigoPatch) | **PATCH** /setor/{codigo} | 
[**setorGet**](SetorApi.md#setorGet) | **GET** /setor | 
[**setorPost**](SetorApi.md#setorPost) | **POST** /setor | 


<a name="setorCodigoDelete"></a>
# **setorCodigoDelete**
> setorCodigoDelete(codigo)



### Example
```java
// Import classes:
//import logic.smartmind.client.invoker.ApiException;
//import logic.smartmind.client.api.SetorApi;


SetorApi apiInstance = new SetorApi();
Integer codigo = 56; // Integer | 
try {
    apiInstance.setorCodigoDelete(codigo);
} catch (ApiException e) {
    System.err.println("Exception when calling SetorApi#setorCodigoDelete");
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

<a name="setorCodigoGet"></a>
# **setorCodigoGet**
> Setor setorCodigoGet(codigo)



### Example
```java
// Import classes:
//import logic.smartmind.client.invoker.ApiException;
//import logic.smartmind.client.api.SetorApi;


SetorApi apiInstance = new SetorApi();
Integer codigo = 56; // Integer | 
try {
    Setor result = apiInstance.setorCodigoGet(codigo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SetorApi#setorCodigoGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **codigo** | **Integer**|  |

### Return type

[**Setor**](Setor.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="setorCodigoPatch"></a>
# **setorCodigoPatch**
> setorCodigoPatch(codigo, body)



### Example
```java
// Import classes:
//import logic.smartmind.client.invoker.ApiException;
//import logic.smartmind.client.api.SetorApi;


SetorApi apiInstance = new SetorApi();
Integer codigo = 56; // Integer | 
Setor body = new Setor(); // Setor | 
try {
    apiInstance.setorCodigoPatch(codigo, body);
} catch (ApiException e) {
    System.err.println("Exception when calling SetorApi#setorCodigoPatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **codigo** | **Integer**|  |
 **body** | [**Setor**](Setor.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="setorGet"></a>
# **setorGet**
> List&lt;Setor&gt; setorGet()



### Example
```java
// Import classes:
//import logic.smartmind.client.invoker.ApiException;
//import logic.smartmind.client.api.SetorApi;


SetorApi apiInstance = new SetorApi();
try {
    List<Setor> result = apiInstance.setorGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SetorApi#setorGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Setor&gt;**](Setor.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="setorPost"></a>
# **setorPost**
> setorPost(body)



### Example
```java
// Import classes:
//import logic.smartmind.client.invoker.ApiException;
//import logic.smartmind.client.api.SetorApi;


SetorApi apiInstance = new SetorApi();
Setor body = new Setor(); // Setor | 
try {
    apiInstance.setorPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling SetorApi#setorPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Setor**](Setor.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

