# ASW.APIServices.VMS.Model.WorkerOffer
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | Unique identifier for this offer. | [optional] 
**BookingRequestId** | **string** | The underlying booking request for this offer. | [optional] 
**Worker** | [**Person**](Person.md) |  | 
**Agency** | [**Agency**](Agency.md) |  | 
**QualificationStatus** | **string** | Qualification Status:  * &#x60;qualified&#x60; - Worker has passed all trust-defined checks, and may be considered valid to book.  * &#x60;unqualified&#x60; - Worker has not passed some, or all of the trust-defined checks. These should be performed before progressing to booking the worker.  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

