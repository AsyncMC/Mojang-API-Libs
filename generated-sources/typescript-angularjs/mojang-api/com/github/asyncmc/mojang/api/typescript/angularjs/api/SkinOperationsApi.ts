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

import * as models from '../model/models';

/* tslint:disable:no-unused-variable member-ordering */

export class SkinOperationsApi {
    protected basePath = 'https://api.mojang.com';
    public defaultHeaders : any = {};

    static $inject: string[] = ['$http', '$httpParamSerializer', 'basePath'];

    constructor(protected $http: ng.IHttpService, protected $httpParamSerializer?: (d: any) => any, basePath?: string) {
        if (basePath !== undefined) {
            this.basePath = basePath;
        }
    }

    /**
     * This will set the skin for the selected profile, but Mojang's servers will fetch the skin from a URL. This will also work for legacy accounts.
     * @summary Changes the player skin by URL
     * @param strippedUuid The player UUID without hyphens
     * @param url The URL which Mojang servers will download and apply the skin
     * @param model 
     */
    public changePlayerSkin (strippedUuid: string, url: string, model?: models.models.SkinModel, extraHttpRequestParams?: any ) : ng.IHttpPromise<{}> {
        const localVarPath = this.basePath + '/user/profile/{stripped_uuid}/skin'
            .replace('{' + 'stripped_uuid' + '}', encodeURIComponent(String(strippedUuid)));

        let queryParameters: any = {};
        let headerParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let formParams: any = {};

        // verify required parameter 'strippedUuid' is not null or undefined
        if (strippedUuid === null || strippedUuid === undefined) {
            throw new Error('Required parameter strippedUuid was null or undefined when calling changePlayerSkin.');
        }

        // verify required parameter 'url' is not null or undefined
        if (url === null || url === undefined) {
            throw new Error('Required parameter url was null or undefined when calling changePlayerSkin.');
        }

        headerParams['Content-Type'] = 'application/x-www-form-urlencoded';

        formParams['model'] = model;

        formParams['url'] = url;

        let httpRequestParams: ng.IRequestConfig = {
            method: 'POST',
            url: localVarPath,
            data: this.$httpParamSerializer(formParams),
            params: queryParameters,
            headers: headerParams
        };

        if (extraHttpRequestParams) {
            httpRequestParams = (<any>Object).assign(httpRequestParams, extraHttpRequestParams);
        }

        return this.$http(httpRequestParams);
    }
    /**
     * 
     * @summary Resets the player skin to default
     * @param strippedUuid The player UUID without hyphens
     */
    public resetPlayerSkin (strippedUuid: string, extraHttpRequestParams?: any ) : ng.IHttpPromise<{}> {
        const localVarPath = this.basePath + '/user/profile/{stripped_uuid}/skin'
            .replace('{' + 'stripped_uuid' + '}', encodeURIComponent(String(strippedUuid)));

        let queryParameters: any = {};
        let headerParams: any = (<any>Object).assign({}, this.defaultHeaders);
        // verify required parameter 'strippedUuid' is not null or undefined
        if (strippedUuid === null || strippedUuid === undefined) {
            throw new Error('Required parameter strippedUuid was null or undefined when calling resetPlayerSkin.');
        }

        let httpRequestParams: ng.IRequestConfig = {
            method: 'DELETE',
            url: localVarPath,
            params: queryParameters,
            headers: headerParams
        };

        if (extraHttpRequestParams) {
            httpRequestParams = (<any>Object).assign(httpRequestParams, extraHttpRequestParams);
        }

        return this.$http(httpRequestParams);
    }
    /**
     * This uploads a skin to Mojang's servers. It also sets the users skin. This works on legacy counts as well.
     * @summary Changes the player skin by upload
     * @param strippedUuid The player UUID without hyphens
     * @param file The skin image in PNG format
     * @param model 
     */
    public uploadPlayerSkin (strippedUuid: string, file: any, model?: models.models.SkinModel, extraHttpRequestParams?: any ) : ng.IHttpPromise<{}> {
        const localVarPath = this.basePath + '/user/profile/{stripped_uuid}/skin'
            .replace('{' + 'stripped_uuid' + '}', encodeURIComponent(String(strippedUuid)));

        let queryParameters: any = {};
        let headerParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let formParams: any = {};

        // verify required parameter 'strippedUuid' is not null or undefined
        if (strippedUuid === null || strippedUuid === undefined) {
            throw new Error('Required parameter strippedUuid was null or undefined when calling uploadPlayerSkin.');
        }

        // verify required parameter 'file' is not null or undefined
        if (file === null || file === undefined) {
            throw new Error('Required parameter file was null or undefined when calling uploadPlayerSkin.');
        }

        headerParams['Content-Type'] = 'application/x-www-form-urlencoded';

        formParams['model'] = model;

        formParams['file'] = file;

        let httpRequestParams: ng.IRequestConfig = {
            method: 'PUT',
            url: localVarPath,
            data: this.$httpParamSerializer(formParams),
            params: queryParameters,
            headers: headerParams
        };

        if (extraHttpRequestParams) {
            httpRequestParams = (<any>Object).assign(httpRequestParams, extraHttpRequestParams);
        }

        return this.$http(httpRequestParams);
    }
}