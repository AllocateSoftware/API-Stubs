# ASW.APIServices.Core.Api.DutyApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CancelDuty**](DutyApi.md#cancelduty) | **POST** /{version}/trustcode/{trustCode}/duty/{dutyId}/cancel | Cancel a duty
[**FillDuty**](DutyApi.md#fillduty) | **POST** /{version}/trustcode/{trustCode}/duty/{dutyId}/booking | Creates booking for duty
[**GetDutyDetails**](DutyApi.md#getdutydetails) | **GET** /{version}/trustcode/{trustCode}/duty/ | Returns details about a duties.
[**GetSingleDutyDetails**](DutyApi.md#getsingledutydetails) | **GET** /{version}/trustcode/{trustCode}/duty/{dutyId} | Returns details about a duties.
[**UpdateContractStatus**](DutyApi.md#updatecontractstatus) | **PUT** /{version}/trustcode/{trustCode}/duty/{dutyId}/contract/{contractId}/status/{statusId} | Updates DE Contract status
[**UpdateTimesheets**](DutyApi.md#updatetimesheets) | **PUT** /{version}/trustcode/{trustCode}/duty/{dutyId}/timesheet | Updates timesheet for duty


<a name="cancelduty"></a>
# **CancelDuty**
> void CancelDuty (string version, string trustCode, int dutyId)

Cancel a duty

Service that cancels certain duty.

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
            Configuration.Default.BasePath = "http://localhost";
            var apiInstance = new DutyApi(Configuration.Default);
            var version = version_example;  // string | API version
            var trustCode = trustCode_example;  // string | Trust code from BankStaff
            var dutyId = 56;  // int | ID of the duty associated with the DE contract

            try
            {
                // Cancel a duty
                apiInstance.CancelDuty(version, trustCode, dutyId);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DutyApi.CancelDuty: " + e.Message );
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
 **version** | **string**| API version | 
 **trustCode** | **string**| Trust code from BankStaff | 
 **dutyId** | **int**| ID of the duty associated with the DE contract | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request errors |  -  |
| **401** | Unauthorized |  -  |
| **404** | Trust/Duty not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="fillduty"></a>
# **FillDuty**
> BookingResponse FillDuty (string version, string trustCode, int dutyId, BookingInfo bookingInfo)

Creates booking for duty

Service that will create new booking on HR side with data sent by DE Provider.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using ASW.APIServices.Core.Api;
using ASW.APIServices.Core.Client;
using ASW.APIServices.Core.Model;

namespace Example
{
    public class FillDutyExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://localhost";
            var apiInstance = new DutyApi(Configuration.Default);
            var version = version_example;  // string | API version
            var trustCode = trustCode_example;  // string | Trust code from BankStaff
            var dutyId = 56;  // int | ID of the duty associated with the DE contract
            var bookingInfo = new BookingInfo(); // BookingInfo | 

            try
            {
                // Creates booking for duty
                BookingResponse result = apiInstance.FillDuty(version, trustCode, dutyId, bookingInfo);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DutyApi.FillDuty: " + e.Message );
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
 **version** | **string**| API version | 
 **trustCode** | **string**| Trust code from BankStaff | 
 **dutyId** | **int**| ID of the duty associated with the DE contract | 
 **bookingInfo** | [**BookingInfo**](BookingInfo.md)|  | 

### Return type

[**BookingResponse**](BookingResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * X-Pagination -  <br>  |
| **400** | Bad request errors |  -  |
| **401** | Unauthorized |  -  |
| **404** | Trust/Duty not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getdutydetails"></a>
# **GetDutyDetails**
> Duty GetDutyDetails (string version, string trustCode, List<int> id, int? page = null, int? pageSize = null)

Returns details about a duties.

Returns details about a duties.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using ASW.APIServices.Core.Api;
using ASW.APIServices.Core.Client;
using ASW.APIServices.Core.Model;

namespace Example
{
    public class GetDutyDetailsExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://localhost";
            var apiInstance = new DutyApi(Configuration.Default);
            var version = version_example;  // string | API version
            var trustCode = trustCode_example;  // string | Trust code from BankStaff
            var id = new List<int>(); // List<int> | IDs of the duties to return
            var page = 56;  // int? | Result page (optional) 
            var pageSize = 56;  // int? | Count of records per page (optional) 

            try
            {
                // Returns details about a duties.
                Duty result = apiInstance.GetDutyDetails(version, trustCode, id, page, pageSize);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DutyApi.GetDutyDetails: " + e.Message );
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
 **version** | **string**| API version | 
 **trustCode** | **string**| Trust code from BankStaff | 
 **id** | [**List&lt;int&gt;**](int.md)| IDs of the duties to return | 
 **page** | **int?**| Result page | [optional] 
 **pageSize** | **int?**| Count of records per page | [optional] 

### Return type

[**Duty**](Duty.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request errors |  -  |
| **401** | Unauthorized |  -  |
| **404** | Trust not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getsingledutydetails"></a>
# **GetSingleDutyDetails**
> Duty GetSingleDutyDetails (string version, string trustCode, int dutyId, int? page = null, int? pageSize = null)

Returns details about a duties.

Returns details about a duties.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using ASW.APIServices.Core.Api;
using ASW.APIServices.Core.Client;
using ASW.APIServices.Core.Model;

namespace Example
{
    public class GetSingleDutyDetailsExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://localhost";
            var apiInstance = new DutyApi(Configuration.Default);
            var version = version_example;  // string | API version
            var trustCode = trustCode_example;  // string | Trust code from BankStaff
            var dutyId = 56;  // int | ID of a duty to return
            var page = 56;  // int? | Result page (optional) 
            var pageSize = 56;  // int? | Count of records per page (optional) 

            try
            {
                // Returns details about a duties.
                Duty result = apiInstance.GetSingleDutyDetails(version, trustCode, dutyId, page, pageSize);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DutyApi.GetSingleDutyDetails: " + e.Message );
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
 **version** | **string**| API version | 
 **trustCode** | **string**| Trust code from BankStaff | 
 **dutyId** | **int**| ID of a duty to return | 
 **page** | **int?**| Result page | [optional] 
 **pageSize** | **int?**| Count of records per page | [optional] 

### Return type

[**Duty**](Duty.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request errors |  -  |
| **401** | Unauthorized |  -  |
| **404** | Trust not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="updatecontractstatus"></a>
# **UpdateContractStatus**
> void UpdateContractStatus (string version, string trustCode, int dutyId, string contractId, ContractStatus statusId)

Updates DE Contract status

Service that will be used by DE Provider to update the contract status, after DE contract is created/approved.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using ASW.APIServices.Core.Api;
using ASW.APIServices.Core.Client;
using ASW.APIServices.Core.Model;

namespace Example
{
    public class UpdateContractStatusExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://localhost";
            var apiInstance = new DutyApi(Configuration.Default);
            var version = version_example;  // string | API version
            var trustCode = trustCode_example;  // string | Trust code from BankStaff
            var dutyId = 56;  // int | ID of the duty associated with the DE contract
            var contractId = 77135e23-af51-4714-b854-d8df9e64aa63;  // string | ID of the contract from DE Provider's system
            var statusId = new ContractStatus(); // ContractStatus | 

            try
            {
                // Updates DE Contract status
                apiInstance.UpdateContractStatus(version, trustCode, dutyId, contractId, statusId);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DutyApi.UpdateContractStatus: " + e.Message );
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
 **version** | **string**| API version | 
 **trustCode** | **string**| Trust code from BankStaff | 
 **dutyId** | **int**| ID of the duty associated with the DE contract | 
 **contractId** | **string**| ID of the contract from DE Provider&#39;s system | 
 **statusId** | [**ContractStatus**](ContractStatus.md)|  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request errors |  -  |
| **401** | Unauthorized |  -  |
| **404** | Trust/Duty not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="updatetimesheets"></a>
# **UpdateTimesheets**
> void UpdateTimesheets (string version, string trustCode, int dutyId, InlineObject inlineObject)

Updates timesheet for duty

Service that will be used by DE Provider to update the timesheets, after approving the payment on their side.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using ASW.APIServices.Core.Api;
using ASW.APIServices.Core.Client;
using ASW.APIServices.Core.Model;

namespace Example
{
    public class UpdateTimesheetsExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://localhost";
            var apiInstance = new DutyApi(Configuration.Default);
            var version = version_example;  // string | API version
            var trustCode = trustCode_example;  // string | Trust code from BankStaff
            var dutyId = 56;  // int | ID of the duty associated with the DE contract
            var inlineObject = new InlineObject(); // InlineObject | 

            try
            {
                // Updates timesheet for duty
                apiInstance.UpdateTimesheets(version, trustCode, dutyId, inlineObject);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DutyApi.UpdateTimesheets: " + e.Message );
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
 **version** | **string**| API version | 
 **trustCode** | **string**| Trust code from BankStaff | 
 **dutyId** | **int**| ID of the duty associated with the DE contract | 
 **inlineObject** | [**InlineObject**](InlineObject.md)|  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request errors |  -  |
| **401** | Unauthorized |  -  |
| **404** | Trust/Duty not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

