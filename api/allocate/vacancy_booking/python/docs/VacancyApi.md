# api_server.VacancyApi

All URIs are relative to *http://healthsuite.allocatesoftware.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_proposal**](VacancyApi.md#create_proposal) | **POST** /vacancies/{vacancyId}/proposals | 
[**create_vacancy**](VacancyApi.md#create_vacancy) | **POST** /vacancies | 
[**submit_timesheet**](VacancyApi.md#submit_timesheet) | **POST** /vacancies/{vacancyId}/timesheet | 


# **create_proposal**
> CreateProposalResponse create_proposal(vacancy_id, proposal_details)



Offer a worker for filling a duty

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
api_instance = api_server.VacancyApi(api_server.ApiClient(configuration))
vacancy_id = '33C33192-7B8D-4EE0-AD41-47AACF240A29' # str | The ID of the vacancy
proposal_details = api_server.ProposalDetails() # ProposalDetails | Details of the proposal for filling the vacancy (worker, costs, etc)

try:
    api_response = api_instance.create_proposal(vacancy_id, proposal_details)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling VacancyApi->create_proposal: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vacancy_id** | **str**| The ID of the vacancy | 
 **proposal_details** | [**ProposalDetails**](ProposalDetails.md)| Details of the proposal for filling the vacancy (worker, costs, etc) | 

### Return type

[**CreateProposalResponse**](CreateProposalResponse.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Proposal created successfully |  -  |
**202** | The proposal has been accepted and a response will be returned asyncronously. |  -  |
**400** | One or more errors have occurred when attempting to process the provided data |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_vacancy**
> CreateVacancyResponse create_vacancy(vacancy)



Create a new vacancy

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
api_instance = api_server.VacancyApi(api_server.ApiClient(configuration))
vacancy = api_server.Vacancy() # Vacancy | Details of the vacancy

try:
    api_response = api_instance.create_vacancy(vacancy)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling VacancyApi->create_vacancy: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vacancy** | [**Vacancy**](Vacancy.md)| Details of the vacancy | 

### Return type

[**CreateVacancyResponse**](CreateVacancyResponse.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**403** | Forbidden - you do not have the necessary permissions to undertake this action |  -  |
**200** | Vacancy created successfully |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **submit_timesheet**
> submit_timesheet(vacancy_id, inline_object)



Send timesheet information for a completed activity

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
api_instance = api_server.VacancyApi(api_server.ApiClient(configuration))
vacancy_id = '33C33192-7B8D-4EE0-AD41-47AACF240A29' # str | The ID of the vacancy
inline_object = api_server.InlineObject() # InlineObject | 

try:
    api_instance.submit_timesheet(vacancy_id, inline_object)
except ApiException as e:
    print("Exception when calling VacancyApi->submit_timesheet: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vacancy_id** | **str**| The ID of the vacancy | 
 **inline_object** | [**InlineObject**](InlineObject.md)|  | 

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
**200** | Timesheet successfully submitted |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

