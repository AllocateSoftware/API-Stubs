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

type DutySendEvent struct {

	EventType string `json:"eventType"`

	// Where this duty has been sent
	Destination string `json:"destination,omitempty"`

	Duty Duty `json:"duty,omitempty"`
}