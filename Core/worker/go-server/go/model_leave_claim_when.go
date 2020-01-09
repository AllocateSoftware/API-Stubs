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

type LeaveClaimWhen struct {

	// 1st day (inclusive) of leave claim
	From string `json:"from,omitempty"`

	// Last day (inclusive) of leave claim
	To string `json:"to,omitempty"`
}
