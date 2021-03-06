/**
 * Worker API and Events
 *      ## API and events for providing workers. 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@allocatesoftware.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


export interface WorkingRestrictionRestrictions { 
    effectiveFrom?: string;
    daysPerWeek?: string;
    maxDaysPerWeek?: string;
    maxShiftsPerWeek?: string;
    maxConsecutiveDays?: string;
    maxConsecutiveDaysRequested?: string;
    maxWorkTimePerDay?: string;
    maxDurationPerShift?: string;
    additionalHoursPerWeek?: string;
    maxOvertimePerDay?: string;
    maxOvertimePerWeek?: string;
    maxOvertimePerCalendarMonth?: string;
    wtdDayStart?: string;
    wtdWeekDayStart?: string;
    wtdWeekTimeStart?: string;
    minBreakBetweenShifts?: number;
    notes?: string;
}

