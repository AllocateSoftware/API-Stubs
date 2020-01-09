/*
 * DE Provider Direct Engagement API
 *
 * description
 *
 * API version: 1.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package allocateApi

type BookingResponse struct {

	// Trust identifier of the booked duty
	DutyId string `json:"dutyId,omitempty"`

	// Trust identifier of the booking in BankStaff
	BookingId string `json:"bookingId,omitempty"`

	// Trust identifier of the booked person in BankStaff
	AllocatePersonId string `json:"allocatePersonId,omitempty"`

	// Trust identifier of the master duty if the duty is part of the consolidated duty
	MasterDutyId string `json:"masterDutyId,omitempty"`

	// Trust identifier of the slave duty if the duty is part of the consolidated duty
	SlaveDutyId string `json:"slaveDutyId,omitempty"`
}
