# ASW.APIServices.Core.Api.ReferenceDataApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetAgenciesByIds**](ReferenceDataApi.md#getagenciesbyids) | **GET** /{version}/trustcode/{trustCode}/referenceData/agency/ | Get agencies
[**GetAllAgencies**](ReferenceDataApi.md#getallagencies) | **GET** /{version}/trustcode/{trustCode}/referenceData/agency | Get all agencies
[**GetAllContractStatuses**](ReferenceDataApi.md#getallcontractstatuses) | **GET** /{version}/trustcode/{trustCode}/referenceData/contractStatus | Get all contract statuses
[**GetAllGrades**](ReferenceDataApi.md#getallgrades) | **GET** /{version}/trustcode/{trustCode}/referenceData/grade | Get all grades
[**GetAllReasonsForVacancy**](ReferenceDataApi.md#getallreasonsforvacancy) | **GET** /{version}/trustcode/{trustCode}/referenceData/reasonForVacancy | Get all reasons for vacancy
[**GetAllStaffGroups**](ReferenceDataApi.md#getallstaffgroups) | **GET** /{version}/trustcode/{trustCode}/referenceData/staffGroup | Get all staff groups
[**GetAllUnits**](ReferenceDataApi.md#getallunits) | **GET** /{version}/trustcode/{trustCode}/referenceData/unit | Get all units
[**GetContractStatusesByIds**](ReferenceDataApi.md#getcontractstatusesbyids) | **GET** /{version}/trustcode/{trustCode}/referenceData/contractStatus/ | Get contract statuses
[**GetGradesByIds**](ReferenceDataApi.md#getgradesbyids) | **GET** /{version}/trustcode/{trustCode}/referenceData/grade/ | Get grades
[**GetReasonsForVacancyByIds**](ReferenceDataApi.md#getreasonsforvacancybyids) | **GET** /{version}/trustcode/{trustCode}/referenceData/reasonForVacancy/ | Get reasons for vacancy
[**GetStaffGroupsByIds**](ReferenceDataApi.md#getstaffgroupsbyids) | **GET** /{version}/trustcode/{trustCode}/referenceData/staffGroup/ | Get staff groups
[**GetUnitsByIds**](ReferenceDataApi.md#getunitsbyids) | **GET** /{version}/trustcode/{trustCode}/referenceData/unit/ | Get units



## GetAgenciesByIds

> List&lt;ReferenceDataResponse&gt; GetAgenciesByIds (string version, string trustCode, List<int> id, int page = null, int pageSize = null)

Get agencies

Returns an array of agencies

### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using ASW.APIServices.Core.Api;
using ASW.APIServices.Core.Client;
using ASW.APIServices.Core.Model;

namespace Example
{
    public class GetAgenciesByIdsExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://localhost";
            var apiInstance = new ReferenceDataApi(Configuration.Default);
            var version = version_example;  // string | API version
            var trustCode = trustCode_example;  // string | Trust code from BankStaff
            var id = new List<int>(); // List<int> | Array of reference data IDs to return
            var page = 56;  // int | Result page (optional) 
            var pageSize = 56;  // int | Count of records per page (optional) 

            try
            {
                // Get agencies
                List<ReferenceDataResponse> result = apiInstance.GetAgenciesByIds(version, trustCode, id, page, pageSize);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling ReferenceDataApi.GetAgenciesByIds: " + e.Message );
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
 **version** | **string**| API version | 
 **trustCode** | **string**| Trust code from BankStaff | 
 **id** | [**List&lt;int&gt;**](int.md)| Array of reference data IDs to return | 
 **page** | **int**| Result page | [optional] 
 **pageSize** | **int**| Count of records per page | [optional] 

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
| **200** | OK |  * X-Pagination -  <br>  |
| **400** | Bad request errors |  -  |
| **401** | Unauthorized |  -  |
| **404** | Trust not found |  -  |

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetAllAgencies

> List&lt;ReferenceDataResponse&gt; GetAllAgencies (string version, string trustCode, int page = null, int pageSize = null)

Get all agencies

Returns an array of agencies

### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using ASW.APIServices.Core.Api;
using ASW.APIServices.Core.Client;
using ASW.APIServices.Core.Model;

namespace Example
{
    public class GetAllAgenciesExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://localhost";
            var apiInstance = new ReferenceDataApi(Configuration.Default);
            var version = version_example;  // string | API version
            var trustCode = trustCode_example;  // string | Trust code from BankStaff
            var page = 56;  // int | Result page (optional) 
            var pageSize = 56;  // int | Count of records per page (optional) 

            try
            {
                // Get all agencies
                List<ReferenceDataResponse> result = apiInstance.GetAllAgencies(version, trustCode, page, pageSize);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling ReferenceDataApi.GetAllAgencies: " + e.Message );
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
 **version** | **string**| API version | 
 **trustCode** | **string**| Trust code from BankStaff | 
 **page** | **int**| Result page | [optional] 
 **pageSize** | **int**| Count of records per page | [optional] 

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
| **200** | OK |  * X-Pagination -  <br>  |
| **400** | Bad request errors |  -  |
| **401** | Unauthorized |  -  |
| **404** | Trust not found |  -  |

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetAllContractStatuses

> List&lt;ReferenceDataResponse&gt; GetAllContractStatuses (string version, string trustCode, int page = null, int pageSize = null)

Get all contract statuses

Returns an array of contract statuses.

### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using ASW.APIServices.Core.Api;
using ASW.APIServices.Core.Client;
using ASW.APIServices.Core.Model;

namespace Example
{
    public class GetAllContractStatusesExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://localhost";
            var apiInstance = new ReferenceDataApi(Configuration.Default);
            var version = version_example;  // string | API version
            var trustCode = trustCode_example;  // string | Trust code from BankStaff
            var page = 56;  // int | Result page (optional) 
            var pageSize = 56;  // int | Count of records per page (optional) 

            try
            {
                // Get all contract statuses
                List<ReferenceDataResponse> result = apiInstance.GetAllContractStatuses(version, trustCode, page, pageSize);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling ReferenceDataApi.GetAllContractStatuses: " + e.Message );
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
 **version** | **string**| API version | 
 **trustCode** | **string**| Trust code from BankStaff | 
 **page** | **int**| Result page | [optional] 
 **pageSize** | **int**| Count of records per page | [optional] 

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
| **200** | OK |  * X-Pagination -  <br>  |
| **400** | Bad request errors |  -  |
| **401** | Unauthorized |  -  |
| **404** | Trust not found |  -  |

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetAllGrades

> List&lt;ReferenceDataResponse&gt; GetAllGrades (string version, string trustCode, int page = null, int pageSize = null)

Get all grades

Returns an array of grades

### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using ASW.APIServices.Core.Api;
using ASW.APIServices.Core.Client;
using ASW.APIServices.Core.Model;

namespace Example
{
    public class GetAllGradesExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://localhost";
            var apiInstance = new ReferenceDataApi(Configuration.Default);
            var version = version_example;  // string | API version
            var trustCode = trustCode_example;  // string | Trust code from BankStaff
            var page = 56;  // int | Result page (optional) 
            var pageSize = 56;  // int | Count of records per page (optional) 

            try
            {
                // Get all grades
                List<ReferenceDataResponse> result = apiInstance.GetAllGrades(version, trustCode, page, pageSize);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling ReferenceDataApi.GetAllGrades: " + e.Message );
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
 **version** | **string**| API version | 
 **trustCode** | **string**| Trust code from BankStaff | 
 **page** | **int**| Result page | [optional] 
 **pageSize** | **int**| Count of records per page | [optional] 

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
| **200** | OK |  * X-Pagination -  <br>  |
| **400** | Bad request errors |  -  |
| **401** | Unauthorized |  -  |
| **404** | Trust not found |  -  |

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetAllReasonsForVacancy

> List&lt;ReferenceDataResponse&gt; GetAllReasonsForVacancy (string version, string trustCode, int page = null, int pageSize = null)

Get all reasons for vacancy

Returns an array of reasons for vacancy

### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using ASW.APIServices.Core.Api;
using ASW.APIServices.Core.Client;
using ASW.APIServices.Core.Model;

namespace Example
{
    public class GetAllReasonsForVacancyExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://localhost";
            var apiInstance = new ReferenceDataApi(Configuration.Default);
            var version = version_example;  // string | API version
            var trustCode = trustCode_example;  // string | Trust code from BankStaff
            var page = 56;  // int | Result page (optional) 
            var pageSize = 56;  // int | Count of records per page (optional) 

            try
            {
                // Get all reasons for vacancy
                List<ReferenceDataResponse> result = apiInstance.GetAllReasonsForVacancy(version, trustCode, page, pageSize);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling ReferenceDataApi.GetAllReasonsForVacancy: " + e.Message );
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
 **version** | **string**| API version | 
 **trustCode** | **string**| Trust code from BankStaff | 
 **page** | **int**| Result page | [optional] 
 **pageSize** | **int**| Count of records per page | [optional] 

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
| **200** | OK |  * X-Pagination -  <br>  |
| **400** | Bad request errors |  -  |
| **401** | Unauthorized |  -  |
| **404** | Trust not found |  -  |

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetAllStaffGroups

> List&lt;ReferenceDataResponse&gt; GetAllStaffGroups (string version, string trustCode, int page = null, int pageSize = null)

Get all staff groups

Returns an array of staff groups

### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using ASW.APIServices.Core.Api;
using ASW.APIServices.Core.Client;
using ASW.APIServices.Core.Model;

namespace Example
{
    public class GetAllStaffGroupsExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://localhost";
            var apiInstance = new ReferenceDataApi(Configuration.Default);
            var version = version_example;  // string | API version
            var trustCode = trustCode_example;  // string | Trust code from BankStaff
            var page = 56;  // int | Result page (optional) 
            var pageSize = 56;  // int | Count of records per page (optional) 

            try
            {
                // Get all staff groups
                List<ReferenceDataResponse> result = apiInstance.GetAllStaffGroups(version, trustCode, page, pageSize);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling ReferenceDataApi.GetAllStaffGroups: " + e.Message );
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
 **version** | **string**| API version | 
 **trustCode** | **string**| Trust code from BankStaff | 
 **page** | **int**| Result page | [optional] 
 **pageSize** | **int**| Count of records per page | [optional] 

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
| **200** | OK |  * X-Pagination -  <br>  |
| **400** | Bad request errors |  -  |
| **401** | Unauthorized |  -  |
| **404** | Trust not found |  -  |

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetAllUnits

> List&lt;UnitReferenceDataResponse&gt; GetAllUnits (string version, string trustCode, int page = null, int pageSize = null)

Get all units

Returns an array of units

### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using ASW.APIServices.Core.Api;
using ASW.APIServices.Core.Client;
using ASW.APIServices.Core.Model;

namespace Example
{
    public class GetAllUnitsExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://localhost";
            var apiInstance = new ReferenceDataApi(Configuration.Default);
            var version = version_example;  // string | API version
            var trustCode = trustCode_example;  // string | Trust code from BankStaff
            var page = 56;  // int | Result page (optional) 
            var pageSize = 56;  // int | Count of records per page (optional) 

            try
            {
                // Get all units
                List<UnitReferenceDataResponse> result = apiInstance.GetAllUnits(version, trustCode, page, pageSize);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling ReferenceDataApi.GetAllUnits: " + e.Message );
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
 **version** | **string**| API version | 
 **trustCode** | **string**| Trust code from BankStaff | 
 **page** | **int**| Result page | [optional] 
 **pageSize** | **int**| Count of records per page | [optional] 

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
| **200** | OK |  * X-Pagination -  <br>  |
| **400** | Bad request errors |  -  |
| **401** | Unauthorized |  -  |
| **404** | Trust not found |  -  |

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetContractStatusesByIds

> List&lt;ReferenceDataResponse&gt; GetContractStatusesByIds (string version, string trustCode, List<string> id, int page = null, int pageSize = null)

Get contract statuses

Returns an array of contract statuses

### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using ASW.APIServices.Core.Api;
using ASW.APIServices.Core.Client;
using ASW.APIServices.Core.Model;

namespace Example
{
    public class GetContractStatusesByIdsExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://localhost";
            var apiInstance = new ReferenceDataApi(Configuration.Default);
            var version = version_example;  // string | API version
            var trustCode = trustCode_example;  // string | Trust code from BankStaff
            var id = new List<string>(); // List<string> | Array of reference data IDs to return
            var page = 56;  // int | Result page (optional) 
            var pageSize = 56;  // int | Count of records per page (optional) 

            try
            {
                // Get contract statuses
                List<ReferenceDataResponse> result = apiInstance.GetContractStatusesByIds(version, trustCode, id, page, pageSize);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling ReferenceDataApi.GetContractStatusesByIds: " + e.Message );
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
 **version** | **string**| API version | 
 **trustCode** | **string**| Trust code from BankStaff | 
 **id** | [**List&lt;string&gt;**](string.md)| Array of reference data IDs to return | 
 **page** | **int**| Result page | [optional] 
 **pageSize** | **int**| Count of records per page | [optional] 

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
| **200** | OK |  * X-Pagination -  <br>  |
| **400** | Bad request errors |  -  |
| **401** | Unauthorized |  -  |
| **404** | Trust not found |  -  |

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetGradesByIds

> List&lt;ReferenceDataResponse&gt; GetGradesByIds (string version, string trustCode, List<int> id, int page = null, int pageSize = null)

Get grades

Returns an array of grades

### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using ASW.APIServices.Core.Api;
using ASW.APIServices.Core.Client;
using ASW.APIServices.Core.Model;

namespace Example
{
    public class GetGradesByIdsExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://localhost";
            var apiInstance = new ReferenceDataApi(Configuration.Default);
            var version = version_example;  // string | API version
            var trustCode = trustCode_example;  // string | Trust code from BankStaff
            var id = new List<int>(); // List<int> | Array of reference data IDs to return
            var page = 56;  // int | Result page (optional) 
            var pageSize = 56;  // int | Count of records per page (optional) 

            try
            {
                // Get grades
                List<ReferenceDataResponse> result = apiInstance.GetGradesByIds(version, trustCode, id, page, pageSize);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling ReferenceDataApi.GetGradesByIds: " + e.Message );
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
 **version** | **string**| API version | 
 **trustCode** | **string**| Trust code from BankStaff | 
 **id** | [**List&lt;int&gt;**](int.md)| Array of reference data IDs to return | 
 **page** | **int**| Result page | [optional] 
 **pageSize** | **int**| Count of records per page | [optional] 

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
| **200** | OK |  * X-Pagination -  <br>  |
| **400** | Bad request errors |  -  |
| **401** | Unauthorized |  -  |
| **404** | Trust not found |  -  |

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetReasonsForVacancyByIds

> List&lt;ReferenceDataResponse&gt; GetReasonsForVacancyByIds (string version, string trustCode, List<int> id, int page = null, int pageSize = null)

Get reasons for vacancy

Returns an array of reasons for vacancy

### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using ASW.APIServices.Core.Api;
using ASW.APIServices.Core.Client;
using ASW.APIServices.Core.Model;

namespace Example
{
    public class GetReasonsForVacancyByIdsExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://localhost";
            var apiInstance = new ReferenceDataApi(Configuration.Default);
            var version = version_example;  // string | API version
            var trustCode = trustCode_example;  // string | Trust code from BankStaff
            var id = new List<int>(); // List<int> | Array of reference data IDs to return
            var page = 56;  // int | Result page (optional) 
            var pageSize = 56;  // int | Count of records per page (optional) 

            try
            {
                // Get reasons for vacancy
                List<ReferenceDataResponse> result = apiInstance.GetReasonsForVacancyByIds(version, trustCode, id, page, pageSize);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling ReferenceDataApi.GetReasonsForVacancyByIds: " + e.Message );
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
 **version** | **string**| API version | 
 **trustCode** | **string**| Trust code from BankStaff | 
 **id** | [**List&lt;int&gt;**](int.md)| Array of reference data IDs to return | 
 **page** | **int**| Result page | [optional] 
 **pageSize** | **int**| Count of records per page | [optional] 

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
| **200** | OK |  * X-Pagination -  <br>  |
| **400** | Bad request errors |  -  |
| **401** | Unauthorized |  -  |
| **404** | Trust not found |  -  |

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetStaffGroupsByIds

> List&lt;ReferenceDataResponse&gt; GetStaffGroupsByIds (string version, string trustCode, List<int> id, int page = null, int pageSize = null)

Get staff groups

Returns an array of staff groups

### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using ASW.APIServices.Core.Api;
using ASW.APIServices.Core.Client;
using ASW.APIServices.Core.Model;

namespace Example
{
    public class GetStaffGroupsByIdsExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://localhost";
            var apiInstance = new ReferenceDataApi(Configuration.Default);
            var version = version_example;  // string | API version
            var trustCode = trustCode_example;  // string | Trust code from BankStaff
            var id = new List<int>(); // List<int> | Array of reference data IDs to return
            var page = 56;  // int | Result page (optional) 
            var pageSize = 56;  // int | Count of records per page (optional) 

            try
            {
                // Get staff groups
                List<ReferenceDataResponse> result = apiInstance.GetStaffGroupsByIds(version, trustCode, id, page, pageSize);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling ReferenceDataApi.GetStaffGroupsByIds: " + e.Message );
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
 **version** | **string**| API version | 
 **trustCode** | **string**| Trust code from BankStaff | 
 **id** | [**List&lt;int&gt;**](int.md)| Array of reference data IDs to return | 
 **page** | **int**| Result page | [optional] 
 **pageSize** | **int**| Count of records per page | [optional] 

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
| **200** | OK |  * X-Pagination -  <br>  |
| **400** | Bad request errors |  -  |
| **401** | Unauthorized |  -  |
| **404** | Trust not found |  -  |

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetUnitsByIds

> List&lt;UnitReferenceDataResponse&gt; GetUnitsByIds (string version, string trustCode, List<int> id, int page = null, int pageSize = null)

Get units

Returns an array of units

### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using ASW.APIServices.Core.Api;
using ASW.APIServices.Core.Client;
using ASW.APIServices.Core.Model;

namespace Example
{
    public class GetUnitsByIdsExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://localhost";
            var apiInstance = new ReferenceDataApi(Configuration.Default);
            var version = version_example;  // string | API version
            var trustCode = trustCode_example;  // string | Trust code from BankStaff
            var id = new List<int>(); // List<int> | Array of reference data IDs to return
            var page = 56;  // int | Result page (optional) 
            var pageSize = 56;  // int | Count of records per page (optional) 

            try
            {
                // Get units
                List<UnitReferenceDataResponse> result = apiInstance.GetUnitsByIds(version, trustCode, id, page, pageSize);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling ReferenceDataApi.GetUnitsByIds: " + e.Message );
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
 **version** | **string**| API version | 
 **trustCode** | **string**| Trust code from BankStaff | 
 **id** | [**List&lt;int&gt;**](int.md)| Array of reference data IDs to return | 
 **page** | **int**| Result page | [optional] 
 **pageSize** | **int**| Count of records per page | [optional] 

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
| **200** | OK |  * X-Pagination -  <br>  |
| **400** | Bad request errors |  -  |
| **401** | Unauthorized |  -  |
| **404** | Trust not found |  -  |

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

