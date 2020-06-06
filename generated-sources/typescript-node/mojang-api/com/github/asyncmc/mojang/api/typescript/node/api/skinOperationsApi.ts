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

import localVarRequest = require('request');
import http = require('http');
import Promise = require('bluebird');

/* tslint:disable:no-unused-locals */
import { SkinModel } from '../com.github.asyncmc.mojang.api.typescript.node.model/skinModel';

import { ObjectSerializer, Authentication, HttpBasicAuth, ApiKeyAuth, OAuth, VoidAuth } from '../model/models';

let defaultBasePath = 'https://api.mojang.com';

// ===============================================
// This file is autogenerated - Please do not edit
// ===============================================

export enum SkinOperationsApiApiKeys {
}

export class SkinOperationsApi {
    protected _basePath = defaultBasePath;
    protected defaultHeaders : any = {};
    protected _useQuerystring : boolean = false;

    protected authentications = {
        'default': <Authentication>new VoidAuth(),
        'PlayerAccessToken': new HttpBasicAuth(),
    }

    constructor(basePath?: string);
    constructor(username: string, password: string, basePath?: string);
    constructor(basePathOrUsername: string, password?: string, basePath?: string) {
        if (password) {
            this.username = basePathOrUsername;
            this.password = password
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

    public setApiKey(key: SkinOperationsApiApiKeys, value: string) {
        (this.authentications as any)[SkinOperationsApiApiKeys[key]].apiKey = value;
    }
    set username(username: string) {
        this.authentications.PlayerAccessToken.username = username;
    }

    set password(password: string) {
        this.authentications.PlayerAccessToken.password = password;
    }

    /**
     * This will set the skin for the selected profile, but Mojang's servers will fetch the skin from a URL. This will also work for legacy accounts.
     * @summary Changes the player skin by URL
     * @param strippedUuid The player UUID without hyphens
     * @param url The URL which Mojang servers will download and apply the skin
     * @param model 
     */
    public changePlayerSkin (strippedUuid: string, url: string, model?: SkinModel) : Promise<{ response: http.ClientResponse; body?: any;  }> {
        const localVarPath = this.basePath + '/user/profile/{stripped_uuid}/skin'
            .replace('{' + 'stripped_uuid' + '}', encodeURIComponent(String(strippedUuid)));
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'strippedUuid' is not null or undefined
        if (strippedUuid === null || strippedUuid === undefined) {
            throw new Error('Required parameter strippedUuid was null or undefined when calling changePlayerSkin.');
        }

        // verify required parameter 'url' is not null or undefined
        if (url === null || url === undefined) {
            throw new Error('Required parameter url was null or undefined when calling changePlayerSkin.');
        }


        let localVarUseFormData = false;

        if (model !== undefined) {
            localVarFormParams['model'] = ObjectSerializer.serialize(model, "SkinModel");
        }

        if (url !== undefined) {
            localVarFormParams['url'] = ObjectSerializer.serialize(url, "string");
        }

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'POST',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
        };

        this.authentications.PlayerAccessToken.applyToRequest(localVarRequestOptions);

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body?: any;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
    /**
     * 
     * @summary Resets the player skin to default
     * @param strippedUuid The player UUID without hyphens
     */
    public resetPlayerSkin (strippedUuid: string) : Promise<{ response: http.ClientResponse; body?: any;  }> {
        const localVarPath = this.basePath + '/user/profile/{stripped_uuid}/skin'
            .replace('{' + 'stripped_uuid' + '}', encodeURIComponent(String(strippedUuid)));
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'strippedUuid' is not null or undefined
        if (strippedUuid === null || strippedUuid === undefined) {
            throw new Error('Required parameter strippedUuid was null or undefined when calling resetPlayerSkin.');
        }


        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'DELETE',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
        };

        this.authentications.PlayerAccessToken.applyToRequest(localVarRequestOptions);

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body?: any;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
                    if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                        resolve({ response: response, body: body });
                    } else {
                        reject({ response: response, body: body });
                    }
                }
            });
        });
    }
    /**
     * This uploads a skin to Mojang's servers. It also sets the users skin. This works on legacy counts as well.
     * @summary Changes the player skin by upload
     * @param strippedUuid The player UUID without hyphens
     * @param file The skin image in PNG format
     * @param model 
     */
    public uploadPlayerSkin (strippedUuid: string, file: Buffer, model?: SkinModel) : Promise<{ response: http.ClientResponse; body?: any;  }> {
        const localVarPath = this.basePath + '/user/profile/{stripped_uuid}/skin'
            .replace('{' + 'stripped_uuid' + '}', encodeURIComponent(String(strippedUuid)));
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this.defaultHeaders);
        let localVarFormParams: any = {};

        // verify required parameter 'strippedUuid' is not null or undefined
        if (strippedUuid === null || strippedUuid === undefined) {
            throw new Error('Required parameter strippedUuid was null or undefined when calling uploadPlayerSkin.');
        }

        // verify required parameter 'file' is not null or undefined
        if (file === null || file === undefined) {
            throw new Error('Required parameter file was null or undefined when calling uploadPlayerSkin.');
        }


        let localVarUseFormData = false;

        if (model !== undefined) {
            localVarFormParams['model'] = ObjectSerializer.serialize(model, "SkinModel");
        }

        if (file !== undefined) {
            localVarFormParams['file'] = file;
        }
        localVarUseFormData = true;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'PUT',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
        };

        this.authentications.PlayerAccessToken.applyToRequest(localVarRequestOptions);

        this.authentications.default.applyToRequest(localVarRequestOptions);

        if (Object.keys(localVarFormParams).length) {
            if (localVarUseFormData) {
                (<any>localVarRequestOptions).formData = localVarFormParams;
            } else {
                localVarRequestOptions.form = localVarFormParams;
            }
        }
        return new Promise<{ response: http.ClientResponse; body?: any;  }>((resolve, reject) => {
            localVarRequest(localVarRequestOptions, (error, response, body) => {
                if (error) {
                    reject(error);
                } else {
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