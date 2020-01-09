/**
 * DE Provider Direct Engagement API
 * description
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
import { Rates } from './rates';


export interface TimeIntervalRates { 
    startTime?: Date;
    endTime?: Date;
    /**
     * Trust Pay Agency & Trust Pays DE provider - split rate between pay to worker and pay to agency
     */
    rates?: Array<Rates>;
}

