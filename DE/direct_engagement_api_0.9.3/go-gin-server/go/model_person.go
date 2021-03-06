/*
 * DE Provider Direct Engagement API
 *
 * description
 *
 * API version: 1.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package allocateApi

type Person struct {

	FirstName string `json:"firstName,omitempty"`

	Surname string `json:"surname,omitempty"`

	// Date of birth
	DateOfBirth string `json:"dateOfBirth,omitempty"`

	PersonGender PersonGender `json:"personGender,omitempty"`

	// NINumber.e-mail 
	MatchId string `json:"matchId,omitempty"`

	// Business Key
	AllocatePersonId string `json:"allocatePersonId,omitempty"`

	Email string `json:"email,omitempty"`

	TelephoneNumber string `json:"telephoneNumber,omitempty"`

	ExtSystemId string `json:"extSystemId,omitempty"`
}
