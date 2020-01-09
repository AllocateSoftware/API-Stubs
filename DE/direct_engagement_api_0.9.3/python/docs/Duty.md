# Duty

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**duty_id** | **str** | Trust identifier of the duty | [optional] 
**slave_duty_id** | **str** | Identifier of the slave duty if duty is part of consolidated duties | [optional] 
**block_id** | **str** | Identifier of block duties if duty is part of the block | [optional] 
**client_dept_id** | **str** | BankStaff ward trust identifier | [optional] 
**sub_discipline** | **str** | Staff group trust identifier | [optional] 
**request_gender** | [**RequestGender**](RequestGender.md) |  | [optional] 
**grade** | **str** | Grade trust identifier of the request | [optional] 
**fallback_grade** | **str** |  | [optional] 
**vacancy_reason** | **str** |  | [optional] 
**date** | **date** | Date of the duty | [optional] 
**start_time** | **str** | Start time of the shift | [optional] 
**end_time** | **str** | End time of the shift | [optional] 
**break_duration** | **int** | Duration of break in minutes | [optional] 
**po_number** | **int** | Need to understand if needed from Trust/Agency | [optional] 
**unique_number** | **int** | BRN / Unique number | [optional] 
**agency** | **str** | Supplying agency trust identifier | [optional] 
**skill** | **str** | Stored as free text in DE Provider | [optional] 
**specialty** | **str** | Stored as free text in DE Provider | [optional] 
**fallback_skill** | **str** | Stored as free text in DE Provider | [optional] 
**fallback_speciality** | **str** | Stored as free text in DE Provider | [optional] 
**status** | **str** | Will need to understand if duty is no longer required and cancel on DE Provider | [optional] 
**rates** | [**list[Rates]**](Rates.md) | Trust Pay Agency &amp; Trust Pays DE provider - split rate between pay to worker and pay to agency | [optional] 
**time_interval_rates** | [**list[TimeIntervalRates]**](TimeIntervalRates.md) | Array of rates and intervals for which the rate is applied | [optional] 
**person** | [**Person**](Person.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


