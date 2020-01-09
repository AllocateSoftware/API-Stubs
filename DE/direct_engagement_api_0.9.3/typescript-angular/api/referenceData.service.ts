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
/* tslint:disable:no-unused-variable member-ordering */

import { Inject, Injectable, Optional }                      from '@angular/core';
import { HttpClient, HttpHeaders, HttpParams,
         HttpResponse, HttpEvent, HttpParameterCodec }       from '@angular/common/http';
import { CustomHttpParameterCodec }                          from '../encoder';
import { Observable }                                        from 'rxjs';

import { ReferenceDataResponse } from '../model/referenceDataResponse';
import { UnitReferenceDataResponse } from '../model/unitReferenceDataResponse';

import { BASE_PATH, COLLECTION_FORMATS }                     from '../variables';
import { Configuration }                                     from '../configuration';



@Injectable({
  providedIn: 'root'
})
export class ReferenceDataService {

    protected basePath = 'http://localhost';
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
     * Get agencies
     * Returns an array of agencies
     * @param version API version
     * @param trustCode Trust code from BankStaff
     * @param id Array of reference data IDs to return
     * @param page Result page
     * @param pageSize Count of records per page
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public getAgenciesByIds(version: string, trustCode: string, id: Array<number>, page?: number, pageSize?: number, observe?: 'body', reportProgress?: boolean): Observable<Array<ReferenceDataResponse>>;
    public getAgenciesByIds(version: string, trustCode: string, id: Array<number>, page?: number, pageSize?: number, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<Array<ReferenceDataResponse>>>;
    public getAgenciesByIds(version: string, trustCode: string, id: Array<number>, page?: number, pageSize?: number, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<Array<ReferenceDataResponse>>>;
    public getAgenciesByIds(version: string, trustCode: string, id: Array<number>, page?: number, pageSize?: number, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {
        if (version === null || version === undefined) {
            throw new Error('Required parameter version was null or undefined when calling getAgenciesByIds.');
        }
        if (trustCode === null || trustCode === undefined) {
            throw new Error('Required parameter trustCode was null or undefined when calling getAgenciesByIds.');
        }
        if (id === null || id === undefined) {
            throw new Error('Required parameter id was null or undefined when calling getAgenciesByIds.');
        }

        let queryParameters = new HttpParams({encoder: this.encoder});
        if (id) {
            id.forEach((element) => {
                queryParameters = queryParameters.append('id', <any>element);
            })
        }
        if (page !== undefined && page !== null) {
            queryParameters = queryParameters.set('page', <any>page);
        }
        if (pageSize !== undefined && pageSize !== null) {
            queryParameters = queryParameters.set('pageSize', <any>pageSize);
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        const httpHeaderAccepts: string[] = [
            'application/json',
            'text/plain'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected !== undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }


        return this.httpClient.get<Array<ReferenceDataResponse>>(`${this.configuration.basePath}/${encodeURIComponent(String(version))}/trustcode/${encodeURIComponent(String(trustCode))}/referenceData/agency/`,
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
     * Get all agencies
     * Returns an array of agencies
     * @param version API version
     * @param trustCode Trust code from BankStaff
     * @param page Result page
     * @param pageSize Count of records per page
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public getAllAgencies(version: string, trustCode: string, page?: number, pageSize?: number, observe?: 'body', reportProgress?: boolean): Observable<Array<ReferenceDataResponse>>;
    public getAllAgencies(version: string, trustCode: string, page?: number, pageSize?: number, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<Array<ReferenceDataResponse>>>;
    public getAllAgencies(version: string, trustCode: string, page?: number, pageSize?: number, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<Array<ReferenceDataResponse>>>;
    public getAllAgencies(version: string, trustCode: string, page?: number, pageSize?: number, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {
        if (version === null || version === undefined) {
            throw new Error('Required parameter version was null or undefined when calling getAllAgencies.');
        }
        if (trustCode === null || trustCode === undefined) {
            throw new Error('Required parameter trustCode was null or undefined when calling getAllAgencies.');
        }

        let queryParameters = new HttpParams({encoder: this.encoder});
        if (page !== undefined && page !== null) {
            queryParameters = queryParameters.set('page', <any>page);
        }
        if (pageSize !== undefined && pageSize !== null) {
            queryParameters = queryParameters.set('pageSize', <any>pageSize);
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        const httpHeaderAccepts: string[] = [
            'application/json',
            'text/plain'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected !== undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }


        return this.httpClient.get<Array<ReferenceDataResponse>>(`${this.configuration.basePath}/${encodeURIComponent(String(version))}/trustcode/${encodeURIComponent(String(trustCode))}/referenceData/agency`,
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
     * Get all contract statuses
     * Returns an array of contract statuses.
     * @param version API version
     * @param trustCode Trust code from BankStaff
     * @param page Result page
     * @param pageSize Count of records per page
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public getAllContractStatuses(version: string, trustCode: string, page?: number, pageSize?: number, observe?: 'body', reportProgress?: boolean): Observable<Array<ReferenceDataResponse>>;
    public getAllContractStatuses(version: string, trustCode: string, page?: number, pageSize?: number, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<Array<ReferenceDataResponse>>>;
    public getAllContractStatuses(version: string, trustCode: string, page?: number, pageSize?: number, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<Array<ReferenceDataResponse>>>;
    public getAllContractStatuses(version: string, trustCode: string, page?: number, pageSize?: number, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {
        if (version === null || version === undefined) {
            throw new Error('Required parameter version was null or undefined when calling getAllContractStatuses.');
        }
        if (trustCode === null || trustCode === undefined) {
            throw new Error('Required parameter trustCode was null or undefined when calling getAllContractStatuses.');
        }

        let queryParameters = new HttpParams({encoder: this.encoder});
        if (page !== undefined && page !== null) {
            queryParameters = queryParameters.set('page', <any>page);
        }
        if (pageSize !== undefined && pageSize !== null) {
            queryParameters = queryParameters.set('pageSize', <any>pageSize);
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        const httpHeaderAccepts: string[] = [
            'application/json',
            'text/plain'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected !== undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }


        return this.httpClient.get<Array<ReferenceDataResponse>>(`${this.configuration.basePath}/${encodeURIComponent(String(version))}/trustcode/${encodeURIComponent(String(trustCode))}/referenceData/contractStatus`,
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
     * Get all grades
     * Returns an array of grades
     * @param version API version
     * @param trustCode Trust code from BankStaff
     * @param page Result page
     * @param pageSize Count of records per page
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public getAllGrades(version: string, trustCode: string, page?: number, pageSize?: number, observe?: 'body', reportProgress?: boolean): Observable<Array<ReferenceDataResponse>>;
    public getAllGrades(version: string, trustCode: string, page?: number, pageSize?: number, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<Array<ReferenceDataResponse>>>;
    public getAllGrades(version: string, trustCode: string, page?: number, pageSize?: number, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<Array<ReferenceDataResponse>>>;
    public getAllGrades(version: string, trustCode: string, page?: number, pageSize?: number, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {
        if (version === null || version === undefined) {
            throw new Error('Required parameter version was null or undefined when calling getAllGrades.');
        }
        if (trustCode === null || trustCode === undefined) {
            throw new Error('Required parameter trustCode was null or undefined when calling getAllGrades.');
        }

        let queryParameters = new HttpParams({encoder: this.encoder});
        if (page !== undefined && page !== null) {
            queryParameters = queryParameters.set('page', <any>page);
        }
        if (pageSize !== undefined && pageSize !== null) {
            queryParameters = queryParameters.set('pageSize', <any>pageSize);
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        const httpHeaderAccepts: string[] = [
            'application/json',
            'text/plain'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected !== undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }


        return this.httpClient.get<Array<ReferenceDataResponse>>(`${this.configuration.basePath}/${encodeURIComponent(String(version))}/trustcode/${encodeURIComponent(String(trustCode))}/referenceData/grade`,
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
     * Get all reasons for vacancy
     * Returns an array of reasons for vacancy
     * @param version API version
     * @param trustCode Trust code from BankStaff
     * @param page Result page
     * @param pageSize Count of records per page
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public getAllReasonsForVacancy(version: string, trustCode: string, page?: number, pageSize?: number, observe?: 'body', reportProgress?: boolean): Observable<Array<ReferenceDataResponse>>;
    public getAllReasonsForVacancy(version: string, trustCode: string, page?: number, pageSize?: number, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<Array<ReferenceDataResponse>>>;
    public getAllReasonsForVacancy(version: string, trustCode: string, page?: number, pageSize?: number, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<Array<ReferenceDataResponse>>>;
    public getAllReasonsForVacancy(version: string, trustCode: string, page?: number, pageSize?: number, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {
        if (version === null || version === undefined) {
            throw new Error('Required parameter version was null or undefined when calling getAllReasonsForVacancy.');
        }
        if (trustCode === null || trustCode === undefined) {
            throw new Error('Required parameter trustCode was null or undefined when calling getAllReasonsForVacancy.');
        }

        let queryParameters = new HttpParams({encoder: this.encoder});
        if (page !== undefined && page !== null) {
            queryParameters = queryParameters.set('page', <any>page);
        }
        if (pageSize !== undefined && pageSize !== null) {
            queryParameters = queryParameters.set('pageSize', <any>pageSize);
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        const httpHeaderAccepts: string[] = [
            'application/json',
            'text/plain'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected !== undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }


        return this.httpClient.get<Array<ReferenceDataResponse>>(`${this.configuration.basePath}/${encodeURIComponent(String(version))}/trustcode/${encodeURIComponent(String(trustCode))}/referenceData/reasonForVacancy`,
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
     * Get all staff groups
     * Returns an array of staff groups
     * @param version API version
     * @param trustCode Trust code from BankStaff
     * @param page Result page
     * @param pageSize Count of records per page
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public getAllStaffGroups(version: string, trustCode: string, page?: number, pageSize?: number, observe?: 'body', reportProgress?: boolean): Observable<Array<ReferenceDataResponse>>;
    public getAllStaffGroups(version: string, trustCode: string, page?: number, pageSize?: number, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<Array<ReferenceDataResponse>>>;
    public getAllStaffGroups(version: string, trustCode: string, page?: number, pageSize?: number, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<Array<ReferenceDataResponse>>>;
    public getAllStaffGroups(version: string, trustCode: string, page?: number, pageSize?: number, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {
        if (version === null || version === undefined) {
            throw new Error('Required parameter version was null or undefined when calling getAllStaffGroups.');
        }
        if (trustCode === null || trustCode === undefined) {
            throw new Error('Required parameter trustCode was null or undefined when calling getAllStaffGroups.');
        }

        let queryParameters = new HttpParams({encoder: this.encoder});
        if (page !== undefined && page !== null) {
            queryParameters = queryParameters.set('page', <any>page);
        }
        if (pageSize !== undefined && pageSize !== null) {
            queryParameters = queryParameters.set('pageSize', <any>pageSize);
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        const httpHeaderAccepts: string[] = [
            'application/json',
            'text/plain'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected !== undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }


        return this.httpClient.get<Array<ReferenceDataResponse>>(`${this.configuration.basePath}/${encodeURIComponent(String(version))}/trustcode/${encodeURIComponent(String(trustCode))}/referenceData/staffGroup`,
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
     * Get all units
     * Returns an array of units
     * @param version API version
     * @param trustCode Trust code from BankStaff
     * @param page Result page
     * @param pageSize Count of records per page
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public getAllUnits(version: string, trustCode: string, page?: number, pageSize?: number, observe?: 'body', reportProgress?: boolean): Observable<Array<UnitReferenceDataResponse>>;
    public getAllUnits(version: string, trustCode: string, page?: number, pageSize?: number, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<Array<UnitReferenceDataResponse>>>;
    public getAllUnits(version: string, trustCode: string, page?: number, pageSize?: number, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<Array<UnitReferenceDataResponse>>>;
    public getAllUnits(version: string, trustCode: string, page?: number, pageSize?: number, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {
        if (version === null || version === undefined) {
            throw new Error('Required parameter version was null or undefined when calling getAllUnits.');
        }
        if (trustCode === null || trustCode === undefined) {
            throw new Error('Required parameter trustCode was null or undefined when calling getAllUnits.');
        }

        let queryParameters = new HttpParams({encoder: this.encoder});
        if (page !== undefined && page !== null) {
            queryParameters = queryParameters.set('page', <any>page);
        }
        if (pageSize !== undefined && pageSize !== null) {
            queryParameters = queryParameters.set('pageSize', <any>pageSize);
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        const httpHeaderAccepts: string[] = [
            'application/json',
            'text/plain'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected !== undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }


        return this.httpClient.get<Array<UnitReferenceDataResponse>>(`${this.configuration.basePath}/${encodeURIComponent(String(version))}/trustcode/${encodeURIComponent(String(trustCode))}/referenceData/unit`,
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
     * Get contract statuses
     * Returns an array of contract statuses
     * @param version API version
     * @param trustCode Trust code from BankStaff
     * @param id Array of reference data IDs to return
     * @param page Result page
     * @param pageSize Count of records per page
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public getContractStatusesByIds(version: string, trustCode: string, id: Array<string>, page?: number, pageSize?: number, observe?: 'body', reportProgress?: boolean): Observable<Array<ReferenceDataResponse>>;
    public getContractStatusesByIds(version: string, trustCode: string, id: Array<string>, page?: number, pageSize?: number, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<Array<ReferenceDataResponse>>>;
    public getContractStatusesByIds(version: string, trustCode: string, id: Array<string>, page?: number, pageSize?: number, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<Array<ReferenceDataResponse>>>;
    public getContractStatusesByIds(version: string, trustCode: string, id: Array<string>, page?: number, pageSize?: number, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {
        if (version === null || version === undefined) {
            throw new Error('Required parameter version was null or undefined when calling getContractStatusesByIds.');
        }
        if (trustCode === null || trustCode === undefined) {
            throw new Error('Required parameter trustCode was null or undefined when calling getContractStatusesByIds.');
        }
        if (id === null || id === undefined) {
            throw new Error('Required parameter id was null or undefined when calling getContractStatusesByIds.');
        }

        let queryParameters = new HttpParams({encoder: this.encoder});
        if (id) {
            id.forEach((element) => {
                queryParameters = queryParameters.append('id', <any>element);
            })
        }
        if (page !== undefined && page !== null) {
            queryParameters = queryParameters.set('page', <any>page);
        }
        if (pageSize !== undefined && pageSize !== null) {
            queryParameters = queryParameters.set('pageSize', <any>pageSize);
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        const httpHeaderAccepts: string[] = [
            'application/json',
            'text/plain'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected !== undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }


        return this.httpClient.get<Array<ReferenceDataResponse>>(`${this.configuration.basePath}/${encodeURIComponent(String(version))}/trustcode/${encodeURIComponent(String(trustCode))}/referenceData/contractStatus/`,
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
     * Get grades
     * Returns an array of grades
     * @param version API version
     * @param trustCode Trust code from BankStaff
     * @param id Array of reference data IDs to return
     * @param page Result page
     * @param pageSize Count of records per page
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public getGradesByIds(version: string, trustCode: string, id: Array<number>, page?: number, pageSize?: number, observe?: 'body', reportProgress?: boolean): Observable<Array<ReferenceDataResponse>>;
    public getGradesByIds(version: string, trustCode: string, id: Array<number>, page?: number, pageSize?: number, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<Array<ReferenceDataResponse>>>;
    public getGradesByIds(version: string, trustCode: string, id: Array<number>, page?: number, pageSize?: number, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<Array<ReferenceDataResponse>>>;
    public getGradesByIds(version: string, trustCode: string, id: Array<number>, page?: number, pageSize?: number, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {
        if (version === null || version === undefined) {
            throw new Error('Required parameter version was null or undefined when calling getGradesByIds.');
        }
        if (trustCode === null || trustCode === undefined) {
            throw new Error('Required parameter trustCode was null or undefined when calling getGradesByIds.');
        }
        if (id === null || id === undefined) {
            throw new Error('Required parameter id was null or undefined when calling getGradesByIds.');
        }

        let queryParameters = new HttpParams({encoder: this.encoder});
        if (id) {
            id.forEach((element) => {
                queryParameters = queryParameters.append('id', <any>element);
            })
        }
        if (page !== undefined && page !== null) {
            queryParameters = queryParameters.set('page', <any>page);
        }
        if (pageSize !== undefined && pageSize !== null) {
            queryParameters = queryParameters.set('pageSize', <any>pageSize);
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        const httpHeaderAccepts: string[] = [
            'application/json',
            'text/plain'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected !== undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }


        return this.httpClient.get<Array<ReferenceDataResponse>>(`${this.configuration.basePath}/${encodeURIComponent(String(version))}/trustcode/${encodeURIComponent(String(trustCode))}/referenceData/grade/`,
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
     * Get reasons for vacancy
     * Returns an array of reasons for vacancy
     * @param version API version
     * @param trustCode Trust code from BankStaff
     * @param id Array of reference data IDs to return
     * @param page Result page
     * @param pageSize Count of records per page
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public getReasonsForVacancyByIds(version: string, trustCode: string, id: Array<number>, page?: number, pageSize?: number, observe?: 'body', reportProgress?: boolean): Observable<Array<ReferenceDataResponse>>;
    public getReasonsForVacancyByIds(version: string, trustCode: string, id: Array<number>, page?: number, pageSize?: number, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<Array<ReferenceDataResponse>>>;
    public getReasonsForVacancyByIds(version: string, trustCode: string, id: Array<number>, page?: number, pageSize?: number, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<Array<ReferenceDataResponse>>>;
    public getReasonsForVacancyByIds(version: string, trustCode: string, id: Array<number>, page?: number, pageSize?: number, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {
        if (version === null || version === undefined) {
            throw new Error('Required parameter version was null or undefined when calling getReasonsForVacancyByIds.');
        }
        if (trustCode === null || trustCode === undefined) {
            throw new Error('Required parameter trustCode was null or undefined when calling getReasonsForVacancyByIds.');
        }
        if (id === null || id === undefined) {
            throw new Error('Required parameter id was null or undefined when calling getReasonsForVacancyByIds.');
        }

        let queryParameters = new HttpParams({encoder: this.encoder});
        if (id) {
            id.forEach((element) => {
                queryParameters = queryParameters.append('id', <any>element);
            })
        }
        if (page !== undefined && page !== null) {
            queryParameters = queryParameters.set('page', <any>page);
        }
        if (pageSize !== undefined && pageSize !== null) {
            queryParameters = queryParameters.set('pageSize', <any>pageSize);
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        const httpHeaderAccepts: string[] = [
            'application/json',
            'text/plain'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected !== undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }


        return this.httpClient.get<Array<ReferenceDataResponse>>(`${this.configuration.basePath}/${encodeURIComponent(String(version))}/trustcode/${encodeURIComponent(String(trustCode))}/referenceData/reasonForVacancy/`,
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
     * Get staff groups
     * Returns an array of staff groups
     * @param version API version
     * @param trustCode Trust code from BankStaff
     * @param id Array of reference data IDs to return
     * @param page Result page
     * @param pageSize Count of records per page
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public getStaffGroupsByIds(version: string, trustCode: string, id: Array<number>, page?: number, pageSize?: number, observe?: 'body', reportProgress?: boolean): Observable<Array<ReferenceDataResponse>>;
    public getStaffGroupsByIds(version: string, trustCode: string, id: Array<number>, page?: number, pageSize?: number, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<Array<ReferenceDataResponse>>>;
    public getStaffGroupsByIds(version: string, trustCode: string, id: Array<number>, page?: number, pageSize?: number, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<Array<ReferenceDataResponse>>>;
    public getStaffGroupsByIds(version: string, trustCode: string, id: Array<number>, page?: number, pageSize?: number, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {
        if (version === null || version === undefined) {
            throw new Error('Required parameter version was null or undefined when calling getStaffGroupsByIds.');
        }
        if (trustCode === null || trustCode === undefined) {
            throw new Error('Required parameter trustCode was null or undefined when calling getStaffGroupsByIds.');
        }
        if (id === null || id === undefined) {
            throw new Error('Required parameter id was null or undefined when calling getStaffGroupsByIds.');
        }

        let queryParameters = new HttpParams({encoder: this.encoder});
        if (id) {
            id.forEach((element) => {
                queryParameters = queryParameters.append('id', <any>element);
            })
        }
        if (page !== undefined && page !== null) {
            queryParameters = queryParameters.set('page', <any>page);
        }
        if (pageSize !== undefined && pageSize !== null) {
            queryParameters = queryParameters.set('pageSize', <any>pageSize);
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        const httpHeaderAccepts: string[] = [
            'application/json',
            'text/plain'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected !== undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }


        return this.httpClient.get<Array<ReferenceDataResponse>>(`${this.configuration.basePath}/${encodeURIComponent(String(version))}/trustcode/${encodeURIComponent(String(trustCode))}/referenceData/staffGroup/`,
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
     * Get units
     * Returns an array of units
     * @param version API version
     * @param trustCode Trust code from BankStaff
     * @param id Array of reference data IDs to return
     * @param page Result page
     * @param pageSize Count of records per page
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public getUnitsByIds(version: string, trustCode: string, id: Array<number>, page?: number, pageSize?: number, observe?: 'body', reportProgress?: boolean): Observable<Array<UnitReferenceDataResponse>>;
    public getUnitsByIds(version: string, trustCode: string, id: Array<number>, page?: number, pageSize?: number, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<Array<UnitReferenceDataResponse>>>;
    public getUnitsByIds(version: string, trustCode: string, id: Array<number>, page?: number, pageSize?: number, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<Array<UnitReferenceDataResponse>>>;
    public getUnitsByIds(version: string, trustCode: string, id: Array<number>, page?: number, pageSize?: number, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {
        if (version === null || version === undefined) {
            throw new Error('Required parameter version was null or undefined when calling getUnitsByIds.');
        }
        if (trustCode === null || trustCode === undefined) {
            throw new Error('Required parameter trustCode was null or undefined when calling getUnitsByIds.');
        }
        if (id === null || id === undefined) {
            throw new Error('Required parameter id was null or undefined when calling getUnitsByIds.');
        }

        let queryParameters = new HttpParams({encoder: this.encoder});
        if (id) {
            id.forEach((element) => {
                queryParameters = queryParameters.append('id', <any>element);
            })
        }
        if (page !== undefined && page !== null) {
            queryParameters = queryParameters.set('page', <any>page);
        }
        if (pageSize !== undefined && pageSize !== null) {
            queryParameters = queryParameters.set('pageSize', <any>pageSize);
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        const httpHeaderAccepts: string[] = [
            'application/json',
            'text/plain'
        ];
        const httpHeaderAcceptSelected: string | undefined = this.configuration.selectHeaderAccept(httpHeaderAccepts);
        if (httpHeaderAcceptSelected !== undefined) {
            headers = headers.set('Accept', httpHeaderAcceptSelected);
        }


        return this.httpClient.get<Array<UnitReferenceDataResponse>>(`${this.configuration.basePath}/${encodeURIComponent(String(version))}/trustcode/${encodeURIComponent(String(trustCode))}/referenceData/unit/`,
            {
                params: queryParameters,
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

}
