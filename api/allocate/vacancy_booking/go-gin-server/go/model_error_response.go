/*
 * Vacancy Booking API and Events
 *
 *      ## Duty Booking API and events and Events 
 *
 * API version: 1.0.0
 * Contact: support@allocatesoftware.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package allocateApi

// ErrorResponse - An Error has occurred in processing your request
type ErrorResponse struct {

	// Optional identifier for this reponse (for matching with logging)
	Id string `json:"id,omitempty"`

	// Optional error code identifying this particular error
	Code string `json:"code,omitempty"`

	// Optional error code identifying this particular error
	Description string `json:"description"`

	// List of child errors
	Items []ErrorResponse `json:"items,omitempty"`
}
