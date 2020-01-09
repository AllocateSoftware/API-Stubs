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

type WorkingRestriction struct {

	Title string `json:"title"`

	Validity DateSpan `json:"validity"`

	HoursOfWork WorkingRestrictionHoursOfWork `json:"hoursOfWork"`

	DefaultLeaveHours WorkingRestrictionDefaultLeaveHours `json:"defaultLeaveHours"`

	Restrictions WorkingRestrictionRestrictions `json:"restrictions"`
}