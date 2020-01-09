/*
 * Duties and Events
 *
 * ## Duties and Events 
 *
 * API version: 1.0.0
 * Contact: support@allocatesoftware.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package allocateApi

type Duty struct {

	// Identifier for this duty
	Id string `json:"id,omitempty"`

	When DutyWhen `json:"when,omitempty"`

	Where DutyWhere `json:"where,omitempty"`

	// reason for requestBody
	Reason string `json:"reason,omitempty"`

	Requirements DutyRequirements `json:"requirements,omitempty"`
}