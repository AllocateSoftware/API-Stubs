# api_server.WorkersApi

All URIs are relative to *http://healthsuite.allocatesoftware.com/vms/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_worker**](WorkersApi.md#get_worker) | **GET** /workers/{id} | 


# **get_worker**
> Person get_worker(id)



Get the details of a person (worker) from the VMS

### Example

* Bearer (jwt) Authentication (bearerAuth):
```python
from __future__ import print_function
import time
import api_server
from api_server.rest import ApiException
from pprint import pprint
configuration = api_server.Configuration()
# Configure Bearer authorization (jwt): bearerAuth
configuration.access_token = 'YOUR_BEARER_TOKEN'

# Defining host is optional and default to http://healthsuite.allocatesoftware.com/vms/api/v1
configuration.host = "http://healthsuite.allocatesoftware.com/vms/api/v1"
# Create an instance of the API class
api_instance = api_server.WorkersApi(api_server.ApiClient(configuration))
id = 'id_example' # str | ID of the worker within the VMS.

try:
    api_response = api_instance.get_worker(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling WorkersApi->get_worker: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| ID of the worker within the VMS. | 

### Return type

[**Person**](Person.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Request OK |  -  |
**400** | Invalid input parameter |  -  |
**401** | Unauthorized |  -  |
**404** | Trust not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

