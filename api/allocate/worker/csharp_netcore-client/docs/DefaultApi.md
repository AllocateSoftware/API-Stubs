# ASW.APIServices.Core.Api.DefaultApi

All URIs are relative to *http://healthsuite.allocatesoftware.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetWorker**](DefaultApi.md#getworker) | **GET** /workers/{id} | 
[**RegisterWorker**](DefaultApi.md#registerworker) | **POST** /workers | 


<a name="getworker"></a>
# **GetWorker**
> Person GetWorker (string id)



Retrieve worker details from the Allocate ecosystem using the Allocate Worker id. The Allocate Worker id will be issued when registering a worker.  

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using ASW.APIServices.Core.Api;
using ASW.APIServices.Core.Client;
using ASW.APIServices.Core.Model;

namespace Example
{
    public class GetWorkerExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://healthsuite.allocatesoftware.com/api/v1";
            // Configure HTTP basic authorization: jwt
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new DefaultApi(Configuration.Default);
            var id = 2CBC7FF9-38FB-4F0A-835A-324D9CF4800C;  // string | The ID of the worker

            try
            {
                Person result = apiInstance.GetWorker(id);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DefaultApi.GetWorker: " + e.Message );
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
 **id** | **string**| The ID of the worker | 

### Return type

[**Person**](Person.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Worker successfully found |  -  |
| **404** | The worker was not found |  -  |
| **403** | Forbidden - you do not have the necessary permissions to undertake this action |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="registerworker"></a>
# **RegisterWorker**
> WorkerRegistrationResponse RegisterWorker (Person person)



Provide worker details for inclusion into the Allocate ecosystem.  The platform will accept the worker information, and respond either synchronously or asynchronously with the allocate worker identifier.  This may entail an on-boarding process, so the final response may require human interaction before it can be completed.  Where there is a source system in common, such as HealthSuite and a Bank system both using ESR as a source of worker data, a person record containing an ESR trust-relative Staff Number is likely to be sufficient. 

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
            Configuration.Default.BasePath = "http://healthsuite.allocatesoftware.com/api/v1";
            // Configure HTTP basic authorization: jwt
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new DefaultApi(Configuration.Default);
            var person = new Person(); // Person | Worker information

            try
            {
                WorkerRegistrationResponse result = apiInstance.RegisterWorker(person);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DefaultApi.RegisterWorker: " + e.Message );
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

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The worker has been registered successfully |  -  |
| **400** | One or more errors have occurred when attempting to process the provided data |  -  |
| **403** | Forbidden - you do not have the necessary permissions to undertake this action |  -  |
| **202** | The worker data has been accepted, and will be processed in due course. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

