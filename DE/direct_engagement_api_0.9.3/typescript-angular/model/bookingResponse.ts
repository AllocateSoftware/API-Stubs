/**
 * DE Provider Direct Engagement API
 * description
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


export interface BookingResponse { 
    /**
     * Trust identifier of the booked duty
     */
    dutyId?: string;
    /**
     * Trust identifier of the booking in BankStaff
     */
    bookingId?: string;
    /**
     * Trust identifier of the booked person in BankStaff
     */
    allocatePersonId?: string;
    /**
     * Trust identifier of the master duty if the duty is part of the consolidated duty
     */
    masterDutyId?: string;
    /**
     * Trust identifier of the slave duty if the duty is part of the consolidated duty
     */
    slaveDutyId?: string;
}

