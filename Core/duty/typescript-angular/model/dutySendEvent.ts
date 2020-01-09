/**
 * Duties and Events
 * ## Duties and Events 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@allocatesoftware.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
import { Duty } from './duty';


export interface DutySendEvent { 
    eventType: string;
    /**
     * Where this duty has been sent
     */
    destination?: DutySendEvent.DestinationEnum;
    duty?: Duty;
}
export namespace DutySendEvent {
    export type DestinationEnum = 'bank' | 'agency' | 'cloudstaff';
    export const DestinationEnum = {
        Bank: 'bank' as DestinationEnum,
        Agency: 'agency' as DestinationEnum,
        Cloudstaff: 'cloudstaff' as DestinationEnum
    };
}


