# HoursAssignmentPerson

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**staff_number** | **str** |  | [optional] 
**forenames** | **str** | List of forenames for the person | [optional] 
**surname** | **str** | Surname for the person | [optional] 
**mobile_number** | **str** |  | [optional] 
**grade** | [**Grade**](Grade.md) |  | [optional] 
**grade_type** | [**GradeType**](GradeType.md) |  | [optional] 
**grade_type_category** | [**GradeTypeCategory**](GradeTypeCategory.md) |  | [optional] 
**wte** | **float** | Whole time Equivalent – this is the person’s contracted hours divided by the person’s default grade type value for WTE (if the grade type has no value then use grade type category if neither have a value use system default setting). e.g. 37.5 / (2250/60) &#x3D; 1.00 NOTE if the grade type default wte is not set this will not be returned  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


