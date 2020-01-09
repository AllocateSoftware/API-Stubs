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

type DutyAssignmentRedeploymentEventAllOf struct {

	AssignmentNumber string `json:"assignmentNumber,omitempty"`

	OriginalDuty Duty `json:"originalDuty,omitempty"`

	NewDuty Duty `json:"newDuty,omitempty"`
}
