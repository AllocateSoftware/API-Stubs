# ASW.APIServices.Core.Api.WorkerApi

All URIs are relative to *http://healthsuite.allocatesoftware.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**OnboardWorkerToTrust**](WorkerApi.md#onboardworkertotrust) | **POST** /workers/{id}/onboardToTrust | 



## OnboardWorkerToTrust

> void OnboardWorkerToTrust (string id, InlineObject inlineObject)



On-board a worker to a particular trust. In scenarios where worker data is being provided by a 3rd party Human Resources (or equivalent) system, it may be necessary to 'on-board' that worker into a particular trust so that they may be selected. Note that in external bank scenarios this is not required, since the trust on-boarding request is implicit within the worker offer.  

### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using ASW.APIServices.Core.Api;
using ASW.APIServices.Core.Client;
using ASW.APIServices.Core.Model;

namespace Example
{
    public class OnboardWorkerToTrustExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://healthsuite.allocatesoftware.com/api/v1";
            // Configure HTTP basic authorization: jwt
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new WorkerApi(Configuration.Default);
            var id = EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440;  // string | The Allocate Worker ID
            var inlineObject = new InlineObject(); // InlineObject | 

            try
            {
                apiInstance.OnboardWorkerToTrust(id, inlineObject);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling WorkerApi.OnboardWorkerToTrust: " + e.Message );
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
 **id** | **string**| The Allocate Worker ID | 
 **inlineObject** | [**InlineObject**](InlineObject.md)|  | 

### Return type

void (empty response body)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The worker has been on-boarded successfully |  -  |
| **400** | One or more errors have occurred when attempting to process the provided data |  -  |
| **403** | Forbidden - you do not have the necessary permissions to undertake this action |  -  |
| **202** | The request has been accepted, and will be processed in due course. |  -  |

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

