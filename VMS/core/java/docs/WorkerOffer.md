

# WorkerOffer

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Unique identifier for this offer. |  [optional]
**bookingRequestId** | **String** | The underlying booking request for this offer. |  [optional]
**worker** | [**Person**](Person.md) |  | 
**agency** | [**Agency**](Agency.md) |  | 
**qualificationStatus** | [**QualificationStatusEnum**](#QualificationStatusEnum) | Qualification Status:  * &#x60;qualified&#x60; - Worker has passed all trust-defined checks, and may be considered valid to book.  * &#x60;unqualified&#x60; - Worker has not passed some, or all of the trust-defined checks. These should be performed before progressing to booking the worker.  | 



## Enum: QualificationStatusEnum

Name | Value
---- | -----
QUALIFIED | &quot;qualified&quot;
UNQUALIFIED | &quot;unqualified&quot;



