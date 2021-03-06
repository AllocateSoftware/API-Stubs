/*
 * Duties and Events
 *
 * ## Duties and Events 
 *
 * API version: 1.0.0
 * Contact: support@allocatesoftware.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package allocateApi

import (
	"time"
)

type DateSpan struct {

	// Start date-time
	Start time.Time `json:"start,omitempty"`

	// End date-time
	End time.Time `json:"end,omitempty"`
}
