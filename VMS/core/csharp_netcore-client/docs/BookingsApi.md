# ASW.APIServices.VMS.Api.BookingsApi

All URIs are relative to *http://healthsuite.allocatesoftware.com/vms/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AcceptAgencyOffer**](BookingsApi.md#acceptagencyoffer) | **PUT** /bookingRequests/{bookingRequestId}/offers/{offerId}/accept | 
[**CancelBooking**](BookingsApi.md#cancelbooking) | **DELETE** /bookings/{bookingId} | 
[**CancelBookingRequest**](BookingsApi.md#cancelbookingrequest) | **DELETE** /bookingRequests/{bookingRequestId} | 
[**GetBooking**](BookingsApi.md#getbooking) | **GET** /bookings/{bookingId} | 


<a name="acceptagencyoffer"></a>
# **AcceptAgencyOffer**
> string AcceptAgencyOffer (string bookingRequestId, string offerId)



Accept an agency offer for a worker.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using ASW.APIServices.VMS.Api;
using ASW.APIServices.VMS.Client;
using ASW.APIServices.VMS.Model;

namespace Example
{
    public class AcceptAgencyOfferExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://healthsuite.allocatesoftware.com/vms/api/v1";
            // Configure HTTP basic authorization: bearerAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new BookingsApi(Configuration.Default);
            var bookingRequestId = bookingRequestId_example;  // string | ID of the booking request to accept.
            var offerId = offerId_example;  // string | ID of the offer to accept. Depending on the VMS, this may be a unique ID, an index to locate an agency, or the agency ID itself.

            try
            {
                string result = apiInstance.AcceptAgencyOffer(bookingRequestId, offerId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling BookingsApi.AcceptAgencyOffer: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookingRequestId** | **string**| ID of the booking request to accept. | 
 **offerId** | **string**| ID of the offer to accept. Depending on the VMS, this may be a unique ID, an index to locate an agency, or the agency ID itself. | 

### Return type

**string**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Booking request confirmed by VMS. |  -  |
| **401** | Unauthorized |  -  |
| **404** | No such booking request exists |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="cancelbooking"></a>
# **CancelBooking**
> void CancelBooking (string bookingId)



Cancel a duty booking previously accepted. This does not cancel any outstanding booking requests or duty cascades.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using ASW.APIServices.VMS.Api;
using ASW.APIServices.VMS.Client;
using ASW.APIServices.VMS.Model;

namespace Example
{
    public class CancelBookingExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://healthsuite.allocatesoftware.com/vms/api/v1";
            // Configure HTTP basic authorization: bearerAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new BookingsApi(Configuration.Default);
            var bookingId = bookingId_example;  // string | ID of the booking to cancel.

            try
            {
                apiInstance.CancelBooking(bookingId);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling BookingsApi.CancelBooking: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookingId** | **string**| ID of the booking to cancel. | 

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully deleted booking |  -  |
| **401** | Unauthorized |  -  |
| **404** | No such booking exists |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="cancelbookingrequest"></a>
# **CancelBookingRequest**
> void CancelBookingRequest (string bookingRequestId)



Cancel a previously requested booking. If the booking request has resulted in actual bookings, these will also be cancelled.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using ASW.APIServices.VMS.Api;
using ASW.APIServices.VMS.Client;
using ASW.APIServices.VMS.Model;

namespace Example
{
    public class CancelBookingRequestExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://healthsuite.allocatesoftware.com/vms/api/v1";
            // Configure HTTP basic authorization: bearerAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new BookingsApi(Configuration.Default);
            var bookingRequestId = bookingRequestId_example;  // string | ID of the booking request to cancel.

            try
            {
                apiInstance.CancelBookingRequest(bookingRequestId);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling BookingsApi.CancelBookingRequest: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookingRequestId** | **string**| ID of the booking request to cancel. | 

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully deleted booking request |  -  |
| **401** | Unauthorized |  -  |
| **404** | No such booking request exists |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getbooking"></a>
# **GetBooking**
> DutyRequest GetBooking (string bookingId)



Query a duty booking by id

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using ASW.APIServices.VMS.Api;
using ASW.APIServices.VMS.Client;
using ASW.APIServices.VMS.Model;

namespace Example
{
    public class GetBookingExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://healthsuite.allocatesoftware.com/vms/api/v1";
            // Configure HTTP basic authorization: bearerAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new BookingsApi(Configuration.Default);
            var bookingId = bookingId_example;  // string | ID of the duty booking

            try
            {
                DutyRequest result = apiInstance.GetBooking(bookingId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling BookingsApi.GetBooking: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bookingId** | **string**| ID of the duty booking | 

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
| **200** | Request OK |  -  |
| **400** | Invalid input parameter |  -  |
| **401** | Unauthorized |  -  |
| **404** | No such booking exists |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

