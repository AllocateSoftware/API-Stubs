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
import { Duty } from './duty';


/**
 * A vacancy has become available for filling.
 */
export interface VacancyPublishedEvent { 
    /**
     * ID of the vacancy
     */
    id: string;
    duty: Duty;
}

