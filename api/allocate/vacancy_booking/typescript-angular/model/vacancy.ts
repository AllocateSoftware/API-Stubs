/**
 * Vacancy Booking API and Events
 *      ## Duty Booking API and events and Events 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@allocatesoftware.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
import { VacancyWhen } from './vacancyWhen';
import { VacancyWhere } from './vacancyWhere';
import { VacancyPersonRequirements } from './vacancyPersonRequirements';


export interface Vacancy { 
    /**
     * Identifier for this vacancy
     */
    id: string;
    when?: VacancyWhen;
    where?: VacancyWhere;
    /**
     * Reason for the request
     */
    reason?: string;
    personRequirements?: VacancyPersonRequirements;
}

