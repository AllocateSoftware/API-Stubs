# api_server.DefaultApi

All URIs are relative to *http://healthsuite.allocatesoftware.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_worker**](DefaultApi.md#get_worker) | **GET** /workers/{id} | 
[**register_worker**](DefaultApi.md#register_worker) | **POST** /workers | 


# **get_worker**
> Person get_worker(id)



Retrieve worker details from the Allocate ecosystem using the Allocate Worker id. The Allocate Worker id will be issued when registering a worker.  

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
api_instance = api_server.DefaultApi(api_server.ApiClient(configuration))
id = '2CBC7FF9-38FB-4F0A-835A-324D9CF4800C' # str | The ID of the worker

try:
    api_response = api_instance.get_worker(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DefaultApi->get_worker: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The ID of the worker | 

### Return type

[**Person**](Person.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Worker successfully found |  -  |
**404** | The worker was not found |  -  |
**403** | Forbidden - you do not have the necessary permissions to undertake this action |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **register_worker**
> WorkerRegistrationResponse register_worker(person)



Provide worker details for inclusion into the Allocate ecosystem.  The platform will accept the worker information, and respond either synchronously or asynchronously with the allocate worker identifier.  This may entail an on-boarding process, so the final response may require human interaction before it can be completed.  Where there is a source system in common, such as HealthSuite and a Bank system both using ESR as a source of worker data, a person record containing an ESR trust-relative Staff Number is likely to be sufficient. 

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
api_instance = api_server.DefaultApi(api_server.ApiClient(configuration))
person = api_server.Person() # Person | Worker information

try:
    api_response = api_instance.register_worker(person)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DefaultApi->register_worker: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **person** | [**Person**](Person.md)| Worker information | 

### Return type

[**WorkerRegistrationResponse**](WorkerRegistrationResponse.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The worker has been registered successfully |  -  |
**400** | One or more errors have occurred when attempting to process the provided data |  -  |
**403** | Forbidden - you do not have the necessary permissions to undertake this action |  -  |
**202** | The worker data has been accepted, and will be processed in due course. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

