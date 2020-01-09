

# ContactLogInformation

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) |  | 
**when** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**who** | [**Map&lt;String, Identifier&gt;**](Identifier.md) |  |  [optional]
**details** | [**ContactLogInformationDetails**](ContactLogInformationDetails.md) |  |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
TELEPHONE | &quot;telephone&quot;
EMAIL | &quot;email&quot;
IM | &quot;IM&quot;
FACETOFACE | &quot;faceToFace&quot;



