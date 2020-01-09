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


/**
 * Where an API may respond with an asynchronous \'Accepted\' (HTTP 202) response, it will return an AsyncResponse object. The eventual                 response will be returned by way of an async event, containing the corresponding correlation ID header returned below.                                  The location of the correlation ID will depend upon the eventing transport in use - though typically it will be included as a message header (rather than a payload).             
 */
export interface AsyncResponse { 
    /**
     * Correlation Identifier
     */
    id: string;
}

