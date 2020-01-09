# ASW.APIServices.Core.Api.DefaultApi

All URIs are relative to *http://healthsuite.allocatesoftware.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetActivities**](DefaultApi.md#getactivities) | **GET** /activities | 



## GetActivities

> List&lt;HoursAssignment&gt; GetActivities (string customerCode, string format = null)



Provide hours and assignment details for workers

### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using ASW.APIServices.Core.Api;
using ASW.APIServices.Core.Client;
using ASW.APIServices.Core.Model;

namespace Example
{
    public class GetActivitiesExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://healthsuite.allocatesoftware.com/api/v1";
            // Configure HTTP basic authorization: jwt
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new DefaultApi(Configuration.Default);
            var customerCode = ASPH;  // string | The code for the customer (trust) for which the activities should be returned
            var format = short;  // string | Format for the output. TBD, but may be used to control the scope of information returned. (optional) 

            try
            {
                List<HoursAssignment> result = apiInstance.GetActivities(customerCode, format);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling DefaultApi.GetActivities: " + e.Message );
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
 **customerCode** | **string**| The code for the customer (trust) for which the activities should be returned | 
 **format** | **string**| Format for the output. TBD, but may be used to control the scope of information returned. | [optional] 

### Return type

[**List&lt;HoursAssignment&gt;**](HoursAssignment.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The worker has been registered successfully |  -  |
| **400** | One or more errors have occurred when attempting to process the provided data |  -  |
| **403** | Forbidden - you do not have the necessary permissions to undertake this action |  -  |

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

