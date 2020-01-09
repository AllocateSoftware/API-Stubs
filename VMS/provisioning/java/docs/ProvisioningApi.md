# ProvisioningApi

All URIs are relative to *http://healthsuite.allocatesoftware.com/vms/provisioning/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**provisionStructure**](ProvisioningApi.md#provisionStructure) | **PUT** /provision/customer/{id} | 
[**provisionUser**](ProvisioningApi.md#provisionUser) | **PUT** /provision/user/{id} | 


<a name="provisionStructure"></a>
# **provisionStructure**
> provisionStructure(id, structureProvision)



Provision the supplied structure.

### Example
```java
// Import classes:
import com.allocate.vms.ApiClient;
import com.allocate.vms.ApiException;
import com.allocate.vms.Configuration;
import com.allocate.vms.models.*;
import com.allocate.vms.api.ProvisioningApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://healthsuite.allocatesoftware.com/vms/provisioning/v1");

    ProvisioningApi apiInstance = new ProvisioningApi(defaultClient);
    String id = "id_example"; // String | ID of the customer to provision
    StructureProvision structureProvision = new StructureProvision(); // StructureProvision | Structure of the Customer (trust). This call should be considered a 'set' - elements omitted that were present in previous provisionings should be removed.
    try {
      apiInstance.provisionStructure(id, structureProvision);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvisioningApi#provisionStructure");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of the customer to provision |
 **structureProvision** | [**StructureProvision**](StructureProvision.md)| Structure of the Customer (trust). This call should be considered a &#39;set&#39; - elements omitted that were present in previous provisionings should be removed. |

### Return type

null (empty response body)

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

<a name="provisionUser"></a>
# **provisionUser**
> provisionUser(id, userProvision)



Provision the supplied user.

### Example
```java
// Import classes:
import com.allocate.vms.ApiClient;
import com.allocate.vms.ApiException;
import com.allocate.vms.Configuration;
import com.allocate.vms.models.*;
import com.allocate.vms.api.ProvisioningApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://healthsuite.allocatesoftware.com/vms/provisioning/v1");

    ProvisioningApi apiInstance = new ProvisioningApi(defaultClient);
    String id = "id_example"; // String | ID of the user to provision
    UserProvision userProvision = new UserProvision(); // UserProvision | Structure of the User
    try {
      apiInstance.provisionUser(id, userProvision);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProvisioningApi#provisionUser");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| ID of the user to provision |
 **userProvision** | [**UserProvision**](UserProvision.md)| Structure of the User |

### Return type

null (empty response body)

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

