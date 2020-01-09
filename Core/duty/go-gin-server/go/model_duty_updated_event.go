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

type DutyUpdatedEvent struct {

	EventType string `json:"eventType"`

	Duty Duty `json:"duty,omitempty"`
}