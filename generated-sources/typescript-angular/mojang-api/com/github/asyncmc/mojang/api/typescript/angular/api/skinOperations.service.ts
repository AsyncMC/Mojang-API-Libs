/**
 * Mojang API
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

import { SkinModel } from '../com.github.asyncmc.mojang.api.typescript.angular.model/skinModel';

import { BASE_PATH, COLLECTION_FORMATS }                     from '../variables';
import { Configuration }                                     from '../configuration';


@Injectable()
export class SkinOperationsService {

    protected basePath = 'https://api.mojang.com';
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
     * Changes the player skin by URL
     * This will set the skin for the selected profile, but Mojang&#39;s servers will fetch the skin from a URL. This will also work for legacy accounts.
     * @param strippedUuid The player UUID without hyphens
     * @param url The URL which Mojang servers will download and apply the skin
     * @param model 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public changePlayerSkin(strippedUuid: string, url: string, model?: SkinModel, observe?: 'body', reportProgress?: boolean): Observable<any>;
    public changePlayerSkin(strippedUuid: string, url: string, model?: SkinModel, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<any>>;
    public changePlayerSkin(strippedUuid: string, url: string, model?: SkinModel, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<any>>;
    public changePlayerSkin(strippedUuid: string, url: string, model?: SkinModel, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {
        if (strippedUuid === null || strippedUuid === undefined) {
            throw new Error('Required parameter strippedUuid was null or undefined when calling changePlayerSkin.');
        }
        if (url === null || url === undefined) {
            throw new Error('Required parameter url was null or undefined when calling changePlayerSkin.');
        }

        let headers = this.defaultHeaders;

        // authentication (PlayerAccessToken) required
        if (this.configuration.username || this.configuration.password) {
            headers = headers.set('Authorization', 'Basic ' + btoa(this.configuration.username + ':' + this.configuration.password));
        }

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
            'application/x-www-form-urlencoded'
        ];

        const canConsumeForm = this.canConsumeForm(consumes);

        let formParams: { append(param: string, value: any): any; };
        let useForm = false;
        let convertFormParamsToString = false;
        if (useForm) {
            formParams = new FormData();
        } else {
            formParams = new HttpParams({encoder: new CustomHttpUrlEncodingCodec()});
        }

        if (model !== undefined) {
            formParams = formParams.append('model', <any>model) || formParams;
        }
        if (url !== undefined) {
            formParams = formParams.append('url', <any>url) || formParams;
        }

        return this.httpClient.post<any>(`${this.configuration.basePath}/user/profile/${encodeURIComponent(String(strippedUuid))}/skin`,
            convertFormParamsToString ? formParams.toString() : formParams,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * Resets the player skin to default
     * 
     * @param strippedUuid The player UUID without hyphens
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public resetPlayerSkin(strippedUuid: string, observe?: 'body', reportProgress?: boolean): Observable<any>;
    public resetPlayerSkin(strippedUuid: string, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<any>>;
    public resetPlayerSkin(strippedUuid: string, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<any>>;
    public resetPlayerSkin(strippedUuid: string, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {
        if (strippedUuid === null || strippedUuid === undefined) {
            throw new Error('Required parameter strippedUuid was null or undefined when calling resetPlayerSkin.');
        }

        let headers = this.defaultHeaders;

        // authentication (PlayerAccessToken) required
        if (this.configuration.username || this.configuration.password) {
            headers = headers.set('Authorization', 'Basic ' + btoa(this.configuration.username + ':' + this.configuration.password));
        }

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
        ];

        return this.httpClient.delete<any>(`${this.configuration.basePath}/user/profile/${encodeURIComponent(String(strippedUuid))}/skin`,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

    /**
     * Changes the player skin by upload
     * This uploads a skin to Mojang&#39;s servers. It also sets the users skin. This works on legacy counts as well.
     * @param strippedUuid The player UUID without hyphens
     * @param file The skin image in PNG format
     * @param model 
     * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
     * @param reportProgress flag to report request and response progress.
     */
    public uploadPlayerSkin(strippedUuid: string, file: Blob, model?: SkinModel, observe?: 'body', reportProgress?: boolean): Observable<any>;
    public uploadPlayerSkin(strippedUuid: string, file: Blob, model?: SkinModel, observe?: 'response', reportProgress?: boolean): Observable<HttpResponse<any>>;
    public uploadPlayerSkin(strippedUuid: string, file: Blob, model?: SkinModel, observe?: 'events', reportProgress?: boolean): Observable<HttpEvent<any>>;
    public uploadPlayerSkin(strippedUuid: string, file: Blob, model?: SkinModel, observe: any = 'body', reportProgress: boolean = false ): Observable<any> {
        if (strippedUuid === null || strippedUuid === undefined) {
            throw new Error('Required parameter strippedUuid was null or undefined when calling uploadPlayerSkin.');
        }
        if (file === null || file === undefined) {
            throw new Error('Required parameter file was null or undefined when calling uploadPlayerSkin.');
        }

        let headers = this.defaultHeaders;

        // authentication (PlayerAccessToken) required
        if (this.configuration.username || this.configuration.password) {
            headers = headers.set('Authorization', 'Basic ' + btoa(this.configuration.username + ':' + this.configuration.password));
        }

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
            'multipart/form-data'
        ];

        const canConsumeForm = this.canConsumeForm(consumes);

        let formParams: { append(param: string, value: any): any; };
        let useForm = false;
        let convertFormParamsToString = false;
        // use FormData to transmit files using content-type "multipart/form-data"
        // see https://stackoverflow.com/questions/4007969/application-x-www-form-urlencoded-or-multipart-form-data
        useForm = canConsumeForm;
        if (useForm) {
            formParams = new FormData();
        } else {
            formParams = new HttpParams({encoder: new CustomHttpUrlEncodingCodec()});
        }

        if (model !== undefined) {
            formParams = formParams.append('model', <any>model) || formParams;
        }
        if (file !== undefined) {
            formParams = formParams.append('file', <any>file) || formParams;
        }

        return this.httpClient.put<any>(`${this.configuration.basePath}/user/profile/${encodeURIComponent(String(strippedUuid))}/skin`,
            convertFormParamsToString ? formParams.toString() : formParams,
            {
                withCredentials: this.configuration.withCredentials,
                headers: headers,
                observe: observe,
                reportProgress: reportProgress
            }
        );
    }

}
