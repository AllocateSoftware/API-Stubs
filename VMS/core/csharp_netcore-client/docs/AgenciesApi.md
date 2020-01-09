# ASW.APIServices.VMS.Api.AgenciesApi

All URIs are relative to *http://healthsuite.allocatesoftware.com/vms/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetCostings**](AgenciesApi.md#getcostings) | **POST** /agencies/costings | 
[**SendDutyToAgencies**](AgenciesApi.md#senddutytoagencies) | **POST** /agencies | 
[**SendDutyToAgency**](AgenciesApi.md#senddutytoagency) | **POST** /agencies/{agencyId} | 


<a name="getcostings"></a>
# **GetCostings**
> AgencyCostings GetCostings (Duty duty)



Returns a list of agencies and their costs for the supplied duty.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using ASW.APIServices.VMS.Api;
using ASW.APIServices.VMS.Client;
using ASW.APIServices.VMS.Model;

namespace Example
{
    public class GetCostingsExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://healthsuite.allocatesoftware.com/vms/api/v1";
            // Configure HTTP basic authorization: bearerAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new AgenciesApi(Configuration.Default);
            var duty = new Duty(); // Duty | Duty to be costed

            try
            {
                AgencyCostings result = apiInstance.GetCostings(duty);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling AgenciesApi.GetCostings: " + e.Message );
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
 **duty** | [**Duty**](Duty.md)| Duty to be costed | 

### Return type

[**AgencyCostings**](AgencyCostings.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Invalid input parameter |  -  |
| **401** | Unauthorized |  -  |
| **404** | Trust not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="senddutytoagencies"></a>
# **SendDutyToAgencies**
> string SendDutyToAgencies (DutyRequest dutyRequest)



Forward a request for a duty to be filled by agency. Dependent upon the rules specified within the VMS, this will cascade to the appropriate agencies.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using ASW.APIServices.VMS.Api;
using ASW.APIServices.VMS.Client;
using ASW.APIServices.VMS.Model;

namespace Example
{
    public class SendDutyToAgenciesExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://healthsuite.allocatesoftware.com/vms/api/v1";
            // Configure HTTP basic authorization: bearerAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new AgenciesApi(Configuration.Default);
            var dutyRequest = new DutyRequest(); // DutyRequest | Duty to be sent to agency

            try
            {
                string result = apiInstance.SendDutyToAgencies(dutyRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling AgenciesApi.SendDutyToAgencies: " + e.Message );
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
 **dutyRequest** | [**DutyRequest**](DutyRequest.md)| Duty to be sent to agency | 

### Return type

**string**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Duty accepted by VMS. |  -  |
| **400** | Invalid input parameter |  -  |
| **401** | Unauthorized |  -  |
| **404** | Trust not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="senddutytoagency"></a>
# **SendDutyToAgency**
> string SendDutyToAgency (string agencyId, DutyRequest dutyRequest)



Immediately forward a request for a duty to be filled by a specific agency. If the request also specifies a worker Identity, this will be a direct booking.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using ASW.APIServices.VMS.Api;
using ASW.APIServices.VMS.Client;
using ASW.APIServices.VMS.Model;

namespace Example
{
    public class SendDutyToAgencyExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://healthsuite.allocatesoftware.com/vms/api/v1";
            // Configure HTTP basic authorization: bearerAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new AgenciesApi(Configuration.Default);
            var agencyId = agencyId_example;  // string | ID of the agency to send the request to.
            var dutyRequest = new DutyRequest(); // DutyRequest | Duty to be sent to agency

            try
            {
                string result = apiInstance.SendDutyToAgency(agencyId, dutyRequest);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling AgenciesApi.SendDutyToAgency: " + e.Message );
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
 **agencyId** | **string**| ID of the agency to send the request to. | 
 **dutyRequest** | [**DutyRequest**](DutyRequest.md)| Duty to be sent to agency | 

### Return type

**string**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Duty accepted by VMS. |  -  |
| **400** | Invalid input parameter |  -  |
| **401** | Unauthorized |  -  |
| **404** | Trust not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

