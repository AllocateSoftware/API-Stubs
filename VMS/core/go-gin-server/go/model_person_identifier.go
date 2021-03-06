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

// PersonIdentifier - ID to specify a worker. Either an ID (relative to the receiving system) or universalId (such as National Insurance Number) may be used.
type PersonIdentifier struct {

	// identifier of the person (worker) within the VMS
	Id string `json:"id,omitempty"`

	// Global identifer, such as National Insurance number (where known), or other identifier or composite identifier that may be used for matching purposes.
	UniversalId string `json:"universalId,omitempty"`
}
