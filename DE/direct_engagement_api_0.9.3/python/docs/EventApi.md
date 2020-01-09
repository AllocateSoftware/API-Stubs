# api_server.EventApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_events**](EventApi.md#get_events) | **GET** /{version}/trustcode/{trustCode}/event | Get all events older than input timestamp


# **get_events**
> Duty get_events(version, trust_code, date_time_from, page=page, page_size=page_size)

Get all events older than input timestamp

Returns an array of events

### Example

```python
from __future__ import print_function
import time
import api_server
from api_server.rest import ApiException
from pprint import pprint

# Create an instance of the API class
api_instance = api_server.EventApi()
version = 'version_example' # str | API version
trust_code = 'trust_code_example' # str | Trust code from BankStaff
date_time_from = '2013-10-20T19:20:30+01:00' # datetime | Timestamp
page = 56 # int | Result page (optional)
page_size = 56 # int | Count of records per page (optional)

try:
    # Get all events older than input timestamp
    api_response = api_instance.get_events(version, trust_code, date_time_from, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling EventApi->get_events: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **version** | **str**| API version | 
 **trust_code** | **str**| Trust code from BankStaff | 
 **date_time_from** | **datetime**| Timestamp | 
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
**200** | OK |  * X-Pagination -  <br>  |
**400** | Bad request errors |  -  |
**401** | Unauthorized |  -  |
**404** | Trust not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

