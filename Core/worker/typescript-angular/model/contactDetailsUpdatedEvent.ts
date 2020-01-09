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
import { ContactInformation } from './contactInformation';


export interface ContactDetailsUpdatedEvent { 
    /**
     * ASWid of the person
     */
    personId: string;
    contactInformation: { [key: string]: ContactInformation; };
}
