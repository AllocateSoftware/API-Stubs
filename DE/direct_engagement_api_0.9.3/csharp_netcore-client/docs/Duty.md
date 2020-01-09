# ASW.APIServices.Core.Model.Duty
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DutyId** | **string** | Trust identifier of the duty | [optional] 
**SlaveDutyId** | **string** | Identifier of the slave duty if duty is part of consolidated duties | [optional] 
**BlockId** | **string** | Identifier of block duties if duty is part of the block | [optional] 
**ClientDeptId** | **string** | BankStaff ward trust identifier | [optional] 
**SubDiscipline** | **string** | Staff group trust identifier | [optional] 
**RequestGender** | **RequestGender** |  | [optional] 
**Grade** | **string** | Grade trust identifier of the request | [optional] 
**FallbackGrade** | **string** |  | [optional] 
**VacancyReason** | **string** |  | [optional] 
**Date** | **DateTime** | Date of the duty | [optional] 
**StartTime** | **string** | Start time of the shift | [optional] 
**EndTime** | **string** | End time of the shift | [optional] 
**BreakDuration** | **int** | Duration of break in minutes | [optional] 
**PoNumber** | **int** | Need to understand if needed from Trust/Agency | [optional] 
**UniqueNumber** | **int** | BRN / Unique number | [optional] 
**Agency** | **string** | Supplying agency trust identifier | [optional] 
**Skill** | **string** | Stored as free text in DE Provider | [optional] 
**Specialty** | **string** | Stored as free text in DE Provider | [optional] 
**FallbackSkill** | **string** | Stored as free text in DE Provider | [optional] 
**FallbackSpeciality** | **string** | Stored as free text in DE Provider | [optional] 
**Status** | **string** | Will need to understand if duty is no longer required and cancel on DE Provider | [optional] 
**Rates** | [**List&lt;Rates&gt;**](Rates.md) | Trust Pay Agency &amp; Trust Pays DE provider - split rate between pay to worker and pay to agency | [optional] 
**TimeIntervalRates** | [**List&lt;TimeIntervalRates&gt;**](TimeIntervalRates.md) | Array of rates and intervals for which the rate is applied | [optional] 
**Person** | [**Person**](Person.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

