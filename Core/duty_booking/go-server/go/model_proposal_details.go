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

type ProposalDetails struct {

	// The ASWid of the worker being offered for this duty
	PersonId string `json:"personId"`

	// The engagement route for this worker
	EngagementRoute string `json:"engagementRoute"`

	// The ASWid of the agency, if this worker is being provided through an agency engagement
	AgencyId map[string]interface{} `json:"agencyId,omitempty"`

	// Cost for this worker
	Cost float32 `json:"cost"`

	CancellationCosts []CancellationCost `json:"cancellationCosts"`

	// Any options being passed for this worker
	Options [][]string `json:"options,omitempty"`
}
