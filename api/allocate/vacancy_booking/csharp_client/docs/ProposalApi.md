# ASW.APIServices.Core.Api.ProposalApi

All URIs are relative to *http://healthsuite.allocatesoftware.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AcceptProposal**](ProposalApi.md#acceptproposal) | **POST** /proposals/{id}/accept | 
[**CancelProposal**](ProposalApi.md#cancelproposal) | **DELETE** /proposals/{id} | 
[**GetProposal**](ProposalApi.md#getproposal) | **GET** /proposals/{id} | 
[**UpdateProposal**](ProposalApi.md#updateproposal) | **PUT** /proposals/{id} | 



## AcceptProposal

> void AcceptProposal (string id)



Accept the proposal (possibly on behalf of the trust). Note that it is not neccessary to call this API in the case of direct-book scenarios as it will be assumed as a part of the workflow.

### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using ASW.APIServices.Core.Api;
using ASW.APIServices.Core.Client;
using ASW.APIServices.Core.Model;

namespace Example
{
    public class AcceptProposalExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://healthsuite.allocatesoftware.com/api/v1";
            // Configure HTTP basic authorization: jwt
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new ProposalApi(Configuration.Default);
            var id = 2CBC7FF9-38FB-4F0A-835A-324D9CF4800C;  // string | The ID of the proposal

            try
            {
                apiInstance.AcceptProposal(id);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling ProposalApi.AcceptProposal: " + e.Message );
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
 **id** | **string**| The ID of the proposal | 

### Return type

void (empty response body)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | The proposal was not found |  -  |
| **200** | Proposal successfully accepted |  -  |

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


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
            Configuration.Default.BasePath = "http://healthsuite.allocatesoftware.com/api/v1";
            // Configure HTTP basic authorization: jwt
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new ProposalApi(Configuration.Default);
            var id = 2CBC7FF9-38FB-4F0A-835A-324D9CF4800C;  // string | The ID of the proposal

            try
            {
                apiInstance.CancelProposal(id);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling ProposalApi.CancelProposal: " + e.Message );
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
 **id** | **string**| The ID of the proposal | 

### Return type

void (empty response body)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | The proposal was not found |  -  |
| **200** | Cancelled successfully |  -  |
| **202** | The request was accepted and will be processed asynchronously |  -  |

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetProposal

> ProposalDetails GetProposal (string id)



### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using ASW.APIServices.Core.Api;
using ASW.APIServices.Core.Client;
using ASW.APIServices.Core.Model;

namespace Example
{
    public class GetProposalExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://healthsuite.allocatesoftware.com/api/v1";
            // Configure HTTP basic authorization: jwt
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new ProposalApi(Configuration.Default);
            var id = 2CBC7FF9-38FB-4F0A-835A-324D9CF4800C;  // string | The ID of the proposal

            try
            {
                ProposalDetails result = apiInstance.GetProposal(id);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling ProposalApi.GetProposal: " + e.Message );
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
 **id** | **string**| The ID of the proposal | 

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
| **404** | The proposal was not found |  -  |
| **200** | Proposal successfully found |  -  |

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
            Configuration.Default.BasePath = "http://healthsuite.allocatesoftware.com/api/v1";
            // Configure HTTP basic authorization: jwt
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new ProposalApi(Configuration.Default);
            var id = 2CBC7FF9-38FB-4F0A-835A-324D9CF4800C;  // string | The ID of the proposal
            var proposalDetails = new ProposalDetails(); // ProposalDetails | Details of the proposal for filling the duty (worker)

            try
            {
                apiInstance.UpdateProposal(id, proposalDetails);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling ProposalApi.UpdateProposal: " + e.Message );
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
 **id** | **string**| The ID of the proposal | 
 **proposalDetails** | [**ProposalDetails**](ProposalDetails.md)| Details of the proposal for filling the duty (worker) | 

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
| **404** | The proposal was not found |  -  |
| **200** | The Proposal successfully updated |  -  |

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

