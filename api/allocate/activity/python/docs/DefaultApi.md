# api_server.DefaultApi

All URIs are relative to *http://healthsuite.allocatesoftware.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_activities**](DefaultApi.md#get_activities) | **GET** /activities | 


# **get_activities**
> list[HoursAssignment] get_activities(customer_code, format=format)



Provide hours and assignment details for workers

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
customer_code = 'ASPH' # str | The code for the customer (trust) for which the activities should be returned
format = 'short' # str | Format for the output. TBD, but may be used to control the scope of information returned. (optional)

try:
    api_response = api_instance.get_activities(customer_code, format=format)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DefaultApi->get_activities: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customer_code** | **str**| The code for the customer (trust) for which the activities should be returned | 
 **format** | **str**| Format for the output. TBD, but may be used to control the scope of information returned. | [optional] 

### Return type

[**list[HoursAssignment]**](HoursAssignment.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The worker has been registered successfully |  -  |
**400** | One or more errors have occurred when attempting to process the provided data |  -  |
**403** | Forbidden - you do not have the necessary permissions to undertake this action |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

