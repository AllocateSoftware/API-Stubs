# api_server.ReferenceDataApi

All URIs are relative to *http://healthsuite.allocatesoftware.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_vocabulary_entry**](ReferenceDataApi.md#create_vocabulary_entry) | **POST** /vocabularies/{id}/entries | 
[**delete_vocabulary_entry**](ReferenceDataApi.md#delete_vocabulary_entry) | **DELETE** /vocabularies/{id}/entries/{elementId} | 
[**get_vocabularies**](ReferenceDataApi.md#get_vocabularies) | **GET** /vocabularies | 
[**get_vocabulary**](ReferenceDataApi.md#get_vocabulary) | **GET** /vocabularies/{id} | 
[**get_vocabulary_element**](ReferenceDataApi.md#get_vocabulary_element) | **GET** /vocabularies/{id}/entries/{elementId} | 
[**get_vocabulary_entries**](ReferenceDataApi.md#get_vocabulary_entries) | **GET** /vocabularies/{id}/entries | 
[**get_vocabulary_type_by_id**](ReferenceDataApi.md#get_vocabulary_type_by_id) | **GET** /vocabularyTypes/{id} | 
[**get_vocabulary_types**](ReferenceDataApi.md#get_vocabulary_types) | **GET** /vocabularyTypes | 
[**put_vocabulary_entry**](ReferenceDataApi.md#put_vocabulary_entry) | **PUT** /vocabularies/{id}/entries/{elementId} | 


# **create_vocabulary_entry**
> str create_vocabulary_entry(id, vocabulary_entry)



Create a new entry in a vocabulary

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
api_instance = api_server.ReferenceDataApi(api_server.ApiClient(configuration))
id = 'EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440' # str | The ID of the vocabulary
vocabulary_entry = api_server.VocabularyEntry() # VocabularyEntry | Details of the vocabulary entry

try:
    api_response = api_instance.create_vocabulary_entry(id, vocabulary_entry)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReferenceDataApi->create_vocabulary_entry: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The ID of the vocabulary | 
 **vocabulary_entry** | [**VocabularyEntry**](VocabularyEntry.md)| Details of the vocabulary entry | 

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
**200** | Returning a list of vocabularies |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_vocabulary_entry**
> delete_vocabulary_entry(id, element_id)



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
api_instance = api_server.ReferenceDataApi(api_server.ApiClient(configuration))
id = 'EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440' # str | The ID of the vocabulary
element_id = 'EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440' # str | The ID of the vocabulary element

try:
    api_instance.delete_vocabulary_entry(id, element_id)
except ApiException as e:
    print("Exception when calling ReferenceDataApi->delete_vocabulary_entry: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The ID of the vocabulary | 
 **element_id** | **str**| The ID of the vocabulary element | 

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

# **get_vocabularies**
> list[Vocabulary] get_vocabularies(vocabulary_type_id=vocabulary_type_id, page=page, page_size=page_size)



Return a list of vocabularies types that you may query

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
api_instance = api_server.ReferenceDataApi(api_server.ApiClient(configuration))
vocabulary_type_id = '4A4C8447-F66E-464F-BBB1-2DEE4971CF28' # str | Limit to vocabulary types (optional)
page = 'page_example' # str | Return page of results (optional)
page_size = 'page_size_example' # str | Records per page (optional)

try:
    api_response = api_instance.get_vocabularies(vocabulary_type_id=vocabulary_type_id, page=page, page_size=page_size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReferenceDataApi->get_vocabularies: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vocabulary_type_id** | **str**| Limit to vocabulary types | [optional] 
 **page** | **str**| Return page of results | [optional] 
 **page_size** | **str**| Records per page | [optional] 

### Return type

[**list[Vocabulary]**](Vocabulary.md)

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

# **get_vocabulary**
> Vocabulary get_vocabulary(id)



Return a list of vocabularies that you may query

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
api_instance = api_server.ReferenceDataApi(api_server.ApiClient(configuration))
id = 'EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440' # str | The ID of the vocabulary

try:
    api_response = api_instance.get_vocabulary(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReferenceDataApi->get_vocabulary: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The ID of the vocabulary | 

### Return type

[**Vocabulary**](Vocabulary.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Returning a vocabulary |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_vocabulary_element**
> VocabularyEntry get_vocabulary_element(id, element_id)



Return the elements of a vocabulary

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
api_instance = api_server.ReferenceDataApi(api_server.ApiClient(configuration))
id = 'EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440' # str | The ID of the vocabulary
element_id = 'EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440' # str | The ID of the vocabulary element

try:
    api_response = api_instance.get_vocabulary_element(id, element_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReferenceDataApi->get_vocabulary_element: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The ID of the vocabulary | 
 **element_id** | **str**| The ID of the vocabulary element | 

### Return type

[**VocabularyEntry**](VocabularyEntry.md)

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

# **get_vocabulary_entries**
> list[VocabularyEntry] get_vocabulary_entries(id)



Return the elements of a vocabulary

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
api_instance = api_server.ReferenceDataApi(api_server.ApiClient(configuration))
id = 'EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440' # str | The ID of the vocabulary

try:
    api_response = api_instance.get_vocabulary_entries(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReferenceDataApi->get_vocabulary_entries: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The ID of the vocabulary | 

### Return type

[**list[VocabularyEntry]**](VocabularyEntry.md)

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

# **get_vocabulary_type_by_id**
> VocabularyType get_vocabulary_type_by_id(id)



Return a vocabulary type

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
api_instance = api_server.ReferenceDataApi(api_server.ApiClient(configuration))
id = 'EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440' # str | The ID of the vocabulary type

try:
    api_response = api_instance.get_vocabulary_type_by_id(id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReferenceDataApi->get_vocabulary_type_by_id: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The ID of the vocabulary type | 

### Return type

[**VocabularyType**](VocabularyType.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Returning a vocabulary type |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_vocabulary_types**
> list[VocabularyType] get_vocabulary_types()



Return a list of vocabularies types that you may query

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
api_instance = api_server.ReferenceDataApi(api_server.ApiClient(configuration))

try:
    api_response = api_instance.get_vocabulary_types()
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ReferenceDataApi->get_vocabulary_types: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**list[VocabularyType]**](VocabularyType.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Returning a list of vocabulary types |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **put_vocabulary_entry**
> put_vocabulary_entry(id, element_id, vocabulary_entry)



Create a new entry in a vocabulary

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
api_instance = api_server.ReferenceDataApi(api_server.ApiClient(configuration))
id = 'EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440' # str | The ID of the vocabulary
element_id = 'EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440' # str | The ID of the vocabulary element
vocabulary_entry = api_server.VocabularyEntry() # VocabularyEntry | Details of the vocabulary entry

try:
    api_instance.put_vocabulary_entry(id, element_id, vocabulary_entry)
except ApiException as e:
    print("Exception when calling ReferenceDataApi->put_vocabulary_entry: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The ID of the vocabulary | 
 **element_id** | **str**| The ID of the vocabulary element | 
 **vocabulary_entry** | [**VocabularyEntry**](VocabularyEntry.md)| Details of the vocabulary entry | 

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

