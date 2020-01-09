# ReferenceDataApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAgenciesByIds**](ReferenceDataApi.md#getAgenciesByIds) | **GET** /{version}/trustcode/{trustCode}/referenceData/agency/ | Get agencies
[**getAllAgencies**](ReferenceDataApi.md#getAllAgencies) | **GET** /{version}/trustcode/{trustCode}/referenceData/agency | Get all agencies
[**getAllContractStatuses**](ReferenceDataApi.md#getAllContractStatuses) | **GET** /{version}/trustcode/{trustCode}/referenceData/contractStatus | Get all contract statuses
[**getAllGrades**](ReferenceDataApi.md#getAllGrades) | **GET** /{version}/trustcode/{trustCode}/referenceData/grade | Get all grades
[**getAllReasonsForVacancy**](ReferenceDataApi.md#getAllReasonsForVacancy) | **GET** /{version}/trustcode/{trustCode}/referenceData/reasonForVacancy | Get all reasons for vacancy
[**getAllStaffGroups**](ReferenceDataApi.md#getAllStaffGroups) | **GET** /{version}/trustcode/{trustCode}/referenceData/staffGroup | Get all staff groups
[**getAllUnits**](ReferenceDataApi.md#getAllUnits) | **GET** /{version}/trustcode/{trustCode}/referenceData/unit | Get all units
[**getContractStatusesByIds**](ReferenceDataApi.md#getContractStatusesByIds) | **GET** /{version}/trustcode/{trustCode}/referenceData/contractStatus/ | Get contract statuses
[**getGradesByIds**](ReferenceDataApi.md#getGradesByIds) | **GET** /{version}/trustcode/{trustCode}/referenceData/grade/ | Get grades
[**getReasonsForVacancyByIds**](ReferenceDataApi.md#getReasonsForVacancyByIds) | **GET** /{version}/trustcode/{trustCode}/referenceData/reasonForVacancy/ | Get reasons for vacancy
[**getStaffGroupsByIds**](ReferenceDataApi.md#getStaffGroupsByIds) | **GET** /{version}/trustcode/{trustCode}/referenceData/staffGroup/ | Get staff groups
[**getUnitsByIds**](ReferenceDataApi.md#getUnitsByIds) | **GET** /{version}/trustcode/{trustCode}/referenceData/unit/ | Get units


<a name="getAgenciesByIds"></a>
# **getAgenciesByIds**
> List&lt;ReferenceDataResponse&gt; getAgenciesByIds(version, trustCode, id, page, pageSize)

Get agencies

Returns an array of agencies

### Example
```java
// Import classes:
import com.allocate.openapi.ApiClient;
import com.allocate.openapi.ApiException;
import com.allocate.openapi.Configuration;
import com.allocate.openapi.models.*;
import com.allocate.openapi.api.ReferenceDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ReferenceDataApi apiInstance = new ReferenceDataApi(defaultClient);
    String version = "version_example"; // String | API version
    String trustCode = "trustCode_example"; // String | Trust code from BankStaff
    List<Integer> id = Arrays.asList(); // List<Integer> | Array of reference data IDs to return
    Integer page = 56; // Integer | Result page
    Integer pageSize = 56; // Integer | Count of records per page
    try {
      List<ReferenceDataResponse> result = apiInstance.getAgenciesByIds(version, trustCode, id, page, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReferenceDataApi#getAgenciesByIds");
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
 **id** | [**List&lt;Integer&gt;**](Integer.md)| Array of reference data IDs to return |
 **page** | **Integer**| Result page | [optional]
 **pageSize** | **Integer**| Count of records per page | [optional]

### Return type

[**List&lt;ReferenceDataResponse&gt;**](ReferenceDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * X-Pagination -  <br>  |
**400** | Bad request errors |  -  |
**401** | Unauthorized |  -  |
**404** | Trust not found |  -  |

<a name="getAllAgencies"></a>
# **getAllAgencies**
> List&lt;ReferenceDataResponse&gt; getAllAgencies(version, trustCode, page, pageSize)

Get all agencies

Returns an array of agencies

### Example
```java
// Import classes:
import com.allocate.openapi.ApiClient;
import com.allocate.openapi.ApiException;
import com.allocate.openapi.Configuration;
import com.allocate.openapi.models.*;
import com.allocate.openapi.api.ReferenceDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ReferenceDataApi apiInstance = new ReferenceDataApi(defaultClient);
    String version = "version_example"; // String | API version
    String trustCode = "trustCode_example"; // String | Trust code from BankStaff
    Integer page = 56; // Integer | Result page
    Integer pageSize = 56; // Integer | Count of records per page
    try {
      List<ReferenceDataResponse> result = apiInstance.getAllAgencies(version, trustCode, page, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReferenceDataApi#getAllAgencies");
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
 **page** | **Integer**| Result page | [optional]
 **pageSize** | **Integer**| Count of records per page | [optional]

### Return type

[**List&lt;ReferenceDataResponse&gt;**](ReferenceDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * X-Pagination -  <br>  |
**400** | Bad request errors |  -  |
**401** | Unauthorized |  -  |
**404** | Trust not found |  -  |

<a name="getAllContractStatuses"></a>
# **getAllContractStatuses**
> List&lt;ReferenceDataResponse&gt; getAllContractStatuses(version, trustCode, page, pageSize)

Get all contract statuses

Returns an array of contract statuses.

### Example
```java
// Import classes:
import com.allocate.openapi.ApiClient;
import com.allocate.openapi.ApiException;
import com.allocate.openapi.Configuration;
import com.allocate.openapi.models.*;
import com.allocate.openapi.api.ReferenceDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ReferenceDataApi apiInstance = new ReferenceDataApi(defaultClient);
    String version = "version_example"; // String | API version
    String trustCode = "trustCode_example"; // String | Trust code from BankStaff
    Integer page = 56; // Integer | Result page
    Integer pageSize = 56; // Integer | Count of records per page
    try {
      List<ReferenceDataResponse> result = apiInstance.getAllContractStatuses(version, trustCode, page, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReferenceDataApi#getAllContractStatuses");
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
 **page** | **Integer**| Result page | [optional]
 **pageSize** | **Integer**| Count of records per page | [optional]

### Return type

[**List&lt;ReferenceDataResponse&gt;**](ReferenceDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * X-Pagination -  <br>  |
**400** | Bad request errors |  -  |
**401** | Unauthorized |  -  |
**404** | Trust not found |  -  |

<a name="getAllGrades"></a>
# **getAllGrades**
> List&lt;ReferenceDataResponse&gt; getAllGrades(version, trustCode, page, pageSize)

Get all grades

Returns an array of grades

### Example
```java
// Import classes:
import com.allocate.openapi.ApiClient;
import com.allocate.openapi.ApiException;
import com.allocate.openapi.Configuration;
import com.allocate.openapi.models.*;
import com.allocate.openapi.api.ReferenceDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ReferenceDataApi apiInstance = new ReferenceDataApi(defaultClient);
    String version = "version_example"; // String | API version
    String trustCode = "trustCode_example"; // String | Trust code from BankStaff
    Integer page = 56; // Integer | Result page
    Integer pageSize = 56; // Integer | Count of records per page
    try {
      List<ReferenceDataResponse> result = apiInstance.getAllGrades(version, trustCode, page, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReferenceDataApi#getAllGrades");
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
 **page** | **Integer**| Result page | [optional]
 **pageSize** | **Integer**| Count of records per page | [optional]

### Return type

[**List&lt;ReferenceDataResponse&gt;**](ReferenceDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * X-Pagination -  <br>  |
**400** | Bad request errors |  -  |
**401** | Unauthorized |  -  |
**404** | Trust not found |  -  |

<a name="getAllReasonsForVacancy"></a>
# **getAllReasonsForVacancy**
> List&lt;ReferenceDataResponse&gt; getAllReasonsForVacancy(version, trustCode, page, pageSize)

Get all reasons for vacancy

Returns an array of reasons for vacancy

### Example
```java
// Import classes:
import com.allocate.openapi.ApiClient;
import com.allocate.openapi.ApiException;
import com.allocate.openapi.Configuration;
import com.allocate.openapi.models.*;
import com.allocate.openapi.api.ReferenceDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ReferenceDataApi apiInstance = new ReferenceDataApi(defaultClient);
    String version = "version_example"; // String | API version
    String trustCode = "trustCode_example"; // String | Trust code from BankStaff
    Integer page = 56; // Integer | Result page
    Integer pageSize = 56; // Integer | Count of records per page
    try {
      List<ReferenceDataResponse> result = apiInstance.getAllReasonsForVacancy(version, trustCode, page, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReferenceDataApi#getAllReasonsForVacancy");
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
 **page** | **Integer**| Result page | [optional]
 **pageSize** | **Integer**| Count of records per page | [optional]

### Return type

[**List&lt;ReferenceDataResponse&gt;**](ReferenceDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * X-Pagination -  <br>  |
**400** | Bad request errors |  -  |
**401** | Unauthorized |  -  |
**404** | Trust not found |  -  |

<a name="getAllStaffGroups"></a>
# **getAllStaffGroups**
> List&lt;ReferenceDataResponse&gt; getAllStaffGroups(version, trustCode, page, pageSize)

Get all staff groups

Returns an array of staff groups

### Example
```java
// Import classes:
import com.allocate.openapi.ApiClient;
import com.allocate.openapi.ApiException;
import com.allocate.openapi.Configuration;
import com.allocate.openapi.models.*;
import com.allocate.openapi.api.ReferenceDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ReferenceDataApi apiInstance = new ReferenceDataApi(defaultClient);
    String version = "version_example"; // String | API version
    String trustCode = "trustCode_example"; // String | Trust code from BankStaff
    Integer page = 56; // Integer | Result page
    Integer pageSize = 56; // Integer | Count of records per page
    try {
      List<ReferenceDataResponse> result = apiInstance.getAllStaffGroups(version, trustCode, page, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReferenceDataApi#getAllStaffGroups");
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
 **page** | **Integer**| Result page | [optional]
 **pageSize** | **Integer**| Count of records per page | [optional]

### Return type

[**List&lt;ReferenceDataResponse&gt;**](ReferenceDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * X-Pagination -  <br>  |
**400** | Bad request errors |  -  |
**401** | Unauthorized |  -  |
**404** | Trust not found |  -  |

<a name="getAllUnits"></a>
# **getAllUnits**
> List&lt;UnitReferenceDataResponse&gt; getAllUnits(version, trustCode, page, pageSize)

Get all units

Returns an array of units

### Example
```java
// Import classes:
import com.allocate.openapi.ApiClient;
import com.allocate.openapi.ApiException;
import com.allocate.openapi.Configuration;
import com.allocate.openapi.models.*;
import com.allocate.openapi.api.ReferenceDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ReferenceDataApi apiInstance = new ReferenceDataApi(defaultClient);
    String version = "version_example"; // String | API version
    String trustCode = "trustCode_example"; // String | Trust code from BankStaff
    Integer page = 56; // Integer | Result page
    Integer pageSize = 56; // Integer | Count of records per page
    try {
      List<UnitReferenceDataResponse> result = apiInstance.getAllUnits(version, trustCode, page, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReferenceDataApi#getAllUnits");
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
 **page** | **Integer**| Result page | [optional]
 **pageSize** | **Integer**| Count of records per page | [optional]

### Return type

[**List&lt;UnitReferenceDataResponse&gt;**](UnitReferenceDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * X-Pagination -  <br>  |
**400** | Bad request errors |  -  |
**401** | Unauthorized |  -  |
**404** | Trust not found |  -  |

<a name="getContractStatusesByIds"></a>
# **getContractStatusesByIds**
> List&lt;ReferenceDataResponse&gt; getContractStatusesByIds(version, trustCode, id, page, pageSize)

Get contract statuses

Returns an array of contract statuses

### Example
```java
// Import classes:
import com.allocate.openapi.ApiClient;
import com.allocate.openapi.ApiException;
import com.allocate.openapi.Configuration;
import com.allocate.openapi.models.*;
import com.allocate.openapi.api.ReferenceDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ReferenceDataApi apiInstance = new ReferenceDataApi(defaultClient);
    String version = "version_example"; // String | API version
    String trustCode = "trustCode_example"; // String | Trust code from BankStaff
    List<String> id = Arrays.asList(); // List<String> | Array of reference data IDs to return
    Integer page = 56; // Integer | Result page
    Integer pageSize = 56; // Integer | Count of records per page
    try {
      List<ReferenceDataResponse> result = apiInstance.getContractStatusesByIds(version, trustCode, id, page, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReferenceDataApi#getContractStatusesByIds");
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
 **id** | [**List&lt;String&gt;**](String.md)| Array of reference data IDs to return |
 **page** | **Integer**| Result page | [optional]
 **pageSize** | **Integer**| Count of records per page | [optional]

### Return type

[**List&lt;ReferenceDataResponse&gt;**](ReferenceDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * X-Pagination -  <br>  |
**400** | Bad request errors |  -  |
**401** | Unauthorized |  -  |
**404** | Trust not found |  -  |

<a name="getGradesByIds"></a>
# **getGradesByIds**
> List&lt;ReferenceDataResponse&gt; getGradesByIds(version, trustCode, id, page, pageSize)

Get grades

Returns an array of grades

### Example
```java
// Import classes:
import com.allocate.openapi.ApiClient;
import com.allocate.openapi.ApiException;
import com.allocate.openapi.Configuration;
import com.allocate.openapi.models.*;
import com.allocate.openapi.api.ReferenceDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ReferenceDataApi apiInstance = new ReferenceDataApi(defaultClient);
    String version = "version_example"; // String | API version
    String trustCode = "trustCode_example"; // String | Trust code from BankStaff
    List<Integer> id = Arrays.asList(); // List<Integer> | Array of reference data IDs to return
    Integer page = 56; // Integer | Result page
    Integer pageSize = 56; // Integer | Count of records per page
    try {
      List<ReferenceDataResponse> result = apiInstance.getGradesByIds(version, trustCode, id, page, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReferenceDataApi#getGradesByIds");
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
 **id** | [**List&lt;Integer&gt;**](Integer.md)| Array of reference data IDs to return |
 **page** | **Integer**| Result page | [optional]
 **pageSize** | **Integer**| Count of records per page | [optional]

### Return type

[**List&lt;ReferenceDataResponse&gt;**](ReferenceDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * X-Pagination -  <br>  |
**400** | Bad request errors |  -  |
**401** | Unauthorized |  -  |
**404** | Trust not found |  -  |

<a name="getReasonsForVacancyByIds"></a>
# **getReasonsForVacancyByIds**
> List&lt;ReferenceDataResponse&gt; getReasonsForVacancyByIds(version, trustCode, id, page, pageSize)

Get reasons for vacancy

Returns an array of reasons for vacancy

### Example
```java
// Import classes:
import com.allocate.openapi.ApiClient;
import com.allocate.openapi.ApiException;
import com.allocate.openapi.Configuration;
import com.allocate.openapi.models.*;
import com.allocate.openapi.api.ReferenceDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ReferenceDataApi apiInstance = new ReferenceDataApi(defaultClient);
    String version = "version_example"; // String | API version
    String trustCode = "trustCode_example"; // String | Trust code from BankStaff
    List<Integer> id = Arrays.asList(); // List<Integer> | Array of reference data IDs to return
    Integer page = 56; // Integer | Result page
    Integer pageSize = 56; // Integer | Count of records per page
    try {
      List<ReferenceDataResponse> result = apiInstance.getReasonsForVacancyByIds(version, trustCode, id, page, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReferenceDataApi#getReasonsForVacancyByIds");
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
 **id** | [**List&lt;Integer&gt;**](Integer.md)| Array of reference data IDs to return |
 **page** | **Integer**| Result page | [optional]
 **pageSize** | **Integer**| Count of records per page | [optional]

### Return type

[**List&lt;ReferenceDataResponse&gt;**](ReferenceDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * X-Pagination -  <br>  |
**400** | Bad request errors |  -  |
**401** | Unauthorized |  -  |
**404** | Trust not found |  -  |

<a name="getStaffGroupsByIds"></a>
# **getStaffGroupsByIds**
> List&lt;ReferenceDataResponse&gt; getStaffGroupsByIds(version, trustCode, id, page, pageSize)

Get staff groups

Returns an array of staff groups

### Example
```java
// Import classes:
import com.allocate.openapi.ApiClient;
import com.allocate.openapi.ApiException;
import com.allocate.openapi.Configuration;
import com.allocate.openapi.models.*;
import com.allocate.openapi.api.ReferenceDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ReferenceDataApi apiInstance = new ReferenceDataApi(defaultClient);
    String version = "version_example"; // String | API version
    String trustCode = "trustCode_example"; // String | Trust code from BankStaff
    List<Integer> id = Arrays.asList(); // List<Integer> | Array of reference data IDs to return
    Integer page = 56; // Integer | Result page
    Integer pageSize = 56; // Integer | Count of records per page
    try {
      List<ReferenceDataResponse> result = apiInstance.getStaffGroupsByIds(version, trustCode, id, page, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReferenceDataApi#getStaffGroupsByIds");
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
 **id** | [**List&lt;Integer&gt;**](Integer.md)| Array of reference data IDs to return |
 **page** | **Integer**| Result page | [optional]
 **pageSize** | **Integer**| Count of records per page | [optional]

### Return type

[**List&lt;ReferenceDataResponse&gt;**](ReferenceDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * X-Pagination -  <br>  |
**400** | Bad request errors |  -  |
**401** | Unauthorized |  -  |
**404** | Trust not found |  -  |

<a name="getUnitsByIds"></a>
# **getUnitsByIds**
> List&lt;UnitReferenceDataResponse&gt; getUnitsByIds(version, trustCode, id, page, pageSize)

Get units

Returns an array of units

### Example
```java
// Import classes:
import com.allocate.openapi.ApiClient;
import com.allocate.openapi.ApiException;
import com.allocate.openapi.Configuration;
import com.allocate.openapi.models.*;
import com.allocate.openapi.api.ReferenceDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    ReferenceDataApi apiInstance = new ReferenceDataApi(defaultClient);
    String version = "version_example"; // String | API version
    String trustCode = "trustCode_example"; // String | Trust code from BankStaff
    List<Integer> id = Arrays.asList(); // List<Integer> | Array of reference data IDs to return
    Integer page = 56; // Integer | Result page
    Integer pageSize = 56; // Integer | Count of records per page
    try {
      List<UnitReferenceDataResponse> result = apiInstance.getUnitsByIds(version, trustCode, id, page, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReferenceDataApi#getUnitsByIds");
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
 **id** | [**List&lt;Integer&gt;**](Integer.md)| Array of reference data IDs to return |
 **page** | **Integer**| Result page | [optional]
 **pageSize** | **Integer**| Count of records per page | [optional]

### Return type

[**List&lt;UnitReferenceDataResponse&gt;**](UnitReferenceDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * X-Pagination -  <br>  |
**400** | Bad request errors |  -  |
**401** | Unauthorized |  -  |
**404** | Trust not found |  -  |

