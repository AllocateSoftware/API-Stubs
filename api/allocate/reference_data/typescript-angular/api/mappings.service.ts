/**
 * Reference data and Mappings API
 *      ## API for accessing reference data and mapping information 
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

import { Mapping } from '../model/mapping';
import { MappingSet } from '../model/mappingSet';

import { BASE_PATH, COLLECTION_FORMATS }                     from '../variables';
import { Configuration }                                     from '../configuration';



@Injectable({
  providedIn: 'root'
})
export class MappingsService {

    protected basePath = 'http://healthsuite.allocatesoftware.com/api/v1';
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
     * Create a new entry in a mapping set
     * @param setId The ID of the mapping set
     * @param mapping Details of the mapping
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public createMapping(setId: string, mapping: Mapping, observe?: 'body', reportProgress?: boolean): Observable<string>;
    public createMapping(setId: string, mapping: Mapping, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<string>>;
    public createMapping(setId: string, mapping: Mapping, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<string>>;
    public createMapping(setId: string, mapping: Mapping, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {
        if (setId === null || setId === undefined) {
            throw new Error('Required parameter setId was null or undefined when calling createMapping.');
        }
        if (mapping === null || mapping === undefined) {
            throw new Error('Required parameter mapping was null or undefined when calling createMapping.');
        }

        let headers = this.defaultHeaders;

        // authentication (jwt) required
        if (this.configuration.accessToken) {
            const accessToken = typeof this.configuration.accessToken === 'function'
                ? this.configuration.accessToken()
                : this.configuration.accessToken;
            headers = headers.set('Authorization', 'Bearer ' + accessToken);
        }
        // to determine the Accept header
        const httpHeaderAccepts: string[] = [
            'text/plain'
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

        return this.httpClient.post<string>(`${this.configuration.basePath}/mappingSets/${encodeURIComponent(String(setId))}/mappings`,
            mapping,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * Delete a vocabulary entry
     * @param id The ID of the vocabulary
     * @param mappingId The ID of the mapping
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public deleteMapping(id: string, mappingId: string, observe?: 'body', reportProgress?: boolean): Observable<any>;
    public deleteMapping(id: string, mappingId: string, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<any>>;
    public deleteMapping(id: string, mappingId: string, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<any>>;
    public deleteMapping(id: string, mappingId: string, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {
        if (id === null || id === undefined) {
            throw new Error('Required parameter id was null or undefined when calling deleteMapping.');
        }
        if (mappingId === null || mappingId === undefined) {
            throw new Error('Required parameter mappingId was null or undefined when calling deleteMapping.');
        }

        let headers = this.defaultHeaders;

        // authentication (jwt) required
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


        return this.httpClient.delete<any>(`${this.configuration.basePath}/mappingSets/${encodeURIComponent(String(id))}/mappings/${encodeURIComponent(String(mappingId))}`,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * Return the mapping
     * @param id The ID of the mapping set
     * @param mappingId The ID of the mapping set element
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public getMapping(id: string, mappingId: string, observe?: 'body', reportProgress?: boolean): Observable<Mapping>;
    public getMapping(id: string, mappingId: string, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<Mapping>>;
    public getMapping(id: string, mappingId: string, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<Mapping>>;
    public getMapping(id: string, mappingId: string, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {
        if (id === null || id === undefined) {
            throw new Error('Required parameter id was null or undefined when calling getMapping.');
        }
        if (mappingId === null || mappingId === undefined) {
            throw new Error('Required parameter mappingId was null or undefined when calling getMapping.');
        }

        let headers = this.defaultHeaders;

        // authentication (jwt) required
        if (this.configuration.accessToken) {
            const accessToken = typeof this.configuration.accessToken === 'function'
                ? this.configuration.accessToken()
                : this.configuration.accessToken;
            headers = headers.set('Authorization', 'Bearer ' + accessToken);
        }
        // to determine the Accept header
        const httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected !== undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }


        return this.httpClient.get<Mapping>(`${this.configuration.basePath}/mappingSets/${encodeURIComponent(String(id))}/mappings/${encodeURIComponent(String(mappingId))}`,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * Get a mapping set by ID
     * @param setId The ID of the vocabulary type
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public getMappingSetById(setId: string, observe?: 'body', reportProgress?: boolean): Observable<MappingSet>;
    public getMappingSetById(setId: string, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<MappingSet>>;
    public getMappingSetById(setId: string, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<MappingSet>>;
    public getMappingSetById(setId: string, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {
        if (setId === null || setId === undefined) {
            throw new Error('Required parameter setId was null or undefined when calling getMappingSetById.');
        }

        let headers = this.defaultHeaders;

        // authentication (jwt) required
        if (this.configuration.accessToken) {
            const accessToken = typeof this.configuration.accessToken === 'function'
                ? this.configuration.accessToken()
                : this.configuration.accessToken;
            headers = headers.set('Authorization', 'Bearer ' + accessToken);
        }
        // to determine the Accept header
        const httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected !== undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }


        return this.httpClient.get<MappingSet>(`${this.configuration.basePath}/mappingSets/${encodeURIComponent(String(setId))}`,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * Return a list of mapping sets that you may utilise
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public getMappingSets(observe?: 'body', reportProgress?: boolean): Observable<Array<MappingSet>>;
    public getMappingSets(observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<Array<MappingSet>>>;
    public getMappingSets(observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<Array<MappingSet>>>;
    public getMappingSets(observe: any = 'body', reportProgress: boolean = false ): Observable<any> {

        let headers = this.defaultHeaders;

        // authentication (jwt) required
        if (this.configuration.accessToken) {
            const accessToken = typeof this.configuration.accessToken === 'function'
                ? this.configuration.accessToken()
                : this.configuration.accessToken;
            headers = headers.set('Authorization', 'Bearer ' + accessToken);
        }
        // to determine the Accept header
        const httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected !== undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }


        return this.httpClient.get<Array<MappingSet>>(`${this.configuration.basePath}/mappingSets`,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * Return the elements of a mapping set
     * @param setId The ID of the mapping set
     * @param fromCode Search for a mapping where the from code matches the provided string
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public getMappings(setId: string, fromCode?: string, observe?: 'body', reportProgress?: boolean): Observable<Array<Mapping>>;
    public getMappings(setId: string, fromCode?: string, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<Array<Mapping>>>;
    public getMappings(setId: string, fromCode?: string, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<Array<Mapping>>>;
    public getMappings(setId: string, fromCode?: string, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {
        if (setId === null || setId === undefined) {
            throw new Error('Required parameter setId was null or undefined when calling getMappings.');
        }

        let queryParameters = new HttpParams({encoder: this.encoder});
        if (fromCode !== undefined && fromCode !== null) {
            queryParameters = queryParameters.set('fromCode', <any>fromCode);
        }

        let headers = this.defaultHeaders;

        // authentication (jwt) required
        if (this.configuration.accessToken) {
            const accessToken = typeof this.configuration.accessToken === 'function'
                ? this.configuration.accessToken()
                : this.configuration.accessToken;
            headers = headers.set('Authorization', 'Bearer ' + accessToken);
        }
        // to determine the Accept header
        const httpHeaderAccepts: string[] = [
            'application/json'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected !== undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }


        return this.httpClient.get<Array<Mapping>>(`${this.configuration.basePath}/mappingSets/${encodeURIComponent(String(setId))}/mappings`,
            {
                params: queryParameters,
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * Update a mapping
     * @param id The ID of the vocabulary
     * @param mappingId The ID of the vocabulary element
     * @param mapping Details of the mapping
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public putMapping(id: string, mappingId: string, mapping: Mapping, observe?: 'body', reportProgress?: boolean): Observable<any>;
    public putMapping(id: string, mappingId: string, mapping: Mapping, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<any>>;
    public putMapping(id: string, mappingId: string, mapping: Mapping, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<any>>;
    public putMapping(id: string, mappingId: string, mapping: Mapping, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {
        if (id === null || id === undefined) {
            throw new Error('Required parameter id was null or undefined when calling putMapping.');
        }
        if (mappingId === null || mappingId === undefined) {
            throw new Error('Required parameter mappingId was null or undefined when calling putMapping.');
        }
        if (mapping === null || mapping === undefined) {
            throw new Error('Required parameter mapping was null or undefined when calling putMapping.');
        }

        let headers = this.defaultHeaders;

        // authentication (jwt) required
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

        return this.httpClient.put<any>(`${this.configuration.basePath}/mappingSets/${encodeURIComponent(String(id))}/mappings/${encodeURIComponent(String(mappingId))}`,
            mapping,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

}