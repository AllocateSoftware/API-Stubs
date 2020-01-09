# ASW.APIServices.Core.Api.ReferenceDataApi

All URIs are relative to *http://healthsuite.allocatesoftware.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateVocabularyEntry**](ReferenceDataApi.md#createvocabularyentry) | **POST** /vocabularies/{id}/entries | 
[**DeleteVocabularyEntry**](ReferenceDataApi.md#deletevocabularyentry) | **DELETE** /vocabularies/{id}/entries/{elementId} | 
[**GetVocabularies**](ReferenceDataApi.md#getvocabularies) | **GET** /vocabularies | 
[**GetVocabulary**](ReferenceDataApi.md#getvocabulary) | **GET** /vocabularies/{id} | 
[**GetVocabularyElement**](ReferenceDataApi.md#getvocabularyelement) | **GET** /vocabularies/{id}/entries/{elementId} | 
[**GetVocabularyEntries**](ReferenceDataApi.md#getvocabularyentries) | **GET** /vocabularies/{id}/entries | 
[**GetVocabularyTypeById**](ReferenceDataApi.md#getvocabularytypebyid) | **GET** /vocabularyTypes/{id} | 
[**GetVocabularyTypes**](ReferenceDataApi.md#getvocabularytypes) | **GET** /vocabularyTypes | 
[**PutVocabularyEntry**](ReferenceDataApi.md#putvocabularyentry) | **PUT** /vocabularies/{id}/entries/{elementId} | 


<a name="createvocabularyentry"></a>
# **CreateVocabularyEntry**
> string CreateVocabularyEntry (string id, VocabularyEntry vocabularyEntry)



Create a new entry in a vocabulary

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using ASW.APIServices.Core.Api;
using ASW.APIServices.Core.Client;
using ASW.APIServices.Core.Model;

namespace Example
{
    public class CreateVocabularyEntryExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://healthsuite.allocatesoftware.com/api/v1";
            // Configure HTTP basic authorization: jwt
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new ReferenceDataApi(Configuration.Default);
            var id = EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440;  // string | The ID of the vocabulary
            var vocabularyEntry = new VocabularyEntry(); // VocabularyEntry | Details of the vocabulary entry

            try
            {
                string result = apiInstance.CreateVocabularyEntry(id, vocabularyEntry);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ReferenceDataApi.CreateVocabularyEntry: " + e.Message );
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
 **vocabularyEntry** | [**VocabularyEntry**](VocabularyEntry.md)| Details of the vocabulary entry | 

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
| **200** | Returning a list of vocabularies |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="deletevocabularyentry"></a>
# **DeleteVocabularyEntry**
> void DeleteVocabularyEntry (string id, string elementId)



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
    public class DeleteVocabularyEntryExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://healthsuite.allocatesoftware.com/api/v1";
            // Configure HTTP basic authorization: jwt
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new ReferenceDataApi(Configuration.Default);
            var id = EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440;  // string | The ID of the vocabulary
            var elementId = EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440;  // string | The ID of the vocabulary element

            try
            {
                apiInstance.DeleteVocabularyEntry(id, elementId);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ReferenceDataApi.DeleteVocabularyEntry: " + e.Message );
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
 **elementId** | **string**| The ID of the vocabulary element | 

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getvocabularies"></a>
# **GetVocabularies**
> List&lt;Vocabulary&gt; GetVocabularies (string vocabularyTypeId = null, string page = null, string pageSize = null)



Return a list of vocabularies types that you may query

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using ASW.APIServices.Core.Api;
using ASW.APIServices.Core.Client;
using ASW.APIServices.Core.Model;

namespace Example
{
    public class GetVocabulariesExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://healthsuite.allocatesoftware.com/api/v1";
            // Configure HTTP basic authorization: jwt
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new ReferenceDataApi(Configuration.Default);
            var vocabularyTypeId = 4A4C8447-F66E-464F-BBB1-2DEE4971CF28;  // string | Limit to vocabulary types (optional) 
            var page = page_example;  // string | Return page of results (optional) 
            var pageSize = pageSize_example;  // string | Records per page (optional) 

            try
            {
                List<Vocabulary> result = apiInstance.GetVocabularies(vocabularyTypeId, page, pageSize);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ReferenceDataApi.GetVocabularies: " + e.Message );
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
 **vocabularyTypeId** | **string**| Limit to vocabulary types | [optional] 
 **page** | **string**| Return page of results | [optional] 
 **pageSize** | **string**| Records per page | [optional] 

### Return type

[**List&lt;Vocabulary&gt;**](Vocabulary.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returning a list of vocabularies |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getvocabulary"></a>
# **GetVocabulary**
> Vocabulary GetVocabulary (string id)



Return a list of vocabularies that you may query

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using ASW.APIServices.Core.Api;
using ASW.APIServices.Core.Client;
using ASW.APIServices.Core.Model;

namespace Example
{
    public class GetVocabularyExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://healthsuite.allocatesoftware.com/api/v1";
            // Configure HTTP basic authorization: jwt
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new ReferenceDataApi(Configuration.Default);
            var id = EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440;  // string | The ID of the vocabulary

            try
            {
                Vocabulary result = apiInstance.GetVocabulary(id);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ReferenceDataApi.GetVocabulary: " + e.Message );
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

### Return type

[**Vocabulary**](Vocabulary.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returning a vocabulary |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getvocabularyelement"></a>
# **GetVocabularyElement**
> VocabularyEntry GetVocabularyElement (string id, string elementId)



Return the elements of a vocabulary

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using ASW.APIServices.Core.Api;
using ASW.APIServices.Core.Client;
using ASW.APIServices.Core.Model;

namespace Example
{
    public class GetVocabularyElementExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://healthsuite.allocatesoftware.com/api/v1";
            // Configure HTTP basic authorization: jwt
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new ReferenceDataApi(Configuration.Default);
            var id = EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440;  // string | The ID of the vocabulary
            var elementId = EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440;  // string | The ID of the vocabulary element

            try
            {
                VocabularyEntry result = apiInstance.GetVocabularyElement(id, elementId);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ReferenceDataApi.GetVocabularyElement: " + e.Message );
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
 **elementId** | **string**| The ID of the vocabulary element | 

### Return type

[**VocabularyEntry**](VocabularyEntry.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returning a list of vocabularies |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getvocabularyentries"></a>
# **GetVocabularyEntries**
> List&lt;VocabularyEntry&gt; GetVocabularyEntries (string id)



Return the elements of a vocabulary

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using ASW.APIServices.Core.Api;
using ASW.APIServices.Core.Client;
using ASW.APIServices.Core.Model;

namespace Example
{
    public class GetVocabularyEntriesExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://healthsuite.allocatesoftware.com/api/v1";
            // Configure HTTP basic authorization: jwt
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new ReferenceDataApi(Configuration.Default);
            var id = EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440;  // string | The ID of the vocabulary

            try
            {
                List<VocabularyEntry> result = apiInstance.GetVocabularyEntries(id);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ReferenceDataApi.GetVocabularyEntries: " + e.Message );
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

### Return type

[**List&lt;VocabularyEntry&gt;**](VocabularyEntry.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returning a list of vocabularies |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getvocabularytypebyid"></a>
# **GetVocabularyTypeById**
> VocabularyType GetVocabularyTypeById (string id)



Return a vocabulary type

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using ASW.APIServices.Core.Api;
using ASW.APIServices.Core.Client;
using ASW.APIServices.Core.Model;

namespace Example
{
    public class GetVocabularyTypeByIdExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://healthsuite.allocatesoftware.com/api/v1";
            // Configure HTTP basic authorization: jwt
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new ReferenceDataApi(Configuration.Default);
            var id = EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440;  // string | The ID of the vocabulary type

            try
            {
                VocabularyType result = apiInstance.GetVocabularyTypeById(id);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ReferenceDataApi.GetVocabularyTypeById: " + e.Message );
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
 **id** | **string**| The ID of the vocabulary type | 

### Return type

[**VocabularyType**](VocabularyType.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returning a vocabulary type |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getvocabularytypes"></a>
# **GetVocabularyTypes**
> List&lt;VocabularyType&gt; GetVocabularyTypes ()



Return a list of vocabularies types that you may query

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using ASW.APIServices.Core.Api;
using ASW.APIServices.Core.Client;
using ASW.APIServices.Core.Model;

namespace Example
{
    public class GetVocabularyTypesExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://healthsuite.allocatesoftware.com/api/v1";
            // Configure HTTP basic authorization: jwt
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new ReferenceDataApi(Configuration.Default);

            try
            {
                List<VocabularyType> result = apiInstance.GetVocabularyTypes();
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ReferenceDataApi.GetVocabularyTypes: " + e.Message );
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

[**List&lt;VocabularyType&gt;**](VocabularyType.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returning a list of vocabulary types |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="putvocabularyentry"></a>
# **PutVocabularyEntry**
> void PutVocabularyEntry (string id, string elementId, VocabularyEntry vocabularyEntry)



Create a new entry in a vocabulary

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using ASW.APIServices.Core.Api;
using ASW.APIServices.Core.Client;
using ASW.APIServices.Core.Model;

namespace Example
{
    public class PutVocabularyEntryExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "http://healthsuite.allocatesoftware.com/api/v1";
            // Configure HTTP basic authorization: jwt
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";

            var apiInstance = new ReferenceDataApi(Configuration.Default);
            var id = EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440;  // string | The ID of the vocabulary
            var elementId = EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440;  // string | The ID of the vocabulary element
            var vocabularyEntry = new VocabularyEntry(); // VocabularyEntry | Details of the vocabulary entry

            try
            {
                apiInstance.PutVocabularyEntry(id, elementId, vocabularyEntry);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling ReferenceDataApi.PutVocabularyEntry: " + e.Message );
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
 **elementId** | **string**| The ID of the vocabulary element | 
 **vocabularyEntry** | [**VocabularyEntry**](VocabularyEntry.md)| Details of the vocabulary entry | 

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

