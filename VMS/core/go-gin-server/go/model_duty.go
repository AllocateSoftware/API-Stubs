/*
 * VMS API
 *
 * ## Description  API to be impemented by VMS systems for integration into HealthSuite business processes 
 *
 * API version: 1.0.0
 * Contact: support@allocatesoftware.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package allocateApi

type Duty struct {

	// ID of the duty (from the source system)
	Id string `json:"id,omitempty"`

	When DutyTiming `json:"when,omitempty"`

	Where DutyLocation `json:"where,omitempty"`

	Requirements DutyRequirements `json:"requirements,omitempty"`

	// BankStaff ward trust identifier
	ClientDeptId string `json:"clientDeptId,omitempty"`

	// Staff group trust identifier
	SubDiscipline string `json:"subDiscipline,omitempty"`

	// Grade trust identifier of the request
	Grade string `json:"grade,omitempty"`

	FallbackGrade string `json:"fallbackGrade,omitempty"`

	VacancyReason string `json:"vacancyReason,omitempty"`

	// Need to understand if needed from Trust/Agency
	PoNumber int32 `json:"poNumber,omitempty"`

	// BRN / Unique number
	UniqueNumber int32 `json:"uniqueNumber,omitempty"`

	// Supplying agency for the duty
	Agency string `json:"agency,omitempty"`
}