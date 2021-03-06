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
import { Event } from './event';
import { DutyAssignmentRedeploymentEventAllOf } from './dutyAssignmentRedeploymentEventAllOf';


export interface DutyAssignmentRedeploymentEvent extends Event { 
    assignmentNumber?: string;
    originalDuty?: Duty;
    newDuty?: Duty;
}

