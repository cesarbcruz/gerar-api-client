# OsApi

All URIs are relative to *http://localhost:8080/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**osPost**](OsApi.md#osPost) | **POST** /os | 


<a name="osPost"></a>
# **osPost**
> File osPost(os)



### Example
```java
// Import classes:
//import logic.smartmind.client.invoker.ApiException;
//import logic.smartmind.client.api.OsApi;


OsApi apiInstance = new OsApi();
File os = new File("/path/to/file.txt"); // File | 
try {
    File result = apiInstance.osPost(os);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OsApi#osPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **os** | **File**|  | [optional]

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

