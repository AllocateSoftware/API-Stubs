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
/* tslint:disable:no-unused-variable member-ordering */

import { Inject, Injectable, Optional }                      from '@angular/core';
import { HttpClient, HttpHeaders, HttpParams,
         HttpResponse, HttpEvent, HttpParameterCodec }       from '@angular/common/http';
import { CustomHttpParameterCodec }                          from '../encoder';
import { Observable }                                        from 'rxjs';

import { StructureProvision } from '../model/structureProvision';
import { UserProvision } from '../model/userProvision';

import { BASE_PATH, COLLECTION_FORMATS }                     from '../variables';
import { Configuration }                                     from '../configuration';



@Injectable({
  providedIn: 'root'
})
export class ProvisioningService {

    protected basePath = 'http://healthsuite.allocatesoftware.com/vms/provisioning/v1';
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
     * Provision the supplied structure.
     * @param id ID of the customer to provision
     * @param structureProvision Structure of the Customer (trust). This call should be considered a \&#39;set\&#39; - elements omitted that were present in previous provisionings should be removed.
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public provisionStructure(id: string, structureProvision: StructureProvision, observe?: 'body', reportProgress?: boolean): Observable<any>;
    public provisionStructure(id: string, structureProvision: StructureProvision, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<any>>;
    public provisionStructure(id: string, structureProvision: StructureProvision, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<any>>;
    public provisionStructure(id: string, structureProvision: StructureProvision, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {
        if (id === null || id === undefined) {
            throw new Error('Required parameter id was null or undefined when calling provisionStructure.');
        }
        if (structureProvision === null || structureProvision === undefined) {
            throw new Error('Required parameter structureProvision was null or undefined when calling provisionStructure.');
        }

        let headers = this.defaultHeaders;

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

        return this.httpClient.put<any>(`${this.configuration.basePath}/provision/customer/${encodeURIComponent(String(id))}`,
            structureProvision,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * Provision the supplied user.
     * @param id ID of the user to provision
     * @param userProvision Structure of the User
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public provisionUser(id: string, userProvision: UserProvision, observe?: 'body', reportProgress?: boolean): Observable<any>;
    public provisionUser(id: string, userProvision: UserProvision, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<any>>;
    public provisionUser(id: string, userProvision: UserProvision, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<any>>;
    public provisionUser(id: string, userProvision: UserProvision, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {
        if (id === null || id === undefined) {
            throw new Error('Required parameter id was null or undefined when calling provisionUser.');
        }
        if (userProvision === null || userProvision === undefined) {
            throw new Error('Required parameter userProvision was null or undefined when calling provisionUser.');
        }

        let headers = this.defaultHeaders;

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

        return this.httpClient.put<any>(`${this.configuration.basePath}/provision/user/${encodeURIComponent(String(id))}`,
            userProvision,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

}
