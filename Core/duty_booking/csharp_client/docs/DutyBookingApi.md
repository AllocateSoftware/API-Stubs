# ASW.APIServices.Core.Api.DutyBookingApi

All URIs are relative to *http://healthsuite.allocatesoftware.com/api/booking/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CancelProposal**](DutyBookingApi.md#cancelproposal) | **DELETE** /proposals/{id} | 
[**CreateProposal**](DutyBookingApi.md#createproposal) | **POST** /vacancy/{vacancyId}/proposals | 
[**UpdateProposal**](DutyBookingApi.md#updateproposal) | **PUT** /proposals/{id} | 



## CancelProposal

> void CancelProposal (string id)



Cancel the proposal (and the booking, if it has been accepted)

### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using ASW.APIServices.Core.Api;
using ASW.APIServices.Core.Client;
using ASW.APIServices.Core.Model;

namespace Example
{
    public class CancelProposalExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://healthsuite.allocatesoftware.com/api/booking/v1";
            var apiInstance = new DutyBookingApi(Configuration.Default);
            var id = id_example;  // string | ID of the proposal

            try
            {
                apiInstance.CancelProposal(id);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling DutyBookingApi.CancelProposal: " + e.Message );
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
 **id** | **string**| ID of the proposal | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Cancelled successfully |  -  |
| **404** | The proposal was not found |  -  |
| **202** | The request was accepted and will be processed asynchronously |  -  |

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CreateProposal

> string CreateProposal (string vacancyId, ProposalDetails proposalDetails)



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
            Configuration.Default.BasePath = "http://healthsuite.allocatesoftware.com/api/booking/v1";
            var apiInstance = new DutyBookingApi(Configuration.Default);
            var vacancyId = vacancyId_example;  // string | The ID of the vacancy
            var proposalDetails = new ProposalDetails(); // ProposalDetails | Details of the proposal for filling the duty (worker)

            try
            {
                string result = apiInstance.CreateProposal(vacancyId, proposalDetails);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling DutyBookingApi.CreateProposal: " + e.Message );
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
 **proposalDetails** | [**ProposalDetails**](ProposalDetails.md)| Details of the proposal for filling the duty (worker) | 

### Return type

**string**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: text/plain, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Proposal created successfully |  -  |
| **202** | The proposal has been accepted and a response will be returned asyncronously. |  -  |

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## UpdateProposal

> void UpdateProposal (string id, ProposalDetails proposalDetails)



### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using ASW.APIServices.Core.Api;
using ASW.APIServices.Core.Client;
using ASW.APIServices.Core.Model;

namespace Example
{
    public class UpdateProposalExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://healthsuite.allocatesoftware.com/api/booking/v1";
            var apiInstance = new DutyBookingApi(Configuration.Default);
            var id = id_example;  // string | ID of the proposal
            var proposalDetails = new ProposalDetails(); // ProposalDetails | Details of the proposal for filling the duty (worker)

            try
            {
                apiInstance.UpdateProposal(id, proposalDetails);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling DutyBookingApi.UpdateProposal: " + e.Message );
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
 **id** | **string**| ID of the proposal | 
 **proposalDetails** | [**ProposalDetails**](ProposalDetails.md)| Details of the proposal for filling the duty (worker) | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Duty costing successfully |  -  |
| **404** | The proposal was not found |  -  |
| **202** | The request was accepted and will be processed asynchronously |  -  |

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

