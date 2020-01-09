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

type WorkingRestrictionRestrictions struct {

	EffectiveFrom string `json:"effectiveFrom,omitempty"`

	DaysPerWeek string `json:"daysPerWeek,omitempty"`

	MaxDaysPerWeek string `json:"maxDaysPerWeek,omitempty"`

	MaxShiftsPerWeek string `json:"maxShiftsPerWeek,omitempty"`

	MaxConsecutiveDays string `json:"maxConsecutiveDays,omitempty"`

	MaxConsecutiveDaysRequested string `json:"maxConsecutiveDaysRequested,omitempty"`

	MaxWorkTimePerDay string `json:"maxWorkTimePerDay,omitempty"`

	MaxDurationPerShift string `json:"maxDurationPerShift,omitempty"`

	AdditionalHoursPerWeek string `json:"additionalHoursPerWeek,omitempty"`

	MaxOvertimePerDay string `json:"maxOvertimePerDay,omitempty"`

	MaxOvertimePerWeek string `json:"maxOvertimePerWeek,omitempty"`

	MaxOvertimePerCalendarMonth string `json:"maxOvertimePerCalendarMonth,omitempty"`

	WtdDayStart string `json:"wtdDayStart,omitempty"`

	WtdWeekDayStart string `json:"wtdWeekDayStart,omitempty"`

	WtdWeekTimeStart string `json:"wtdWeekTimeStart,omitempty"`

	MinBreakBetweenShifts float32 `json:"minBreakBetweenShifts,omitempty"`

	Notes string `json:"notes,omitempty"`
}
