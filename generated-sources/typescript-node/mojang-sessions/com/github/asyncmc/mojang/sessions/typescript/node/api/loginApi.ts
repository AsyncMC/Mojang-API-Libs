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

import localVarRequest = require('request');
import http = require('http');
import Promise = require('bluebird');

/* tslint:disable:no-unused-locals */
import { PlayerProfile } from '../com.github.asyncmc.mojang.sessions.typescript.node.model/playerProfile';
import { SessionApiError } from '../com.github.asyncmc.mojang.sessions.typescript.node.model/sessionApiError';

import { ObjectSerializer, Authentication, HttpBasicAuth, ApiKeyAuth, OAuth, VoidAuth } from '../model/models';

let defaultBasePath = 'https://sessionserver.mojang.com';

// ===============================================
// This file is autogenerated - Please do not edit
// ===============================================

export enum LoginApiApiKeys {
}

export class LoginApi {
    protected _basePath = defaultBasePath;
    protected defaultHeaders : any = {};
    protected _useQuerystring : boolean = false;

    protected authentications = {
        'default': <Authentication>new VoidAuth(),
    }

    constructor(basePath?: string);
    constructor(basePathOrUsername: string, password?: string, basePath?: string) {
        if (password) {
            if (basePath) {
                this.basePath = basePath;
            }
        } else {
            if (basePathOrUsername) {
                this.basePath = basePathOrUsername
            }
        }
    }

    set useQuerystring(value: boolean) {
        this._useQuerystring = value;
    }

    set basePath(basePath: string) {
        this._basePath = basePath;
    }

    get basePath() {
        return this._basePath;
    }

    public setDefaultAuthentication(auth: Authentication) {
        this.authentications.default = auth;
    }

    public setApiKey(key: LoginApiApiKeys, value: string) {
        (this.authentications as any)[LoginApiApiKeys[key]].apiKey = value;
    }

    /**
     * This will return the player's username plus any additional information about them (e.g. skins). This has a much stricter rate limit: You can request the same profile once per minute, however you can send as many unique requests as you like.
     * @summary Gets the player's game profile
     * @param strippedUuid The player UUID without hyphens
     * @param unsigned When set to false, the signature data are sent
     */
    public getPlayerProfile (strippedUuid: string, unsigned?: boolean) : Promise<{ response: http.ClientResponse; body: PlayerProfile;  }> {
        const localVarPath = this.basePath + '/session/minecraft/profile/{stripped_uuid}'
            .replace('{' + 'stripped_uuid' + '}', encodeURIComponent(String(strippedUuid)));
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'strippedUuid' is not null or undefined
        if (strippedUuid === null || strippedUuid === undefined) {
            throw new Error('Required parameter strippedUuid was null or undefined when calling getPlayerProfile.');
        }

        if (unsigned !== undefined) {
            localVarQueryParameters['unsigned'] = ObjectSerializer.serialize(unsigned, "boolean");
        }


        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'GET',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
        };

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body: PlayerProfile;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    body = ObjectSerializer.deserialize(body, "PlayerProfile");
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
}