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

type DutyTempStaffingNoteCreatedEvent struct {

	EventType string `json:"eventType"`

	DutyId string `json:"dutyId,omitempty"`

	// Identifier for the note
	NoteId string `json:"noteId,omitempty"`

	// Content for the note
	Content string `json:"content,omitempty"`
}