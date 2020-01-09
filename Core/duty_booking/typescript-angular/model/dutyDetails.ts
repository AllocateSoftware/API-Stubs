/**
 * Duty Booking API and Events
 * ## Duty Booking API and events and Events 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@allocatesoftware.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
import { DutyDetailsWhere } from './dutyDetailsWhere';
import { DutyDetailsWhen } from './dutyDetailsWhen';


export interface DutyDetails { 
    when?: DutyDetailsWhen;
    where?: DutyDetailsWhere;
    requirements?: object;
}

