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


import * as $ from 'jquery';
import * as models from '../model/models';
import { COLLECTION_FORMATS } from '../variables';
import { Configuration } from '../configuration';

/* tslint:disable:no-unused-variable member-ordering */


export class SkinOperationsApi {
    protected basePath = 'https://api.mojang.com';
    public defaultHeaders: Array<string> = [];
    public defaultExtraJQueryAjaxSettings?: JQueryAjaxSettings = null;
    public configuration: Configuration = new Configuration();

    constructor(basePath?: string, configuration?: Configuration, defaultExtraJQueryAjaxSettings?: JQueryAjaxSettings) {
        if (basePath) {
            this.basePath = basePath;
        }
        if (configuration) {
            this.configuration = configuration;
        }
        if (defaultExtraJQueryAjaxSettings) {
            this.defaultExtraJQueryAjaxSettings = defaultExtraJQueryAjaxSettings;
        }
    }

    private extendObj<T1, T2 extends T1>(objA: T2, objB: T2): T1|T2 {
        for (let key in objB) {
            if (objB.hasOwnProperty(key)) {
                objA[key] = objB[key];
            }
        }
        return objA;
    }

    /**
     * This will set the skin for the selected profile, but Mojang's servers will fetch the skin from a URL. This will also work for legacy accounts.
     * @summary Changes the player skin by URL
     * @param strippedUuid The player UUID without hyphens
     * @param url The URL which Mojang servers will download and apply the skin
     * @param model 
     */
    public changePlayerSkin(strippedUuid: string, url: string, model?: models.SkinModel, extraJQueryAjaxSettings?: JQueryAjaxSettings): JQuery.Promise<
    { response: JQueryXHR; body?: any;  },
    { response: JQueryXHR; errorThrown: string }
    > {
        let localVarPath = this.basePath + '/user/profile/{stripped_uuid}/skin'.replace('{' + 'stripped_uuid' + '}', encodeURIComponent(String(strippedUuid)));

        let queryParameters: any = {};
        let headerParams: any = {};
        let formParams = new FormData();
        let reqHasFile = false;

        // verify required parameter 'strippedUuid' is not null or undefined
        if (strippedUuid === null || strippedUuid === undefined) {
            throw new Error('Required parameter strippedUuid was null or undefined when calling changePlayerSkin.');
        }

        // verify required parameter 'url' is not null or undefined
        if (url === null || url === undefined) {
            throw new Error('Required parameter url was null or undefined when calling changePlayerSkin.');
        }


        localVarPath = localVarPath + "?" + $.param(queryParameters);
        if (model !== null && model !== undefined) {
            formParams.append('model', <any>model);
        }
        if (url !== null && url !== undefined) {
            formParams.append('url', <any>url);
        }
        // to determine the Content-Type header
        let consumes: string[] = [
            'application/x-www-form-urlencoded'
        ];

        // to determine the Accept header
        let produces: string[] = [
            'application/json'
        ];

        // authentication (PlayerAccessToken) required
        // http basic authentication required
        if (this.configuration.username || this.configuration.password) {
            headerParams['Authorization'] = 'Basic ' + btoa(this.configuration.username + ':' + this.configuration.password);
        }

        if (!reqHasFile) {
            headerParams['Content-Type'] = 'application/x-www-form-urlencoded';
        }


        let requestOptions: JQueryAjaxSettings = {
            url: localVarPath,
            type: 'POST',
            headers: headerParams,
            processData: false
        };

        if (headerParams['Content-Type']) {
            requestOptions.contentType = headerParams['Content-Type'];
        }
        requestOptions.data = formParams;
        if (reqHasFile) {
            requestOptions.contentType = false;
        }

        if (extraJQueryAjaxSettings) {
            requestOptions = (<any>Object).assign(requestOptions, extraJQueryAjaxSettings);
        }

        if (this.defaultExtraJQueryAjaxSettings) {
            requestOptions = (<any>Object).assign(requestOptions, this.defaultExtraJQueryAjaxSettings);
        }

        let dfd = $.Deferred<
            { response: JQueryXHR; body?: any;  },
            { response: JQueryXHR; errorThrown: string }
        >();
        $.ajax(requestOptions).then(
            (data: any, textStatus: string, jqXHR: JQueryXHR) =>
                dfd.resolve({response: jqXHR, body: data}),
            (xhr: JQueryXHR, textStatus: string, errorThrown: string) =>
                dfd.reject({response: xhr, errorThrown: errorThrown})
        );
        return dfd.promise();
    }

    /**
     * 
     * @summary Resets the player skin to default
     * @param strippedUuid The player UUID without hyphens
     */
    public resetPlayerSkin(strippedUuid: string, extraJQueryAjaxSettings?: JQueryAjaxSettings): JQuery.Promise<
    { response: JQueryXHR; body?: any;  },
    { response: JQueryXHR; errorThrown: string }
    > {
        let localVarPath = this.basePath + '/user/profile/{stripped_uuid}/skin'.replace('{' + 'stripped_uuid' + '}', encodeURIComponent(String(strippedUuid)));

        let queryParameters: any = {};
        let headerParams: any = {};
        // verify required parameter 'strippedUuid' is not null or undefined
        if (strippedUuid === null || strippedUuid === undefined) {
            throw new Error('Required parameter strippedUuid was null or undefined when calling resetPlayerSkin.');
        }


        localVarPath = localVarPath + "?" + $.param(queryParameters);
        // to determine the Content-Type header
        let consumes: string[] = [
        ];

        // to determine the Accept header
        let produces: string[] = [
            'application/json'
        ];

        // authentication (PlayerAccessToken) required
        // http basic authentication required
        if (this.configuration.username || this.configuration.password) {
            headerParams['Authorization'] = 'Basic ' + btoa(this.configuration.username + ':' + this.configuration.password);
        }


        let requestOptions: JQueryAjaxSettings = {
            url: localVarPath,
            type: 'DELETE',
            headers: headerParams,
            processData: false
        };

        if (headerParams['Content-Type']) {
            requestOptions.contentType = headerParams['Content-Type'];
        }

        if (extraJQueryAjaxSettings) {
            requestOptions = (<any>Object).assign(requestOptions, extraJQueryAjaxSettings);
        }

        if (this.defaultExtraJQueryAjaxSettings) {
            requestOptions = (<any>Object).assign(requestOptions, this.defaultExtraJQueryAjaxSettings);
        }

        let dfd = $.Deferred<
            { response: JQueryXHR; body?: any;  },
            { response: JQueryXHR; errorThrown: string }
        >();
        $.ajax(requestOptions).then(
            (data: any, textStatus: string, jqXHR: JQueryXHR) =>
                dfd.resolve({response: jqXHR, body: data}),
            (xhr: JQueryXHR, textStatus: string, errorThrown: string) =>
                dfd.reject({response: xhr, errorThrown: errorThrown})
        );
        return dfd.promise();
    }

    /**
     * This uploads a skin to Mojang's servers. It also sets the users skin. This works on legacy counts as well.
     * @summary Changes the player skin by upload
     * @param strippedUuid The player UUID without hyphens
     * @param file The skin image in PNG format
     * @param model 
     */
    public uploadPlayerSkin(strippedUuid: string, file: any, model?: models.SkinModel, extraJQueryAjaxSettings?: JQueryAjaxSettings): JQuery.Promise<
    { response: JQueryXHR; body?: any;  },
    { response: JQueryXHR; errorThrown: string }
    > {
        let localVarPath = this.basePath + '/user/profile/{stripped_uuid}/skin'.replace('{' + 'stripped_uuid' + '}', encodeURIComponent(String(strippedUuid)));

        let queryParameters: any = {};
        let headerParams: any = {};
        let formParams = new FormData();
        let reqHasFile = false;

        // verify required parameter 'strippedUuid' is not null or undefined
        if (strippedUuid === null || strippedUuid === undefined) {
            throw new Error('Required parameter strippedUuid was null or undefined when calling uploadPlayerSkin.');
        }

        // verify required parameter 'file' is not null or undefined
        if (file === null || file === undefined) {
            throw new Error('Required parameter file was null or undefined when calling uploadPlayerSkin.');
        }


        localVarPath = localVarPath + "?" + $.param(queryParameters);
        if (model !== null && model !== undefined) {
            formParams.append('model', <any>model);
        }
        reqHasFile = true;
        formParams.append("file", file);
        // to determine the Content-Type header
        let consumes: string[] = [
            'multipart/form-data'
        ];

        // to determine the Accept header
        let produces: string[] = [
            'application/json'
        ];

        // authentication (PlayerAccessToken) required
        // http basic authentication required
        if (this.configuration.username || this.configuration.password) {
            headerParams['Authorization'] = 'Basic ' + btoa(this.configuration.username + ':' + this.configuration.password);
        }

        if (!reqHasFile) {
            headerParams['Content-Type'] = 'application/x-www-form-urlencoded';
        }


        let requestOptions: JQueryAjaxSettings = {
            url: localVarPath,
            type: 'PUT',
            headers: headerParams,
            processData: false
        };

        if (headerParams['Content-Type']) {
            requestOptions.contentType = headerParams['Content-Type'];
        }
        requestOptions.data = formParams;
        if (reqHasFile) {
            requestOptions.contentType = false;
        }

        if (extraJQueryAjaxSettings) {
            requestOptions = (<any>Object).assign(requestOptions, extraJQueryAjaxSettings);
        }

        if (this.defaultExtraJQueryAjaxSettings) {
            requestOptions = (<any>Object).assign(requestOptions, this.defaultExtraJQueryAjaxSettings);
        }

        let dfd = $.Deferred<
            { response: JQueryXHR; body?: any;  },
            { response: JQueryXHR; errorThrown: string }
        >();
        $.ajax(requestOptions).then(
            (data: any, textStatus: string, jqXHR: JQueryXHR) =>
                dfd.resolve({response: jqXHR, body: data}),
            (xhr: JQueryXHR, textStatus: string, errorThrown: string) =>
                dfd.reject({response: xhr, errorThrown: errorThrown})
        );
        return dfd.promise();
    }

}