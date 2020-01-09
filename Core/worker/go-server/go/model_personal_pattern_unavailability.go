/*
 * Workers
 *
 * ## Workers and events 
 *
 * API version: 1.0.0
 * Contact: support@allocatesoftware.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package allocateApi

type PersonalPatternUnavailability struct {

	UnavailabilityGroup string `json:"unavailabilityGroup,omitempty"`

	UnavailabilityReason string `json:"unavailabilityReason"`

	Work string `json:"work,omitempty"`

	Start string `json:"start"`

	End string `json:"end"`

	ExternalUnavailabilityIdentifier string `json:"externalUnavailabilityIdentifier"`
}