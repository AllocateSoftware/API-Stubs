# api_server.AgenciesApi

All URIs are relative to *http://healthsuite.allocatesoftware.com/vms/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_costings**](AgenciesApi.md#get_costings) | **POST** /agencies/costings | 
[**send_duty_to_agencies**](AgenciesApi.md#send_duty_to_agencies) | **POST** /agencies | 
[**send_duty_to_agency**](AgenciesApi.md#send_duty_to_agency) | **POST** /agencies/{agencyId} | 


# **get_costings**
> AgencyCostings get_costings(duty)



Returns a list of agencies and their costs for the supplied duty.

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
api_instance = api_server.AgenciesApi(api_server.ApiClient(configuration))
duty = api_server.Duty() # Duty | Duty to be costed

try:
    api_response = api_instance.get_costings(duty)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AgenciesApi->get_costings: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **duty** | [**Duty**](Duty.md)| Duty to be costed | 

### Return type

[**AgencyCostings**](AgencyCostings.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Invalid input parameter |  -  |
**401** | Unauthorized |  -  |
**404** | Trust not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **send_duty_to_agencies**
> str send_duty_to_agencies(duty_request)



Forward a request for a duty to be filled by agency. Dependent upon the rules specified within the VMS, this will cascade to the appropriate agencies.

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
api_instance = api_server.AgenciesApi(api_server.ApiClient(configuration))
duty_request = api_server.DutyRequest() # DutyRequest | Duty to be sent to agency

try:
    api_response = api_instance.send_duty_to_agencies(duty_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AgenciesApi->send_duty_to_agencies: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **duty_request** | [**DutyRequest**](DutyRequest.md)| Duty to be sent to agency | 

### Return type

**str**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Duty accepted by VMS. |  -  |
**400** | Invalid input parameter |  -  |
**401** | Unauthorized |  -  |
**404** | Trust not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **send_duty_to_agency**
> str send_duty_to_agency(agency_id, duty_request)



Immediately forward a request for a duty to be filled by a specific agency. If the request also specifies a worker Identity, this will be a direct booking.

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
api_instance = api_server.AgenciesApi(api_server.ApiClient(configuration))
agency_id = 'agency_id_example' # str | ID of the agency to send the request to.
duty_request = api_server.DutyRequest() # DutyRequest | Duty to be sent to agency

try:
    api_response = api_instance.send_duty_to_agency(agency_id, duty_request)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AgenciesApi->send_duty_to_agency: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **agency_id** | **str**| ID of the agency to send the request to. | 
 **duty_request** | [**DutyRequest**](DutyRequest.md)| Duty to be sent to agency | 

### Return type

**str**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Duty accepted by VMS. |  -  |
**400** | Invalid input parameter |  -  |
**401** | Unauthorized |  -  |
**404** | Trust not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

