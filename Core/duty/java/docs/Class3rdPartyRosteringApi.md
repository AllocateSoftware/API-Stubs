# Class3rdPartyRosteringApi

All URIs are relative to *http://healthsuite.allocatesoftware.com/api/duty/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelDuty**](Class3rdPartyRosteringApi.md#cancelDuty) | **DELETE** /duties/{id} | 
[**cancelDutyBooking**](Class3rdPartyRosteringApi.md#cancelDutyBooking) | **DELETE** /duties/{id}/booking | 
[**createDuty**](Class3rdPartyRosteringApi.md#createDuty) | **POST** /duties | 
[**sendDutyForFulfillment**](Class3rdPartyRosteringApi.md#sendDutyForFulfillment) | **POST** /duties/{id}/sendTo/{destination} | 


<a name="cancelDuty"></a>
# **cancelDuty**
> cancelDuty(id)



Cancel a duty. Also cancels any bookings (if present).

### Example
```java
// Import classes:
import com.allocate.openapi.ApiClient;
import com.allocate.openapi.ApiException;
import com.allocate.openapi.Configuration;
import com.allocate.openapi.models.*;
import com.allocate.openapi.api.Class3rdPartyRosteringApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://healthsuite.allocatesoftware.com/api/duty/v1");

    Class3rdPartyRosteringApi apiInstance = new Class3rdPartyRosteringApi(defaultClient);
    String id = "id_example"; // String | ID of the duty
    try {
      apiInstance.cancelDuty(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling Class3rdPartyRosteringApi#cancelDuty");
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
 **id** | **String**| ID of the duty |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Duty cancelled |  -  |
**202** | The cancellation has been accepted and a response will be returned asyncronously. |  -  |

<a name="cancelDutyBooking"></a>
# **cancelDutyBooking**
> cancelDutyBooking(id)



Cancel a duty booking.

### Example
```java
// Import classes:
import com.allocate.openapi.ApiClient;
import com.allocate.openapi.ApiException;
import com.allocate.openapi.Configuration;
import com.allocate.openapi.models.*;
import com.allocate.openapi.api.Class3rdPartyRosteringApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://healthsuite.allocatesoftware.com/api/duty/v1");

    Class3rdPartyRosteringApi apiInstance = new Class3rdPartyRosteringApi(defaultClient);
    String id = "id_example"; // String | ID of the duty
    try {
      apiInstance.cancelDutyBooking(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling Class3rdPartyRosteringApi#cancelDutyBooking");
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
 **id** | **String**| ID of the duty |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Duty booking cancelled |  -  |
**202** | The duty cancellation been accepted and a response will be returned asyncronously. |  -  |
**404** | Duty or Customer not found |  -  |

<a name="createDuty"></a>
# **createDuty**
> String createDuty(dutyDetails)



Create a new Duty

### Example
```java
// Import classes:
import com.allocate.openapi.ApiClient;
import com.allocate.openapi.ApiException;
import com.allocate.openapi.Configuration;
import com.allocate.openapi.models.*;
import com.allocate.openapi.api.Class3rdPartyRosteringApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://healthsuite.allocatesoftware.com/api/duty/v1");

    Class3rdPartyRosteringApi apiInstance = new Class3rdPartyRosteringApi(defaultClient);
    DutyDetails dutyDetails = new DutyDetails(); // DutyDetails | Duty to be sent to agency
    try {
      String result = apiInstance.createDuty(dutyDetails);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling Class3rdPartyRosteringApi#createDuty");
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
 **dutyDetails** | [**DutyDetails**](DutyDetails.md)| Duty to be sent to agency |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/plain, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Duty created successfully |  -  |
**202** | The duty has been accepted and a response will be returned asyncronously. |  -  |

<a name="sendDutyForFulfillment"></a>
# **sendDutyForFulfillment**
> sendDutyForFulfillment(id, destination)



Send a duty for fulfillment by contingent workforce (Bank, Cloudstaff, Agency)

### Example
```java
// Import classes:
import com.allocate.openapi.ApiClient;
import com.allocate.openapi.ApiException;
import com.allocate.openapi.Configuration;
import com.allocate.openapi.models.*;
import com.allocate.openapi.api.Class3rdPartyRosteringApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://healthsuite.allocatesoftware.com/api/duty/v1");

    Class3rdPartyRosteringApi apiInstance = new Class3rdPartyRosteringApi(defaultClient);
    String id = "id_example"; // String | ID of the duty
    String destination = "destination_example"; // String | Desination to send the duty
    try {
      apiInstance.sendDutyForFulfillment(id, destination);
    } catch (ApiException e) {
      System.err.println("Exception when calling Class3rdPartyRosteringApi#sendDutyForFulfillment");
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
 **id** | **String**| ID of the duty |
 **destination** | **String**| Desination to send the duty | [enum: bank, agency, cloudstaff]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Duty sent successfully |  -  |
**202** | Request been accepted and a response will be returned asyncronously. |  -  |

