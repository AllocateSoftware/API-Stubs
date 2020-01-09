

# Identification

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**staffNumber** | **String** | Unique and unchanging staff number to use as the constant reference for a Person | 
**title** | **String** | This value is subject to mapping in the Gateway. If unavailable, provide a constant value e.g. UNKNOWN, which can be mapped to an empty value in HealthRoster Optima |  [optional]
**forenames** | **String** |  | 
**surname** | **String** |  | 
**middleInitials** | **String** |  |  [optional]
**knownAs** | **String** |  |  [optional]
**gender** | [**GenderEnum**](#GenderEnum) |  |  [optional]
**dateOfBirth** | [**LocalDate**](LocalDate.md) |  | 
**ssn** | **String** | National Insurance \\ Social Security Number. |  [optional]



## Enum: GenderEnum

Name | Value
---- | -----
MALE | &quot;male&quot;
FEMALE | &quot;female&quot;
OTHER | &quot;other&quot;



