# ASW.APIServices.Core.Api.AnnualLeaveClaimsApi

All URIs are relative to *http://healthsuite.allocatesoftware.com/api/worker/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**SubmitAnnualLeaveClaim**](AnnualLeaveClaimsApi.md#submitannualleaveclaim) | **POST** /worker/{id}/leave | 


<a name="submitannualleaveclaim"></a>
# **SubmitAnnualLeaveClaim**
> AsyncResponse SubmitAnnualLeaveClaim (string id, LeaveClaim leaveClaim)



Submit an leave (vacation) claim for a worker

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using ASW.APIServices.Core.Api;
using ASW.APIServices.Core.Client;
using ASW.APIServices.Core.Model;

namespace Example
{
    public class SubmitAnnualLeaveClaimExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://healthsuite.allocatesoftware.com/api/worker/v1";
            var apiInstance = new AnnualLeaveClaimsApi(Configuration.Default);
            var id = id_example;  // string | ID of the worker
            var leaveClaim = new LeaveClaim(); // LeaveClaim | Leave claim for a worker

            try
            {
                AsyncResponse result = apiInstance.SubmitAnnualLeaveClaim(id, leaveClaim);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling AnnualLeaveClaimsApi.SubmitAnnualLeaveClaim: " + e.Message );
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
 **id** | **string**| ID of the worker | 
 **leaveClaim** | [**LeaveClaim**](LeaveClaim.md)| Leave claim for a worker | 

### Return type

[**AsyncResponse**](AsyncResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | The worker data has been accepted, and will be processed in due course. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

