# ASW.APIServices.Core.Api.BookingsApi

All URIs are relative to *http://healthsuite.allocatesoftware.com/api/duty/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**SendDutyCosting**](BookingsApi.md#senddutycosting) | **POST** /duties/{id}/costing | 


<a name="senddutycosting"></a>
# **SendDutyCosting**
> void SendDutyCosting (string id, DutyCostDetails dutyCostDetails)



### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using ASW.APIServices.Core.Api;
using ASW.APIServices.Core.Client;
using ASW.APIServices.Core.Model;

namespace Example
{
    public class SendDutyCostingExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://healthsuite.allocatesoftware.com/api/duty/v1";
            var apiInstance = new BookingsApi(Configuration.Default);
            var id = id_example;  // string | ID of the duty
            var dutyCostDetails = new DutyCostDetails(); // DutyCostDetails | Costing Information

            try
            {
                apiInstance.SendDutyCosting(id, dutyCostDetails);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling BookingsApi.SendDutyCosting: " + e.Message );
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
 **dutyCostDetails** | [**DutyCostDetails**](DutyCostDetails.md)| Costing Information | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Duty costing successfully |  -  |
| **202** | The duty costing has been accepted and a response will be returned asyncronously. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

