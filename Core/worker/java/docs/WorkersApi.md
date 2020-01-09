# WorkersApi

All URIs are relative to *http://healthsuite.allocatesoftware.com/api/worker/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**registerWorker**](WorkersApi.md#registerWorker) | **POST** /workers | 
[**submitAnnualLeaveClaim**](WorkersApi.md#submitAnnualLeaveClaim) | **POST** /worker/{id}/leave | 


<a name="registerWorker"></a>
# **registerWorker**
> WorkerRegistrationResponse registerWorker(person)



Provide worker details for inclusion into the Allocate ecosystem. The platform will accept the worker information, and respond either synchronously or asynchronously with the allocate worker identifier. This may entail an on-boarding process, so the final response may require human interaction before it can be completed.

### Example
```java
// Import classes:
import com.allocate.openapi.ApiClient;
import com.allocate.openapi.ApiException;
import com.allocate.openapi.Configuration;
import com.allocate.openapi.models.*;
import com.allocate.openapi.api.WorkersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://healthsuite.allocatesoftware.com/api/worker/v1");

    WorkersApi apiInstance = new WorkersApi(defaultClient);
    Person person = new Person(); // Person | Worker information
    try {
      WorkerRegistrationResponse result = apiInstance.registerWorker(person);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#registerWorker");
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
 **person** | [**Person**](Person.md)| Worker information |

### Return type

[**WorkerRegistrationResponse**](WorkerRegistrationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The worker has been registered successfully |  -  |
**400** | One or more errors have occurred when attempting to process the provided data |  -  |
**202** | The worker data has been accepted, and will be processed in due course. |  -  |

<a name="submitAnnualLeaveClaim"></a>
# **submitAnnualLeaveClaim**
> AsyncResponse submitAnnualLeaveClaim(id, leaveClaim)



Submit an leave (vacation) claim for a worker

### Example
```java
// Import classes:
import com.allocate.openapi.ApiClient;
import com.allocate.openapi.ApiException;
import com.allocate.openapi.Configuration;
import com.allocate.openapi.models.*;
import com.allocate.openapi.api.WorkersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://healthsuite.allocatesoftware.com/api/worker/v1");

    WorkersApi apiInstance = new WorkersApi(defaultClient);
    String id = "id_example"; // String | ID of the worker
    LeaveClaim leaveClaim = new LeaveClaim(); // LeaveClaim | Leave claim for a worker
    try {
      AsyncResponse result = apiInstance.submitAnnualLeaveClaim(id, leaveClaim);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkersApi#submitAnnualLeaveClaim");
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
 **id** | **String**| ID of the worker |
 **leaveClaim** | [**LeaveClaim**](LeaveClaim.md)| Leave claim for a worker |

### Return type

[**AsyncResponse**](AsyncResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | The worker data has been accepted, and will be processed in due course. |  -  |

