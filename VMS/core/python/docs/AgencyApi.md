# api_server.AgencyApi

All URIs are relative to *http://healthsuite.allocatesoftware.com/vms/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**offer_worker**](AgencyApi.md#offer_worker) | **POST** /bookingRequests/{bookingRequestId}/offers | 


# **offer_worker**
> offer_worker(booking_request_id, person_identifier)



Offer a worker for a booking

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
api_instance = api_server.AgencyApi(api_server.ApiClient(configuration))
booking_request_id = 'booking_request_id_example' # str | ID of the booking request to offer a worker for.
person_identifier = api_server.PersonIdentifier() # PersonIdentifier | Worker to be offered

try:
    api_instance.offer_worker(booking_request_id, person_identifier)
except ApiException as e:
    print("Exception when calling AgencyApi->offer_worker: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **booking_request_id** | **str**| ID of the booking request to offer a worker for. | 
 **person_identifier** | [**PersonIdentifier**](PersonIdentifier.md)| Worker to be offered | 

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully offered worker |  -  |
**401** | Unauthorized |  -  |
**404** | No such booking request exists |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

