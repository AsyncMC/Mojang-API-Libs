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

import * as models from '../model/models';

/* tslint:disable:no-unused-variable member-ordering */

export class DefaultApi {
    protected basePath = 'https://authserver.mojang.com';
    public defaultHeaders : any = {};

    static $inject: string[] = ['$http', '$httpParamSerializer', 'basePath'];

    constructor(protected $http: ng.IHttpService, protected $httpParamSerializer?: (d: any) => any, basePath?: string) {
        if (basePath !== undefined) {
            this.basePath = basePath;
        }
    }

    /**
     * 
     * @param authenticationRequest 
     */
    public authenticate (authenticationRequest: models.models.AuthenticationRequest, extraHttpRequestParams?: any ) : ng.IHttpPromise<models.Authentication> {
        const localVarPath = this.basePath + '/authenticate';

        let queryParameters: any = {};
        let headerParams: any = (<any>Object).assign({}, this.defaultHeaders);
        // verify required parameter 'authenticationRequest' is not null or undefined
        if (authenticationRequest === null || authenticationRequest === undefined) {
            throw new Error('Required parameter authenticationRequest was null or undefined when calling authenticate.');
        }

        let httpRequestParams: ng.IRequestConfig = {
            method: 'POST',
            url: localVarPath,
            data: authenticationRequest,
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
     * @param accessKeys 
     */
    public invalidate (accessKeys: models.models.AccessKeys, extraHttpRequestParams?: any ) : ng.IHttpPromise<{}> {
        const localVarPath = this.basePath + '/invalidate';

        let queryParameters: any = {};
        let headerParams: any = (<any>Object).assign({}, this.defaultHeaders);
        // verify required parameter 'accessKeys' is not null or undefined
        if (accessKeys === null || accessKeys === undefined) {
            throw new Error('Required parameter accessKeys was null or undefined when calling invalidate.');
        }

        let httpRequestParams: ng.IRequestConfig = {
            method: 'POST',
            url: localVarPath,
            data: accessKeys,
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
     * @param refreshRequest 
     */
    public refresh (refreshRequest: models.models.RefreshRequest, extraHttpRequestParams?: any ) : ng.IHttpPromise<models.RefreshResponse> {
        const localVarPath = this.basePath + '/refresh';

        let queryParameters: any = {};
        let headerParams: any = (<any>Object).assign({}, this.defaultHeaders);
        // verify required parameter 'refreshRequest' is not null or undefined
        if (refreshRequest === null || refreshRequest === undefined) {
            throw new Error('Required parameter refreshRequest was null or undefined when calling refresh.');
        }

        let httpRequestParams: ng.IRequestConfig = {
            method: 'POST',
            url: localVarPath,
            data: refreshRequest,
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
     * @param usernamePassword 
     */
    public siginout (usernamePassword: models.models.UsernamePassword, extraHttpRequestParams?: any ) : ng.IHttpPromise<{}> {
        const localVarPath = this.basePath + '/signout';

        let queryParameters: any = {};
        let headerParams: any = (<any>Object).assign({}, this.defaultHeaders);
        // verify required parameter 'usernamePassword' is not null or undefined
        if (usernamePassword === null || usernamePassword === undefined) {
            throw new Error('Required parameter usernamePassword was null or undefined when calling siginout.');
        }

        let httpRequestParams: ng.IRequestConfig = {
            method: 'POST',
            url: localVarPath,
            data: usernamePassword,
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
     * @param accessKeys 
     */
    public validate (accessKeys: models.models.AccessKeys, extraHttpRequestParams?: any ) : ng.IHttpPromise<{}> {
        const localVarPath = this.basePath + '/validate';

        let queryParameters: any = {};
        let headerParams: any = (<any>Object).assign({}, this.defaultHeaders);
        // verify required parameter 'accessKeys' is not null or undefined
        if (accessKeys === null || accessKeys === undefined) {
            throw new Error('Required parameter accessKeys was null or undefined when calling validate.');
        }

        let httpRequestParams: ng.IRequestConfig = {
            method: 'POST',
            url: localVarPath,
            data: accessKeys,
            params: queryParameters,
            headers: headerParams
        };

        if (extraHttpRequestParams) {
            httpRequestParams = (<any>Object).assign(httpRequestParams, extraHttpRequestParams);
        }

        return this.$http(httpRequestParams);
    }
}
