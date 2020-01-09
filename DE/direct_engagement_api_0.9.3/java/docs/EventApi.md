# EventApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEvents**](EventApi.md#getEvents) | **GET** /{version}/trustcode/{trustCode}/event | Get all events older than input timestamp


<a name="getEvents"></a>
# **getEvents**
> Duty getEvents(version, trustCode, dateTimeFrom, page, pageSize)

Get all events older than input timestamp

Returns an array of events

### Example
```java
// Import classes:
import com.allocate.openapi.ApiClient;
import com.allocate.openapi.ApiException;
import com.allocate.openapi.Configuration;
import com.allocate.openapi.models.*;
import com.allocate.openapi.api.EventApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    EventApi apiInstance = new EventApi(defaultClient);
    String version = "version_example"; // String | API version
    String trustCode = "trustCode_example"; // String | Trust code from BankStaff
    OffsetDateTime dateTimeFrom = new OffsetDateTime(); // OffsetDateTime | Timestamp
    Integer page = 56; // Integer | Result page
    Integer pageSize = 56; // Integer | Count of records per page
    try {
      Duty result = apiInstance.getEvents(version, trustCode, dateTimeFrom, page, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventApi#getEvents");
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
 **version** | **String**| API version |
 **trustCode** | **String**| Trust code from BankStaff |
 **dateTimeFrom** | **OffsetDateTime**| Timestamp |
 **page** | **Integer**| Result page | [optional]
 **pageSize** | **Integer**| Count of records per page | [optional]

### Return type

[**Duty**](Duty.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * X-Pagination -  <br>  |
**400** | Bad request errors |  -  |
**401** | Unauthorized |  -  |
**404** | Trust not found |  -  |

