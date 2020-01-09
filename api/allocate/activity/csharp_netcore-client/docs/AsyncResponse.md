# ASW.APIServices.Core.Model.AsyncResponse
Where an API may respond with an asynchronous 'Accepted' (HTTP 202) response, it will return an AsyncResponse object. The eventual                 response will be returned by way of an async event, containing the corresponding correlation ID header returned below.                                  The location of the correlation ID will depend upon the eventing transport in use - though typically it will be included as a message header (rather than a payload).             
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | Correlation Identifier | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

