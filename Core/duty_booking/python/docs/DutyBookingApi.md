# api_server.DutyBookingApi

All URIs are relative to *http://healthsuite.allocatesoftware.com/api/booking/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancel_proposal**](DutyBookingApi.md#cancel_proposal) | **DELETE** /proposals/{id} | 
[**create_proposal**](DutyBookingApi.md#create_proposal) | **POST** /vacancy/{vacancyId}/proposals | 
[**update_proposal**](DutyBookingApi.md#update_proposal) | **PUT** /proposals/{id} | 


# **cancel_proposal**
> cancel_proposal(id)



Cancel the proposal (and the booking, if it has been accepted)

### Example

```python
from __future__ import print_function
import time
import api_server
from api_server.rest import ApiException
from pprint import pprint

# Create an instance of the API class
api_instance = api_server.DutyBookingApi()
id = 'id_example' # str | ID of the proposal

try:
    api_instance.cancel_proposal(id)
except ApiException as e:
    print("Exception when calling DutyBookingApi->cancel_proposal: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| ID of the proposal | 

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
**200** | Cancelled successfully |  -  |
**404** | The proposal was not found |  -  |
**202** | The request was accepted and will be processed asynchronously |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_proposal**
> str create_proposal(vacancy_id, proposal_details)



Offer a worker for filling a duty

### Example

```python
from __future__ import print_function
import time
import api_server
from api_server.rest import ApiException
from pprint import pprint

# Create an instance of the API class
api_instance = api_server.DutyBookingApi()
vacancy_id = 'vacancy_id_example' # str | The ID of the vacancy
proposal_details = api_server.ProposalDetails() # ProposalDetails | Details of the proposal for filling the duty (worker)

try:
    api_response = api_instance.create_proposal(vacancy_id, proposal_details)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling DutyBookingApi->create_proposal: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vacancy_id** | **str**| The ID of the vacancy | 
 **proposal_details** | [**ProposalDetails**](ProposalDetails.md)| Details of the proposal for filling the duty (worker) | 

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
**200** | Proposal created successfully |  -  |
**202** | The proposal has been accepted and a response will be returned asyncronously. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_proposal**
> update_proposal(id, proposal_details)



### Example

```python
from __future__ import print_function
import time
import api_server
from api_server.rest import ApiException
from pprint import pprint

# Create an instance of the API class
api_instance = api_server.DutyBookingApi()
id = 'id_example' # str | ID of the proposal
proposal_details = api_server.ProposalDetails() # ProposalDetails | Details of the proposal for filling the duty (worker)

try:
    api_instance.update_proposal(id, proposal_details)
except ApiException as e:
    print("Exception when calling DutyBookingApi->update_proposal: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| ID of the proposal | 
 **proposal_details** | [**ProposalDetails**](ProposalDetails.md)| Details of the proposal for filling the duty (worker) | 

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
**404** | The proposal was not found |  -  |
**202** | The request was accepted and will be processed asynchronously |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

