# ASW.APIServices.VMS.Api.AgencyApi

All URIs are relative to *http://healthsuite.allocatesoftware.com/vms/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**OfferWorker**](AgencyApi.md#offerworker) | **POST** /bookingRequests/{bookingRequestId}/offers | 



## OfferWorker

> void OfferWorker (string bookingRequestId, PersonIdentifier personIdentifier)



Offer a worker for a booking

### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using ASW.APIServices.VMS.Api;
using ASW.APIServices.VMS.Client;
using ASW.APIServices.VMS.Model;

namespace Example
{
    public class OfferWorkerExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://healthsuite.allocatesoftware.com/vms/api/v1";
            // Configure HTTP basic authorization: bearerAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new AgencyApi(Configuration.Default);
            var bookingRequestId = bookingRequestId_example;  // string | ID of the booking request to offer a worker for.
            var personIdentifier = new PersonIdentifier(); // PersonIdentifier | Worker to be offered

            try
            {
                apiInstance.OfferWorker(bookingRequestId, personIdentifier);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling AgencyApi.OfferWorker: " + e.Message );
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
 **bookingRequestId** | **string**| ID of the booking request to offer a worker for. | 
 **personIdentifier** | [**PersonIdentifier**](PersonIdentifier.md)| Worker to be offered | 

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully offered worker |  -  |
| **401** | Unauthorized |  -  |
| **404** | No such booking request exists |  -  |

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

