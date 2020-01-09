# ASW.APIServices.Core.Api.WorkerDataApi

All URIs are relative to *http://healthsuite.allocatesoftware.com/api/worker/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**RegisterWorker**](WorkerDataApi.md#registerworker) | **POST** /workers | 


<a name="registerworker"></a>
# **RegisterWorker**
> WorkerRegistrationResponse RegisterWorker (Person person)



Provide worker details for inclusion into the Allocate ecosystem. The platform will accept the worker information, and respond either synchronously or asynchronously with the allocate worker identifier. This may entail an on-boarding process, so the final response may require human interaction before it can be completed.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using ASW.APIServices.Core.Api;
using ASW.APIServices.Core.Client;
using ASW.APIServices.Core.Model;

namespace Example
{
    public class RegisterWorkerExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://healthsuite.allocatesoftware.com/api/worker/v1";
            var apiInstance = new WorkerDataApi(Configuration.Default);
            var person = new Person(); // Person | Worker information

            try
            {
                WorkerRegistrationResponse result = apiInstance.RegisterWorker(person);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling WorkerDataApi.RegisterWorker: " + e.Message );
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
 **person** | [**Person**](Person.md)| Worker information | 

### Return type

[**WorkerRegistrationResponse**](WorkerRegistrationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The worker has been registered successfully |  -  |
| **400** | One or more errors have occurred when attempting to process the provided data |  -  |
| **202** | The worker data has been accepted, and will be processed in due course. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

