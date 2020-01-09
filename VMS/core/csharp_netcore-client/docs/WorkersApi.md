# ASW.APIServices.VMS.Api.WorkersApi

All URIs are relative to *http://healthsuite.allocatesoftware.com/vms/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetWorker**](WorkersApi.md#getworker) | **GET** /workers/{id} | 


<a name="getworker"></a>
# **GetWorker**
> Person GetWorker (string id)



Get the details of a person (worker) from the VMS

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using ASW.APIServices.VMS.Api;
using ASW.APIServices.VMS.Client;
using ASW.APIServices.VMS.Model;

namespace Example
{
    public class GetWorkerExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://healthsuite.allocatesoftware.com/vms/api/v1";
            // Configure HTTP basic authorization: bearerAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new WorkersApi(Configuration.Default);
            var id = id_example;  // string | ID of the worker within the VMS.

            try
            {
                Person result = apiInstance.GetWorker(id);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling WorkersApi.GetWorker: " + e.Message );
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
 **id** | **string**| ID of the worker within the VMS. | 

### Return type

[**Person**](Person.md)

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
| **404** | Trust not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

