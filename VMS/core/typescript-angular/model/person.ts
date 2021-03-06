/**
 * VMS API
 * ## Description  API to be impemented by VMS systems for integration into HealthSuite business processes 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@allocatesoftware.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
import { Link } from './link';


/**
 * Details of a Person in the VMS, typically a Worker.
 */
export interface Person { 
    /**
     * identifier of the person (worker) within the VMS
     */
    id?: string;
    /**
     * Global identifer, such as National Insurance number (where known), or other identifier or composite identifier that may be used for matching purposes.
     */
    universalId?: string;
    firstName?: string;
    surname?: string;
    email?: string;
    telephoneNumber?: string;
    /**
     * Array of HATEOAS-style references that may be followed by the client. This may include a \'worker.profile\' URL, which will return an HTML page representing the worker profile within the VMS.
     */
    links?: Array<Link>;
}

