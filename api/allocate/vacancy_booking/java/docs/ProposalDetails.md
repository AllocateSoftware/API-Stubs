

# ProposalDetails

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**personId** | **String** | Allocate PersonID for the person being proposed | 
**engagementRoute** | [**EngagementRouteEnum**](#EngagementRouteEnum) | The engagement route for this worker | 
**agencyId** | **String** | The Allocate Agency ID for the agency, if this worker is being provided through an agency engagement |  [optional]
**cost** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**cancellationCosts** | [**List&lt;CancellationCost&gt;**](CancellationCost.md) |  |  [optional]



## Enum: EngagementRouteEnum

Name | Value
---- | -----
SUBSTANTIVE | &quot;substantive&quot;
BANK | &quot;bank&quot;
AGENCY | &quot;agency&quot;
OTHER | &quot;other&quot;



