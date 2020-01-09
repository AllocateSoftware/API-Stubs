/*
 * Activity API
 *
 *      ## API for querying worker activity.      This is an early availabilty API, and is subject to change. 
 *
 * API version: 0.0.1
 * Contact: support@allocatesoftware.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package allocateApi

type HoursAssignmentCancellationReason struct {

	Name string `json:"name,omitempty"`

	Description string `json:"description,omitempty"`

	ExternalReference string `json:"externalReference,omitempty"`
}
