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

type WorkingRestrictionHoursOfWork struct {

	Mon TimeSpan `json:"mon,omitempty"`

	Tue TimeSpan `json:"tue,omitempty"`

	Wed TimeSpan `json:"wed,omitempty"`

	Thu TimeSpan `json:"thu,omitempty"`

	Fri TimeSpan `json:"fri,omitempty"`

	Sat TimeSpan `json:"sat,omitempty"`

	Sun TimeSpan `json:"sun,omitempty"`
}