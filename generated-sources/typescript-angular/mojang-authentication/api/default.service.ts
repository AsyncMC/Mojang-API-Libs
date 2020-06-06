/**
 * Mojang Authentication API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2020-06-05
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
/* tslint:disable:no-unused-variable member-ordering */

import { Inject, Injectable, Optional }                      from '@angular/core';
import { HttpClient, HttpHeaders, HttpParams,
         HttpResponse, HttpEvent }                           from '@angular/common/http';
import { CustomHttpUrlEncodingCodec }                        from '../encoder';

import { Observable }                                        from 'rxjs/Observable';

import { AccessKeys } from '../model/accessKeys';
import { Authentication } from '../model/authentication';
import { AuthenticationRequest } from '../model/authenticationRequest';
import { RefreshRequest } from '../model/refreshRequest';
import { RefreshResponse } from '../model/refreshResponse';
import { UsernamePassword } from '../model/usernamePassword';

import { BASE_PATH, COLLECTION_FORMATS }                     from '../variables';
import { Configuration }                                     from '../configuration';


@Injectable()
export class DefaultService {

    protected basePath = 'https://authserver.mojang.com';
    public defaultHeaders = new HttpHeaders();
    public configuration = new Configuration();

    constructor(protected httpClient: HttpClient, @Optional()@Inject(BASE_PATH) basePath: string, @Optional() configuration: Configuration) {

        if (configuration) {
            this.configuration = configuration;
            this.configuration.basePath = configuration.basePath || basePath || this.basePath;

        } else {
            this.configuration.basePath = basePath || this.basePath;
        }
    }

    /**
     * @param consumes string[] mime-types
     * @return true: consumes contains 'multipart/form-data', false: otherwise
     */
    private canConsumeForm(consumes: string[]): boolean {
        const form = 'multipart/form-data';
        for (const consume of consumes) {
            if (form === consume) {
                return true;
            }
        }
        return false;
    }


    /**
     * 
     * 
     * @param authenticationRequest 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public authenticate(authenticationRequest: AuthenticationRequest, observe?: 'body', reportProgress?: boolean): Observable<Authentication>;
    public authenticate(authenticationRequest: AuthenticationRequest, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<Authentication>>;
    public authenticate(authenticationRequest: AuthenticationRequest, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<Authentication>>;
    public authenticate(authenticationRequest: AuthenticationRequest, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {
        if (authenticationRequest === null || authenticationRequest === undefined) {
            throw new Error('Required parameter authenticationRequest was null or undefined when calling authenticate.');
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
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

        return this.httpClient.post<Authentication>(`${this.configuration.basePath}/authenticate`,
            authenticationRequest,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * 
     * 
     * @param accessKeys 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public invalidate(accessKeys: AccessKeys, observe?: 'body', reportProgress?: boolean): Observable<any>;
    public invalidate(accessKeys: AccessKeys, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<any>>;
    public invalidate(accessKeys: AccessKeys, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<any>>;
    public invalidate(accessKeys: AccessKeys, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {
        if (accessKeys === null || accessKeys === undefined) {
            throw new Error('Required parameter accessKeys was null or undefined when calling invalidate.');
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
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

        return this.httpClient.post<any>(`${this.configuration.basePath}/invalidate`,
            accessKeys,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * 
     * 
     * @param refreshRequest 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public refresh(refreshRequest: RefreshRequest, observe?: 'body', reportProgress?: boolean): Observable<RefreshResponse>;
    public refresh(refreshRequest: RefreshRequest, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<RefreshResponse>>;
    public refresh(refreshRequest: RefreshRequest, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<RefreshResponse>>;
    public refresh(refreshRequest: RefreshRequest, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {
        if (refreshRequest === null || refreshRequest === undefined) {
            throw new Error('Required parameter refreshRequest was null or undefined when calling refresh.');
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
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

        return this.httpClient.post<RefreshResponse>(`${this.configuration.basePath}/refresh`,
            refreshRequest,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * 
     * 
     * @param usernamePassword 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public siginout(usernamePassword: UsernamePassword, observe?: 'body', reportProgress?: boolean): Observable<any>;
    public siginout(usernamePassword: UsernamePassword, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<any>>;
    public siginout(usernamePassword: UsernamePassword, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<any>>;
    public siginout(usernamePassword: UsernamePassword, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {
        if (usernamePassword === null || usernamePassword === undefined) {
            throw new Error('Required parameter usernamePassword was null or undefined when calling siginout.');
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
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

        return this.httpClient.post<any>(`${this.configuration.basePath}/signout`,
            usernamePassword,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * 
     * 
     * @param accessKeys 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public validate(accessKeys: AccessKeys, observe?: 'body', reportProgress?: boolean): Observable<any>;
    public validate(accessKeys: AccessKeys, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<any>>;
    public validate(accessKeys: AccessKeys, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<any>>;
    public validate(accessKeys: AccessKeys, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {
        if (accessKeys === null || accessKeys === undefined) {
            throw new Error('Required parameter accessKeys was null or undefined when calling validate.');
        }

        let headers = this.defaultHeaders;

        // to determine the Accept header
        let httpHeaderAccepts: string[] = [
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

        return this.httpClient.post<any>(`${this.configuration.basePath}/validate`,
            accessKeys,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

}
