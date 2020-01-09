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

// DutyCascadeEvent - Duty has been cascaded to a temporary staffing tier
type DutyCascadeEvent struct {

	EventType string `json:"eventType"`

	DutyId string `json:"dutyId"`

	CascadeFrom string `json:"cascadeFrom,omitempty"`

	CascadeTo string `json:"cascadeTo"`

	// Is this a 'reset' ? (I.E Revert)
	IsDutyReset bool `json:"isDutyReset,omitempty"`
}