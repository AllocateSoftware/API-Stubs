/*
 * Duty Booking API and Events
 *
 * ## Duty Booking API and events and Events 
 *
 * API version: 1.0.0
 * Contact: support@allocatesoftware.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package allocateApi

type DutyWhen struct {

	Planned DutyTimes `json:"planned,omitempty"`

	Actual DutyTimes `json:"actual,omitempty"`

	// Night, Day, etc
	ShiftType string `json:"shiftType,omitempty"`
}