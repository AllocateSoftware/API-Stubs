
# ASW.APIServices.Core.Model.HoursAssignment

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int** | Identifier for the hours assignment | 
**When** | **DateTime** | Date assignment begins on | [optional] 
**Actual** | [**DateSpan**](DateSpan.md) |  | [optional] 
**WorkTime** | **int** | Number of minutes worked in assignment | [optional] 
**ContractedTime** | **int** | Number of minutes that count towards the person’s contracted hours | [optional] 
**PayState** | **string** | Details where the duty is in it’s lifecycle. *   Requested &#x3D; (Requested Bank Duty) *   Accepted &#x3D; (Roster Approved) *   Approved &#x3D; (Finalised) *   Submitted &#x3D; (PAID) *   Paid *   Unlocked &#x3D; (Was once Finalised state.) *   Relocked &#x3D; (Finalised given that it was once un-finalised for some reason)  | [optional] 
**EmployeeType** | [**HoursAssignmentEmployeeType**](HoursAssignmentEmployeeType.md) |  | [optional] 
**Person** | [**HoursAssignmentPerson**](HoursAssignmentPerson.md) |  | [optional] 
**Assignment** | [**HoursAssignmentAssignment**](HoursAssignmentAssignment.md) |  | [optional] 
**Post** | [**HoursAssignmentPost**](HoursAssignmentPost.md) |  | [optional] 
**Posting** | [**HoursAssignmentPosting**](HoursAssignmentPosting.md) |  | [optional] 
**Cancellation** | [**HoursAssignmentCancellation**](HoursAssignmentCancellation.md) |  | [optional] 
**InCharge** | **bool** | Was the employee in charge? | [optional] 
**Shift** | [**HoursAssignmentShift**](HoursAssignmentShift.md) |  | [optional] 
**Duty** | [**HoursAssignmentDuty**](HoursAssignmentDuty.md) |  | [optional] 
**Fulfillment** | [**HoursAssignmentFulfillment**](HoursAssignmentFulfillment.md) |  | [optional] 
**CostCentre** | [**HoursAssignmentCostCentre**](HoursAssignmentCostCentre.md) |  | [optional] 
**OwningUnit** | [**HoursAssignmentOwningUnit**](HoursAssignmentOwningUnit.md) |  | [optional] 
**ResourcingUnit** | [**HoursAssignmentOwningUnit**](HoursAssignmentOwningUnit.md) |  | [optional] 
**Requirement** | [**HoursAssignmentRequirement**](HoursAssignmentRequirement.md) |  | [optional] 
**Location** | [**HoursAssignmentLocation**](HoursAssignmentLocation.md) |  | [optional] 
**AdditionalDutyReason** | **string** |  | [optional] 
**DutyHasWarnings** | **bool** |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to README]](../README.md)

