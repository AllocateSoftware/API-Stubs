# api_server.DutyApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancel_duty**](DutyApi.md#cancel_duty) | **POST** /{version}/trustcode/{trustCode}/duty/{dutyId}/cancel | Cancel a duty
[**fill_duty**](DutyApi.md#fill_duty) | **POST** /{version}/trustcode/{trustCode}/duty/{dutyId}/booking | Creates booking for duty
[**get_duty_details**](DutyApi.md#get_duty_details) | **GET** /{version}/trustcode/{trustCode}/duty/ | Returns details about a duties.
[**get_single_duty_details**](DutyApi.md#get_single_duty_details) | **GET** /{version}/trustcode/{trustCode}/duty/{dutyId} | Returns details about a duties.
[**update_contract_status**](DutyApi.md#update_contract_status) | **PUT** /{version}/trustcode/{trustCode}/duty/{dutyId}/contract/{contractId}/status/{statusId} | Updates DE Contract status
[**update_timesheets**](DutyApi.md#update_timesheets) | **PUT** /{version}/trustcode/{trustCode}/duty/{dutyId}/timesheet | Updates timesheet for duty


# **cancel_duty**
> cancel_duty(version, trust_code, duty_id)

Cancel a duty

Service that cancels certain duty.

### Example

```python
from __future__ import print_function
import time
import api_server
from api_server.rest import ApiException
from pprint import pprint

# Create an instance of the API class
api_instance = api_server.DutyApi()
version = 'version_example' # str | API version
trust_code = 'trust_code_example' # str | Trust code from BankStaff
duty_id = 56 # int | ID of the duty associated with the DE contract

try:
    # Cancel a duty
    api_instance.cancel_duty(version, trust_code, duty_id)
except ApiException as e:
    print("Exception when calling DutyApi->cancel_duty: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **version** | **str**| API version | 
 **trust_code** | **str**| Trust code from BankStaff | 
 **duty_id** | **int**| ID of the duty associated with the DE contract | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad request errors |  -  |
**401** | Unauthorized |  -  |
**404** | Trust/Duty not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **fill_duty**
> BookingResponse fill_duty(version, trust_code, duty_id, booking_info)

Creates booking for duty

Service that will create new booking on HR side with data sent by DE Provider.

### Example

```python
from __future__ import print_function
import time
import api_server
from api_server.rest import ApiException
from pprint import pprint

# Create an instance of the API class
api_instance = api_server.DutyApi()
version = 'version_example' # str | API version
trust_code = 'trust_code_example' # str | Trust code from BankStaff
duty_id = 56 # int | ID of the duty associated with the DE contract
booking_info = api_server.BookingInfo() # BookingInfo | 

try:
    # Creates booking for duty
    api_response = api_instance.fill_duty(version, trust_code, duty_id, booking_info)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DutyApi->fill_duty: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **version** | **str**| API version | 
 **trust_code** | **str**| Trust code from BankStaff | 
 **duty_id** | **int**| ID of the duty associated with the DE contract | 
 **booking_info** | [**BookingInfo**](BookingInfo.md)|  | 

### Return type

[**BookingResponse**](BookingResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * X-Pagination -  <br>  |
**400** | Bad request errors |  -  |
**401** | Unauthorized |  -  |
**404** | Trust/Duty not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_duty_details**
> Duty get_duty_details(version, trust_code, id, page=page, page_size=page_size)

Returns details about a duties.

Returns details about a duties.

### Example

```python
from __future__ import print_function
import time
import api_server
from api_server.rest import ApiException
from pprint import pprint

# Create an instance of the API class
api_instance = api_server.DutyApi()
version = 'version_example' # str | API version
trust_code = 'trust_code_example' # str | Trust code from BankStaff
id = [56] # list[int] | IDs of the duties to return
page = 56 # int | Result page (optional)
page_size = 56 # int | Count of records per page (optional)

try:
    # Returns details about a duties.
    api_response = api_instance.get_duty_details(version, trust_code, id, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DutyApi->get_duty_details: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **version** | **str**| API version | 
 **trust_code** | **str**| Trust code from BankStaff | 
 **id** | [**list[int]**](int.md)| IDs of the duties to return | 
 **page** | **int**| Result page | [optional] 
 **page_size** | **int**| Count of records per page | [optional] 

### Return type

[**Duty**](Duty.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad request errors |  -  |
**401** | Unauthorized |  -  |
**404** | Trust not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_single_duty_details**
> Duty get_single_duty_details(version, trust_code, duty_id, page=page, page_size=page_size)

Returns details about a duties.

Returns details about a duties.

### Example

```python
from __future__ import print_function
import time
import api_server
from api_server.rest import ApiException
from pprint import pprint

# Create an instance of the API class
api_instance = api_server.DutyApi()
version = 'version_example' # str | API version
trust_code = 'trust_code_example' # str | Trust code from BankStaff
duty_id = 56 # int | ID of a duty to return
page = 56 # int | Result page (optional)
page_size = 56 # int | Count of records per page (optional)

try:
    # Returns details about a duties.
    api_response = api_instance.get_single_duty_details(version, trust_code, duty_id, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DutyApi->get_single_duty_details: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **version** | **str**| API version | 
 **trust_code** | **str**| Trust code from BankStaff | 
 **duty_id** | **int**| ID of a duty to return | 
 **page** | **int**| Result page | [optional] 
 **page_size** | **int**| Count of records per page | [optional] 

### Return type

[**Duty**](Duty.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad request errors |  -  |
**401** | Unauthorized |  -  |
**404** | Trust not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_contract_status**
> update_contract_status(version, trust_code, duty_id, contract_id, status_id)

Updates DE Contract status

Service that will be used by DE Provider to update the contract status, after DE contract is created/approved.

### Example

```python
from __future__ import print_function
import time
import api_server
from api_server.rest import ApiException
from pprint import pprint

# Create an instance of the API class
api_instance = api_server.DutyApi()
version = 'version_example' # str | API version
trust_code = 'trust_code_example' # str | Trust code from BankStaff
duty_id = 56 # int | ID of the duty associated with the DE contract
contract_id = '77135e23-af51-4714-b854-d8df9e64aa63' # str | ID of the contract from DE Provider's system
status_id = api_server.ContractStatus() # ContractStatus | 

try:
    # Updates DE Contract status
    api_instance.update_contract_status(version, trust_code, duty_id, contract_id, status_id)
except ApiException as e:
    print("Exception when calling DutyApi->update_contract_status: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **version** | **str**| API version | 
 **trust_code** | **str**| Trust code from BankStaff | 
 **duty_id** | **int**| ID of the duty associated with the DE contract | 
 **contract_id** | **str**| ID of the contract from DE Provider&#39;s system | 
 **status_id** | [**ContractStatus**](.md)|  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad request errors |  -  |
**401** | Unauthorized |  -  |
**404** | Trust/Duty not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_timesheets**
> update_timesheets(version, trust_code, duty_id, inline_object)

Updates timesheet for duty

Service that will be used by DE Provider to update the timesheets, after approving the payment on their side.

### Example

```python
from __future__ import print_function
import time
import api_server
from api_server.rest import ApiException
from pprint import pprint

# Create an instance of the API class
api_instance = api_server.DutyApi()
version = 'version_example' # str | API version
trust_code = 'trust_code_example' # str | Trust code from BankStaff
duty_id = 56 # int | ID of the duty associated with the DE contract
inline_object = api_server.InlineObject() # InlineObject | 

try:
    # Updates timesheet for duty
    api_instance.update_timesheets(version, trust_code, duty_id, inline_object)
except ApiException as e:
    print("Exception when calling DutyApi->update_timesheets: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **version** | **str**| API version | 
 **trust_code** | **str**| Trust code from BankStaff | 
 **duty_id** | **int**| ID of the duty associated with the DE contract | 
 **inline_object** | [**InlineObject**](InlineObject.md)|  | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad request errors |  -  |
**401** | Unauthorized |  -  |
**404** | Trust/Duty not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

