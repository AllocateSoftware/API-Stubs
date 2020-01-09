
# ASW.APIServices.VMS.Model.Person

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | identifier of the person (worker) within the VMS | [optional] 
**UniversalId** | **string** | Global identifer, such as National Insurance number (where known), or other identifier or composite identifier that may be used for matching purposes. | [optional] 
**FirstName** | **string** |  | [optional] 
**Surname** | **string** |  | [optional] 
**Email** | **string** |  | [optional] 
**TelephoneNumber** | **string** |  | [optional] 
**Links** | [**List&lt;Link&gt;**](Link.md) | Array of HATEOAS-style references that may be followed by the client. This may include a &#39;worker.profile&#39; URL, which will return an HTML page representing the worker profile within the VMS. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to README]](../README.md)

