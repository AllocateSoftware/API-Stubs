/**
 * Workers
 * ## Workers and events 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@allocatesoftware.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
import { DateSpan } from './dateSpan';


export interface Visa { 
    number?: string;
    country?: string;
    issuingOffice?: string;
    type?: string;
    entries?: string;
    validity: DateSpan;
}
