# ProposalApi

All URIs are relative to *http://healthsuite.allocatesoftware.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**acceptProposal**](ProposalApi.md#acceptProposal) | **POST** /proposals/{id}/accept | 
[**cancelProposal**](ProposalApi.md#cancelProposal) | **DELETE** /proposals/{id} | 
[**getProposal**](ProposalApi.md#getProposal) | **GET** /proposals/{id} | 
[**updateProposal**](ProposalApi.md#updateProposal) | **PUT** /proposals/{id} | 


<a name="acceptProposal"></a>
# **acceptProposal**
> acceptProposal(id)



Accept the proposal (possibly on behalf of the trust). Note that it is not neccessary to call this API in the case of direct-book scenarios as it will be assumed as a part of the workflow.

### Example
```java
// Import classes:
import com.allocate.openapi.ApiClient;
import com.allocate.openapi.ApiException;
import com.allocate.openapi.Configuration;
import com.allocate.openapi.auth.*;
import com.allocate.openapi.models.*;
import com.allocate.openapi.api.ProposalApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://healthsuite.allocatesoftware.com/api/v1");
    
    // Configure HTTP bearer authorization: jwt
    HttpBearerAuth jwt = (HttpBearerAuth) defaultClient.getAuthentication("jwt");
    jwt.setBearerToken("BEARER TOKEN");

    ProposalApi apiInstance = new ProposalApi(defaultClient);
    String id = 2CBC7FF9-38FB-4F0A-835A-324D9CF4800C; // String | The ID of the proposal
    try {
      apiInstance.acceptProposal(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProposalApi#acceptProposal");
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
 **id** | **String**| The ID of the proposal |

### Return type

null (empty response body)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**404** | The proposal was not found |  -  |
**200** | Proposal successfully accepted |  -  |

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
import com.allocate.openapi.auth.*;
import com.allocate.openapi.models.*;
import com.allocate.openapi.api.ProposalApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://healthsuite.allocatesoftware.com/api/v1");
    
    // Configure HTTP bearer authorization: jwt
    HttpBearerAuth jwt = (HttpBearerAuth) defaultClient.getAuthentication("jwt");
    jwt.setBearerToken("BEARER TOKEN");

    ProposalApi apiInstance = new ProposalApi(defaultClient);
    String id = 2CBC7FF9-38FB-4F0A-835A-324D9CF4800C; // String | The ID of the proposal
    try {
      apiInstance.cancelProposal(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProposalApi#cancelProposal");
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
 **id** | **String**| The ID of the proposal |

### Return type

null (empty response body)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**404** | The proposal was not found |  -  |
**200** | Cancelled successfully |  -  |
**202** | The request was accepted and will be processed asynchronously |  -  |

<a name="getProposal"></a>
# **getProposal**
> ProposalDetails getProposal(id)



### Example
```java
// Import classes:
import com.allocate.openapi.ApiClient;
import com.allocate.openapi.ApiException;
import com.allocate.openapi.Configuration;
import com.allocate.openapi.auth.*;
import com.allocate.openapi.models.*;
import com.allocate.openapi.api.ProposalApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://healthsuite.allocatesoftware.com/api/v1");
    
    // Configure HTTP bearer authorization: jwt
    HttpBearerAuth jwt = (HttpBearerAuth) defaultClient.getAuthentication("jwt");
    jwt.setBearerToken("BEARER TOKEN");

    ProposalApi apiInstance = new ProposalApi(defaultClient);
    String id = 2CBC7FF9-38FB-4F0A-835A-324D9CF4800C; // String | The ID of the proposal
    try {
      ProposalDetails result = apiInstance.getProposal(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProposalApi#getProposal");
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
 **id** | **String**| The ID of the proposal |

### Return type

[**ProposalDetails**](ProposalDetails.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**404** | The proposal was not found |  -  |
**200** | Proposal successfully found |  -  |

<a name="updateProposal"></a>
# **updateProposal**
> updateProposal(id, proposalDetails)



### Example
```java
// Import classes:
import com.allocate.openapi.ApiClient;
import com.allocate.openapi.ApiException;
import com.allocate.openapi.Configuration;
import com.allocate.openapi.auth.*;
import com.allocate.openapi.models.*;
import com.allocate.openapi.api.ProposalApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://healthsuite.allocatesoftware.com/api/v1");
    
    // Configure HTTP bearer authorization: jwt
    HttpBearerAuth jwt = (HttpBearerAuth) defaultClient.getAuthentication("jwt");
    jwt.setBearerToken("BEARER TOKEN");

    ProposalApi apiInstance = new ProposalApi(defaultClient);
    String id = 2CBC7FF9-38FB-4F0A-835A-324D9CF4800C; // String | The ID of the proposal
    ProposalDetails proposalDetails = new ProposalDetails(); // ProposalDetails | Details of the proposal for filling the duty (worker)
    try {
      apiInstance.updateProposal(id, proposalDetails);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProposalApi#updateProposal");
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
 **id** | **String**| The ID of the proposal |
 **proposalDetails** | [**ProposalDetails**](ProposalDetails.md)| Details of the proposal for filling the duty (worker) |

### Return type

null (empty response body)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**404** | The proposal was not found |  -  |
**200** | The Proposal successfully updated |  -  |

