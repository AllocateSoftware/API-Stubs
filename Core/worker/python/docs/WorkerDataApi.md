# api_server.WorkerDataApi

All URIs are relative to *http://healthsuite.allocatesoftware.com/api/worker/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**register_worker**](WorkerDataApi.md#register_worker) | **POST** /workers | 


# **register_worker**
> WorkerRegistrationResponse register_worker(person)



Provide worker details for inclusion into the Allocate ecosystem. The platform will accept the worker information, and respond either synchronously or asynchronously with the allocate worker identifier. This may entail an on-boarding process, so the final response may require human interaction before it can be completed.

### Example

```python
from __future__ import print_function
import time
import api_server
from api_server.rest import ApiException
from pprint import pprint

# Create an instance of the API class
api_instance = api_server.WorkerDataApi()
person = api_server.Person() # Person | Worker information

try:
    api_response = api_instance.register_worker(person)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling WorkerDataApi->register_worker: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **person** | [**Person**](Person.md)| Worker information | 

### Return type

[**WorkerRegistrationResponse**](WorkerRegistrationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The worker has been registered successfully |  -  |
**400** | One or more errors have occurred when attempting to process the provided data |  -  |
**202** | The worker data has been accepted, and will be processed in due course. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

