# AssetenvironmentApi

All URIs are relative to *http://localhost:8080/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**assetenvironmentAssetidDelete**](AssetenvironmentApi.md#assetenvironmentAssetidDelete) | **DELETE** /assetenvironment/{assetid} | 
[**assetenvironmentAssetidGet**](AssetenvironmentApi.md#assetenvironmentAssetidGet) | **GET** /assetenvironment/{assetid} | 
[**assetenvironmentAssetidPatch**](AssetenvironmentApi.md#assetenvironmentAssetidPatch) | **PATCH** /assetenvironment/{assetid} | 
[**assetenvironmentGet**](AssetenvironmentApi.md#assetenvironmentGet) | **GET** /assetenvironment | 
[**assetenvironmentPost**](AssetenvironmentApi.md#assetenvironmentPost) | **POST** /assetenvironment | 


<a name="assetenvironmentAssetidDelete"></a>
# **assetenvironmentAssetidDelete**
> assetenvironmentAssetidDelete(assetid)



### Example
```java
// Import classes:
//import logic.smartmind.client.invoker.ApiException;
//import logic.smartmind.client.api.AssetenvironmentApi;


AssetenvironmentApi apiInstance = new AssetenvironmentApi();
String assetid = "assetid_example"; // String | 
try {
    apiInstance.assetenvironmentAssetidDelete(assetid);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetenvironmentApi#assetenvironmentAssetidDelete");
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

<a name="assetenvironmentAssetidGet"></a>
# **assetenvironmentAssetidGet**
> AssetEnvironment assetenvironmentAssetidGet(assetid)



### Example
```java
// Import classes:
//import logic.smartmind.client.invoker.ApiException;
//import logic.smartmind.client.api.AssetenvironmentApi;


AssetenvironmentApi apiInstance = new AssetenvironmentApi();
String assetid = "assetid_example"; // String | 
try {
    AssetEnvironment result = apiInstance.assetenvironmentAssetidGet(assetid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetenvironmentApi#assetenvironmentAssetidGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assetid** | **String**|  |

### Return type

[**AssetEnvironment**](AssetEnvironment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="assetenvironmentAssetidPatch"></a>
# **assetenvironmentAssetidPatch**
> assetenvironmentAssetidPatch(assetid, body)



### Example
```java
// Import classes:
//import logic.smartmind.client.invoker.ApiException;
//import logic.smartmind.client.api.AssetenvironmentApi;


AssetenvironmentApi apiInstance = new AssetenvironmentApi();
String assetid = "assetid_example"; // String | 
AssetEnvironment body = new AssetEnvironment(); // AssetEnvironment | 
try {
    apiInstance.assetenvironmentAssetidPatch(assetid, body);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetenvironmentApi#assetenvironmentAssetidPatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **assetid** | **String**|  |
 **body** | [**AssetEnvironment**](AssetEnvironment.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="assetenvironmentGet"></a>
# **assetenvironmentGet**
> List&lt;AssetEnvironment&gt; assetenvironmentGet()



### Example
```java
// Import classes:
//import logic.smartmind.client.invoker.ApiException;
//import logic.smartmind.client.api.AssetenvironmentApi;


AssetenvironmentApi apiInstance = new AssetenvironmentApi();
try {
    List<AssetEnvironment> result = apiInstance.assetenvironmentGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetenvironmentApi#assetenvironmentGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;AssetEnvironment&gt;**](AssetEnvironment.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="assetenvironmentPost"></a>
# **assetenvironmentPost**
> assetenvironmentPost(body)



### Example
```java
// Import classes:
//import logic.smartmind.client.invoker.ApiException;
//import logic.smartmind.client.api.AssetenvironmentApi;


AssetenvironmentApi apiInstance = new AssetenvironmentApi();
AssetEnvironment body = new AssetEnvironment(); // AssetEnvironment | 
try {
    apiInstance.assetenvironmentPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetenvironmentApi#assetenvironmentPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AssetEnvironment**](AssetEnvironment.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

