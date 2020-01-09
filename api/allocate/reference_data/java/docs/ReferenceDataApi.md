# ReferenceDataApi

All URIs are relative to *http://healthsuite.allocatesoftware.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createVocabularyEntry**](ReferenceDataApi.md#createVocabularyEntry) | **POST** /vocabularies/{id}/entries | 
[**deleteVocabularyEntry**](ReferenceDataApi.md#deleteVocabularyEntry) | **DELETE** /vocabularies/{id}/entries/{elementId} | 
[**getVocabularies**](ReferenceDataApi.md#getVocabularies) | **GET** /vocabularies | 
[**getVocabulary**](ReferenceDataApi.md#getVocabulary) | **GET** /vocabularies/{id} | 
[**getVocabularyElement**](ReferenceDataApi.md#getVocabularyElement) | **GET** /vocabularies/{id}/entries/{elementId} | 
[**getVocabularyEntries**](ReferenceDataApi.md#getVocabularyEntries) | **GET** /vocabularies/{id}/entries | 
[**getVocabularyTypeById**](ReferenceDataApi.md#getVocabularyTypeById) | **GET** /vocabularyTypes/{id} | 
[**getVocabularyTypes**](ReferenceDataApi.md#getVocabularyTypes) | **GET** /vocabularyTypes | 
[**putVocabularyEntry**](ReferenceDataApi.md#putVocabularyEntry) | **PUT** /vocabularies/{id}/entries/{elementId} | 


<a name="createVocabularyEntry"></a>
# **createVocabularyEntry**
> String createVocabularyEntry(id, vocabularyEntry)



Create a new entry in a vocabulary

### Example
```java
// Import classes:
import com.allocate.openapi.ApiClient;
import com.allocate.openapi.ApiException;
import com.allocate.openapi.Configuration;
import com.allocate.openapi.auth.*;
import com.allocate.openapi.models.*;
import com.allocate.openapi.api.ReferenceDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://healthsuite.allocatesoftware.com/api/v1");
    
    // Configure HTTP bearer authorization: jwt
    HttpBearerAuth jwt = (HttpBearerAuth) defaultClient.getAuthentication("jwt");
    jwt.setBearerToken("BEARER TOKEN");

    ReferenceDataApi apiInstance = new ReferenceDataApi(defaultClient);
    String id = EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440; // String | The ID of the vocabulary
    VocabularyEntry vocabularyEntry = new VocabularyEntry(); // VocabularyEntry | Details of the vocabulary entry
    try {
      String result = apiInstance.createVocabularyEntry(id, vocabularyEntry);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReferenceDataApi#createVocabularyEntry");
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
 **id** | **String**| The ID of the vocabulary |
 **vocabularyEntry** | [**VocabularyEntry**](VocabularyEntry.md)| Details of the vocabulary entry |

### Return type

**String**

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Returning a list of vocabularies |  -  |

<a name="deleteVocabularyEntry"></a>
# **deleteVocabularyEntry**
> deleteVocabularyEntry(id, elementId)



Delete a vocabulary entry

### Example
```java
// Import classes:
import com.allocate.openapi.ApiClient;
import com.allocate.openapi.ApiException;
import com.allocate.openapi.Configuration;
import com.allocate.openapi.auth.*;
import com.allocate.openapi.models.*;
import com.allocate.openapi.api.ReferenceDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://healthsuite.allocatesoftware.com/api/v1");
    
    // Configure HTTP bearer authorization: jwt
    HttpBearerAuth jwt = (HttpBearerAuth) defaultClient.getAuthentication("jwt");
    jwt.setBearerToken("BEARER TOKEN");

    ReferenceDataApi apiInstance = new ReferenceDataApi(defaultClient);
    String id = EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440; // String | The ID of the vocabulary
    String elementId = EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440; // String | The ID of the vocabulary element
    try {
      apiInstance.deleteVocabularyEntry(id, elementId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReferenceDataApi#deleteVocabularyEntry");
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
 **id** | **String**| The ID of the vocabulary |
 **elementId** | **String**| The ID of the vocabulary element |

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
**200** | Updated successfully |  -  |

<a name="getVocabularies"></a>
# **getVocabularies**
> List&lt;Vocabulary&gt; getVocabularies(vocabularyTypeId, page, pageSize)



Return a list of vocabularies types that you may query

### Example
```java
// Import classes:
import com.allocate.openapi.ApiClient;
import com.allocate.openapi.ApiException;
import com.allocate.openapi.Configuration;
import com.allocate.openapi.auth.*;
import com.allocate.openapi.models.*;
import com.allocate.openapi.api.ReferenceDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://healthsuite.allocatesoftware.com/api/v1");
    
    // Configure HTTP bearer authorization: jwt
    HttpBearerAuth jwt = (HttpBearerAuth) defaultClient.getAuthentication("jwt");
    jwt.setBearerToken("BEARER TOKEN");

    ReferenceDataApi apiInstance = new ReferenceDataApi(defaultClient);
    String vocabularyTypeId = 4A4C8447-F66E-464F-BBB1-2DEE4971CF28; // String | Limit to vocabulary types
    String page = "page_example"; // String | Return page of results
    String pageSize = "pageSize_example"; // String | Records per page
    try {
      List<Vocabulary> result = apiInstance.getVocabularies(vocabularyTypeId, page, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReferenceDataApi#getVocabularies");
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
 **vocabularyTypeId** | **String**| Limit to vocabulary types | [optional]
 **page** | **String**| Return page of results | [optional]
 **pageSize** | **String**| Records per page | [optional]

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
**200** | Returning a list of vocabularies |  -  |

<a name="getVocabulary"></a>
# **getVocabulary**
> Vocabulary getVocabulary(id)



Return a list of vocabularies that you may query

### Example
```java
// Import classes:
import com.allocate.openapi.ApiClient;
import com.allocate.openapi.ApiException;
import com.allocate.openapi.Configuration;
import com.allocate.openapi.auth.*;
import com.allocate.openapi.models.*;
import com.allocate.openapi.api.ReferenceDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://healthsuite.allocatesoftware.com/api/v1");
    
    // Configure HTTP bearer authorization: jwt
    HttpBearerAuth jwt = (HttpBearerAuth) defaultClient.getAuthentication("jwt");
    jwt.setBearerToken("BEARER TOKEN");

    ReferenceDataApi apiInstance = new ReferenceDataApi(defaultClient);
    String id = EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440; // String | The ID of the vocabulary
    try {
      Vocabulary result = apiInstance.getVocabulary(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReferenceDataApi#getVocabulary");
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
 **id** | **String**| The ID of the vocabulary |

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
**200** | Returning a vocabulary |  -  |

<a name="getVocabularyElement"></a>
# **getVocabularyElement**
> VocabularyEntry getVocabularyElement(id, elementId)



Return the elements of a vocabulary

### Example
```java
// Import classes:
import com.allocate.openapi.ApiClient;
import com.allocate.openapi.ApiException;
import com.allocate.openapi.Configuration;
import com.allocate.openapi.auth.*;
import com.allocate.openapi.models.*;
import com.allocate.openapi.api.ReferenceDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://healthsuite.allocatesoftware.com/api/v1");
    
    // Configure HTTP bearer authorization: jwt
    HttpBearerAuth jwt = (HttpBearerAuth) defaultClient.getAuthentication("jwt");
    jwt.setBearerToken("BEARER TOKEN");

    ReferenceDataApi apiInstance = new ReferenceDataApi(defaultClient);
    String id = EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440; // String | The ID of the vocabulary
    String elementId = EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440; // String | The ID of the vocabulary element
    try {
      VocabularyEntry result = apiInstance.getVocabularyElement(id, elementId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReferenceDataApi#getVocabularyElement");
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
 **id** | **String**| The ID of the vocabulary |
 **elementId** | **String**| The ID of the vocabulary element |

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
**200** | Returning a list of vocabularies |  -  |

<a name="getVocabularyEntries"></a>
# **getVocabularyEntries**
> List&lt;VocabularyEntry&gt; getVocabularyEntries(id)



Return the elements of a vocabulary

### Example
```java
// Import classes:
import com.allocate.openapi.ApiClient;
import com.allocate.openapi.ApiException;
import com.allocate.openapi.Configuration;
import com.allocate.openapi.auth.*;
import com.allocate.openapi.models.*;
import com.allocate.openapi.api.ReferenceDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://healthsuite.allocatesoftware.com/api/v1");
    
    // Configure HTTP bearer authorization: jwt
    HttpBearerAuth jwt = (HttpBearerAuth) defaultClient.getAuthentication("jwt");
    jwt.setBearerToken("BEARER TOKEN");

    ReferenceDataApi apiInstance = new ReferenceDataApi(defaultClient);
    String id = EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440; // String | The ID of the vocabulary
    try {
      List<VocabularyEntry> result = apiInstance.getVocabularyEntries(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReferenceDataApi#getVocabularyEntries");
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
 **id** | **String**| The ID of the vocabulary |

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
**200** | Returning a list of vocabularies |  -  |

<a name="getVocabularyTypeById"></a>
# **getVocabularyTypeById**
> VocabularyType getVocabularyTypeById(id)



Return a vocabulary type

### Example
```java
// Import classes:
import com.allocate.openapi.ApiClient;
import com.allocate.openapi.ApiException;
import com.allocate.openapi.Configuration;
import com.allocate.openapi.auth.*;
import com.allocate.openapi.models.*;
import com.allocate.openapi.api.ReferenceDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://healthsuite.allocatesoftware.com/api/v1");
    
    // Configure HTTP bearer authorization: jwt
    HttpBearerAuth jwt = (HttpBearerAuth) defaultClient.getAuthentication("jwt");
    jwt.setBearerToken("BEARER TOKEN");

    ReferenceDataApi apiInstance = new ReferenceDataApi(defaultClient);
    String id = EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440; // String | The ID of the vocabulary type
    try {
      VocabularyType result = apiInstance.getVocabularyTypeById(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReferenceDataApi#getVocabularyTypeById");
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
 **id** | **String**| The ID of the vocabulary type |

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
**200** | Returning a vocabulary type |  -  |

<a name="getVocabularyTypes"></a>
# **getVocabularyTypes**
> List&lt;VocabularyType&gt; getVocabularyTypes()



Return a list of vocabularies types that you may query

### Example
```java
// Import classes:
import com.allocate.openapi.ApiClient;
import com.allocate.openapi.ApiException;
import com.allocate.openapi.Configuration;
import com.allocate.openapi.auth.*;
import com.allocate.openapi.models.*;
import com.allocate.openapi.api.ReferenceDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://healthsuite.allocatesoftware.com/api/v1");
    
    // Configure HTTP bearer authorization: jwt
    HttpBearerAuth jwt = (HttpBearerAuth) defaultClient.getAuthentication("jwt");
    jwt.setBearerToken("BEARER TOKEN");

    ReferenceDataApi apiInstance = new ReferenceDataApi(defaultClient);
    try {
      List<VocabularyType> result = apiInstance.getVocabularyTypes();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReferenceDataApi#getVocabularyTypes");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
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
**200** | Returning a list of vocabulary types |  -  |

<a name="putVocabularyEntry"></a>
# **putVocabularyEntry**
> putVocabularyEntry(id, elementId, vocabularyEntry)



Create a new entry in a vocabulary

### Example
```java
// Import classes:
import com.allocate.openapi.ApiClient;
import com.allocate.openapi.ApiException;
import com.allocate.openapi.Configuration;
import com.allocate.openapi.auth.*;
import com.allocate.openapi.models.*;
import com.allocate.openapi.api.ReferenceDataApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://healthsuite.allocatesoftware.com/api/v1");
    
    // Configure HTTP bearer authorization: jwt
    HttpBearerAuth jwt = (HttpBearerAuth) defaultClient.getAuthentication("jwt");
    jwt.setBearerToken("BEARER TOKEN");

    ReferenceDataApi apiInstance = new ReferenceDataApi(defaultClient);
    String id = EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440; // String | The ID of the vocabulary
    String elementId = EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440; // String | The ID of the vocabulary element
    VocabularyEntry vocabularyEntry = new VocabularyEntry(); // VocabularyEntry | Details of the vocabulary entry
    try {
      apiInstance.putVocabularyEntry(id, elementId, vocabularyEntry);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReferenceDataApi#putVocabularyEntry");
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
 **id** | **String**| The ID of the vocabulary |
 **elementId** | **String**| The ID of the vocabulary element |
 **vocabularyEntry** | [**VocabularyEntry**](VocabularyEntry.md)| Details of the vocabulary entry |

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
**200** | Updated successfully |  -  |

