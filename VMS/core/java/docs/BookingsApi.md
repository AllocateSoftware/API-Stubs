# BookingsApi

All URIs are relative to *http://healthsuite.allocatesoftware.com/vms/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**acceptAgencyOffer**](BookingsApi.md#acceptAgencyOffer) | **PUT** /bookingRequests/{bookingRequestId}/offers/{offerId}/accept | 
[**cancelBooking**](BookingsApi.md#cancelBooking) | **DELETE** /bookings/{bookingId} | 
[**cancelBookingRequest**](BookingsApi.md#cancelBookingRequest) | **DELETE** /bookingRequests/{bookingRequestId} | 
[**getBooking**](BookingsApi.md#getBooking) | **GET** /bookings/{bookingId} | 


<a name="acceptAgencyOffer"></a>
# **acceptAgencyOffer**
> String acceptAgencyOffer(bookingRequestId, offerId)



Accept an agency offer for a worker.

### Example
```java
// Import classes:
import com.allocate.vms.ApiClient;
import com.allocate.vms.ApiException;
import com.allocate.vms.Configuration;
import com.allocate.vms.auth.*;
import com.allocate.vms.models.*;
import com.allocate.vms.api.BookingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://healthsuite.allocatesoftware.com/vms/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    BookingsApi apiInstance = new BookingsApi(defaultClient);
    String bookingRequestId = "bookingRequestId_example"; // String | ID of the booking request to accept.
    String offerId = "offerId_example"; // String | ID of the offer to accept. Depending on the VMS, this may be a unique ID, an index to locate an agency, or the agency ID itself.
    try {
      String result = apiInstance.acceptAgencyOffer(bookingRequestId, offerId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BookingsApi#acceptAgencyOffer");
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
 **bookingRequestId** | **String**| ID of the booking request to accept. |
 **offerId** | **String**| ID of the offer to accept. Depending on the VMS, this may be a unique ID, an index to locate an agency, or the agency ID itself. |

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Booking request confirmed by VMS. |  -  |
**401** | Unauthorized |  -  |
**404** | No such booking request exists |  -  |

<a name="cancelBooking"></a>
# **cancelBooking**
> cancelBooking(bookingId)



Cancel a duty booking previously accepted. This does not cancel any outstanding booking requests or duty cascades.

### Example
```java
// Import classes:
import com.allocate.vms.ApiClient;
import com.allocate.vms.ApiException;
import com.allocate.vms.Configuration;
import com.allocate.vms.auth.*;
import com.allocate.vms.models.*;
import com.allocate.vms.api.BookingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://healthsuite.allocatesoftware.com/vms/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    BookingsApi apiInstance = new BookingsApi(defaultClient);
    String bookingId = "bookingId_example"; // String | ID of the booking to cancel.
    try {
      apiInstance.cancelBooking(bookingId);
    } catch (ApiException e) {
      System.err.println("Exception when calling BookingsApi#cancelBooking");
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
 **bookingId** | **String**| ID of the booking to cancel. |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully deleted booking |  -  |
**401** | Unauthorized |  -  |
**404** | No such booking exists |  -  |

<a name="cancelBookingRequest"></a>
# **cancelBookingRequest**
> cancelBookingRequest(bookingRequestId)



Cancel a previously requested booking. If the booking request has resulted in actual bookings, these will also be cancelled.

### Example
```java
// Import classes:
import com.allocate.vms.ApiClient;
import com.allocate.vms.ApiException;
import com.allocate.vms.Configuration;
import com.allocate.vms.auth.*;
import com.allocate.vms.models.*;
import com.allocate.vms.api.BookingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://healthsuite.allocatesoftware.com/vms/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    BookingsApi apiInstance = new BookingsApi(defaultClient);
    String bookingRequestId = "bookingRequestId_example"; // String | ID of the booking request to cancel.
    try {
      apiInstance.cancelBookingRequest(bookingRequestId);
    } catch (ApiException e) {
      System.err.println("Exception when calling BookingsApi#cancelBookingRequest");
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
 **bookingRequestId** | **String**| ID of the booking request to cancel. |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully deleted booking request |  -  |
**401** | Unauthorized |  -  |
**404** | No such booking request exists |  -  |

<a name="getBooking"></a>
# **getBooking**
> DutyRequest getBooking(bookingId)



Query a duty booking by id

### Example
```java
// Import classes:
import com.allocate.vms.ApiClient;
import com.allocate.vms.ApiException;
import com.allocate.vms.Configuration;
import com.allocate.vms.auth.*;
import com.allocate.vms.models.*;
import com.allocate.vms.api.BookingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://healthsuite.allocatesoftware.com/vms/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    BookingsApi apiInstance = new BookingsApi(defaultClient);
    String bookingId = "bookingId_example"; // String | ID of the duty booking
    try {
      DutyRequest result = apiInstance.getBooking(bookingId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BookingsApi#getBooking");
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
 **bookingId** | **String**| ID of the duty booking |

### Return type

[**DutyRequest**](DutyRequest.md)

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
**404** | No such booking exists |  -  |

