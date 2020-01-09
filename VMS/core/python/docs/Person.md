# Person

Details of a Person in the VMS, typically a Worker.
## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | identifier of the person (worker) within the VMS | [optional] 
**universal_id** | **str** | Global identifer, such as National Insurance number (where known), or other identifier or composite identifier that may be used for matching purposes. | [optional] 
**first_name** | **str** |  | [optional] 
**surname** | **str** |  | [optional] 
**email** | **str** |  | [optional] 
**telephone_number** | **str** |  | [optional] 
**links** | [**list[Link]**](Link.md) | Array of HATEOAS-style references that may be followed by the client. This may include a &#39;worker.profile&#39; URL, which will return an HTML page representing the worker profile within the VMS. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


