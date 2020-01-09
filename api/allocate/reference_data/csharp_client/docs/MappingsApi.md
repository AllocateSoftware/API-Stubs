# ASW.APIServices.Core.Api.MappingsApi

All URIs are relative to *http://healthsuite.allocatesoftware.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateMapping**](MappingsApi.md#createmapping) | **POST** /mappingSets/{setId}/mappings | 
[**DeleteMapping**](MappingsApi.md#deletemapping) | **DELETE** /mappingSets/{id}/mappings/{mappingId} | 
[**GetMapping**](MappingsApi.md#getmapping) | **GET** /mappingSets/{id}/mappings/{mappingId} | 
[**GetMappingSetById**](MappingsApi.md#getmappingsetbyid) | **GET** /mappingSets/{setId} | 
[**GetMappingSets**](MappingsApi.md#getmappingsets) | **GET** /mappingSets | 
[**GetMappings**](MappingsApi.md#getmappings) | **GET** /mappingSets/{setId}/mappings | 
[**PutMapping**](MappingsApi.md#putmapping) | **PUT** /mappingSets/{id}/mappings/{mappingId} | 



## CreateMapping

> string CreateMapping (string setId, Mapping mapping)



Create a new entry in a mapping set

### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using ASW.APIServices.Core.Api;
using ASW.APIServices.Core.Client;
using ASW.APIServices.Core.Model;

namespace Example
{
    public class CreateMappingExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://healthsuite.allocatesoftware.com/api/v1";
            // Configure HTTP basic authorization: jwt
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new MappingsApi(Configuration.Default);
            var setId = EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440;  // string | The ID of the mapping set
            var mapping = new Mapping(); // Mapping | Details of the mapping

            try
            {
                string result = apiInstance.CreateMapping(setId, mapping);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling MappingsApi.CreateMapping: " + e.Message );
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
 **setId** | **string**| The ID of the mapping set | 
 **mapping** | [**Mapping**](Mapping.md)| Details of the mapping | 

### Return type

**string**

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully created |  -  |

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## DeleteMapping

> void DeleteMapping (string id, string mappingId)



Delete a vocabulary entry

### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using ASW.APIServices.Core.Api;
using ASW.APIServices.Core.Client;
using ASW.APIServices.Core.Model;

namespace Example
{
    public class DeleteMappingExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://healthsuite.allocatesoftware.com/api/v1";
            // Configure HTTP basic authorization: jwt
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new MappingsApi(Configuration.Default);
            var id = EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440;  // string | The ID of the vocabulary
            var mappingId = EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440;  // string | The ID of the mapping

            try
            {
                apiInstance.DeleteMapping(id, mappingId);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling MappingsApi.DeleteMapping: " + e.Message );
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
 **id** | **string**| The ID of the vocabulary | 
 **mappingId** | **string**| The ID of the mapping | 

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
| **200** | Updated successfully |  -  |

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetMapping

> Mapping GetMapping (string id, string mappingId)



Return the mapping

### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using ASW.APIServices.Core.Api;
using ASW.APIServices.Core.Client;
using ASW.APIServices.Core.Model;

namespace Example
{
    public class GetMappingExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://healthsuite.allocatesoftware.com/api/v1";
            // Configure HTTP basic authorization: jwt
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new MappingsApi(Configuration.Default);
            var id = EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440;  // string | The ID of the mapping set
            var mappingId = EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440;  // string | The ID of the mapping set element

            try
            {
                Mapping result = apiInstance.GetMapping(id, mappingId);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling MappingsApi.GetMapping: " + e.Message );
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
 **id** | **string**| The ID of the mapping set | 
 **mappingId** | **string**| The ID of the mapping set element | 

### Return type

[**Mapping**](Mapping.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returning a list of vocabularies |  -  |

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetMappingSetById

> MappingSet GetMappingSetById (string setId)



Get a mapping set by ID

### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using ASW.APIServices.Core.Api;
using ASW.APIServices.Core.Client;
using ASW.APIServices.Core.Model;

namespace Example
{
    public class GetMappingSetByIdExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://healthsuite.allocatesoftware.com/api/v1";
            // Configure HTTP basic authorization: jwt
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new MappingsApi(Configuration.Default);
            var setId = EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440;  // string | The ID of the vocabulary type

            try
            {
                MappingSet result = apiInstance.GetMappingSetById(setId);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling MappingsApi.GetMappingSetById: " + e.Message );
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
 **setId** | **string**| The ID of the vocabulary type | 

### Return type

[**MappingSet**](MappingSet.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returning a list of mapping sets |  -  |

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetMappingSets

> List&lt;MappingSet&gt; GetMappingSets ()



Return a list of mapping sets that you may utilise

### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using ASW.APIServices.Core.Api;
using ASW.APIServices.Core.Client;
using ASW.APIServices.Core.Model;

namespace Example
{
    public class GetMappingSetsExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://healthsuite.allocatesoftware.com/api/v1";
            // Configure HTTP basic authorization: jwt
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new MappingsApi(Configuration.Default);

            try
            {
                List<MappingSet> result = apiInstance.GetMappingSets();
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling MappingsApi.GetMappingSets: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**List&lt;MappingSet&gt;**](MappingSet.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returning a list of mapping sets |  -  |

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetMappings

> List&lt;Mapping&gt; GetMappings (string setId, string fromCode = null)



Return the elements of a mapping set

### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using ASW.APIServices.Core.Api;
using ASW.APIServices.Core.Client;
using ASW.APIServices.Core.Model;

namespace Example
{
    public class GetMappingsExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://healthsuite.allocatesoftware.com/api/v1";
            // Configure HTTP basic authorization: jwt
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new MappingsApi(Configuration.Default);
            var setId = EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440;  // string | The ID of the mapping set
            var fromCode = Band 4;  // string | Search for a mapping where the from code matches the provided string (optional) 

            try
            {
                List<Mapping> result = apiInstance.GetMappings(setId, fromCode);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling MappingsApi.GetMappings: " + e.Message );
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
 **setId** | **string**| The ID of the mapping set | 
 **fromCode** | **string**| Search for a mapping where the from code matches the provided string | [optional] 

### Return type

[**List&lt;Mapping&gt;**](Mapping.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returning a list of mapping set entries |  -  |

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## PutMapping

> void PutMapping (string id, string mappingId, Mapping mapping)



Update a mapping

### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using ASW.APIServices.Core.Api;
using ASW.APIServices.Core.Client;
using ASW.APIServices.Core.Model;

namespace Example
{
    public class PutMappingExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://healthsuite.allocatesoftware.com/api/v1";
            // Configure HTTP basic authorization: jwt
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new MappingsApi(Configuration.Default);
            var id = EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440;  // string | The ID of the vocabulary
            var mappingId = EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440;  // string | The ID of the vocabulary element
            var mapping = new Mapping(); // Mapping | Details of the mapping

            try
            {
                apiInstance.PutMapping(id, mappingId, mapping);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling MappingsApi.PutMapping: " + e.Message );
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
 **id** | **string**| The ID of the vocabulary | 
 **mappingId** | **string**| The ID of the vocabulary element | 
 **mapping** | [**Mapping**](Mapping.md)| Details of the mapping | 

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
| **200** | Updated successfully |  -  |

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

