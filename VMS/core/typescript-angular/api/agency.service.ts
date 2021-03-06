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
/* tslint:disable:no-unused-variable member-ordering */

import { Inject, Injectable, Optional }                      from '@angular/core';
import { HttpClient, HttpHeaders, HttpParams,
         HttpResponse, HttpEvent, HttpParameterCodec }       from '@angular/common/http';
import { CustomHttpParameterCodec }                          from '../encoder';
import { Observable }                                        from 'rxjs';

import { PersonIdentifier } from '../model/personIdentifier';

import { BASE_PATH, COLLECTION_FORMATS }                     from '../variables';
import { Configuration }                                     from '../configuration';



@Injectable({
  providedIn: 'root'
})
export class AgencyService {

    protected basePath = 'http://healthsuite.allocatesoftware.com/vms/api/v1';
    public defaultHeaders = new HttpHeaders();
    public configuration = new Configuration();
    public encoder: HttpParameterCodec;

    constructor(protected httpClient: HttpClient, @Optional()@Inject(BASE_PATH) basePath: string, @Optional() configuration: Configuration) {
        if (configuration) {
            this.configuration = configuration;
        }
        if (typeof this.configuration.basePath !== 'string') {
            if (typeof basePath !== 'string') {
                basePath = this.basePath;
            }
            this.configuration.basePath = basePath;
        }
        this.encoder = this.configuration.encoder || new CustomHttpParameterCodec();
    }



    /**
     * Offer a worker for a booking
     * @param bookingRequestId ID of the booking request to offer a worker for.
     * @param personIdentifier Worker to be offered
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public offerWorker(bookingRequestId: string, personIdentifier: PersonIdentifier, observe?: 'body', reportProgress?: boolean): Observable<any>;
    public offerWorker(bookingRequestId: string, personIdentifier: PersonIdentifier, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<any>>;
    public offerWorker(bookingRequestId: string, personIdentifier: PersonIdentifier, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<any>>;
    public offerWorker(bookingRequestId: string, personIdentifier: PersonIdentifier, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {
        if (bookingRequestId === null || bookingRequestId === undefined) {
            throw new Error('Required parameter bookingRequestId was null or undefined when calling offerWorker.');
        }
        if (personIdentifier === null || personIdentifier === undefined) {
            throw new Error('Required parameter personIdentifier was null or undefined when calling offerWorker.');
        }

        let headers = this.defaultHeaders;

        // authentication (bearerAuth) required
        if (this.configuration.accessToken) {
            const accessToken = typeof this.configuration.accessToken === 'function'
                ? this.configuration.accessToken()
                : this.configuration.accessToken;
            headers = headers.set('Authorization', 'Bearer ' + accessToken);
        }
        // to determine the Accept header
        const httpHeaderAccepts: string[] = [
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected !== undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }


        // to determine the Content-Type header
        const consumes: string[] = [
            'application/json'
        ];
        const httpContentTypeSelected: string | undefined = this.configuration.selectHeaderContentType(consumes);
        if (httpContentTypeSelected !== undefined) {
            headers = headers.set('Content-Type', httpContentTypeSelected);
        }

        return this.httpClient.post<any>(`${this.configuration.basePath}/bookingRequests/${encodeURIComponent(String(bookingRequestId))}/offers`,
            personIdentifier,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

}
