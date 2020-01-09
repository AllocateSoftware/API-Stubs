# DutyApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelDuty**](DutyApi.md#cancelDuty) | **POST** /{version}/trustcode/{trustCode}/duty/{dutyId}/cancel | Cancel a duty
[**fillDuty**](DutyApi.md#fillDuty) | **POST** /{version}/trustcode/{trustCode}/duty/{dutyId}/booking | Creates booking for duty
[**getDutyDetails**](DutyApi.md#getDutyDetails) | **GET** /{version}/trustcode/{trustCode}/duty/ | Returns details about a duties.
[**getSingleDutyDetails**](DutyApi.md#getSingleDutyDetails) | **GET** /{version}/trustcode/{trustCode}/duty/{dutyId} | Returns details about a duties.
[**updateContractStatus**](DutyApi.md#updateContractStatus) | **PUT** /{version}/trustcode/{trustCode}/duty/{dutyId}/contract/{contractId}/status/{statusId} | Updates DE Contract status
[**updateTimesheets**](DutyApi.md#updateTimesheets) | **PUT** /{version}/trustcode/{trustCode}/duty/{dutyId}/timesheet | Updates timesheet for duty


<a name="cancelDuty"></a>
# **cancelDuty**
> cancelDuty(version, trustCode, dutyId)

Cancel a duty

Service that cancels certain duty.

### Example
```java
// Import classes:
import com.allocate.openapi.ApiClient;
import com.allocate.openapi.ApiException;
import com.allocate.openapi.Configuration;
import com.allocate.openapi.models.*;
import com.allocate.openapi.api.DutyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DutyApi apiInstance = new DutyApi(defaultClient);
    String version = "version_example"; // String | API version
    String trustCode = "trustCode_example"; // String | Trust code from BankStaff
    Integer dutyId = 56; // Integer | ID of the duty associated with the DE contract
    try {
      apiInstance.cancelDuty(version, trustCode, dutyId);
    } catch (ApiException e) {
      System.err.println("Exception when calling DutyApi#cancelDuty");
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
 **version** | **String**| API version |
 **trustCode** | **String**| Trust code from BankStaff |
 **dutyId** | **Integer**| ID of the duty associated with the DE contract |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad request errors |  -  |
**401** | Unauthorized |  -  |
**404** | Trust/Duty not found |  -  |

<a name="fillDuty"></a>
# **fillDuty**
> BookingResponse fillDuty(version, trustCode, dutyId, bookingInfo)

Creates booking for duty

Service that will create new booking on HR side with data sent by DE Provider.

### Example
```java
// Import classes:
import com.allocate.openapi.ApiClient;
import com.allocate.openapi.ApiException;
import com.allocate.openapi.Configuration;
import com.allocate.openapi.models.*;
import com.allocate.openapi.api.DutyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DutyApi apiInstance = new DutyApi(defaultClient);
    String version = "version_example"; // String | API version
    String trustCode = "trustCode_example"; // String | Trust code from BankStaff
    Integer dutyId = 56; // Integer | ID of the duty associated with the DE contract
    BookingInfo bookingInfo = new BookingInfo(); // BookingInfo | 
    try {
      BookingResponse result = apiInstance.fillDuty(version, trustCode, dutyId, bookingInfo);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DutyApi#fillDuty");
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
 **version** | **String**| API version |
 **trustCode** | **String**| Trust code from BankStaff |
 **dutyId** | **Integer**| ID of the duty associated with the DE contract |
 **bookingInfo** | [**BookingInfo**](BookingInfo.md)|  |

### Return type

[**BookingResponse**](BookingResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * X-Pagination -  <br>  |
**400** | Bad request errors |  -  |
**401** | Unauthorized |  -  |
**404** | Trust/Duty not found |  -  |

<a name="getDutyDetails"></a>
# **getDutyDetails**
> Duty getDutyDetails(version, trustCode, id, page, pageSize)

Returns details about a duties.

Returns details about a duties.

### Example
```java
// Import classes:
import com.allocate.openapi.ApiClient;
import com.allocate.openapi.ApiException;
import com.allocate.openapi.Configuration;
import com.allocate.openapi.models.*;
import com.allocate.openapi.api.DutyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DutyApi apiInstance = new DutyApi(defaultClient);
    String version = "version_example"; // String | API version
    String trustCode = "trustCode_example"; // String | Trust code from BankStaff
    List<Integer> id = Arrays.asList(); // List<Integer> | IDs of the duties to return
    Integer page = 56; // Integer | Result page
    Integer pageSize = 56; // Integer | Count of records per page
    try {
      Duty result = apiInstance.getDutyDetails(version, trustCode, id, page, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DutyApi#getDutyDetails");
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
 **version** | **String**| API version |
 **trustCode** | **String**| Trust code from BankStaff |
 **id** | [**List&lt;Integer&gt;**](Integer.md)| IDs of the duties to return |
 **page** | **Integer**| Result page | [optional]
 **pageSize** | **Integer**| Count of records per page | [optional]

### Return type

[**Duty**](Duty.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad request errors |  -  |
**401** | Unauthorized |  -  |
**404** | Trust not found |  -  |

<a name="getSingleDutyDetails"></a>
# **getSingleDutyDetails**
> Duty getSingleDutyDetails(version, trustCode, dutyId, page, pageSize)

Returns details about a duties.

Returns details about a duties.

### Example
```java
// Import classes:
import com.allocate.openapi.ApiClient;
import com.allocate.openapi.ApiException;
import com.allocate.openapi.Configuration;
import com.allocate.openapi.models.*;
import com.allocate.openapi.api.DutyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DutyApi apiInstance = new DutyApi(defaultClient);
    String version = "version_example"; // String | API version
    String trustCode = "trustCode_example"; // String | Trust code from BankStaff
    Integer dutyId = 56; // Integer | ID of a duty to return
    Integer page = 56; // Integer | Result page
    Integer pageSize = 56; // Integer | Count of records per page
    try {
      Duty result = apiInstance.getSingleDutyDetails(version, trustCode, dutyId, page, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DutyApi#getSingleDutyDetails");
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
 **version** | **String**| API version |
 **trustCode** | **String**| Trust code from BankStaff |
 **dutyId** | **Integer**| ID of a duty to return |
 **page** | **Integer**| Result page | [optional]
 **pageSize** | **Integer**| Count of records per page | [optional]

### Return type

[**Duty**](Duty.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad request errors |  -  |
**401** | Unauthorized |  -  |
**404** | Trust not found |  -  |

<a name="updateContractStatus"></a>
# **updateContractStatus**
> updateContractStatus(version, trustCode, dutyId, contractId, statusId)

Updates DE Contract status

Service that will be used by DE Provider to update the contract status, after DE contract is created/approved.

### Example
```java
// Import classes:
import com.allocate.openapi.ApiClient;
import com.allocate.openapi.ApiException;
import com.allocate.openapi.Configuration;
import com.allocate.openapi.models.*;
import com.allocate.openapi.api.DutyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DutyApi apiInstance = new DutyApi(defaultClient);
    String version = "version_example"; // String | API version
    String trustCode = "trustCode_example"; // String | Trust code from BankStaff
    Integer dutyId = 56; // Integer | ID of the duty associated with the DE contract
    String contractId = 77135e23-af51-4714-b854-d8df9e64aa63; // String | ID of the contract from DE Provider's system
    ContractStatus statusId = new ContractStatus(); // ContractStatus | 
    try {
      apiInstance.updateContractStatus(version, trustCode, dutyId, contractId, statusId);
    } catch (ApiException e) {
      System.err.println("Exception when calling DutyApi#updateContractStatus");
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
 **version** | **String**| API version |
 **trustCode** | **String**| Trust code from BankStaff |
 **dutyId** | **Integer**| ID of the duty associated with the DE contract |
 **contractId** | **String**| ID of the contract from DE Provider&#39;s system |
 **statusId** | [**ContractStatus**](.md)|  | [enum: not_initiated, in_progress, pending, active, nonactive]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad request errors |  -  |
**401** | Unauthorized |  -  |
**404** | Trust/Duty not found |  -  |

<a name="updateTimesheets"></a>
# **updateTimesheets**
> updateTimesheets(version, trustCode, dutyId, inlineObject)

Updates timesheet for duty

Service that will be used by DE Provider to update the timesheets, after approving the payment on their side.

### Example
```java
// Import classes:
import com.allocate.openapi.ApiClient;
import com.allocate.openapi.ApiException;
import com.allocate.openapi.Configuration;
import com.allocate.openapi.models.*;
import com.allocate.openapi.api.DutyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    DutyApi apiInstance = new DutyApi(defaultClient);
    String version = "version_example"; // String | API version
    String trustCode = "trustCode_example"; // String | Trust code from BankStaff
    Integer dutyId = 56; // Integer | ID of the duty associated with the DE contract
    InlineObject inlineObject = new InlineObject(); // InlineObject | 
    try {
      apiInstance.updateTimesheets(version, trustCode, dutyId, inlineObject);
    } catch (ApiException e) {
      System.err.println("Exception when calling DutyApi#updateTimesheets");
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
 **version** | **String**| API version |
 **trustCode** | **String**| Trust code from BankStaff |
 **dutyId** | **Integer**| ID of the duty associated with the DE contract |
 **inlineObject** | [**InlineObject**](InlineObject.md)|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad request errors |  -  |
**401** | Unauthorized |  -  |
**404** | Trust/Duty not found |  -  |

