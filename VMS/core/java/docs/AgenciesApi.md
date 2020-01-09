# AgenciesApi

All URIs are relative to *http://healthsuite.allocatesoftware.com/vms/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCostings**](AgenciesApi.md#getCostings) | **POST** /agencies/costings | 
[**sendDutyToAgencies**](AgenciesApi.md#sendDutyToAgencies) | **POST** /agencies | 
[**sendDutyToAgency**](AgenciesApi.md#sendDutyToAgency) | **POST** /agencies/{agencyId} | 


<a name="getCostings"></a>
# **getCostings**
> AgencyCostings getCostings(duty)



Returns a list of agencies and their costs for the supplied duty.

### Example
```java
// Import classes:
import com.allocate.vms.ApiClient;
import com.allocate.vms.ApiException;
import com.allocate.vms.Configuration;
import com.allocate.vms.auth.*;
import com.allocate.vms.models.*;
import com.allocate.vms.api.AgenciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://healthsuite.allocatesoftware.com/vms/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AgenciesApi apiInstance = new AgenciesApi(defaultClient);
    Duty duty = new Duty(); // Duty | Duty to be costed
    try {
      AgencyCostings result = apiInstance.getCostings(duty);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgenciesApi#getCostings");
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
 **duty** | [**Duty**](Duty.md)| Duty to be costed |

### Return type

[**AgencyCostings**](AgencyCostings.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Invalid input parameter |  -  |
**401** | Unauthorized |  -  |
**404** | Trust not found |  -  |

<a name="sendDutyToAgencies"></a>
# **sendDutyToAgencies**
> String sendDutyToAgencies(dutyRequest)



Forward a request for a duty to be filled by agency. Dependent upon the rules specified within the VMS, this will cascade to the appropriate agencies.

### Example
```java
// Import classes:
import com.allocate.vms.ApiClient;
import com.allocate.vms.ApiException;
import com.allocate.vms.Configuration;
import com.allocate.vms.auth.*;
import com.allocate.vms.models.*;
import com.allocate.vms.api.AgenciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://healthsuite.allocatesoftware.com/vms/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AgenciesApi apiInstance = new AgenciesApi(defaultClient);
    DutyRequest dutyRequest = new DutyRequest(); // DutyRequest | Duty to be sent to agency
    try {
      String result = apiInstance.sendDutyToAgencies(dutyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgenciesApi#sendDutyToAgencies");
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
 **dutyRequest** | [**DutyRequest**](DutyRequest.md)| Duty to be sent to agency |

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Duty accepted by VMS. |  -  |
**400** | Invalid input parameter |  -  |
**401** | Unauthorized |  -  |
**404** | Trust not found |  -  |

<a name="sendDutyToAgency"></a>
# **sendDutyToAgency**
> String sendDutyToAgency(agencyId, dutyRequest)



Immediately forward a request for a duty to be filled by a specific agency. If the request also specifies a worker Identity, this will be a direct booking.

### Example
```java
// Import classes:
import com.allocate.vms.ApiClient;
import com.allocate.vms.ApiException;
import com.allocate.vms.Configuration;
import com.allocate.vms.auth.*;
import com.allocate.vms.models.*;
import com.allocate.vms.api.AgenciesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://healthsuite.allocatesoftware.com/vms/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    AgenciesApi apiInstance = new AgenciesApi(defaultClient);
    String agencyId = "agencyId_example"; // String | ID of the agency to send the request to.
    DutyRequest dutyRequest = new DutyRequest(); // DutyRequest | Duty to be sent to agency
    try {
      String result = apiInstance.sendDutyToAgency(agencyId, dutyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgenciesApi#sendDutyToAgency");
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
 **agencyId** | **String**| ID of the agency to send the request to. |
 **dutyRequest** | [**DutyRequest**](DutyRequest.md)| Duty to be sent to agency |

### Return type

**String**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Duty accepted by VMS. |  -  |
**400** | Invalid input parameter |  -  |
**401** | Unauthorized |  -  |
**404** | Trust not found |  -  |

