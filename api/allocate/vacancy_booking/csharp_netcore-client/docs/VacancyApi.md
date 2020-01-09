# ASW.APIServices.Core.Api.VacancyApi

All URIs are relative to *http://healthsuite.allocatesoftware.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateProposal**](VacancyApi.md#createproposal) | **POST** /vacancies/{vacancyId}/proposals | 
[**CreateVacancy**](VacancyApi.md#createvacancy) | **POST** /vacancies | 
[**SubmitTimesheet**](VacancyApi.md#submittimesheet) | **POST** /vacancies/{vacancyId}/timesheet | 


<a name="createproposal"></a>
# **CreateProposal**
> CreateProposalResponse CreateProposal (string vacancyId, ProposalDetails proposalDetails)



Offer a worker for filling a duty

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using ASW.APIServices.Core.Api;
using ASW.APIServices.Core.Client;
using ASW.APIServices.Core.Model;

namespace Example
{
    public class CreateProposalExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://healthsuite.allocatesoftware.com/api/v1";
            // Configure HTTP basic authorization: jwt
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new VacancyApi(Configuration.Default);
            var vacancyId = 33C33192-7B8D-4EE0-AD41-47AACF240A29;  // string | The ID of the vacancy
            var proposalDetails = new ProposalDetails(); // ProposalDetails | Details of the proposal for filling the vacancy (worker, costs, etc)

            try
            {
                CreateProposalResponse result = apiInstance.CreateProposal(vacancyId, proposalDetails);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling VacancyApi.CreateProposal: " + e.Message );
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
 **vacancyId** | **string**| The ID of the vacancy | 
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
| **200** | Proposal created successfully |  -  |
| **202** | The proposal has been accepted and a response will be returned asyncronously. |  -  |
| **400** | One or more errors have occurred when attempting to process the provided data |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="createvacancy"></a>
# **CreateVacancy**
> CreateVacancyResponse CreateVacancy (Vacancy vacancy)



Create a new vacancy

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using ASW.APIServices.Core.Api;
using ASW.APIServices.Core.Client;
using ASW.APIServices.Core.Model;

namespace Example
{
    public class CreateVacancyExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://healthsuite.allocatesoftware.com/api/v1";
            // Configure HTTP basic authorization: jwt
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new VacancyApi(Configuration.Default);
            var vacancy = new Vacancy(); // Vacancy | Details of the vacancy

            try
            {
                CreateVacancyResponse result = apiInstance.CreateVacancy(vacancy);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling VacancyApi.CreateVacancy: " + e.Message );
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
| **403** | Forbidden - you do not have the necessary permissions to undertake this action |  -  |
| **200** | Vacancy created successfully |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="submittimesheet"></a>
# **SubmitTimesheet**
> void SubmitTimesheet (string vacancyId, InlineObject inlineObject)



Send timesheet information for a completed activity

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using ASW.APIServices.Core.Api;
using ASW.APIServices.Core.Client;
using ASW.APIServices.Core.Model;

namespace Example
{
    public class SubmitTimesheetExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://healthsuite.allocatesoftware.com/api/v1";
            // Configure HTTP basic authorization: jwt
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new VacancyApi(Configuration.Default);
            var vacancyId = 33C33192-7B8D-4EE0-AD41-47AACF240A29;  // string | The ID of the vacancy
            var inlineObject = new InlineObject(); // InlineObject | 

            try
            {
                apiInstance.SubmitTimesheet(vacancyId, inlineObject);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling VacancyApi.SubmitTimesheet: " + e.Message );
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
 **vacancyId** | **string**| The ID of the vacancy | 
 **inlineObject** | [**InlineObject**](InlineObject.md)|  | 

### Return type

void (empty response body)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Timesheet successfully submitted |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

