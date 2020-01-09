

# ProposalDetails

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**personId** | **String** | The ASWid of the worker being offered for this duty | 
**engagementRoute** | [**EngagementRouteEnum**](#EngagementRouteEnum) | The engagement route for this worker | 
**agencyId** | **Object** | The ASWid of the agency, if this worker is being provided through an agency engagement |  [optional]
**cost** | [**BigDecimal**](BigDecimal.md) | Cost for this worker | 
**cancellationCosts** | [**List&lt;CancellationCost&gt;**](CancellationCost.md) |  | 
**options** | [**List&lt;List&lt;OptionsEnum&gt;&gt;**](#List&lt;List&lt;OptionsEnum&gt;&gt;) | Any options being passed for this worker |  [optional]



## Enum: EngagementRouteEnum

Name | Value
---- | -----
SUBSTANTIVE | &quot;substantive&quot;
BANK | &quot;bank&quot;
AGENCY | &quot;agency&quot;
OTHER | &quot;other&quot;



## Enum: List&lt;List&lt;OptionsEnum&gt;&gt;

Name | Value
---- | -----
DIRECTBOOK | &quot;directBook&quot;



