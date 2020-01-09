# api_server.MappingsApi

All URIs are relative to *http://healthsuite.allocatesoftware.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_mapping**](MappingsApi.md#create_mapping) | **POST** /mappingSets/{setId}/mappings | 
[**delete_mapping**](MappingsApi.md#delete_mapping) | **DELETE** /mappingSets/{id}/mappings/{mappingId} | 
[**get_mapping**](MappingsApi.md#get_mapping) | **GET** /mappingSets/{id}/mappings/{mappingId} | 
[**get_mapping_set_by_id**](MappingsApi.md#get_mapping_set_by_id) | **GET** /mappingSets/{setId} | 
[**get_mapping_sets**](MappingsApi.md#get_mapping_sets) | **GET** /mappingSets | 
[**get_mappings**](MappingsApi.md#get_mappings) | **GET** /mappingSets/{setId}/mappings | 
[**put_mapping**](MappingsApi.md#put_mapping) | **PUT** /mappingSets/{id}/mappings/{mappingId} | 


# **create_mapping**
> str create_mapping(set_id, mapping)



Create a new entry in a mapping set

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
api_instance = api_server.MappingsApi(api_server.ApiClient(configuration))
set_id = 'EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440' # str | The ID of the mapping set
mapping = api_server.Mapping() # Mapping | Details of the mapping

try:
    api_response = api_instance.create_mapping(set_id, mapping)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MappingsApi->create_mapping: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **set_id** | **str**| The ID of the mapping set | 
 **mapping** | [**Mapping**](Mapping.md)| Details of the mapping | 

### Return type

**str**

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully created |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_mapping**
> delete_mapping(id, mapping_id)



Delete a vocabulary entry

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
api_instance = api_server.MappingsApi(api_server.ApiClient(configuration))
id = 'EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440' # str | The ID of the vocabulary
mapping_id = 'EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440' # str | The ID of the mapping

try:
    api_instance.delete_mapping(id, mapping_id)
except ApiException as e:
    print("Exception when calling MappingsApi->delete_mapping: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The ID of the vocabulary | 
 **mapping_id** | **str**| The ID of the mapping | 

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
**200** | Updated successfully |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_mapping**
> Mapping get_mapping(id, mapping_id)



Return the mapping

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
api_instance = api_server.MappingsApi(api_server.ApiClient(configuration))
id = 'EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440' # str | The ID of the mapping set
mapping_id = 'EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440' # str | The ID of the mapping set element

try:
    api_response = api_instance.get_mapping(id, mapping_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MappingsApi->get_mapping: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The ID of the mapping set | 
 **mapping_id** | **str**| The ID of the mapping set element | 

### Return type

[**Mapping**](Mapping.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Returning a list of vocabularies |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_mapping_set_by_id**
> MappingSet get_mapping_set_by_id(set_id)



Get a mapping set by ID

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
api_instance = api_server.MappingsApi(api_server.ApiClient(configuration))
set_id = 'EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440' # str | The ID of the vocabulary type

try:
    api_response = api_instance.get_mapping_set_by_id(set_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MappingsApi->get_mapping_set_by_id: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **set_id** | **str**| The ID of the vocabulary type | 

### Return type

[**MappingSet**](MappingSet.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Returning a list of mapping sets |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_mapping_sets**
> list[MappingSet] get_mapping_sets()



Return a list of mapping sets that you may utilise

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
api_instance = api_server.MappingsApi(api_server.ApiClient(configuration))

try:
    api_response = api_instance.get_mapping_sets()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MappingsApi->get_mapping_sets: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**list[MappingSet]**](MappingSet.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Returning a list of mapping sets |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_mappings**
> list[Mapping] get_mappings(set_id, from_code=from_code)



Return the elements of a mapping set

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
api_instance = api_server.MappingsApi(api_server.ApiClient(configuration))
set_id = 'EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440' # str | The ID of the mapping set
from_code = 'Band 4' # str | Search for a mapping where the from code matches the provided string (optional)

try:
    api_response = api_instance.get_mappings(set_id, from_code=from_code)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling MappingsApi->get_mappings: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **set_id** | **str**| The ID of the mapping set | 
 **from_code** | **str**| Search for a mapping where the from code matches the provided string | [optional] 

### Return type

[**list[Mapping]**](Mapping.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Returning a list of mapping set entries |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **put_mapping**
> put_mapping(id, mapping_id, mapping)



Update a mapping

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
api_instance = api_server.MappingsApi(api_server.ApiClient(configuration))
id = 'EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440' # str | The ID of the vocabulary
mapping_id = 'EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440' # str | The ID of the vocabulary element
mapping = api_server.Mapping() # Mapping | Details of the mapping

try:
    api_instance.put_mapping(id, mapping_id, mapping)
except ApiException as e:
    print("Exception when calling MappingsApi->put_mapping: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The ID of the vocabulary | 
 **mapping_id** | **str**| The ID of the vocabulary element | 
 **mapping** | [**Mapping**](Mapping.md)| Details of the mapping | 

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
**200** | Updated successfully |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

