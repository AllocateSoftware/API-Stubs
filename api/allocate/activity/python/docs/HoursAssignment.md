# HoursAssignment

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | Identifier for the hours assignment | 
**when** | **date** | Date assignment begins on | [optional] 
**actual** | [**DateSpan**](DateSpan.md) |  | [optional] 
**work_time** | **int** | Number of minutes worked in assignment | [optional] 
**contracted_time** | **int** | Number of minutes that count towards the person’s contracted hours | [optional] 
**pay_state** | **str** | Details where the duty is in it’s lifecycle. *   Requested &#x3D; (Requested Bank Duty) *   Accepted &#x3D; (Roster Approved) *   Approved &#x3D; (Finalised) *   Submitted &#x3D; (PAID) *   Paid *   Unlocked &#x3D; (Was once Finalised state.) *   Relocked &#x3D; (Finalised given that it was once un-finalised for some reason)  | [optional] 
**employee_type** | [**HoursAssignmentEmployeeType**](HoursAssignmentEmployeeType.md) |  | [optional] 
**person** | [**HoursAssignmentPerson**](HoursAssignmentPerson.md) |  | [optional] 
**assignment** | [**HoursAssignmentAssignment**](HoursAssignmentAssignment.md) |  | [optional] 
**post** | [**HoursAssignmentPost**](HoursAssignmentPost.md) |  | [optional] 
**posting** | [**HoursAssignmentPosting**](HoursAssignmentPosting.md) |  | [optional] 
**cancellation** | [**HoursAssignmentCancellation**](HoursAssignmentCancellation.md) |  | [optional] 
**in_charge** | **bool** | Was the employee in charge? | [optional] 
**shift** | [**HoursAssignmentShift**](HoursAssignmentShift.md) |  | [optional] 
**duty** | [**HoursAssignmentDuty**](HoursAssignmentDuty.md) |  | [optional] 
**fulfillment** | [**HoursAssignmentFulfillment**](HoursAssignmentFulfillment.md) |  | [optional] 
**cost_centre** | [**HoursAssignmentCostCentre**](HoursAssignmentCostCentre.md) |  | [optional] 
**owning_unit** | [**HoursAssignmentOwningUnit**](HoursAssignmentOwningUnit.md) |  | [optional] 
**resourcing_unit** | [**HoursAssignmentOwningUnit**](HoursAssignmentOwningUnit.md) |  | [optional] 
**requirement** | [**HoursAssignmentRequirement**](HoursAssignmentRequirement.md) |  | [optional] 
**location** | [**HoursAssignmentLocation**](HoursAssignmentLocation.md) |  | [optional] 
**additional_duty_reason** | **str** |  | [optional] 
**duty_has_warnings** | **bool** |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


