# NotificationApi

All URIs are relative to *http://localhost:8080/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**notificationPost**](NotificationApi.md#notificationPost) | **POST** /notification | 


<a name="notificationPost"></a>
# **notificationPost**
> notificationPost(body)



### Example
```java
// Import classes:
//import logic.smartmind.client.invoker.ApiException;
//import logic.smartmind.client.api.NotificationApi;


NotificationApi apiInstance = new NotificationApi();
AssetNotificationLog body = new AssetNotificationLog(); // AssetNotificationLog | 
try {
    apiInstance.notificationPost(body);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationApi#notificationPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AssetNotificationLog**](AssetNotificationLog.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

