# WorkersApi

All URIs are relative to *http://healthsuite.allocatesoftware.com/vms/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getWorker**](WorkersApi.md#getWorker) | **GET** /workers/{id} | 


<a name="getWorker"></a>
# **getWorker**
> Person getWorker(id)



Get the details of a person (worker) from the VMS

### Example
```java
// Import classes:
import com.allocate.vms.ApiClient;
import com.allocate.vms.ApiException;
import com.allocate.vms.Configuration;
import com.allocate.vms.auth.*;
import com.allocate.vms.models.*;
import com.allocate.vms.api.WorkersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://healthsuite.allocatesoftware.com/vms/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    WorkersApi apiInstance = new WorkersApi(defaultClient);
    String id = "id_example"; // String | ID of the worker within the VMS.
    try {
      Person result = apiInstance.getWorker(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#getWorker");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of the worker within the VMS. |

### Return type

[**Person**](Person.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Request OK |  -  |
**400** | Invalid input parameter |  -  |
**401** | Unauthorized |  -  |
**404** | Trust not found |  -  |

