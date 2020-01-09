# ASW.APIServices.Core.Model.HoursAssignmentPerson
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**StaffNumber** | **string** |  | [optional] 
**Forenames** | **string** | List of forenames for the person | [optional] 
**Surname** | **string** | Surname for the person | [optional] 
**MobileNumber** | **string** |  | [optional] 
**Grade** | [**Grade**](Grade.md) |  | [optional] 
**GradeType** | [**GradeType**](GradeType.md) |  | [optional] 
**GradeTypeCategory** | [**GradeTypeCategory**](GradeTypeCategory.md) |  | [optional] 
**WTE** | **decimal** | Whole time Equivalent – this is the person’s contracted hours divided by the person’s default grade type value for WTE (if the grade type has no value then use grade type category if neither have a value use system default setting). e.g. 37.5 / (2250/60) &#x3D; 1.00 NOTE if the grade type default wte is not set this will not be returned  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

