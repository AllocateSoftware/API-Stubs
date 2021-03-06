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

type DutyWhere struct {

	// name of the trust
	TrustId string `json:"trustId,omitempty"`

	// Code for the unit within the trust
	UnitCode string `json:"unitCode,omitempty"`
}
