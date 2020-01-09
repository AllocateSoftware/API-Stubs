# VacancyApi

All URIs are relative to *http://healthsuite.allocatesoftware.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createProposal**](VacancyApi.md#createProposal) | **POST** /vacancies/{vacancyId}/proposals | 
[**createVacancy**](VacancyApi.md#createVacancy) | **POST** /vacancies | 
[**submitTimesheet**](VacancyApi.md#submitTimesheet) | **POST** /vacancies/{vacancyId}/timesheet | 


<a name="createProposal"></a>
# **createProposal**
> CreateProposalResponse createProposal(vacancyId, proposalDetails)



Offer a worker for filling a duty

### Example
```java
// Import classes:
import com.allocate.openapi.ApiClient;
import com.allocate.openapi.ApiException;
import com.allocate.openapi.Configuration;
import com.allocate.openapi.auth.*;
import com.allocate.openapi.models.*;
import com.allocate.openapi.api.VacancyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://healthsuite.allocatesoftware.com/api/v1");
    
    // Configure HTTP bearer authorization: jwt
    HttpBearerAuth jwt = (HttpBearerAuth) defaultClient.getAuthentication("jwt");
    jwt.setBearerToken("BEARER TOKEN");

    VacancyApi apiInstance = new VacancyApi(defaultClient);
    String vacancyId = 33C33192-7B8D-4EE0-AD41-47AACF240A29; // String | The ID of the vacancy
    ProposalDetails proposalDetails = new ProposalDetails(); // ProposalDetails | Details of the proposal for filling the vacancy (worker, costs, etc)
    try {
      CreateProposalResponse result = apiInstance.createProposal(vacancyId, proposalDetails);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VacancyApi#createProposal");
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
 **proposalDetails** | [**ProposalDetails**](ProposalDetails.md)| Details of the proposal for filling the vacancy (worker, costs, etc) |

### Return type

[**CreateProposalResponse**](CreateProposalResponse.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Proposal created successfully |  -  |
**202** | The proposal has been accepted and a response will be returned asyncronously. |  -  |
**400** | One or more errors have occurred when attempting to process the provided data |  -  |

<a name="createVacancy"></a>
# **createVacancy**
> CreateVacancyResponse createVacancy(vacancy)



Create a new vacancy

### Example
```java
// Import classes:
import com.allocate.openapi.ApiClient;
import com.allocate.openapi.ApiException;
import com.allocate.openapi.Configuration;
import com.allocate.openapi.auth.*;
import com.allocate.openapi.models.*;
import com.allocate.openapi.api.VacancyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://healthsuite.allocatesoftware.com/api/v1");
    
    // Configure HTTP bearer authorization: jwt
    HttpBearerAuth jwt = (HttpBearerAuth) defaultClient.getAuthentication("jwt");
    jwt.setBearerToken("BEARER TOKEN");

    VacancyApi apiInstance = new VacancyApi(defaultClient);
    Vacancy vacancy = new Vacancy(); // Vacancy | Details of the vacancy
    try {
      CreateVacancyResponse result = apiInstance.createVacancy(vacancy);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling VacancyApi#createVacancy");
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
 **vacancy** | [**Vacancy**](Vacancy.md)| Details of the vacancy |

### Return type

[**CreateVacancyResponse**](CreateVacancyResponse.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**403** | Forbidden - you do not have the necessary permissions to undertake this action |  -  |
**200** | Vacancy created successfully |  -  |

<a name="submitTimesheet"></a>
# **submitTimesheet**
> submitTimesheet(vacancyId, inlineObject)



Send timesheet information for a completed activity

### Example
```java
// Import classes:
import com.allocate.openapi.ApiClient;
import com.allocate.openapi.ApiException;
import com.allocate.openapi.Configuration;
import com.allocate.openapi.auth.*;
import com.allocate.openapi.models.*;
import com.allocate.openapi.api.VacancyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://healthsuite.allocatesoftware.com/api/v1");
    
    // Configure HTTP bearer authorization: jwt
    HttpBearerAuth jwt = (HttpBearerAuth) defaultClient.getAuthentication("jwt");
    jwt.setBearerToken("BEARER TOKEN");

    VacancyApi apiInstance = new VacancyApi(defaultClient);
    String vacancyId = 33C33192-7B8D-4EE0-AD41-47AACF240A29; // String | The ID of the vacancy
    InlineObject inlineObject = new InlineObject(); // InlineObject | 
    try {
      apiInstance.submitTimesheet(vacancyId, inlineObject);
    } catch (ApiException e) {
      System.err.println("Exception when calling VacancyApi#submitTimesheet");
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
 **inlineObject** | [**InlineObject**](InlineObject.md)|  |

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
**200** | Timesheet successfully submitted |  -  |

