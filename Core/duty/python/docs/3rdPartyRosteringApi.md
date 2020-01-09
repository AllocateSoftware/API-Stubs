# api_server.3rdPartyRosteringApi

All URIs are relative to *http://healthsuite.allocatesoftware.com/api/duty/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancel_duty**](3rdPartyRosteringApi.md#cancel_duty) | **DELETE** /duties/{id} | 
[**cancel_duty_booking**](3rdPartyRosteringApi.md#cancel_duty_booking) | **DELETE** /duties/{id}/booking | 
[**create_duty**](3rdPartyRosteringApi.md#create_duty) | **POST** /duties | 
[**send_duty_for_fulfillment**](3rdPartyRosteringApi.md#send_duty_for_fulfillment) | **POST** /duties/{id}/sendTo/{destination} | 


# **cancel_duty**
> cancel_duty(id)



Cancel a duty. Also cancels any bookings (if present).

### Example

```python
from __future__ import print_function
import time
import api_server
from api_server.rest import ApiException
from pprint import pprint

# Create an instance of the API class
api_instance = api_server.3rdPartyRosteringApi()
id = 'id_example' # str | ID of the duty

try:
    api_instance.cancel_duty(id)
except ApiException as e:
    print("Exception when calling 3rdPartyRosteringApi->cancel_duty: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| ID of the duty | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Duty cancelled |  -  |
**202** | The cancellation has been accepted and a response will be returned asyncronously. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **cancel_duty_booking**
> cancel_duty_booking(id)



Cancel a duty booking.

### Example

```python
from __future__ import print_function
import time
import api_server
from api_server.rest import ApiException
from pprint import pprint

# Create an instance of the API class
api_instance = api_server.3rdPartyRosteringApi()
id = 'id_example' # str | ID of the duty

try:
    api_instance.cancel_duty_booking(id)
except ApiException as e:
    print("Exception when calling 3rdPartyRosteringApi->cancel_duty_booking: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| ID of the duty | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Duty booking cancelled |  -  |
**202** | The duty cancellation been accepted and a response will be returned asyncronously. |  -  |
**404** | Duty or Customer not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_duty**
> str create_duty(duty_details)



Create a new Duty

### Example

```python
from __future__ import print_function
import time
import api_server
from api_server.rest import ApiException
from pprint import pprint

# Create an instance of the API class
api_instance = api_server.3rdPartyRosteringApi()
duty_details = api_server.DutyDetails() # DutyDetails | Duty to be sent to agency

try:
    api_response = api_instance.create_duty(duty_details)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling 3rdPartyRosteringApi->create_duty: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **duty_details** | [**DutyDetails**](DutyDetails.md)| Duty to be sent to agency | 

### Return type

**str**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/plain, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Duty created successfully |  -  |
**202** | The duty has been accepted and a response will be returned asyncronously. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **send_duty_for_fulfillment**
> send_duty_for_fulfillment(id, destination)



Send a duty for fulfillment by contingent workforce (Bank, Cloudstaff, Agency)

### Example

```python
from __future__ import print_function
import time
import api_server
from api_server.rest import ApiException
from pprint import pprint

# Create an instance of the API class
api_instance = api_server.3rdPartyRosteringApi()
id = 'id_example' # str | ID of the duty
destination = 'destination_example' # str | Desination to send the duty

try:
    api_instance.send_duty_for_fulfillment(id, destination)
except ApiException as e:
    print("Exception when calling 3rdPartyRosteringApi->send_duty_for_fulfillment: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| ID of the duty | 
 **destination** | **str**| Desination to send the duty | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Duty sent successfully |  -  |
**202** | Request been accepted and a response will be returned asyncronously. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

