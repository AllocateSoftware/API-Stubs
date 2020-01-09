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

type BookingCancelledEvent struct {

	BookingRequestId string `json:"bookingRequestId"`

	BookingId string `json:"bookingId"`

	AgencyId string `json:"agencyId"`

	Cost float32 `json:"cost,omitempty"`
}
