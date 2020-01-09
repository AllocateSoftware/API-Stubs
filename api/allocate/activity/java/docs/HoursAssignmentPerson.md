

# HoursAssignmentPerson

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**staffNumber** | **String** |  |  [optional]
**forenames** | **String** | List of forenames for the person |  [optional]
**surname** | **String** | Surname for the person |  [optional]
**mobileNumber** | **String** |  |  [optional]
**grade** | [**Grade**](Grade.md) |  |  [optional]
**gradeType** | [**GradeType**](GradeType.md) |  |  [optional]
**gradeTypeCategory** | [**GradeTypeCategory**](GradeTypeCategory.md) |  |  [optional]
**WTE** | [**BigDecimal**](BigDecimal.md) | Whole time Equivalent – this is the person’s contracted hours divided by the person’s default grade type value for WTE (if the grade type has no value then use grade type category if neither have a value use system default setting). e.g. 37.5 / (2250/60) &#x3D; 1.00 NOTE if the grade type default wte is not set this will not be returned  |  [optional]



