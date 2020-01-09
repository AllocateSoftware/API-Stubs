/**
 * VMS Provisioning API
 * ## Description  API to be impemented by 247Time (and, potentially, partners) to enable provisioning of accounts and the org structure 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@allocatesoftware.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


export interface UserProvisionItem { 
    /**
     * Identifier of the unit within the HealthSuite ecosystem
     */
    unitId?: string;
    /**
     * Optional list of textual roles that the user has in relation to the unit
     */
    roles?: Array<string>;
}

