# Person

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | [**list[Identifier]**](Identifier.md) |  Array of identifiers. This should contain as much information as possible in on-boarding in order to facilitate automatic matching where possible. Possible namespaces include - ESR:&lt;trustId&gt;:StaffNumber - The staff number (Where ESR is the system of record, and &lt;trustId&gt; is the Allocate Identifier for the trust) - NI  - the UK National Insurance number - SSN - Social Security   | [optional] 
**identification** | [**Identification**](Identification.md) |  | [optional] 
**personal_info** | [**PersonalInfo**](PersonalInfo.md) |  | [optional] 
**employment_details** | [**EmploymentDetails**](EmploymentDetails.md) |  | [optional] 
**work_locations** | [**WorkLocations**](WorkLocations.md) |  | [optional] 
**postings** | [**list[Posting]**](Posting.md) |  | [optional] 
**contracts** | [**list[Contract]**](Contract.md) |  | [optional] 
**skills** | [**list[Skill]**](Skill.md) |  | [optional] 
**specialties** | [**list[Specialty]**](Specialty.md) |  | [optional] 
**attributes** | [**list[Attribute]**](Attribute.md) |  | [optional] 
**visas** | [**list[Visa]**](Visa.md) |  | [optional] 
**working_restrictions** | [**list[WorkingRestriction]**](WorkingRestriction.md) |  | [optional] 
**availabilities** | [**Availabilities**](Availabilities.md) |  | [optional] 
**personal_pattern** | [**PersonalPattern**](PersonalPattern.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


