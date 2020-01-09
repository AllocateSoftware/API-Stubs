# DutyBookingApi

All URIs are relative to *http://healthsuite.allocatesoftware.com/api/booking/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelProposal**](DutyBookingApi.md#cancelProposal) | **DELETE** /proposals/{id} | 
[**createProposal**](DutyBookingApi.md#createProposal) | **POST** /vacancy/{vacancyId}/proposals | 
[**updateProposal**](DutyBookingApi.md#updateProposal) | **PUT** /proposals/{id} | 


<a name="cancelProposal"></a>
# **cancelProposal**
> cancelProposal(id)



Cancel the proposal (and the booking, if it has been accepted)

### Example
```java
// Import classes:
import com.allocate.openapi.ApiClient;
import com.allocate.openapi.ApiException;
import com.allocate.openapi.Configuration;
import com.allocate.openapi.models.*;
import com.allocate.openapi.api.DutyBookingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://healthsuite.allocatesoftware.com/api/booking/v1");

    DutyBookingApi apiInstance = new DutyBookingApi(defaultClient);
    String id = "id_example"; // String | ID of the proposal
    try {
      apiInstance.cancelProposal(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling DutyBookingApi#cancelProposal");
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
 **id** | **String**| ID of the proposal |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Cancelled successfully |  -  |
**404** | The proposal was not found |  -  |
**202** | The request was accepted and will be processed asynchronously |  -  |

<a name="createProposal"></a>
# **createProposal**
> String createProposal(vacancyId, proposalDetails)



Offer a worker for filling a duty

### Example
```java
// Import classes:
import com.allocate.openapi.ApiClient;
import com.allocate.openapi.ApiException;
import com.allocate.openapi.Configuration;
import com.allocate.openapi.models.*;
import com.allocate.openapi.api.DutyBookingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://healthsuite.allocatesoftware.com/api/booking/v1");

    DutyBookingApi apiInstance = new DutyBookingApi(defaultClient);
    String vacancyId = "vacancyId_example"; // String | The ID of the vacancy
    ProposalDetails proposalDetails = new ProposalDetails(); // ProposalDetails | Details of the proposal for filling the duty (worker)
    try {
      String result = apiInstance.createProposal(vacancyId, proposalDetails);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DutyBookingApi#createProposal");
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
 **vacancyId** | **String**| The ID of the vacancy |
 **proposalDetails** | [**ProposalDetails**](ProposalDetails.md)| Details of the proposal for filling the duty (worker) |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/plain, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Proposal created successfully |  -  |
**202** | The proposal has been accepted and a response will be returned asyncronously. |  -  |

<a name="updateProposal"></a>
# **updateProposal**
> updateProposal(id, proposalDetails)



### Example
```java
// Import classes:
import com.allocate.openapi.ApiClient;
import com.allocate.openapi.ApiException;
import com.allocate.openapi.Configuration;
import com.allocate.openapi.models.*;
import com.allocate.openapi.api.DutyBookingApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://healthsuite.allocatesoftware.com/api/booking/v1");

    DutyBookingApi apiInstance = new DutyBookingApi(defaultClient);
    String id = "id_example"; // String | ID of the proposal
    ProposalDetails proposalDetails = new ProposalDetails(); // ProposalDetails | Details of the proposal for filling the duty (worker)
    try {
      apiInstance.updateProposal(id, proposalDetails);
    } catch (ApiException e) {
      System.err.println("Exception when calling DutyBookingApi#updateProposal");
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
 **id** | **String**| ID of the proposal |
 **proposalDetails** | [**ProposalDetails**](ProposalDetails.md)| Details of the proposal for filling the duty (worker) |

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
**404** | The proposal was not found |  -  |
**202** | The request was accepted and will be processed asynchronously |  -  |

