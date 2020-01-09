# DefaultApi

All URIs are relative to *http://healthsuite.allocatesoftware.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getActivities**](DefaultApi.md#getActivities) | **GET** /activities | 


<a name="getActivities"></a>
# **getActivities**
> List&lt;HoursAssignment&gt; getActivities(customerCode, format)



Provide hours and assignment details for workers

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
    String customerCode = ASPH; // String | The code for the customer (trust) for which the activities should be returned
    String format = short; // String | Format for the output. TBD, but may be used to control the scope of information returned.
    try {
      List<HoursAssignment> result = apiInstance.getActivities(customerCode, format);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getActivities");
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
 **customerCode** | **String**| The code for the customer (trust) for which the activities should be returned |
 **format** | **String**| Format for the output. TBD, but may be used to control the scope of information returned. | [optional]

### Return type

[**List&lt;HoursAssignment&gt;**](HoursAssignment.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The worker has been registered successfully |  -  |
**400** | One or more errors have occurred when attempting to process the provided data |  -  |
**403** | Forbidden - you do not have the necessary permissions to undertake this action |  -  |

