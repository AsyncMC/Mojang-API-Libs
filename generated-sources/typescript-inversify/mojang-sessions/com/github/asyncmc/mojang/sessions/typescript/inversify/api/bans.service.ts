/**
 * Mojang Session API
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


import { COLLECTION_FORMATS }  from '../variables';



@injectable()
export class BansService {
    private basePath: string = 'https://sessionserver.mojang.com';

    constructor(@inject("IApiHttpClient") private httpClient: IHttpClient,
        @inject("IAPIConfiguration") private APIConfiguration: IAPIConfiguration ) {
        if(this.APIConfiguration.basePath)
            this.basePath = this.APIConfiguration.basePath;
    }

    /**
     * A list of SHA1 hashes of banned servers
     * Returns a list of SHA1 hashes used to check server addresses against when the client tries to connect. Clients check the lowercase name, using the ISO-8859-1 charset, against this list. They will also attempt to check subdomains, replacing each level with a *. Specifically, it splits based off of the . in the domain, goes through each section removing one at a time. For instance, for mc.example.com, it would try mc.example.com, *.example.com, and *.com. With IP addresses (verified by having 4 split sections, with each section being a valid integer between 0 and 255, inclusive) substitution starts from the end, so for 192.168.0.1, it would try 192.168.0.1, 192.168.0.*, 192.168.*, and 192.*. This check is done by the bootstrap class in netty. The default netty class is overridden by one in the com.mojang:netty dependency loaded by the launcher. This allows it to affect any version that used netty (1.7+)
     
     */
    public getBlockedServerHashes(observe?: 'body', headers?: Headers): Observable<string>;
    public getBlockedServerHashes(observe?: 'response', headers?: Headers): Observable<HttpResponse<string>>;
    public getBlockedServerHashes(observe: any = 'body', headers: Headers = {}): Observable<any> {
        headers['Accept'] = 'text/plain';

        const response: Observable<HttpResponse<string>> = this.httpClient.get(`${this.basePath}/blockedservers`, headers);
        if (observe == 'body') {
               return response.map(httpResponse => <string>(httpResponse.response));
        }
        return response;
    }

}
