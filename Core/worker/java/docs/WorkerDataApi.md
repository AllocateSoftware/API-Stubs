# WorkerDataApi

All URIs are relative to *http://healthsuite.allocatesoftware.com/api/worker/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**registerWorker**](WorkerDataApi.md#registerWorker) | **POST** /workers | 


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
import com.allocate.openapi.api.WorkerDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://healthsuite.allocatesoftware.com/api/worker/v1");

    WorkerDataApi apiInstance = new WorkerDataApi(defaultClient);
    Person person = new Person(); // Person | Worker information
    try {
      WorkerRegistrationResponse result = apiInstance.registerWorker(person);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkerDataApi#registerWorker");
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

