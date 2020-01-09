

# HoursAssignment

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | Identifier for the hours assignment | 
**when** | [**LocalDate**](LocalDate.md) | Date assignment begins on |  [optional]
**actual** | [**DateSpan**](DateSpan.md) |  |  [optional]
**workTime** | **Integer** | Number of minutes worked in assignment |  [optional]
**contractedTime** | **Integer** | Number of minutes that count towards the person’s contracted hours |  [optional]
**payState** | [**PayStateEnum**](#PayStateEnum) | Details where the duty is in it’s lifecycle. *   Requested &#x3D; (Requested Bank Duty) *   Accepted &#x3D; (Roster Approved) *   Approved &#x3D; (Finalised) *   Submitted &#x3D; (PAID) *   Paid *   Unlocked &#x3D; (Was once Finalised state.) *   Relocked &#x3D; (Finalised given that it was once un-finalised for some reason)  |  [optional]
**employeeType** | [**HoursAssignmentEmployeeType**](HoursAssignmentEmployeeType.md) |  |  [optional]
**person** | [**HoursAssignmentPerson**](HoursAssignmentPerson.md) |  |  [optional]
**assignment** | [**HoursAssignmentAssignment**](HoursAssignmentAssignment.md) |  |  [optional]
**post** | [**HoursAssignmentPost**](HoursAssignmentPost.md) |  |  [optional]
**posting** | [**HoursAssignmentPosting**](HoursAssignmentPosting.md) |  |  [optional]
**cancellation** | [**HoursAssignmentCancellation**](HoursAssignmentCancellation.md) |  |  [optional]
**inCharge** | **Boolean** | Was the employee in charge? |  [optional]
**shift** | [**HoursAssignmentShift**](HoursAssignmentShift.md) |  |  [optional]
**duty** | [**HoursAssignmentDuty**](HoursAssignmentDuty.md) |  |  [optional]
**fulfillment** | [**HoursAssignmentFulfillment**](HoursAssignmentFulfillment.md) |  |  [optional]
**costCentre** | [**HoursAssignmentCostCentre**](HoursAssignmentCostCentre.md) |  |  [optional]
**owningUnit** | [**HoursAssignmentOwningUnit**](HoursAssignmentOwningUnit.md) |  |  [optional]
**resourcingUnit** | [**HoursAssignmentOwningUnit**](HoursAssignmentOwningUnit.md) |  |  [optional]
**requirement** | [**HoursAssignmentRequirement**](HoursAssignmentRequirement.md) |  |  [optional]
**location** | [**HoursAssignmentLocation**](HoursAssignmentLocation.md) |  |  [optional]
**additionalDutyReason** | **String** |  |  [optional]
**dutyHasWarnings** | **Boolean** |  |  [optional]



## Enum: PayStateEnum

Name | Value
---- | -----
REQUESTED | &quot;requested&quot;
ACCEPTED | &quot;accepted&quot;
APPROVED | &quot;approved&quot;
SUBMITTED | &quot;submitted&quot;
PAID | &quot;paid&quot;
UNLOCKED | &quot;unlocked&quot;
RELOCKED | &quot;relocked&quot;



