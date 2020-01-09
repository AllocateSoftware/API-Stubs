# MappingsApi

All URIs are relative to *http://healthsuite.allocatesoftware.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createMapping**](MappingsApi.md#createMapping) | **POST** /mappingSets/{setId}/mappings | 
[**deleteMapping**](MappingsApi.md#deleteMapping) | **DELETE** /mappingSets/{id}/mappings/{mappingId} | 
[**getMapping**](MappingsApi.md#getMapping) | **GET** /mappingSets/{id}/mappings/{mappingId} | 
[**getMappingSetById**](MappingsApi.md#getMappingSetById) | **GET** /mappingSets/{setId} | 
[**getMappingSets**](MappingsApi.md#getMappingSets) | **GET** /mappingSets | 
[**getMappings**](MappingsApi.md#getMappings) | **GET** /mappingSets/{setId}/mappings | 
[**putMapping**](MappingsApi.md#putMapping) | **PUT** /mappingSets/{id}/mappings/{mappingId} | 


<a name="createMapping"></a>
# **createMapping**
> String createMapping(setId, mapping)



Create a new entry in a mapping set

### Example
```java
// Import classes:
import com.allocate.openapi.ApiClient;
import com.allocate.openapi.ApiException;
import com.allocate.openapi.Configuration;
import com.allocate.openapi.auth.*;
import com.allocate.openapi.models.*;
import com.allocate.openapi.api.MappingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://healthsuite.allocatesoftware.com/api/v1");
    
    // Configure HTTP bearer authorization: jwt
    HttpBearerAuth jwt = (HttpBearerAuth) defaultClient.getAuthentication("jwt");
    jwt.setBearerToken("BEARER TOKEN");

    MappingsApi apiInstance = new MappingsApi(defaultClient);
    String setId = EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440; // String | The ID of the mapping set
    Mapping mapping = new Mapping(); // Mapping | Details of the mapping
    try {
      String result = apiInstance.createMapping(setId, mapping);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MappingsApi#createMapping");
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
 **setId** | **String**| The ID of the mapping set |
 **mapping** | [**Mapping**](Mapping.md)| Details of the mapping |

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
**200** | Successfully created |  -  |

<a name="deleteMapping"></a>
# **deleteMapping**
> deleteMapping(id, mappingId)



Delete a vocabulary entry

### Example
```java
// Import classes:
import com.allocate.openapi.ApiClient;
import com.allocate.openapi.ApiException;
import com.allocate.openapi.Configuration;
import com.allocate.openapi.auth.*;
import com.allocate.openapi.models.*;
import com.allocate.openapi.api.MappingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://healthsuite.allocatesoftware.com/api/v1");
    
    // Configure HTTP bearer authorization: jwt
    HttpBearerAuth jwt = (HttpBearerAuth) defaultClient.getAuthentication("jwt");
    jwt.setBearerToken("BEARER TOKEN");

    MappingsApi apiInstance = new MappingsApi(defaultClient);
    String id = EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440; // String | The ID of the vocabulary
    String mappingId = EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440; // String | The ID of the mapping
    try {
      apiInstance.deleteMapping(id, mappingId);
    } catch (ApiException e) {
      System.err.println("Exception when calling MappingsApi#deleteMapping");
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
 **mappingId** | **String**| The ID of the mapping |

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

<a name="getMapping"></a>
# **getMapping**
> Mapping getMapping(id, mappingId)



Return the mapping

### Example
```java
// Import classes:
import com.allocate.openapi.ApiClient;
import com.allocate.openapi.ApiException;
import com.allocate.openapi.Configuration;
import com.allocate.openapi.auth.*;
import com.allocate.openapi.models.*;
import com.allocate.openapi.api.MappingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://healthsuite.allocatesoftware.com/api/v1");
    
    // Configure HTTP bearer authorization: jwt
    HttpBearerAuth jwt = (HttpBearerAuth) defaultClient.getAuthentication("jwt");
    jwt.setBearerToken("BEARER TOKEN");

    MappingsApi apiInstance = new MappingsApi(defaultClient);
    String id = EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440; // String | The ID of the mapping set
    String mappingId = EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440; // String | The ID of the mapping set element
    try {
      Mapping result = apiInstance.getMapping(id, mappingId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MappingsApi#getMapping");
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
 **id** | **String**| The ID of the mapping set |
 **mappingId** | **String**| The ID of the mapping set element |

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
**200** | Returning a list of vocabularies |  -  |

<a name="getMappingSetById"></a>
# **getMappingSetById**
> MappingSet getMappingSetById(setId)



Get a mapping set by ID

### Example
```java
// Import classes:
import com.allocate.openapi.ApiClient;
import com.allocate.openapi.ApiException;
import com.allocate.openapi.Configuration;
import com.allocate.openapi.auth.*;
import com.allocate.openapi.models.*;
import com.allocate.openapi.api.MappingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://healthsuite.allocatesoftware.com/api/v1");
    
    // Configure HTTP bearer authorization: jwt
    HttpBearerAuth jwt = (HttpBearerAuth) defaultClient.getAuthentication("jwt");
    jwt.setBearerToken("BEARER TOKEN");

    MappingsApi apiInstance = new MappingsApi(defaultClient);
    String setId = EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440; // String | The ID of the vocabulary type
    try {
      MappingSet result = apiInstance.getMappingSetById(setId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MappingsApi#getMappingSetById");
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
 **setId** | **String**| The ID of the vocabulary type |

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
**200** | Returning a list of mapping sets |  -  |

<a name="getMappingSets"></a>
# **getMappingSets**
> List&lt;MappingSet&gt; getMappingSets()



Return a list of mapping sets that you may utilise

### Example
```java
// Import classes:
import com.allocate.openapi.ApiClient;
import com.allocate.openapi.ApiException;
import com.allocate.openapi.Configuration;
import com.allocate.openapi.auth.*;
import com.allocate.openapi.models.*;
import com.allocate.openapi.api.MappingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://healthsuite.allocatesoftware.com/api/v1");
    
    // Configure HTTP bearer authorization: jwt
    HttpBearerAuth jwt = (HttpBearerAuth) defaultClient.getAuthentication("jwt");
    jwt.setBearerToken("BEARER TOKEN");

    MappingsApi apiInstance = new MappingsApi(defaultClient);
    try {
      List<MappingSet> result = apiInstance.getMappingSets();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MappingsApi#getMappingSets");
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

[**List&lt;MappingSet&gt;**](MappingSet.md)

### Authorization

[jwt](../README.md#jwt)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Returning a list of mapping sets |  -  |

<a name="getMappings"></a>
# **getMappings**
> List&lt;Mapping&gt; getMappings(setId, fromCode)



Return the elements of a mapping set

### Example
```java
// Import classes:
import com.allocate.openapi.ApiClient;
import com.allocate.openapi.ApiException;
import com.allocate.openapi.Configuration;
import com.allocate.openapi.auth.*;
import com.allocate.openapi.models.*;
import com.allocate.openapi.api.MappingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://healthsuite.allocatesoftware.com/api/v1");
    
    // Configure HTTP bearer authorization: jwt
    HttpBearerAuth jwt = (HttpBearerAuth) defaultClient.getAuthentication("jwt");
    jwt.setBearerToken("BEARER TOKEN");

    MappingsApi apiInstance = new MappingsApi(defaultClient);
    String setId = EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440; // String | The ID of the mapping set
    String fromCode = Band 4; // String | Search for a mapping where the from code matches the provided string
    try {
      List<Mapping> result = apiInstance.getMappings(setId, fromCode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MappingsApi#getMappings");
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
 **setId** | **String**| The ID of the mapping set |
 **fromCode** | **String**| Search for a mapping where the from code matches the provided string | [optional]

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
**200** | Returning a list of mapping set entries |  -  |

<a name="putMapping"></a>
# **putMapping**
> putMapping(id, mappingId, mapping)



Update a mapping

### Example
```java
// Import classes:
import com.allocate.openapi.ApiClient;
import com.allocate.openapi.ApiException;
import com.allocate.openapi.Configuration;
import com.allocate.openapi.auth.*;
import com.allocate.openapi.models.*;
import com.allocate.openapi.api.MappingsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://healthsuite.allocatesoftware.com/api/v1");
    
    // Configure HTTP bearer authorization: jwt
    HttpBearerAuth jwt = (HttpBearerAuth) defaultClient.getAuthentication("jwt");
    jwt.setBearerToken("BEARER TOKEN");

    MappingsApi apiInstance = new MappingsApi(defaultClient);
    String id = EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440; // String | The ID of the vocabulary
    String mappingId = EB7659C5-6AD3-4C1F-8F3F-A5DB1A5E1440; // String | The ID of the vocabulary element
    Mapping mapping = new Mapping(); // Mapping | Details of the mapping
    try {
      apiInstance.putMapping(id, mappingId, mapping);
    } catch (ApiException e) {
      System.err.println("Exception when calling MappingsApi#putMapping");
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
 **mappingId** | **String**| The ID of the vocabulary element |
 **mapping** | [**Mapping**](Mapping.md)| Details of the mapping |

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

