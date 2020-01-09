# api_server.ProposalApi

All URIs are relative to *http://healthsuite.allocatesoftware.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accept_proposal**](ProposalApi.md#accept_proposal) | **POST** /proposals/{id}/accept | 
[**cancel_proposal**](ProposalApi.md#cancel_proposal) | **DELETE** /proposals/{id} | 
[**get_proposal**](ProposalApi.md#get_proposal) | **GET** /proposals/{id} | 
[**update_proposal**](ProposalApi.md#update_proposal) | **PUT** /proposals/{id} | 


# **accept_proposal**
> accept_proposal(id)



Accept the proposal (possibly on behalf of the trust). Note that it is not neccessary to call this API in the case of direct-book scenarios as it will be assumed as a part of the workflow.

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
api_instance = api_server.ProposalApi(api_server.ApiClient(configuration))
id = '2CBC7FF9-38FB-4F0A-835A-324D9CF4800C' # str | The ID of the proposal

try:
    api_instance.accept_proposal(id)
except ApiException as e:
    print("Exception when calling ProposalApi->accept_proposal: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The ID of the proposal | 

### Return type

void (empty response body)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**404** | The proposal was not found |  -  |
**200** | Proposal successfully accepted |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **cancel_proposal**
> cancel_proposal(id)



Cancel the proposal (and the booking, if it has been accepted)

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
api_instance = api_server.ProposalApi(api_server.ApiClient(configuration))
id = '2CBC7FF9-38FB-4F0A-835A-324D9CF4800C' # str | The ID of the proposal

try:
    api_instance.cancel_proposal(id)
except ApiException as e:
    print("Exception when calling ProposalApi->cancel_proposal: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The ID of the proposal | 

### Return type

void (empty response body)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**404** | The proposal was not found |  -  |
**200** | Cancelled successfully |  -  |
**202** | The request was accepted and will be processed asynchronously |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_proposal**
> ProposalDetails get_proposal(id)



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
api_instance = api_server.ProposalApi(api_server.ApiClient(configuration))
id = '2CBC7FF9-38FB-4F0A-835A-324D9CF4800C' # str | The ID of the proposal

try:
    api_response = api_instance.get_proposal(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ProposalApi->get_proposal: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The ID of the proposal | 

### Return type

[**ProposalDetails**](ProposalDetails.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**404** | The proposal was not found |  -  |
**200** | Proposal successfully found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **update_proposal**
> update_proposal(id, proposal_details)



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
api_instance = api_server.ProposalApi(api_server.ApiClient(configuration))
id = '2CBC7FF9-38FB-4F0A-835A-324D9CF4800C' # str | The ID of the proposal
proposal_details = api_server.ProposalDetails() # ProposalDetails | Details of the proposal for filling the duty (worker)

try:
    api_instance.update_proposal(id, proposal_details)
except ApiException as e:
    print("Exception when calling ProposalApi->update_proposal: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The ID of the proposal | 
 **proposal_details** | [**ProposalDetails**](ProposalDetails.md)| Details of the proposal for filling the duty (worker) | 

### Return type

void (empty response body)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**404** | The proposal was not found |  -  |
**200** | The Proposal successfully updated |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

