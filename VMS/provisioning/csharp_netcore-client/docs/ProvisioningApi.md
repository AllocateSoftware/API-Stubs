# ASW.APIServices.VMS.Api.ProvisioningApi

All URIs are relative to *http://healthsuite.allocatesoftware.com/vms/provisioning/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ProvisionStructure**](ProvisioningApi.md#provisionstructure) | **PUT** /provision/customer/{id} | 
[**ProvisionUser**](ProvisioningApi.md#provisionuser) | **PUT** /provision/user/{id} | 


<a name="provisionstructure"></a>
# **ProvisionStructure**
> void ProvisionStructure (string id, StructureProvision structureProvision)



Provision the supplied structure.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using ASW.APIServices.VMS.Api;
using ASW.APIServices.VMS.Client;
using ASW.APIServices.VMS.Model;

namespace Example
{
    public class ProvisionStructureExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://healthsuite.allocatesoftware.com/vms/provisioning/v1";
            var apiInstance = new ProvisioningApi(Configuration.Default);
            var id = id_example;  // string | ID of the customer to provision
            var structureProvision = new StructureProvision(); // StructureProvision | Structure of the Customer (trust). This call should be considered a 'set' - elements omitted that were present in previous provisionings should be removed.

            try
            {
                apiInstance.ProvisionStructure(id, structureProvision);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ProvisioningApi.ProvisionStructure: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string**| ID of the customer to provision | 
 **structureProvision** | [**StructureProvision**](StructureProvision.md)| Structure of the Customer (trust). This call should be considered a &#39;set&#39; - elements omitted that were present in previous provisionings should be removed. | 

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
| **204** | Provisioning successful |  -  |
| **400** | Invalid input parameter |  -  |
| **401** | Unauthorized |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="provisionuser"></a>
# **ProvisionUser**
> void ProvisionUser (string id, UserProvision userProvision)



Provision the supplied user.

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using ASW.APIServices.VMS.Api;
using ASW.APIServices.VMS.Client;
using ASW.APIServices.VMS.Model;

namespace Example
{
    public class ProvisionUserExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://healthsuite.allocatesoftware.com/vms/provisioning/v1";
            var apiInstance = new ProvisioningApi(Configuration.Default);
            var id = id_example;  // string | ID of the user to provision
            var userProvision = new UserProvision(); // UserProvision | Structure of the User

            try
            {
                apiInstance.ProvisionUser(id, userProvision);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ProvisioningApi.ProvisionUser: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string**| ID of the user to provision | 
 **userProvision** | [**UserProvision**](UserProvision.md)| Structure of the User | 

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
| **204** | User accepted and provisioned. |  -  |
| **400** | Invalid input parameter |  -  |
| **401** | Unauthorized |  -  |
| **404** | Trust not found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

