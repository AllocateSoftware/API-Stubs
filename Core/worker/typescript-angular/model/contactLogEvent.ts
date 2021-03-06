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
import { ContactLogInformation } from './contactLogInformation';


/**
 * Denote a contact with a worker
 */
export interface ContactLogEvent { 
    /**
     * ASWid of the person
     */
    personId: string;
    contactLogInformation: { [key: string]: ContactLogInformation; };
}

