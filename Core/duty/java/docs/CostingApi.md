# CostingApi

All URIs are relative to *http://healthsuite.allocatesoftware.com/api/duty/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**sendDutyCosting**](CostingApi.md#sendDutyCosting) | **POST** /duties/{id}/costing | 


<a name="sendDutyCosting"></a>
# **sendDutyCosting**
> sendDutyCosting(id, dutyCostDetails)



### Example
```java
// Import classes:
import com.allocate.openapi.ApiClient;
import com.allocate.openapi.ApiException;
import com.allocate.openapi.Configuration;
import com.allocate.openapi.models.*;
import com.allocate.openapi.api.CostingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://healthsuite.allocatesoftware.com/api/duty/v1");

    CostingApi apiInstance = new CostingApi(defaultClient);
    String id = "id_example"; // String | ID of the duty
    DutyCostDetails dutyCostDetails = new DutyCostDetails(); // DutyCostDetails | Costing Information
    try {
      apiInstance.sendDutyCosting(id, dutyCostDetails);
    } catch (ApiException e) {
      System.err.println("Exception when calling CostingApi#sendDutyCosting");
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
 **id** | **String**| ID of the duty |
 **dutyCostDetails** | [**DutyCostDetails**](DutyCostDetails.md)| Costing Information |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Duty costing successfully |  -  |
**202** | The duty costing has been accepted and a response will be returned asyncronously. |  -  |

