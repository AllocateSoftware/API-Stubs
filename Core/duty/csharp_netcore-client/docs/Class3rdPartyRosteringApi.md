# ASW.APIServices.Core.Api.Class3rdPartyRosteringApi

All URIs are relative to *http://healthsuite.allocatesoftware.com/api/duty/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CancelDuty**](Class3rdPartyRosteringApi.md#cancelduty) | **DELETE** /duties/{id} | 
[**CancelDutyBooking**](Class3rdPartyRosteringApi.md#canceldutybooking) | **DELETE** /duties/{id}/booking | 
[**CreateDuty**](Class3rdPartyRosteringApi.md#createduty) | **POST** /duties | 
[**SendDutyForFulfillment**](Class3rdPartyRosteringApi.md#senddutyforfulfillment) | **POST** /duties/{id}/sendTo/{destination} | 


<a name="cancelduty"></a>
# **CancelDuty**
> void CancelDuty (string id)



Cancel a duty. Also cancels any bookings (if present).

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using ASW.APIServices.Core.Api;
using ASW.APIServices.Core.Client;
using ASW.APIServices.Core.Model;

namespace Example
{
    public class CancelDutyExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://healthsuite.allocatesoftware.com/api/duty/v1";
            var apiInstance = new Class3rdPartyRosteringApi(Configuration.Default);
            var id = id_example;  // string | ID of the duty

            try
            {
                apiInstance.CancelDuty(id);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling Class3rdPartyRosteringApi.CancelDuty: " + e.Message );
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
 **id** | **string**| ID of the duty | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Duty cancelled |  -  |
| **202** | The cancellation has been accepted and a response will be returned asyncronously. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="canceldutybooking"></a>
# **CancelDutyBooking**
> void CancelDutyBooking (string id)



Cancel a duty booking.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using ASW.APIServices.Core.Api;
using ASW.APIServices.Core.Client;
using ASW.APIServices.Core.Model;

namespace Example
{
    public class CancelDutyBookingExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://healthsuite.allocatesoftware.com/api/duty/v1";
            var apiInstance = new Class3rdPartyRosteringApi(Configuration.Default);
            var id = id_example;  // string | ID of the duty

            try
            {
                apiInstance.CancelDutyBooking(id);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling Class3rdPartyRosteringApi.CancelDutyBooking: " + e.Message );
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
 **id** | **string**| ID of the duty | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Duty booking cancelled |  -  |
| **202** | The duty cancellation been accepted and a response will be returned asyncronously. |  -  |
| **404** | Duty or Customer not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="createduty"></a>
# **CreateDuty**
> string CreateDuty (DutyDetails dutyDetails)



Create a new Duty

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using ASW.APIServices.Core.Api;
using ASW.APIServices.Core.Client;
using ASW.APIServices.Core.Model;

namespace Example
{
    public class CreateDutyExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://healthsuite.allocatesoftware.com/api/duty/v1";
            var apiInstance = new Class3rdPartyRosteringApi(Configuration.Default);
            var dutyDetails = new DutyDetails(); // DutyDetails | Duty to be sent to agency

            try
            {
                string result = apiInstance.CreateDuty(dutyDetails);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling Class3rdPartyRosteringApi.CreateDuty: " + e.Message );
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
 **dutyDetails** | [**DutyDetails**](DutyDetails.md)| Duty to be sent to agency | 

### Return type

**string**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/plain, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Duty created successfully |  -  |
| **202** | The duty has been accepted and a response will be returned asyncronously. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="senddutyforfulfillment"></a>
# **SendDutyForFulfillment**
> void SendDutyForFulfillment (string id, string destination)



Send a duty for fulfillment by contingent workforce (Bank, Cloudstaff, Agency)

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using ASW.APIServices.Core.Api;
using ASW.APIServices.Core.Client;
using ASW.APIServices.Core.Model;

namespace Example
{
    public class SendDutyForFulfillmentExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://healthsuite.allocatesoftware.com/api/duty/v1";
            var apiInstance = new Class3rdPartyRosteringApi(Configuration.Default);
            var id = id_example;  // string | ID of the duty
            var destination = destination_example;  // string | Desination to send the duty

            try
            {
                apiInstance.SendDutyForFulfillment(id, destination);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling Class3rdPartyRosteringApi.SendDutyForFulfillment: " + e.Message );
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
 **id** | **string**| ID of the duty | 
 **destination** | **string**| Desination to send the duty | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Duty sent successfully |  -  |
| **202** | Request been accepted and a response will be returned asyncronously. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

