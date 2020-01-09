# api_server.ReferenceDataApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_agencies_by_ids**](ReferenceDataApi.md#get_agencies_by_ids) | **GET** /{version}/trustcode/{trustCode}/referenceData/agency/ | Get agencies
[**get_all_agencies**](ReferenceDataApi.md#get_all_agencies) | **GET** /{version}/trustcode/{trustCode}/referenceData/agency | Get all agencies
[**get_all_contract_statuses**](ReferenceDataApi.md#get_all_contract_statuses) | **GET** /{version}/trustcode/{trustCode}/referenceData/contractStatus | Get all contract statuses
[**get_all_grades**](ReferenceDataApi.md#get_all_grades) | **GET** /{version}/trustcode/{trustCode}/referenceData/grade | Get all grades
[**get_all_reasons_for_vacancy**](ReferenceDataApi.md#get_all_reasons_for_vacancy) | **GET** /{version}/trustcode/{trustCode}/referenceData/reasonForVacancy | Get all reasons for vacancy
[**get_all_staff_groups**](ReferenceDataApi.md#get_all_staff_groups) | **GET** /{version}/trustcode/{trustCode}/referenceData/staffGroup | Get all staff groups
[**get_all_units**](ReferenceDataApi.md#get_all_units) | **GET** /{version}/trustcode/{trustCode}/referenceData/unit | Get all units
[**get_contract_statuses_by_ids**](ReferenceDataApi.md#get_contract_statuses_by_ids) | **GET** /{version}/trustcode/{trustCode}/referenceData/contractStatus/ | Get contract statuses
[**get_grades_by_ids**](ReferenceDataApi.md#get_grades_by_ids) | **GET** /{version}/trustcode/{trustCode}/referenceData/grade/ | Get grades
[**get_reasons_for_vacancy_by_ids**](ReferenceDataApi.md#get_reasons_for_vacancy_by_ids) | **GET** /{version}/trustcode/{trustCode}/referenceData/reasonForVacancy/ | Get reasons for vacancy
[**get_staff_groups_by_ids**](ReferenceDataApi.md#get_staff_groups_by_ids) | **GET** /{version}/trustcode/{trustCode}/referenceData/staffGroup/ | Get staff groups
[**get_units_by_ids**](ReferenceDataApi.md#get_units_by_ids) | **GET** /{version}/trustcode/{trustCode}/referenceData/unit/ | Get units


# **get_agencies_by_ids**
> list[ReferenceDataResponse] get_agencies_by_ids(version, trust_code, id, page=page, page_size=page_size)

Get agencies

Returns an array of agencies

### Example

```python
from __future__ import print_function
import time
import api_server
from api_server.rest import ApiException
from pprint import pprint

# Create an instance of the API class
api_instance = api_server.ReferenceDataApi()
version = 'version_example' # str | API version
trust_code = 'trust_code_example' # str | Trust code from BankStaff
id = [56] # list[int] | Array of reference data IDs to return
page = 56 # int | Result page (optional)
page_size = 56 # int | Count of records per page (optional)

try:
    # Get agencies
    api_response = api_instance.get_agencies_by_ids(version, trust_code, id, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReferenceDataApi->get_agencies_by_ids: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **version** | **str**| API version | 
 **trust_code** | **str**| Trust code from BankStaff | 
 **id** | [**list[int]**](int.md)| Array of reference data IDs to return | 
 **page** | **int**| Result page | [optional] 
 **page_size** | **int**| Count of records per page | [optional] 

### Return type

[**list[ReferenceDataResponse]**](ReferenceDataResponse.md)

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

# **get_all_agencies**
> list[ReferenceDataResponse] get_all_agencies(version, trust_code, page=page, page_size=page_size)

Get all agencies

Returns an array of agencies

### Example

```python
from __future__ import print_function
import time
import api_server
from api_server.rest import ApiException
from pprint import pprint

# Create an instance of the API class
api_instance = api_server.ReferenceDataApi()
version = 'version_example' # str | API version
trust_code = 'trust_code_example' # str | Trust code from BankStaff
page = 56 # int | Result page (optional)
page_size = 56 # int | Count of records per page (optional)

try:
    # Get all agencies
    api_response = api_instance.get_all_agencies(version, trust_code, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReferenceDataApi->get_all_agencies: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **version** | **str**| API version | 
 **trust_code** | **str**| Trust code from BankStaff | 
 **page** | **int**| Result page | [optional] 
 **page_size** | **int**| Count of records per page | [optional] 

### Return type

[**list[ReferenceDataResponse]**](ReferenceDataResponse.md)

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

# **get_all_contract_statuses**
> list[ReferenceDataResponse] get_all_contract_statuses(version, trust_code, page=page, page_size=page_size)

Get all contract statuses

Returns an array of contract statuses.

### Example

```python
from __future__ import print_function
import time
import api_server
from api_server.rest import ApiException
from pprint import pprint

# Create an instance of the API class
api_instance = api_server.ReferenceDataApi()
version = 'version_example' # str | API version
trust_code = 'trust_code_example' # str | Trust code from BankStaff
page = 56 # int | Result page (optional)
page_size = 56 # int | Count of records per page (optional)

try:
    # Get all contract statuses
    api_response = api_instance.get_all_contract_statuses(version, trust_code, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReferenceDataApi->get_all_contract_statuses: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **version** | **str**| API version | 
 **trust_code** | **str**| Trust code from BankStaff | 
 **page** | **int**| Result page | [optional] 
 **page_size** | **int**| Count of records per page | [optional] 

### Return type

[**list[ReferenceDataResponse]**](ReferenceDataResponse.md)

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

# **get_all_grades**
> list[ReferenceDataResponse] get_all_grades(version, trust_code, page=page, page_size=page_size)

Get all grades

Returns an array of grades

### Example

```python
from __future__ import print_function
import time
import api_server
from api_server.rest import ApiException
from pprint import pprint

# Create an instance of the API class
api_instance = api_server.ReferenceDataApi()
version = 'version_example' # str | API version
trust_code = 'trust_code_example' # str | Trust code from BankStaff
page = 56 # int | Result page (optional)
page_size = 56 # int | Count of records per page (optional)

try:
    # Get all grades
    api_response = api_instance.get_all_grades(version, trust_code, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReferenceDataApi->get_all_grades: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **version** | **str**| API version | 
 **trust_code** | **str**| Trust code from BankStaff | 
 **page** | **int**| Result page | [optional] 
 **page_size** | **int**| Count of records per page | [optional] 

### Return type

[**list[ReferenceDataResponse]**](ReferenceDataResponse.md)

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

# **get_all_reasons_for_vacancy**
> list[ReferenceDataResponse] get_all_reasons_for_vacancy(version, trust_code, page=page, page_size=page_size)

Get all reasons for vacancy

Returns an array of reasons for vacancy

### Example

```python
from __future__ import print_function
import time
import api_server
from api_server.rest import ApiException
from pprint import pprint

# Create an instance of the API class
api_instance = api_server.ReferenceDataApi()
version = 'version_example' # str | API version
trust_code = 'trust_code_example' # str | Trust code from BankStaff
page = 56 # int | Result page (optional)
page_size = 56 # int | Count of records per page (optional)

try:
    # Get all reasons for vacancy
    api_response = api_instance.get_all_reasons_for_vacancy(version, trust_code, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReferenceDataApi->get_all_reasons_for_vacancy: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **version** | **str**| API version | 
 **trust_code** | **str**| Trust code from BankStaff | 
 **page** | **int**| Result page | [optional] 
 **page_size** | **int**| Count of records per page | [optional] 

### Return type

[**list[ReferenceDataResponse]**](ReferenceDataResponse.md)

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

# **get_all_staff_groups**
> list[ReferenceDataResponse] get_all_staff_groups(version, trust_code, page=page, page_size=page_size)

Get all staff groups

Returns an array of staff groups

### Example

```python
from __future__ import print_function
import time
import api_server
from api_server.rest import ApiException
from pprint import pprint

# Create an instance of the API class
api_instance = api_server.ReferenceDataApi()
version = 'version_example' # str | API version
trust_code = 'trust_code_example' # str | Trust code from BankStaff
page = 56 # int | Result page (optional)
page_size = 56 # int | Count of records per page (optional)

try:
    # Get all staff groups
    api_response = api_instance.get_all_staff_groups(version, trust_code, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReferenceDataApi->get_all_staff_groups: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **version** | **str**| API version | 
 **trust_code** | **str**| Trust code from BankStaff | 
 **page** | **int**| Result page | [optional] 
 **page_size** | **int**| Count of records per page | [optional] 

### Return type

[**list[ReferenceDataResponse]**](ReferenceDataResponse.md)

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

# **get_all_units**
> list[UnitReferenceDataResponse] get_all_units(version, trust_code, page=page, page_size=page_size)

Get all units

Returns an array of units

### Example

```python
from __future__ import print_function
import time
import api_server
from api_server.rest import ApiException
from pprint import pprint

# Create an instance of the API class
api_instance = api_server.ReferenceDataApi()
version = 'version_example' # str | API version
trust_code = 'trust_code_example' # str | Trust code from BankStaff
page = 56 # int | Result page (optional)
page_size = 56 # int | Count of records per page (optional)

try:
    # Get all units
    api_response = api_instance.get_all_units(version, trust_code, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReferenceDataApi->get_all_units: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **version** | **str**| API version | 
 **trust_code** | **str**| Trust code from BankStaff | 
 **page** | **int**| Result page | [optional] 
 **page_size** | **int**| Count of records per page | [optional] 

### Return type

[**list[UnitReferenceDataResponse]**](UnitReferenceDataResponse.md)

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

# **get_contract_statuses_by_ids**
> list[ReferenceDataResponse] get_contract_statuses_by_ids(version, trust_code, id, page=page, page_size=page_size)

Get contract statuses

Returns an array of contract statuses

### Example

```python
from __future__ import print_function
import time
import api_server
from api_server.rest import ApiException
from pprint import pprint

# Create an instance of the API class
api_instance = api_server.ReferenceDataApi()
version = 'version_example' # str | API version
trust_code = 'trust_code_example' # str | Trust code from BankStaff
id = ['id_example'] # list[str] | Array of reference data IDs to return
page = 56 # int | Result page (optional)
page_size = 56 # int | Count of records per page (optional)

try:
    # Get contract statuses
    api_response = api_instance.get_contract_statuses_by_ids(version, trust_code, id, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReferenceDataApi->get_contract_statuses_by_ids: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **version** | **str**| API version | 
 **trust_code** | **str**| Trust code from BankStaff | 
 **id** | [**list[str]**](str.md)| Array of reference data IDs to return | 
 **page** | **int**| Result page | [optional] 
 **page_size** | **int**| Count of records per page | [optional] 

### Return type

[**list[ReferenceDataResponse]**](ReferenceDataResponse.md)

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

# **get_grades_by_ids**
> list[ReferenceDataResponse] get_grades_by_ids(version, trust_code, id, page=page, page_size=page_size)

Get grades

Returns an array of grades

### Example

```python
from __future__ import print_function
import time
import api_server
from api_server.rest import ApiException
from pprint import pprint

# Create an instance of the API class
api_instance = api_server.ReferenceDataApi()
version = 'version_example' # str | API version
trust_code = 'trust_code_example' # str | Trust code from BankStaff
id = [56] # list[int] | Array of reference data IDs to return
page = 56 # int | Result page (optional)
page_size = 56 # int | Count of records per page (optional)

try:
    # Get grades
    api_response = api_instance.get_grades_by_ids(version, trust_code, id, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReferenceDataApi->get_grades_by_ids: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **version** | **str**| API version | 
 **trust_code** | **str**| Trust code from BankStaff | 
 **id** | [**list[int]**](int.md)| Array of reference data IDs to return | 
 **page** | **int**| Result page | [optional] 
 **page_size** | **int**| Count of records per page | [optional] 

### Return type

[**list[ReferenceDataResponse]**](ReferenceDataResponse.md)

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

# **get_reasons_for_vacancy_by_ids**
> list[ReferenceDataResponse] get_reasons_for_vacancy_by_ids(version, trust_code, id, page=page, page_size=page_size)

Get reasons for vacancy

Returns an array of reasons for vacancy

### Example

```python
from __future__ import print_function
import time
import api_server
from api_server.rest import ApiException
from pprint import pprint

# Create an instance of the API class
api_instance = api_server.ReferenceDataApi()
version = 'version_example' # str | API version
trust_code = 'trust_code_example' # str | Trust code from BankStaff
id = [56] # list[int] | Array of reference data IDs to return
page = 56 # int | Result page (optional)
page_size = 56 # int | Count of records per page (optional)

try:
    # Get reasons for vacancy
    api_response = api_instance.get_reasons_for_vacancy_by_ids(version, trust_code, id, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReferenceDataApi->get_reasons_for_vacancy_by_ids: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **version** | **str**| API version | 
 **trust_code** | **str**| Trust code from BankStaff | 
 **id** | [**list[int]**](int.md)| Array of reference data IDs to return | 
 **page** | **int**| Result page | [optional] 
 **page_size** | **int**| Count of records per page | [optional] 

### Return type

[**list[ReferenceDataResponse]**](ReferenceDataResponse.md)

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

# **get_staff_groups_by_ids**
> list[ReferenceDataResponse] get_staff_groups_by_ids(version, trust_code, id, page=page, page_size=page_size)

Get staff groups

Returns an array of staff groups

### Example

```python
from __future__ import print_function
import time
import api_server
from api_server.rest import ApiException
from pprint import pprint

# Create an instance of the API class
api_instance = api_server.ReferenceDataApi()
version = 'version_example' # str | API version
trust_code = 'trust_code_example' # str | Trust code from BankStaff
id = [56] # list[int] | Array of reference data IDs to return
page = 56 # int | Result page (optional)
page_size = 56 # int | Count of records per page (optional)

try:
    # Get staff groups
    api_response = api_instance.get_staff_groups_by_ids(version, trust_code, id, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReferenceDataApi->get_staff_groups_by_ids: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **version** | **str**| API version | 
 **trust_code** | **str**| Trust code from BankStaff | 
 **id** | [**list[int]**](int.md)| Array of reference data IDs to return | 
 **page** | **int**| Result page | [optional] 
 **page_size** | **int**| Count of records per page | [optional] 

### Return type

[**list[ReferenceDataResponse]**](ReferenceDataResponse.md)

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

# **get_units_by_ids**
> list[UnitReferenceDataResponse] get_units_by_ids(version, trust_code, id, page=page, page_size=page_size)

Get units

Returns an array of units

### Example

```python
from __future__ import print_function
import time
import api_server
from api_server.rest import ApiException
from pprint import pprint

# Create an instance of the API class
api_instance = api_server.ReferenceDataApi()
version = 'version_example' # str | API version
trust_code = 'trust_code_example' # str | Trust code from BankStaff
id = [56] # list[int] | Array of reference data IDs to return
page = 56 # int | Result page (optional)
page_size = 56 # int | Count of records per page (optional)

try:
    # Get units
    api_response = api_instance.get_units_by_ids(version, trust_code, id, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReferenceDataApi->get_units_by_ids: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **version** | **str**| API version | 
 **trust_code** | **str**| Trust code from BankStaff | 
 **id** | [**list[int]**](int.md)| Array of reference data IDs to return | 
 **page** | **int**| Result page | [optional] 
 **page_size** | **int**| Count of records per page | [optional] 

### Return type

[**list[UnitReferenceDataResponse]**](UnitReferenceDataResponse.md)

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

