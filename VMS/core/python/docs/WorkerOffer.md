# WorkerOffer

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | Unique identifier for this offer. | [optional] 
**booking_request_id** | **str** | The underlying booking request for this offer. | [optional] 
**worker** | [**Person**](Person.md) |  | 
**agency** | [**Agency**](Agency.md) |  | 
**qualification_status** | **str** | Qualification Status:  * &#x60;qualified&#x60; - Worker has passed all trust-defined checks, and may be considered valid to book.  * &#x60;unqualified&#x60; - Worker has not passed some, or all of the trust-defined checks. These should be performed before progressing to booking the worker.  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


