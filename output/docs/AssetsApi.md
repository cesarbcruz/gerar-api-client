# AssetsApi

All URIs are relative to *http://localhost:8080/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**assetsAssetidDelete**](AssetsApi.md#assetsAssetidDelete) | **DELETE** /assets/{assetid} | 
[**assetsAssetidGet**](AssetsApi.md#assetsAssetidGet) | **GET** /assets/{assetid} | 
[**assetsAssetidPatch**](AssetsApi.md#assetsAssetidPatch) | **PATCH** /assets/{assetid} | 
[**assetsGet**](AssetsApi.md#assetsGet) | **GET** /assets | 
[**assetsPost**](AssetsApi.md#assetsPost) | **POST** /assets | 


<a name="assetsAssetidDelete"></a>
# **assetsAssetidDelete**
> assetsAssetidDelete(assetid)



### Example
```java
// Import classes:
//import logic.smartmind.client.invoker.ApiException;
//import logic.smartmind.client.api.AssetsApi;


AssetsApi apiInstance = new AssetsApi();
String assetid = "assetid_example"; // String | 
try {
    apiInstance.assetsAssetidDelete(assetid);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetsApi#assetsAssetidDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assetid** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="assetsAssetidGet"></a>
# **assetsAssetidGet**
> Assets assetsAssetidGet(assetid)



### Example
```java
// Import classes:
//import logic.smartmind.client.invoker.ApiException;
//import logic.smartmind.client.api.AssetsApi;


AssetsApi apiInstance = new AssetsApi();
String assetid = "assetid_example"; // String | 
try {
    Assets result = apiInstance.assetsAssetidGet(assetid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetsApi#assetsAssetidGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assetid** | **String**|  |

### Return type

[**Assets**](Assets.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="assetsAssetidPatch"></a>
# **assetsAssetidPatch**
> assetsAssetidPatch(assetid, body)



### Example
```java
// Import classes:
//import logic.smartmind.client.invoker.ApiException;
//import logic.smartmind.client.api.AssetsApi;


AssetsApi apiInstance = new AssetsApi();
String assetid = "assetid_example"; // String | 
Assets body = new Assets(); // Assets | 
try {
    apiInstance.assetsAssetidPatch(assetid, body);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetsApi#assetsAssetidPatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assetid** | **String**|  |
 **body** | [**Assets**](Assets.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="assetsGet"></a>
# **assetsGet**
> List&lt;Assets&gt; assetsGet()



### Example
```java
// Import classes:
//import logic.smartmind.client.invoker.ApiException;
//import logic.smartmind.client.api.AssetsApi;


AssetsApi apiInstance = new AssetsApi();
try {
    List<Assets> result = apiInstance.assetsGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetsApi#assetsGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Assets&gt;**](Assets.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="assetsPost"></a>
# **assetsPost**
> assetsPost(body)



### Example
```java
// Import classes:
//import logic.smartmind.client.invoker.ApiException;
//import logic.smartmind.client.api.AssetsApi;


AssetsApi apiInstance = new AssetsApi();
Assets body = new Assets(); // Assets | 
try {
    apiInstance.assetsPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetsApi#assetsPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Assets**](Assets.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

