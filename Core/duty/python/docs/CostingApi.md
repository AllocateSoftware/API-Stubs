# api_server.CostingApi

All URIs are relative to *http://healthsuite.allocatesoftware.com/api/duty/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**send_duty_costing**](CostingApi.md#send_duty_costing) | **POST** /duties/{id}/costing | 


# **send_duty_costing**
> send_duty_costing(id, duty_cost_details)



### Example

```python
from __future__ import print_function
import time
import api_server
from api_server.rest import ApiException
from pprint import pprint

# Create an instance of the API class
api_instance = api_server.CostingApi()
id = 'id_example' # str | ID of the duty
duty_cost_details = api_server.DutyCostDetails() # DutyCostDetails | Costing Information

try:
    api_instance.send_duty_costing(id, duty_cost_details)
except ApiException as e:
    print("Exception when calling CostingApi->send_duty_costing: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| ID of the duty | 
 **duty_cost_details** | [**DutyCostDetails**](DutyCostDetails.md)| Costing Information | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Duty costing successfully |  -  |
**202** | The duty costing has been accepted and a response will be returned asyncronously. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

