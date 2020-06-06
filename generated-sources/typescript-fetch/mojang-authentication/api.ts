/// <reference path="./custom.d.ts" />
// tslint:disable
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


import * as url from "url";
import * as portableFetch from "portable-fetch";
import { Configuration } from "./configuration";

const BASE_PATH = "https://authserver.mojang.com".replace(/\/+$/, "");

/**
 *
 * @export
 */
export const COLLECTION_FORMATS = {
    csv: ",",
    ssv: " ",
    tsv: "\t",
    pipes: "|",
};

/**
 *
 * @export
 * @interface FetchAPI
 */
export interface FetchAPI {
    (url: string, init?: any): Promise<Response>;
}

/**
 *  
 * @export
 * @interface FetchArgs
 */
export interface FetchArgs {
    url: string;
    options: any;
}

/**
 * 
 * @export
 * @class BaseAPI
 */
export class BaseAPI {
    protected configuration: Configuration | undefined;

    constructor(configuration?: Configuration, protected basePath: string = BASE_PATH, protected fetch: FetchAPI = portableFetch) {
        if (configuration) {
            this.configuration = configuration;
            this.basePath = configuration.basePath || this.basePath;
        }
    }
};

/**
 * 
 * @export
 * @class RequiredError
 * @extends {Error}
 */
export class RequiredError extends Error {
    name: "RequiredError" = "RequiredError";
    constructor(public field: string, msg?: string) {
        super(msg);
    }
}

/**
 * 
 * @export
 * @interface AccessKeys
 */
export interface AccessKeys {
    /**
     * 
     * @type {string}
     * @memberof AccessKeys
     */
    accessToken: string;
    /**
     * 
     * @type {string}
     * @memberof AccessKeys
     */
    clientToken?: string;
}

/**
 * Identifies the software doing the request
 * @export
 * @interface Agent
 */
export interface Agent {
    /**
     * The name of the game
     * @type {string}
     * @memberof Agent
     */
    name?: Agent.NameEnum;
    /**
     * The agent version, usually 1.
     * @type {number}
     * @memberof Agent
     */
    version?: number;
}

/**
 * @export
 * @namespace Agent
 */
export namespace Agent {
    /**
     * @export
     * @enum {string}
     */
    export enum NameEnum {
        Minecraft = 'Minecraft',
        Scrolls = 'Scrolls'
    }
}

/**
 * 
 * @export
 * @interface Authentication
 */
export interface Authentication extends AccessKeys {
}

/**
 * Request body needed to authenticate the player using the username/e-mail and password. Use with care. This is a risky operation.
 * @export
 * @interface AuthenticationRequest
 */
export interface AuthenticationRequest extends UsernamePassword {
}

/**
 * 
 * @export
 * @interface GameProfile
 */
export interface GameProfile {
    /**
     * 
     * @type {string}
     * @memberof GameProfile
     */
    agent?: string;
    /**
     * 
     * @type {string}
     * @memberof GameProfile
     */
    id?: string;
    /**
     * 
     * @type {string}
     * @memberof GameProfile
     */
    name?: string;
    /**
     * 
     * @type {any}
     * @memberof GameProfile
     */
    userId?: any;
    /**
     * Unix timestamp in milliseconds
     * @type {number}
     * @memberof GameProfile
     */
    createdAt?: number;
    /**
     * 
     * @type {boolean}
     * @memberof GameProfile
     */
    legacyProfile?: boolean;
    /**
     * 
     * @type {boolean}
     * @memberof GameProfile
     */
    suspended?: boolean;
    /**
     * 
     * @type {boolean}
     * @memberof GameProfile
     */
    paid?: boolean;
    /**
     * 
     * @type {boolean}
     * @memberof GameProfile
     */
    migrated?: boolean;
    /**
     * 
     * @type {boolean}
     * @memberof GameProfile
     */
    legacy?: boolean;
}

/**
 * 
 * @export
 * @interface GameProfileProperty
 */
export interface GameProfileProperty {
    /**
     * 
     * @type {string}
     * @memberof GameProfileProperty
     */
    name?: string;
    /**
     * 
     * @type {string}
     * @memberof GameProfileProperty
     */
    value?: string;
}

/**
 * This is returned when the request fails
 * @export
 * @interface ModelError
 */
export interface ModelError {
    /**
     * 
     * @type {string}
     * @memberof ModelError
     */
    error?: string;
    /**
     * 
     * @type {string}
     * @memberof ModelError
     */
    errorMessage?: string;
}

/**
 * 
 * @export
 * @interface PrivateUserData
 */
export interface PrivateUserData extends ReducedUserData {
}

/**
 * 
 * @export
 * @interface ProfileId
 */
export interface ProfileId {
    /**
     * 
     * @type {string}
     * @memberof ProfileId
     */
    id: string;
    /**
     * The player name
     * @type {string}
     * @memberof ProfileId
     */
    name: string;
}

/**
 * 
 * @export
 * @interface ReducedUserData
 */
export interface ReducedUserData {
    /**
     * 
     * @type {any}
     * @memberof ReducedUserData
     */
    id?: any;
    /**
     * 
     * @type {Array<GameProfileProperty>}
     * @memberof ReducedUserData
     */
    properties?: Array<GameProfileProperty>;
}

/**
 * 
 * @export
 * @interface RefreshRequest
 */
export interface RefreshRequest extends AccessKeys {
}

/**
 * 
 * @export
 * @interface RefreshResponse
 */
export interface RefreshResponse extends RefreshRequest {
}

/**
 * 
 * @export
 * @interface UsernamePassword
 */
export interface UsernamePassword {
    /**
     * The Mojang account e-mail or username. Never store it.
     * @type {string}
     * @memberof UsernamePassword
     */
    username: string;
    /**
     * The Mojang account password, never store it.
     * @type {string}
     * @memberof UsernamePassword
     */
    password: string;
}


/**
 * DefaultApi - fetch parameter creator
 * @export
 */
export const DefaultApiFetchParamCreator = function (configuration?: Configuration) {
    return {
        /**
         * 
         * @param {AuthenticationRequest} authenticationRequest 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        authenticate(authenticationRequest: AuthenticationRequest, options: any = {}): FetchArgs {
            // verify required parameter 'authenticationRequest' is not null or undefined
            if (authenticationRequest === null || authenticationRequest === undefined) {
                throw new RequiredError('authenticationRequest','Required parameter authenticationRequest was null or undefined when calling authenticate.');
            }
            const localVarPath = `/authenticate`;
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = Object.assign({ method: 'POST' }, baseOptions, options);
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            localVarHeaderParameter['Content-Type'] = 'application/json';

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);
            const needsSerialization = (<any>"AuthenticationRequest" !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.body =  needsSerialization ? JSON.stringify(authenticationRequest || {}) : (authenticationRequest || "");

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * 
         * @param {AccessKeys} accessKeys 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        invalidate(accessKeys: AccessKeys, options: any = {}): FetchArgs {
            // verify required parameter 'accessKeys' is not null or undefined
            if (accessKeys === null || accessKeys === undefined) {
                throw new RequiredError('accessKeys','Required parameter accessKeys was null or undefined when calling invalidate.');
            }
            const localVarPath = `/invalidate`;
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = Object.assign({ method: 'POST' }, baseOptions, options);
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            localVarHeaderParameter['Content-Type'] = 'application/json';

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);
            const needsSerialization = (<any>"AccessKeys" !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.body =  needsSerialization ? JSON.stringify(accessKeys || {}) : (accessKeys || "");

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * 
         * @param {RefreshRequest} refreshRequest 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        refresh(refreshRequest: RefreshRequest, options: any = {}): FetchArgs {
            // verify required parameter 'refreshRequest' is not null or undefined
            if (refreshRequest === null || refreshRequest === undefined) {
                throw new RequiredError('refreshRequest','Required parameter refreshRequest was null or undefined when calling refresh.');
            }
            const localVarPath = `/refresh`;
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = Object.assign({ method: 'POST' }, baseOptions, options);
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            localVarHeaderParameter['Content-Type'] = 'application/json';

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);
            const needsSerialization = (<any>"RefreshRequest" !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.body =  needsSerialization ? JSON.stringify(refreshRequest || {}) : (refreshRequest || "");

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * 
         * @param {UsernamePassword} usernamePassword 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        siginout(usernamePassword: UsernamePassword, options: any = {}): FetchArgs {
            // verify required parameter 'usernamePassword' is not null or undefined
            if (usernamePassword === null || usernamePassword === undefined) {
                throw new RequiredError('usernamePassword','Required parameter usernamePassword was null or undefined when calling siginout.');
            }
            const localVarPath = `/signout`;
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = Object.assign({ method: 'POST' }, baseOptions, options);
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            localVarHeaderParameter['Content-Type'] = 'application/json';

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);
            const needsSerialization = (<any>"UsernamePassword" !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.body =  needsSerialization ? JSON.stringify(usernamePassword || {}) : (usernamePassword || "");

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * 
         * @param {AccessKeys} accessKeys 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        validate(accessKeys: AccessKeys, options: any = {}): FetchArgs {
            // verify required parameter 'accessKeys' is not null or undefined
            if (accessKeys === null || accessKeys === undefined) {
                throw new RequiredError('accessKeys','Required parameter accessKeys was null or undefined when calling validate.');
            }
            const localVarPath = `/validate`;
            const localVarUrlObj = url.parse(localVarPath, true);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }
            const localVarRequestOptions = Object.assign({ method: 'POST' }, baseOptions, options);
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            localVarHeaderParameter['Content-Type'] = 'application/json';

            localVarUrlObj.query = Object.assign({}, localVarUrlObj.query, localVarQueryParameter, options.query);
            // fix override query string Detail: https://stackoverflow.com/a/7517673/1077943
            delete localVarUrlObj.search;
            localVarRequestOptions.headers = Object.assign({}, localVarHeaderParameter, options.headers);
            const needsSerialization = (<any>"AccessKeys" !== "string") || localVarRequestOptions.headers['Content-Type'] === 'application/json';
            localVarRequestOptions.body =  needsSerialization ? JSON.stringify(accessKeys || {}) : (accessKeys || "");

            return {
                url: url.format(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
    }
};

/**
 * DefaultApi - functional programming interface
 * @export
 */
export const DefaultApiFp = function(configuration?: Configuration) {
    return {
        /**
         * 
         * @param {AuthenticationRequest} authenticationRequest 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        authenticate(authenticationRequest: AuthenticationRequest, options?: any): (fetch?: FetchAPI, basePath?: string) => Promise<Authentication> {
            const localVarFetchArgs = DefaultApiFetchParamCreator(configuration).authenticate(authenticationRequest, options);
            return (fetch: FetchAPI = portableFetch, basePath: string = BASE_PATH) => {
                return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                    if (response.status >= 200 && response.status < 300) {
                        return response.json();
                    } else {
                        throw response;
                    }
                });
            };
        },
        /**
         * 
         * @param {AccessKeys} accessKeys 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        invalidate(accessKeys: AccessKeys, options?: any): (fetch?: FetchAPI, basePath?: string) => Promise<Response> {
            const localVarFetchArgs = DefaultApiFetchParamCreator(configuration).invalidate(accessKeys, options);
            return (fetch: FetchAPI = portableFetch, basePath: string = BASE_PATH) => {
                return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                    if (response.status >= 200 && response.status < 300) {
                        return response;
                    } else {
                        throw response;
                    }
                });
            };
        },
        /**
         * 
         * @param {RefreshRequest} refreshRequest 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        refresh(refreshRequest: RefreshRequest, options?: any): (fetch?: FetchAPI, basePath?: string) => Promise<RefreshResponse> {
            const localVarFetchArgs = DefaultApiFetchParamCreator(configuration).refresh(refreshRequest, options);
            return (fetch: FetchAPI = portableFetch, basePath: string = BASE_PATH) => {
                return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                    if (response.status >= 200 && response.status < 300) {
                        return response.json();
                    } else {
                        throw response;
                    }
                });
            };
        },
        /**
         * 
         * @param {UsernamePassword} usernamePassword 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        siginout(usernamePassword: UsernamePassword, options?: any): (fetch?: FetchAPI, basePath?: string) => Promise<Response> {
            const localVarFetchArgs = DefaultApiFetchParamCreator(configuration).siginout(usernamePassword, options);
            return (fetch: FetchAPI = portableFetch, basePath: string = BASE_PATH) => {
                return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                    if (response.status >= 200 && response.status < 300) {
                        return response;
                    } else {
                        throw response;
                    }
                });
            };
        },
        /**
         * 
         * @param {AccessKeys} accessKeys 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        validate(accessKeys: AccessKeys, options?: any): (fetch?: FetchAPI, basePath?: string) => Promise<Response> {
            const localVarFetchArgs = DefaultApiFetchParamCreator(configuration).validate(accessKeys, options);
            return (fetch: FetchAPI = portableFetch, basePath: string = BASE_PATH) => {
                return fetch(basePath + localVarFetchArgs.url, localVarFetchArgs.options).then((response) => {
                    if (response.status >= 200 && response.status < 300) {
                        return response;
                    } else {
                        throw response;
                    }
                });
            };
        },
    }
};

/**
 * DefaultApi - factory interface
 * @export
 */
export const DefaultApiFactory = function (configuration?: Configuration, fetch?: FetchAPI, basePath?: string) {
    return {
        /**
         * 
         * @param {AuthenticationRequest} authenticationRequest 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        authenticate(authenticationRequest: AuthenticationRequest, options?: any) {
            return DefaultApiFp(configuration).authenticate(authenticationRequest, options)(fetch, basePath);
        },
        /**
         * 
         * @param {AccessKeys} accessKeys 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        invalidate(accessKeys: AccessKeys, options?: any) {
            return DefaultApiFp(configuration).invalidate(accessKeys, options)(fetch, basePath);
        },
        /**
         * 
         * @param {RefreshRequest} refreshRequest 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        refresh(refreshRequest: RefreshRequest, options?: any) {
            return DefaultApiFp(configuration).refresh(refreshRequest, options)(fetch, basePath);
        },
        /**
         * 
         * @param {UsernamePassword} usernamePassword 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        siginout(usernamePassword: UsernamePassword, options?: any) {
            return DefaultApiFp(configuration).siginout(usernamePassword, options)(fetch, basePath);
        },
        /**
         * 
         * @param {AccessKeys} accessKeys 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        validate(accessKeys: AccessKeys, options?: any) {
            return DefaultApiFp(configuration).validate(accessKeys, options)(fetch, basePath);
        },
    };
};

/**
 * DefaultApi - object-oriented interface
 * @export
 * @class DefaultApi
 * @extends {BaseAPI}
 */
export class DefaultApi extends BaseAPI {
    /**
     * 
     * @param {AuthenticationRequest} authenticationRequest 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof DefaultApi
     */
    public authenticate(authenticationRequest: AuthenticationRequest, options?: any) {
        return DefaultApiFp(this.configuration).authenticate(authenticationRequest, options)(this.fetch, this.basePath);
    }

    /**
     * 
     * @param {AccessKeys} accessKeys 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof DefaultApi
     */
    public invalidate(accessKeys: AccessKeys, options?: any) {
        return DefaultApiFp(this.configuration).invalidate(accessKeys, options)(this.fetch, this.basePath);
    }

    /**
     * 
     * @param {RefreshRequest} refreshRequest 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof DefaultApi
     */
    public refresh(refreshRequest: RefreshRequest, options?: any) {
        return DefaultApiFp(this.configuration).refresh(refreshRequest, options)(this.fetch, this.basePath);
    }

    /**
     * 
     * @param {UsernamePassword} usernamePassword 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof DefaultApi
     */
    public siginout(usernamePassword: UsernamePassword, options?: any) {
        return DefaultApiFp(this.configuration).siginout(usernamePassword, options)(this.fetch, this.basePath);
    }

    /**
     * 
     * @param {AccessKeys} accessKeys 
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof DefaultApi
     */
    public validate(accessKeys: AccessKeys, options?: any) {
        return DefaultApiFp(this.configuration).validate(accessKeys, options)(this.fetch, this.basePath);
    }

}

