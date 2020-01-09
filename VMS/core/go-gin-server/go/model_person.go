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

// Person - Details of a Person in the VMS, typically a Worker.
type Person struct {

	// identifier of the person (worker) within the VMS
	Id string `json:"id,omitempty"`

	// Global identifer, such as National Insurance number (where known), or other identifier or composite identifier that may be used for matching purposes.
	UniversalId string `json:"universalId,omitempty"`

	FirstName string `json:"firstName,omitempty"`

	Surname string `json:"surname,omitempty"`

	Email string `json:"email,omitempty"`

	TelephoneNumber string `json:"telephoneNumber,omitempty"`

	// Array of HATEOAS-style references that may be followed by the client. This may include a 'worker.profile' URL, which will return an HTML page representing the worker profile within the VMS.
	Links []Link `json:"links,omitempty"`
}
