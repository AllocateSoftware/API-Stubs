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

import (
	"time"
)

type DateSpan struct {

	// When the span starts
	From time.Time `json:"from"`

	// When the span ends
	To time.Time `json:"to,omitempty"`
}
