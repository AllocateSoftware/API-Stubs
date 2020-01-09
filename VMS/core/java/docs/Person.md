

# Person

Details of a Person in the VMS, typically a Worker.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | identifier of the person (worker) within the VMS |  [optional]
**universalId** | **String** | Global identifer, such as National Insurance number (where known), or other identifier or composite identifier that may be used for matching purposes. |  [optional]
**firstName** | **String** |  |  [optional]
**surname** | **String** |  |  [optional]
**email** | **String** |  |  [optional]
**telephoneNumber** | **String** |  |  [optional]
**links** | [**List&lt;Link&gt;**](Link.md) | Array of HATEOAS-style references that may be followed by the client. This may include a &#39;worker.profile&#39; URL, which will return an HTML page representing the worker profile within the VMS. |  [optional]



