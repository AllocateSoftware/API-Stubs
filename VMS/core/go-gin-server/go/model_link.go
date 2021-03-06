/*
 * VMS API
 *
 * ## Description  API to be impemented by VMS systems for integration into HealthSuite business processes 
 *
 * API version: 1.0.0
 * Contact: support@allocatesoftware.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package allocateApi

type Link struct {

	// identifier for the type of link
	Rel string `json:"rel,omitempty"`

	// URL to resolve this link
	Href string `json:"href,omitempty"`
}
