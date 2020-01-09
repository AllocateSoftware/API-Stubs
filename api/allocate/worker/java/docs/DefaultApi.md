# DefaultApi

All URIs are relative to *http://healthsuite.allocatesoftware.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getWorker**](DefaultApi.md#getWorker) | **GET** /workers/{id} | 
[**registerWorker**](DefaultApi.md#registerWorker) | **POST** /workers | 


<a name="getWorker"></a>
# **getWorker**
> Person getWorker(id)



Retrieve worker details from the Allocate ecosystem using the Allocate Worker id. The Allocate Worker id will be issued when registering a worker.  

### Example
```java
// Import classes:
import com.allocate.openapi.ApiClient;
import com.allocate.openapi.ApiException;
import com.allocate.openapi.Configuration;
import com.allocate.openapi.auth.*;
import com.allocate.openapi.models.*;
import com.allocate.openapi.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://healthsuite.allocatesoftware.com/api/v1");
    
    // Configure HTTP bearer authorization: jwt
    HttpBearerAuth jwt = (HttpBearerAuth) defaultClient.getAuthentication("jwt");
    jwt.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String id = 2CBC7FF9-38FB-4F0A-835A-324D9CF4800C; // String | The ID of the worker
    try {
      Person result = apiInstance.getWorker(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getWorker");
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
 **id** | **String**| The ID of the worker |

### Return type

[**Person**](Person.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Worker successfully found |  -  |
**404** | The worker was not found |  -  |
**403** | Forbidden - you do not have the necessary permissions to undertake this action |  -  |

<a name="registerWorker"></a>
# **registerWorker**
> WorkerRegistrationResponse registerWorker(person)



Provide worker details for inclusion into the Allocate ecosystem.  The platform will accept the worker information, and respond either synchronously or asynchronously with the allocate worker identifier.  This may entail an on-boarding process, so the final response may require human interaction before it can be completed.  Where there is a source system in common, such as HealthSuite and a Bank system both using ESR as a source of worker data, a person record containing an ESR trust-relative Staff Number is likely to be sufficient. 

### Example
```java
// Import classes:
import com.allocate.openapi.ApiClient;
import com.allocate.openapi.ApiException;
import com.allocate.openapi.Configuration;
import com.allocate.openapi.auth.*;
import com.allocate.openapi.models.*;
import com.allocate.openapi.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://healthsuite.allocatesoftware.com/api/v1");
    
    // Configure HTTP bearer authorization: jwt
    HttpBearerAuth jwt = (HttpBearerAuth) defaultClient.getAuthentication("jwt");
    jwt.setBearerToken("BEARER TOKEN");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Person person = new Person(); // Person | Worker information
    try {
      WorkerRegistrationResponse result = apiInstance.registerWorker(person);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#registerWorker");
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

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The worker has been registered successfully |  -  |
**400** | One or more errors have occurred when attempting to process the provided data |  -  |
**403** | Forbidden - you do not have the necessary permissions to undertake this action |  -  |
**202** | The worker data has been accepted, and will be processed in due course. |  -  |

