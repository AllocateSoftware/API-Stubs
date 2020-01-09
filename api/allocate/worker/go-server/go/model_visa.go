/*
 * Worker API and Events
 *
 *      ## API and events for providing workers. 
 *
 * API version: 1.0.0
 * Contact: support@allocatesoftware.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package allocateApi

type Visa struct {

	Number string `json:"number,omitempty"`

	Country string `json:"country,omitempty"`

	IssuingOffice string `json:"issuingOffice,omitempty"`

	Type string `json:"type,omitempty"`

	Entries string `json:"entries,omitempty"`

	Validity DateSpan `json:"validity"`
}
