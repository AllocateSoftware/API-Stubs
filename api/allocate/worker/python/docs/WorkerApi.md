# api_server.WorkerApi

All URIs are relative to *http://healthsuite.allocatesoftware.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**onboard_worker_to_trust**](WorkerApi.md#onboard_worker_to_trust) | **POST** /workers/{id}/onboardToTrust | 


# **onboard_worker_to_trust**
> onboard_worker_to_trust(id, inline_object)



On-board a worker to a particular trust. In scenarios where worker data is being provided by a 3rd party Human Resources (or equivalent) system, it may be necessary to 'on-board' that worker into a particular trust so that they may be selected. Note that in external bank scenarios this is not required, since the trust on-boarding request is implicit within the worker offer.  

### Example

* Bearer (JWT) Authentication (jwt):
```python
from __future__ import print_function
import time
import api_server
from api_server.rest import ApiException
from pprint import pprint
configuration = api_server.Configuration()
# Configure Bearer authorization (JWT): jwt
configuration.access_token = 'YOUR_BEARER_TOKEN'

# Defining host is optional and default to http://healthsuite.allocatesoftware.com/api/v1
configuration.host = "http://healthsuite.allocatesoftware.com/api/v1"
# Create an instance of the API class
api_instance = api_server.WorkerApi(api_server.ApiClient(configuration))
id = 'EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440' # str | The Allocate Worker ID
inline_object = api_server.InlineObject() # InlineObject | 

try:
    api_instance.onboard_worker_to_trust(id, inline_object)
except ApiException as e:
    print("Exception when calling WorkerApi->onboard_worker_to_trust: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The Allocate Worker ID | 
 **inline_object** | [**InlineObject**](InlineObject.md)|  | 

### Return type

void (empty response body)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The worker has been on-boarded successfully |  -  |
**400** | One or more errors have occurred when attempting to process the provided data |  -  |
**403** | Forbidden - you do not have the necessary permissions to undertake this action |  -  |
**202** | The request has been accepted, and will be processed in due course. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

