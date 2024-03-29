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

import { Observable } from "rxjs/Observable";
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/toPromise';
import IHttpClient from "../IHttpClient";
import { inject, injectable } from "inversify";
import { IAPIConfiguration } from "../IAPIConfiguration";
import { Headers } from "../Headers";
import HttpResponse from "../HttpResponse";

import { AccessKeys } from '../com.github.asyncmc.mojang.authentication.typescript.inversify.model/accessKeys';
import { Authentication } from '../com.github.asyncmc.mojang.authentication.typescript.inversify.model/authentication';
import { AuthenticationRequest } from '../com.github.asyncmc.mojang.authentication.typescript.inversify.model/authenticationRequest';
import { RefreshRequest } from '../com.github.asyncmc.mojang.authentication.typescript.inversify.model/refreshRequest';
import { RefreshResponse } from '../com.github.asyncmc.mojang.authentication.typescript.inversify.model/refreshResponse';
import { UsernamePassword } from '../com.github.asyncmc.mojang.authentication.typescript.inversify.model/usernamePassword';

import { COLLECTION_FORMATS }  from '../variables';



@injectable()
export class DefaultService {
    private basePath: string = 'https://authserver.mojang.com';

    constructor(@inject("IApiHttpClient") private httpClient: IHttpClient,
        @inject("IAPIConfiguration") private APIConfiguration: IAPIConfiguration ) {
        if(this.APIConfiguration.basePath)
            this.basePath = this.APIConfiguration.basePath;
    }

    /**
     * 
     * 
     * @param authenticationRequest 
     
     */
    public authenticate(authenticationRequest: AuthenticationRequest, observe?: 'body', headers?: Headers): Observable<Authentication>;
    public authenticate(authenticationRequest: AuthenticationRequest, observe?: 'response', headers?: Headers): Observable<HttpResponse<Authentication>>;
    public authenticate(authenticationRequest: AuthenticationRequest, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (!authenticationRequest){
            throw new Error('Required parameter authenticationRequest was null or undefined when calling authenticate.');
        }

        headers['Accept'] = 'application/json';
        headers['Content-Type'] = 'application/json';

        const response: Observable<HttpResponse<Authentication>> = this.httpClient.post(`${this.basePath}/authenticate`, authenticationRequest , headers);
        if (observe == 'body') {
               return response.map(httpResponse => <Authentication>(httpResponse.response));
        }
        return response;
    }


    /**
     * 
     * 
     * @param accessKeys 
     
     */
    public invalidate(accessKeys: AccessKeys, observe?: 'body', headers?: Headers): Observable<any>;
    public invalidate(accessKeys: AccessKeys, observe?: 'response', headers?: Headers): Observable<HttpResponse<any>>;
    public invalidate(accessKeys: AccessKeys, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (!accessKeys){
            throw new Error('Required parameter accessKeys was null or undefined when calling invalidate.');
        }

        headers['Accept'] = 'application/json';
        headers['Content-Type'] = 'application/json';

        const response: Observable<HttpResponse<any>> = this.httpClient.post(`${this.basePath}/invalidate`, accessKeys , headers);
        if (observe == 'body') {
               return response.map(httpResponse => <any>(httpResponse.response));
        }
        return response;
    }


    /**
     * 
     * 
     * @param refreshRequest 
     
     */
    public refresh(refreshRequest: RefreshRequest, observe?: 'body', headers?: Headers): Observable<RefreshResponse>;
    public refresh(refreshRequest: RefreshRequest, observe?: 'response', headers?: Headers): Observable<HttpResponse<RefreshResponse>>;
    public refresh(refreshRequest: RefreshRequest, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (!refreshRequest){
            throw new Error('Required parameter refreshRequest was null or undefined when calling refresh.');
        }

        headers['Accept'] = 'application/json';
        headers['Content-Type'] = 'application/json';

        const response: Observable<HttpResponse<RefreshResponse>> = this.httpClient.post(`${this.basePath}/refresh`, refreshRequest , headers);
        if (observe == 'body') {
               return response.map(httpResponse => <RefreshResponse>(httpResponse.response));
        }
        return response;
    }


    /**
     * 
     * 
     * @param usernamePassword 
     
     */
    public siginout(usernamePassword: UsernamePassword, observe?: 'body', headers?: Headers): Observable<any>;
    public siginout(usernamePassword: UsernamePassword, observe?: 'response', headers?: Headers): Observable<HttpResponse<any>>;
    public siginout(usernamePassword: UsernamePassword, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (!usernamePassword){
            throw new Error('Required parameter usernamePassword was null or undefined when calling siginout.');
        }

        headers['Accept'] = 'application/json';
        headers['Content-Type'] = 'application/json';

        const response: Observable<HttpResponse<any>> = this.httpClient.post(`${this.basePath}/signout`, usernamePassword , headers);
        if (observe == 'body') {
               return response.map(httpResponse => <any>(httpResponse.response));
        }
        return response;
    }


    /**
     * 
     * 
     * @param accessKeys 
     
     */
    public validate(accessKeys: AccessKeys, observe?: 'body', headers?: Headers): Observable<any>;
    public validate(accessKeys: AccessKeys, observe?: 'response', headers?: Headers): Observable<HttpResponse<any>>;
    public validate(accessKeys: AccessKeys, observe: any = 'body', headers: Headers = {}): Observable<any> {
        if (!accessKeys){
            throw new Error('Required parameter accessKeys was null or undefined when calling validate.');
        }

        headers['Accept'] = 'application/json';
        headers['Content-Type'] = 'application/json';

        const response: Observable<HttpResponse<any>> = this.httpClient.post(`${this.basePath}/validate`, accessKeys , headers);
        if (observe == 'body') {
               return response.map(httpResponse => <any>(httpResponse.response));
        }
        return response;
    }

}
