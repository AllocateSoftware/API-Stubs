# api_server.ProvisioningApi

All URIs are relative to *http://healthsuite.allocatesoftware.com/vms/provisioning/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**provision_structure**](ProvisioningApi.md#provision_structure) | **PUT** /provision/customer/{id} | 
[**provision_user**](ProvisioningApi.md#provision_user) | **PUT** /provision/user/{id} | 


# **provision_structure**
> provision_structure(id, structure_provision)



Provision the supplied structure.

### Example

```python
from __future__ import print_function
import time
import api_server
from api_server.rest import ApiException
from pprint import pprint

# Create an instance of the API class
api_instance = api_server.ProvisioningApi()
id = 'id_example' # str | ID of the customer to provision
structure_provision = api_server.StructureProvision() # StructureProvision | Structure of the Customer (trust). This call should be considered a 'set' - elements omitted that were present in previous provisionings should be removed.

try:
    api_instance.provision_structure(id, structure_provision)
except ApiException as e:
    print("Exception when calling ProvisioningApi->provision_structure: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| ID of the customer to provision | 
 **structure_provision** | [**StructureProvision**](StructureProvision.md)| Structure of the Customer (trust). This call should be considered a &#39;set&#39; - elements omitted that were present in previous provisionings should be removed. | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Provisioning successful |  -  |
**400** | Invalid input parameter |  -  |
**401** | Unauthorized |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **provision_user**
> provision_user(id, user_provision)



Provision the supplied user.

### Example

```python
from __future__ import print_function
import time
import api_server
from api_server.rest import ApiException
from pprint import pprint

# Create an instance of the API class
api_instance = api_server.ProvisioningApi()
id = 'id_example' # str | ID of the user to provision
user_provision = api_server.UserProvision() # UserProvision | Structure of the User

try:
    api_instance.provision_user(id, user_provision)
except ApiException as e:
    print("Exception when calling ProvisioningApi->provision_user: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| ID of the user to provision | 
 **user_provision** | [**UserProvision**](UserProvision.md)| Structure of the User | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | User accepted and provisioned. |  -  |
**400** | Invalid input parameter |  -  |
**401** | Unauthorized |  -  |
**404** | Trust not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

