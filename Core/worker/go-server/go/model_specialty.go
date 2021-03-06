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

type Specialty struct {

	TempStaffSpeciality string `json:"tempStaffSpeciality,omitempty"`

	Validity DateSpan `json:"validity"`

	Notes string `json:"notes,omitempty"`
}
