# WorkerApi

All URIs are relative to *http://healthsuite.allocatesoftware.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**onboardWorkerToTrust**](WorkerApi.md#onboardWorkerToTrust) | **POST** /workers/{id}/onboardToTrust | 


<a name="onboardWorkerToTrust"></a>
# **onboardWorkerToTrust**
> onboardWorkerToTrust(id, inlineObject)



On-board a worker to a particular trust. In scenarios where worker data is being provided by a 3rd party Human Resources (or equivalent) system, it may be necessary to &#39;on-board&#39; that worker into a particular trust so that they may be selected. Note that in external bank scenarios this is not required, since the trust on-boarding request is implicit within the worker offer.  

### Example
```java
// Import classes:
import com.allocate.openapi.ApiClient;
import com.allocate.openapi.ApiException;
import com.allocate.openapi.Configuration;
import com.allocate.openapi.auth.*;
import com.allocate.openapi.models.*;
import com.allocate.openapi.api.WorkerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://healthsuite.allocatesoftware.com/api/v1");
    
    // Configure HTTP bearer authorization: jwt
    HttpBearerAuth jwt = (HttpBearerAuth) defaultClient.getAuthentication("jwt");
    jwt.setBearerToken("BEARER TOKEN");

    WorkerApi apiInstance = new WorkerApi(defaultClient);
    String id = EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440; // String | The Allocate Worker ID
    InlineObject inlineObject = new InlineObject(); // InlineObject | 
    try {
      apiInstance.onboardWorkerToTrust(id, inlineObject);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerApi#onboardWorkerToTrust");
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
 **id** | **String**| The Allocate Worker ID |
 **inlineObject** | [**InlineObject**](InlineObject.md)|  |

### Return type

null (empty response body)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The worker has been on-boarded successfully |  -  |
**400** | One or more errors have occurred when attempting to process the provided data |  -  |
**403** | Forbidden - you do not have the necessary permissions to undertake this action |  -  |
**202** | The request has been accepted, and will be processed in due course. |  -  |

