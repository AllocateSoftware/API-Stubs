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
import { CancellationCost } from './cancellationCost';


export interface ProposalDetails { 
    /**
     * Allocate PersonID for the person being proposed
     */
    personId: string;
    /**
     * The engagement route for this worker
     */
    engagementRoute: ProposalDetails.EngagementRouteEnum;
    /**
     * The Allocate Agency ID for the agency, if this worker is being provided through an agency engagement
     */
    agencyId?: string;
    cost?: number;
    cancellationCosts?: Array<CancellationCost>;
}
export namespace ProposalDetails {
    export type EngagementRouteEnum = 'substantive' | 'bank' | 'agency' | 'other';
    export const EngagementRouteEnum = {
        Substantive: 'substantive' as EngagementRouteEnum,
        Bank: 'bank' as EngagementRouteEnum,
        Agency: 'agency' as EngagementRouteEnum,
        Other: 'other' as EngagementRouteEnum
    };
}

