# AgencyApi

All URIs are relative to *http://healthsuite.allocatesoftware.com/vms/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**offerWorker**](AgencyApi.md#offerWorker) | **POST** /bookingRequests/{bookingRequestId}/offers | 


<a name="offerWorker"></a>
# **offerWorker**
> offerWorker(bookingRequestId, personIdentifier)



Offer a worker for a booking

### Example
```java
// Import classes:
import com.allocate.vms.ApiClient;
import com.allocate.vms.ApiException;
import com.allocate.vms.Configuration;
import com.allocate.vms.auth.*;
import com.allocate.vms.models.*;
import com.allocate.vms.api.AgencyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://healthsuite.allocatesoftware.com/vms/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AgencyApi apiInstance = new AgencyApi(defaultClient);
    String bookingRequestId = "bookingRequestId_example"; // String | ID of the booking request to offer a worker for.
    PersonIdentifier personIdentifier = new PersonIdentifier(); // PersonIdentifier | Worker to be offered
    try {
      apiInstance.offerWorker(bookingRequestId, personIdentifier);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgencyApi#offerWorker");
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
 **bookingRequestId** | **String**| ID of the booking request to offer a worker for. |
 **personIdentifier** | [**PersonIdentifier**](PersonIdentifier.md)| Worker to be offered |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully offered worker |  -  |
**401** | Unauthorized |  -  |
**404** | No such booking request exists |  -  |

