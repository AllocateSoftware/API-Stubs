# ASW.APIServices.Core.Api.EventApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetEvents**](EventApi.md#getevents) | **GET** /{version}/trustcode/{trustCode}/event | Get all events older than input timestamp


<a name="getevents"></a>
# **GetEvents**
> Duty GetEvents (string version, string trustCode, DateTime dateTimeFrom, int? page = null, int? pageSize = null)

Get all events older than input timestamp

Returns an array of events

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using ASW.APIServices.Core.Api;
using ASW.APIServices.Core.Client;
using ASW.APIServices.Core.Model;

namespace Example
{
    public class GetEventsExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://localhost";
            var apiInstance = new EventApi(Configuration.Default);
            var version = version_example;  // string | API version
            var trustCode = trustCode_example;  // string | Trust code from BankStaff
            var dateTimeFrom = 2013-10-20T19:20:30+01:00;  // DateTime | Timestamp
            var page = 56;  // int? | Result page (optional) 
            var pageSize = 56;  // int? | Count of records per page (optional) 

            try
            {
                // Get all events older than input timestamp
                Duty result = apiInstance.GetEvents(version, trustCode, dateTimeFrom, page, pageSize);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling EventApi.GetEvents: " + e.Message );
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
 **dateTimeFrom** | **DateTime**| Timestamp | 
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
| **200** | OK |  * X-Pagination -  <br>  |
| **400** | Bad request errors |  -  |
| **401** | Unauthorized |  -  |
| **404** | Trust not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

