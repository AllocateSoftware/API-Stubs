# api_server.AnnualLeaveClaimsApi

All URIs are relative to *http://healthsuite.allocatesoftware.com/api/worker/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**submit_annual_leave_claim**](AnnualLeaveClaimsApi.md#submit_annual_leave_claim) | **POST** /worker/{id}/leave | 


# **submit_annual_leave_claim**
> AsyncResponse submit_annual_leave_claim(id, leave_claim)



Submit an leave (vacation) claim for a worker

### Example

```python
from __future__ import print_function
import time
import api_server
from api_server.rest import ApiException
from pprint import pprint

# Create an instance of the API class
api_instance = api_server.AnnualLeaveClaimsApi()
id = 'id_example' # str | ID of the worker
leave_claim = api_server.LeaveClaim() # LeaveClaim | Leave claim for a worker

try:
    api_response = api_instance.submit_annual_leave_claim(id, leave_claim)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AnnualLeaveClaimsApi->submit_annual_leave_claim: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| ID of the worker | 
 **leave_claim** | [**LeaveClaim**](LeaveClaim.md)| Leave claim for a worker | 

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
**202** | The worker data has been accepted, and will be processed in due course. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

