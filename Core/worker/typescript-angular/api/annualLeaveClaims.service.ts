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
/* tslint:disable:no-unused-variable member-ordering */

import { Inject, Injectable, Optional }                      from '@angular/core';
import { HttpClient, HttpHeaders, HttpParams,
         HttpResponse, HttpEvent, HttpParameterCodec }       from '@angular/common/http';
import { CustomHttpParameterCodec }                          from '../encoder';
import { Observable }                                        from 'rxjs';

import { AsyncResponse } from '../model/asyncResponse';
import { LeaveClaim } from '../model/leaveClaim';

import { BASE_PATH, COLLECTION_FORMATS }                     from '../variables';
import { Configuration }                                     from '../configuration';



@Injectable({
  providedIn: 'root'
})
export class AnnualLeaveClaimsService {

    protected basePath = 'http://healthsuite.allocatesoftware.com/api/worker/v1';
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
     * Submit an leave (vacation) claim for a worker
     * @param id ID of the worker
     * @param leaveClaim Leave claim for a worker
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public submitAnnualLeaveClaim(id: string, leaveClaim: LeaveClaim, observe?: 'body', reportProgress?: boolean): Observable<AsyncResponse>;
    public submitAnnualLeaveClaim(id: string, leaveClaim: LeaveClaim, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<AsyncResponse>>;
    public submitAnnualLeaveClaim(id: string, leaveClaim: LeaveClaim, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<AsyncResponse>>;
    public submitAnnualLeaveClaim(id: string, leaveClaim: LeaveClaim, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {
        if (id === null || id === undefined) {
            throw new Error('Required parameter id was null or undefined when calling submitAnnualLeaveClaim.');
        }
        if (leaveClaim === null || leaveClaim === undefined) {
            throw new Error('Required parameter leaveClaim was null or undefined when calling submitAnnualLeaveClaim.');
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        const httpHeaderAccepts: string[] = [
            'application/json'
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

        return this.httpClient.post<AsyncResponse>(`${this.configuration.basePath}/worker/${encodeURIComponent(String(id))}/leave`,
            leaveClaim,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

}