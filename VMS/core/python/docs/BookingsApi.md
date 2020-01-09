# api_server.BookingsApi

All URIs are relative to *http://healthsuite.allocatesoftware.com/vms/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accept_agency_offer**](BookingsApi.md#accept_agency_offer) | **PUT** /bookingRequests/{bookingRequestId}/offers/{offerId}/accept | 
[**cancel_booking**](BookingsApi.md#cancel_booking) | **DELETE** /bookings/{bookingId} | 
[**cancel_booking_request**](BookingsApi.md#cancel_booking_request) | **DELETE** /bookingRequests/{bookingRequestId} | 
[**get_booking**](BookingsApi.md#get_booking) | **GET** /bookings/{bookingId} | 


# **accept_agency_offer**
> str accept_agency_offer(booking_request_id, offer_id)



Accept an agency offer for a worker.

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
api_instance = api_server.BookingsApi(api_server.ApiClient(configuration))
booking_request_id = 'booking_request_id_example' # str | ID of the booking request to accept.
offer_id = 'offer_id_example' # str | ID of the offer to accept. Depending on the VMS, this may be a unique ID, an index to locate an agency, or the agency ID itself.

try:
    api_response = api_instance.accept_agency_offer(booking_request_id, offer_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BookingsApi->accept_agency_offer: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **booking_request_id** | **str**| ID of the booking request to accept. | 
 **offer_id** | **str**| ID of the offer to accept. Depending on the VMS, this may be a unique ID, an index to locate an agency, or the agency ID itself. | 

### Return type

**str**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Booking request confirmed by VMS. |  -  |
**401** | Unauthorized |  -  |
**404** | No such booking request exists |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **cancel_booking**
> cancel_booking(booking_id)



Cancel a duty booking previously accepted. This does not cancel any outstanding booking requests or duty cascades.

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
api_instance = api_server.BookingsApi(api_server.ApiClient(configuration))
booking_id = 'booking_id_example' # str | ID of the booking to cancel.

try:
    api_instance.cancel_booking(booking_id)
except ApiException as e:
    print("Exception when calling BookingsApi->cancel_booking: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **booking_id** | **str**| ID of the booking to cancel. | 

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully deleted booking |  -  |
**401** | Unauthorized |  -  |
**404** | No such booking exists |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **cancel_booking_request**
> cancel_booking_request(booking_request_id)



Cancel a previously requested booking. If the booking request has resulted in actual bookings, these will also be cancelled.

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
api_instance = api_server.BookingsApi(api_server.ApiClient(configuration))
booking_request_id = 'booking_request_id_example' # str | ID of the booking request to cancel.

try:
    api_instance.cancel_booking_request(booking_request_id)
except ApiException as e:
    print("Exception when calling BookingsApi->cancel_booking_request: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **booking_request_id** | **str**| ID of the booking request to cancel. | 

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully deleted booking request |  -  |
**401** | Unauthorized |  -  |
**404** | No such booking request exists |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_booking**
> DutyRequest get_booking(booking_id)



Query a duty booking by id

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
api_instance = api_server.BookingsApi(api_server.ApiClient(configuration))
booking_id = 'booking_id_example' # str | ID of the duty booking

try:
    api_response = api_instance.get_booking(booking_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling BookingsApi->get_booking: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **booking_id** | **str**| ID of the duty booking | 

### Return type

[**DutyRequest**](DutyRequest.md)

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
**404** | No such booking exists |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

