

# Duty

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dutyId** | **String** | Trust identifier of the duty |  [optional]
**slaveDutyId** | **String** | Identifier of the slave duty if duty is part of consolidated duties |  [optional]
**blockId** | **String** | Identifier of block duties if duty is part of the block |  [optional]
**clientDeptId** | **String** | BankStaff ward trust identifier |  [optional]
**subDiscipline** | **String** | Staff group trust identifier |  [optional]
**requestGender** | [**RequestGender**](RequestGender.md) |  |  [optional]
**grade** | **String** | Grade trust identifier of the request |  [optional]
**fallbackGrade** | **String** |  |  [optional]
**vacancyReason** | **String** |  |  [optional]
**date** | [**LocalDate**](LocalDate.md) | Date of the duty |  [optional]
**startTime** | **String** | Start time of the shift |  [optional]
**endTime** | **String** | End time of the shift |  [optional]
**breakDuration** | **Integer** | Duration of break in minutes |  [optional]
**poNumber** | **Integer** | Need to understand if needed from Trust/Agency |  [optional]
**uniqueNumber** | **Integer** | BRN / Unique number |  [optional]
**agency** | **String** | Supplying agency trust identifier |  [optional]
**skill** | **String** | Stored as free text in DE Provider |  [optional]
**specialty** | **String** | Stored as free text in DE Provider |  [optional]
**fallbackSkill** | **String** | Stored as free text in DE Provider |  [optional]
**fallbackSpeciality** | **String** | Stored as free text in DE Provider |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Will need to understand if duty is no longer required and cancel on DE Provider |  [optional]
**rates** | [**List&lt;Rates&gt;**](Rates.md) | Trust Pay Agency &amp; Trust Pays DE provider - split rate between pay to worker and pay to agency |  [optional]
**timeIntervalRates** | [**List&lt;TimeIntervalRates&gt;**](TimeIntervalRates.md) | Array of rates and intervals for which the rate is applied |  [optional]
**person** | [**Person**](Person.md) |  |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
ACTIVE | &quot;active&quot;
CANCELLED | &quot;cancelled&quot;



